package eapli.base.productmanagement.repositories;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.productmanagement.domain.*;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends DomainRepository<UniqueInternalCode, Product> {

    Optional<Product> findByReference(Reference reference);
    List<Product> findByCategory(Category category);
    List<Product> findByDescription(ShortDescription description);
    List<Product> findByBrand(Brand brand);

    default Optional<Product> findByUniqueInternalCode(UniqueInternalCode uniqueInternalCode) {
        return ofIdentity(uniqueInternalCode);
    }
}
