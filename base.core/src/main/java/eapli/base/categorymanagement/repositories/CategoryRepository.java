package eapli.base.categorymanagement.repositories;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.categorymanagement.domain.CategoryID;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

public interface CategoryRepository extends DomainRepository<CategoryID, Category> {

    default Optional<Category> findByCategoryID (CategoryID categoryID) {
        return ofIdentity(categoryID);
    }
}