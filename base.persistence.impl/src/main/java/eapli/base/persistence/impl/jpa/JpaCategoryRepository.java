package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.categorymanagement.domain.Category;
import eapli.base.categorymanagement.domain.CategoryID;
import eapli.base.categorymanagement.repositories.CategoryRepository;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class JpaCategoryRepository extends JpaAutoTxRepository<Category, CategoryID, CategoryID>
        implements CategoryRepository {


    public JpaCategoryRepository(String persistenceUnitName) {
        super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(), "categoryID");
    }


    public JpaCategoryRepository(TransactionalContext tx) {
        super(tx, "categoryID");
    }


        @Override
        public Optional<Category> findByCategoryID (CategoryID categoryID){
        final Map<String, Object> params = new HashMap<>();
        params.put("cd", categoryID);
        return matchOne("e.categoryID=:cd", params);
    }

}

