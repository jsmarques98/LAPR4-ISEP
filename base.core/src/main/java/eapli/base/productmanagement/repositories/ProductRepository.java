package eapli.base.productmanagement.repositories;

import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.productmanagement.domain.Product;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

public interface ProductRepository extends DomainRepository<MecanographicNumber, Product> {

    default Optional<Product> findByUniqueInternalCode(MecanographicNumber uniqueInternalCode) {
        return ofIdentity(uniqueInternalCode);
    }
}
