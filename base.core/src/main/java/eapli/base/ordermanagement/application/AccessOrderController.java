package eapli.base.ordermanagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.ordermanagement.domain.OrderStatus;
import eapli.base.ordermanagement.repositories.CustomerOrderRepository;

import java.util.List;

public class AccessOrderController {
    private final CustomerOrderRepository customerOrderRepository;
    private final RepositoryFactory repositoryFactory;

    public AccessOrderController() {
        repositoryFactory = PersistenceContext.repositories();
        customerOrderRepository = repositoryFactory.customerOrder();
    }
    public List<CustomerOrder> findOrder(OrderStatus status){

        List<CustomerOrder> customerOrderList=  customerOrderRepository.findByOrderStatus(status);

        return  customerOrderList;

    }
    public void setStatusCustomerOrderList( List<CustomerOrder> customerOrderList, OrderStatus status){
        for (CustomerOrder customerOrder: customerOrderList) {
            customerOrder.changeStatus(status);
             customerOrderRepository.save(customerOrder);
        }

    }

}
