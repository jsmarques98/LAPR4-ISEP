package eapli.base.persistence.impl.inmemory;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.categorymanagement.repositories.CategoryRepository;
import eapli.base.clientusermanagement.domain.ClientUser;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.clientusermanagement.repositories.ClientUserRepository;
import eapli.base.productmanagement.domain.*;
import eapli.base.productmanagement.repositories.ProductRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.List;
import java.util.Optional;

public class InMemoryProductRepository extends InMemoryDomainRepository<Product, UniqueInternalCode>
        implements ProductRepository {
    @Override
    public Optional<Product> findByReference(Reference reference) {
        return Optional.of(data().get(reference));
    }

    @Override
    public List<Product> findByCategory(Category category) {
        return List.of(data().get(category));
    }

    @Override
    public List<Product> findByDescription(Description description) {
        return List.of(data().get(description));
    }

    @Override
    public List<Product> findByBrand(Brand brand) {
        return List.of(data().get(brand));
    }
}
