package eapli.base.customermanagement.repositories;

import eapli.base.customermanagement.domain.Customer;
import eapli.framework.domain.repositories.DomainRepository;
import java.util.Optional;


public interface CustomerRepository extends DomainRepository<Integer, Customer> {

    default Optional<Customer> findByIdCustomer(Integer id) {
        return ofIdentity(id);
    }

}
