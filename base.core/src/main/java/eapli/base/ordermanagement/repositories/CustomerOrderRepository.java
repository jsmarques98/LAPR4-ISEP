package eapli.base.ordermanagement.repositories;

import eapli.base.customermanagement.domain.Customer;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.ordermanagement.domain.OrderStatus;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerOrderRepository extends DomainRepository<Integer, CustomerOrder> {

    List<CustomerOrder> findByCustomer(Customer customer);

    List<CustomerOrder> findByOrderStatus(OrderStatus status);

    CustomerOrder findByOrderID(Integer id);

    default Optional<CustomerOrder> findById(Integer id) {
        return ofIdentity(id);
    }
}
