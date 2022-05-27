package eapli.base.ordermanagement.application;

import eapli.base.agvmanagement.domain.AGV;
import eapli.base.agvmanagement.domain.CurrentTask;
import eapli.base.agvmanagement.domain.IDAGV;
import eapli.base.agvmanagement.repository.AGVRepository;
import eapli.base.customermanagement.domain.Customer;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.ordermanagement.domain.OrderStatus;
import eapli.base.ordermanagement.repositories.CustomerOrderRepository;
import eapli.base.productmanagement.domain.Product;
import eapli.base.productmanagement.repositories.ProductRepository;
import eapli.base.warehousemanagement.repository.AisleRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.*;

import static java.lang.Thread.sleep;

public class PrepareOrderController {

    private final RepositoryFactory repositoryFactory;
    private final AGVRepository agvRepository;
    private final CustomerOrderRepository customerOrderRepository;
    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;
    List<CustomerOrder> customerOrdersList;
    List<Customer> customerOrdersIdList;
    List<AGV> agvList;
    List<IDAGV> agvIdList;

    public PrepareOrderController(){
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
        sleep(30000);
        order.changeStatus(OrderStatus.prepared);
        customerOrderRepository.save(order);
        agv.changeCurrentTask(CurrentTask.FREE);
        agvRepository.save(agv);
        return true;
    }

}
