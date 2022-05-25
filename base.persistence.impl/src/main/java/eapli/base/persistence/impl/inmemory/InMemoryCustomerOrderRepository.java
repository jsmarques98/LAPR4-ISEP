package eapli.base.persistence.impl.inmemory;

import eapli.base.customermanagement.domain.Customer;
import eapli.base.customermanagement.repositories.CustomerRepository;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.ordermanagement.domain.OrderStatus;
import eapli.base.ordermanagement.repositories.CustomerOrderRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.List;
import java.util.Optional;

public class InMemoryCustomerOrderRepository extends InMemoryDomainRepository<CustomerOrder, Integer>
        implements CustomerOrderRepository {

    @Override
    public List<CustomerOrder> findByCustomer(Customer customer) {
        return List.of(data().get((customer)));
    }

    public List<CustomerOrder> findByOrderStatus(OrderStatus status) {return   List.of(data().get(status));}
}
