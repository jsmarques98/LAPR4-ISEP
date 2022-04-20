package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.clientusermanagement.domain.ClientUser;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.clientusermanagement.repositories.ClientUserRepository;
import eapli.base.productmanagement.domain.Product;
import eapli.base.productmanagement.domain.Reference;
import eapli.base.productmanagement.domain.UniqueInternalCode;
import eapli.base.productmanagement.repositories.ProductRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
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
    public Optional<Product> findByUniqueInternalCode(UniqueInternalCode uniqueInternalCode) {
        final Map<String, Object> params = new HashMap<>();
        params.put("uic", uniqueInternalCode);
        return matchOne("e.uniqueInternalCode=:uic", params);
    }
}
