package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.categorymanagement.domain.Category;
import eapli.base.clientusermanagement.domain.ClientUser;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.clientusermanagement.repositories.ClientUserRepository;
import eapli.base.productmanagement.domain.*;
import eapli.base.productmanagement.repositories.ProductRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class JpaProductRepository  extends  JpaAutoTxRepository<Product, UniqueInternalCode, UniqueInternalCode>
        implements ProductRepository{


    public JpaProductRepository(String persistenceUnitName) {
        super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(), "uniqueInternalCode");
    }

    public JpaProductRepository(TransactionalContext tx) {
        super(tx, "uniqueInternalCode");
    }


    @Override
    public Optional<Product> findByReference(Reference reference) {
        final Map<String, Object> params = new HashMap<>();
        params.put("ref", reference);
        return matchOne("e.reference=:ref", params);
    }

    @Override
    public List<Product> findByCategory(Category category) {
        final Map<String, Object> categories = new HashMap<>();
        categories.put("cat", category);
        return match("e.category=:cat", categories);
    }

    @Override
    public List<Product> findByDescription(Description description) {
        final Map<String, Object> descriptions = new HashMap<>();
        descriptions.put("des", description);
        return match("e.description=:des", descriptions);
    }

    @Override
    public List<Product> findByBrand(Brand brand) {
        final Map<String, Object> brands = new HashMap<>();
        brands.put("bra", brand);
        return match("e.brand=:bra", brands);
    }

    @Override
    public Optional<Product> findByUniqueInternalCode(UniqueInternalCode uniqueInternalCode) {
        final Map<String, Object> params = new HashMap<>();
        params.put("uic", uniqueInternalCode);
        return matchOne("e.uniqueInternalCode=:uic", params);
    }
}
