package eapli.base.server.AGVManager.application;

import eapli.base.agvmanagement.domain.AGV;
import eapli.base.agvmanagement.domain.CurrentTask;
import eapli.base.agvmanagement.domain.IDAGV;
import eapli.base.agvmanagement.repository.AGVRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.ordermanagement.domain.OrderStatus;
import eapli.base.ordermanagement.repositories.CustomerOrderRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import static java.lang.Thread.sleep;

public class AGVManagerController {

    private CustomerOrderRepository customerOrderRepository;
    private AGVRepository agvRepository;
    private AGV agv;

    public AGVManagerController(){
        customerOrderRepository = PersistenceContext.repositories().customerOrder();
        agvRepository = PersistenceContext.repositories().agvs();
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
        sleep(5000);
        order.changeStatus(OrderStatus.prepared);
        customerOrderRepository.save(order);
        agv.changeCurrentTask(CurrentTask.FREE);
        agvRepository.save(agv);
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
}
