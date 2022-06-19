package eapli.base.server.AGVManager.application;

import eapli.base.agvmanagement.domain.AGV;
import eapli.base.agvmanagement.domain.CurrentTask;
import eapli.base.agvmanagement.domain.IDAGV;
import eapli.base.agvmanagement.domain.Position;
import eapli.base.agvmanagement.modules.AGVMemory;
import eapli.base.agvmanagement.modules.BSM;
import eapli.base.agvmanagement.modules.ControlSystem;
import eapli.base.agvmanagement.modules.SimulationEngine;
import eapli.base.agvmanagement.repository.AGVRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.ordermanagement.domain.OrderItem;
import eapli.base.ordermanagement.domain.OrderStatus;
import eapli.base.ordermanagement.repositories.CustomerOrderRepository;
import eapli.base.warehousemanagement.domain.AGVDock;
import eapli.base.warehousemanagement.domain.Aisle;
import eapli.base.warehousemanagement.repository.AGVDockRepository;
import eapli.base.warehousemanagement.repository.AisleRepository;

import java.util.*;

import static java.lang.Thread.sleep;

public class AGVManagerController {

    private CustomerOrderRepository customerOrderRepository;
    private AGVRepository agvRepository;
    private AGVDockRepository agvDockRepository;
    private AisleRepository aisleRepository;
    private AGV agv;

    public AGVManagerController(){
        customerOrderRepository = PersistenceContext.repositories().customerOrder();
        agvRepository = PersistenceContext.repositories().agvs();
        agvDockRepository  =PersistenceContext.repositories().aGVDock();
        aisleRepository= PersistenceContext.repositories().aisle();
    }

    public List<CustomerOrder> getOrdersByStatusAndDate() {
        List<CustomerOrder> customerOrdersList = customerOrderRepository.findByOrderStatus(OrderStatus.paymentSucceeded);
        Collections.sort(customerOrdersList, new Comparator<CustomerOrder>() {
            public int compare(CustomerOrder order, CustomerOrder order2) {
                return order.orderDate().compareTo(order2.orderDate());
            }
        });
        return customerOrdersList;
    }

    public List<AGV> getAGVFree() {
        List<AGV> agvList = agvRepository.findByCurrentTask(CurrentTask.FREE);
        Collections.sort(agvList, new Comparator<AGV>() {
            public int compare(AGV agv, AGV agv2) {
                return agv2.maxWeight().compareTo(agv.maxWeight());
            }
        });
        Collections.reverse(agvList);
        return agvList;
    }


    public boolean prepareOrder(CustomerOrder order, AGV agv) throws InterruptedException {
        agv.changeCurrentTask(CurrentTask.SERVING_ORDER);
        agvRepository.save(agv);
        order.changeStatus(OrderStatus.beingPrepared);
        customerOrderRepository.save(order);

        List<Position> productsPositions = new ArrayList<>();

        for (OrderItem o : order.orderItems()) {

            Position position = new Position(o.product().rowAisle().begin().blsquare(), o.product().rowAisle().begin().bwsquare());

            if (!productsPositions.contains(position)) {
                System.out.println(position);
                productsPositions.add(position);
            }
        }


        AGVMemory agvMemory = new AGVMemory(agv);
        agvMemory.setSpeed(1.0);

       SimulationEngine simulationEngine = new SimulationEngine(agvMemory);
        simulationEngine.start();
        ControlSystem controlSystem = new ControlSystem(agvMemory, productsPositions,order);
        controlSystem.start();
        BSM bsm =new BSM(agvMemory);
        bsm.start();
        return true;
    }


    public boolean existsAGV(IDAGV  idagv){
        try {
            agv = agvRepository.findByID(idagv).get();
            return true;
        }catch (NoSuchElementException e){
            System.out.println("This AGV doesn't exist on database!");
            return false;
        }
    }

    public void setAGVStatusOccupied(){
        agv.changeCurrentTask(CurrentTask.SERVING_ORDER);
        agvRepository.save(agv);
    }

    public void setAGVStatusFree(){
        agv.changeCurrentTask(CurrentTask.FREE);
        agvRepository.save(agv);
    }

    public List<AGV> getAGVs(){
        agvRepository = PersistenceContext.repositories().agvs();
        return (List<AGV>) agvRepository.findAll();
    }

    public List<AGVDock> getAGVDocks(){
        agvDockRepository = PersistenceContext.repositories().aGVDock();
        return (List<AGVDock>) agvDockRepository.findAll();
    }

    public List<Aisle> getAisles() {
        aisleRepository= PersistenceContext.repositories().aisle();
        return (List<Aisle>) aisleRepository.findAll();
    }
}
