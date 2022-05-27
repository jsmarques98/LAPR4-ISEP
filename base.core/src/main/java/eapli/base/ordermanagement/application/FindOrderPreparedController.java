package eapli.base.ordermanagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.ordermanagement.domain.OrderStatus;
import eapli.base.ordermanagement.repositories.CustomerOrderRepository;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.List;

public class FindOrderPreparedController {
    private final CustomerOrderRepository customerOrderRepository;
    private final RepositoryFactory repositoryFactory;

    public FindOrderPreparedController() {
        repositoryFactory = PersistenceContext.repositories();
        customerOrderRepository = repositoryFactory.customerOrder();
    }
    public List<CustomerOrder> findOrder(){

        List<CustomerOrder> customerOrderList=  customerOrderRepository.findByOrderStatus(OrderStatus.prepared);

        return  customerOrderList;

    }
    public void setStatusCustomerOrderList( List<CustomerOrder> customerOrderList){
        for (CustomerOrder customerOrder: customerOrderList) {
            customerOrder.changeStatus(OrderStatus.deliveredByCarrier);
             customerOrderRepository.save(customerOrder);
        }

    }

}
