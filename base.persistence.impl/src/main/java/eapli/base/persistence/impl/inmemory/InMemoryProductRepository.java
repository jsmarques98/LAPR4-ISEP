package eapli.base.persistence.impl.inmemory;

import eapli.base.categorymanagement.repositories.CategoryRepository;
import eapli.base.clientusermanagement.domain.ClientUser;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.clientusermanagement.repositories.ClientUserRepository;
import eapli.base.productmanagement.domain.Product;
import eapli.base.productmanagement.domain.Reference;
import eapli.base.productmanagement.domain.UniqueInternalCode;
import eapli.base.productmanagement.repositories.ProductRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

public class InMemoryProductRepository extends InMemoryDomainRepository<Product, UniqueInternalCode>
        implements ProductRepository {
    @Override
    public Optional<Product> findByReference(Reference reference) {
        return Optional.of(data().get(reference));
    }
}
