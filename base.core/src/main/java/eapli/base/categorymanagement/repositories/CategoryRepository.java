package eapli.base.categorymanagement.repositories;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

public interface CategoryRepository extends DomainRepository<MecanographicNumber, Category> {

    default Optional<Category> findByMecanographicNumber(MecanographicNumber categoryID) {
        return ofIdentity(categoryID);
    }
}