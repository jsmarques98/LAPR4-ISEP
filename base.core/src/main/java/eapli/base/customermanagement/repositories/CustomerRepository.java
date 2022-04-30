package eapli.base.customermanagement.repositories;

import eapli.base.customermanagement.domain.Customer;
import eapli.base.customermanagement.domain.VatId;
import eapli.base.productmanagement.domain.Product;
import eapli.base.productmanagement.domain.Reference;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;


public interface CustomerRepository extends DomainRepository<Integer, Customer> {

    Optional<Customer> findByVATId(VatId vatId);

    default Optional<Customer> findByIdCustomer(Integer id) {
        return ofIdentity(id);
    }

}
