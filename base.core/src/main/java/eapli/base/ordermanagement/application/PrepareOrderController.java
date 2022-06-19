package eapli.base.ordermanagement.application;

import eapli.base.agvmanagement.domain.AGV;
import eapli.base.agvmanagement.domain.CurrentTask;
import eapli.base.agvmanagement.domain.IDAGV;
import eapli.base.agvmanagement.domain.Position;
import eapli.base.agvmanagement.modules.BSM;
import eapli.base.agvmanagement.repository.AGVRepository;
import eapli.base.customermanagement.domain.Customer;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.ordermanagement.domain.OrderItem;
import eapli.base.ordermanagement.domain.OrderStatus;
import eapli.base.ordermanagement.repositories.CustomerOrderRepository;
import eapli.base.agvmanagement.modules.AGVMemory;
import eapli.base.agvmanagement.modules.ControlSystem;
import eapli.base.agvmanagement.modules.SimulationEngine;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;

import static java.lang.Thread.sleep;

public class PrepareOrderController {
    private SimulationEngine simulationEngine;
    private final RepositoryFactory repositoryFactory;
    private final AGVRepository agvRepository;
    private final CustomerOrderRepository customerOrderRepository;
    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;
    List<CustomerOrder> customerOrdersList;
    List<Customer> customerOrdersIdList;
    List<AGV> agvList;
    List<IDAGV> agvIdList;

    public PrepareOrderController() {
        repositoryFactory = PersistenceContext.repositories();
        agvRepository = repositoryFactory.agvs();
        customerOrderRepository = repositoryFactory.customerOrder();
        entityManagerFactory = Persistence.createEntityManagerFactory("eapli.base");
        entityManager = entityManagerFactory.createEntityManager();
        customerOrdersList = new ArrayList<>();
        customerOrdersIdList = new ArrayList<>();
        agvList = new ArrayList<>();
        agvIdList = new ArrayList<>();
    }

    public List<CustomerOrder> getCustomerOrdersPayed() {
        return customerOrdersList = customerOrderRepository.findByOrderStatus(OrderStatus.paymentSucceeded);
    }

    public List<AGV> getAGVFree() {
        agvList = agvRepository.findByCurrentTask(CurrentTask.FREE);
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

        simulationEngine = new SimulationEngine(agvMemory);
        simulationEngine.start();
        ControlSystem controlSystem = new ControlSystem(agvMemory, productsPositions,order);
        controlSystem.start();
        BSM bsm =new BSM(agvMemory);
        bsm.start();





        return true;
    }

}
