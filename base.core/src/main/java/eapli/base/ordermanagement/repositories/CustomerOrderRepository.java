package eapli.base.ordermanagement.repositories;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.customermanagement.domain.Customer;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.productmanagement.domain.Product;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerOrderRepository extends DomainRepository<Integer, CustomerOrder> {

    List<CustomerOrder> findByCustomer(Customer customer);

    default Optional<CustomerOrder> findById(Integer id) {
        return ofIdentity(id);
    }
}