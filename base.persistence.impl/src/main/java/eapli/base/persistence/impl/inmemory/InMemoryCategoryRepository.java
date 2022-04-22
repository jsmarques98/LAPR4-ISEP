package eapli.base.persistence.impl.inmemory;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.categorymanagement.repositories.CategoryRepository;
import eapli.base.clientusermanagement.domain.ClientUser;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.clientusermanagement.repositories.ClientUserRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

public class InMemoryCategoryRepository extends InMemoryDomainRepository<Category, MecanographicNumber>
        implements CategoryRepository {

    @Override
    public Optional<Category> findByMecanographicNumber(MecanographicNumber categoryID) {
        return Optional.of(data().get((categoryID)));
    }
}
