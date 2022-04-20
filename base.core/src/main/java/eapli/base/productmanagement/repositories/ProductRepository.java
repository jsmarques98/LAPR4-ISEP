package eapli.base.productmanagement.repositories;

import eapli.base.clientusermanagement.domain.ClientUser;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.productmanagement.domain.Product;
import eapli.base.productmanagement.domain.Reference;
import eapli.base.productmanagement.domain.UniqueInternalCode;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.infrastructure.authz.domain.model.Username;

import java.util.Optional;

public interface ProductRepository extends DomainRepository<UniqueInternalCode, Product> {

    Optional<Product> findByReference(Reference reference);

    default Optional<Product> findByUniqueInternalCode(UniqueInternalCode uniqueInternalCode) {
        return ofIdentity(uniqueInternalCode);
    }
}
