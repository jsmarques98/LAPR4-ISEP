package eapli.base.persistence.impl.inmemory;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.customermanagement.domain.Customer;
import eapli.base.customermanagement.repositories.CustomerRepository;
import eapli.base.productmanagement.domain.Product;
import eapli.base.productmanagement.domain.Reference;
import eapli.base.productmanagement.domain.UniqueInternalCode;
import eapli.base.productmanagement.repositories.ProductRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

public class InMemoryCustomerRepository extends InMemoryDomainRepository<Customer, Integer>
        implements CustomerRepository {

    @Override
    public Optional<Customer> findByIdCustomer(Integer id) {
        return Optional.of(data().get((id)));
    }
}
