package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.warehousemanagement.domain.RowAisle;
import eapli.base.warehousemanagement.domain.RowAisleID;
import eapli.base.warehousemanagement.repository.RowAisleRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class JpaRowAisleRepository extends JpaAutoTxRepository<RowAisle, RowAisleID,RowAisleID> implements RowAisleRepository {

    public JpaRowAisleRepository(String persistenceUnitName){
        super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(),"id");
    }

    public JpaRowAisleRepository(TransactionalContext tx){
        super(tx,"id");
    }

    @Override
    public Optional<RowAisle> findById(RowAisleID rowAisleID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("rowaisle", rowAisleID);
        return matchOne("e.id=:rowaisle", params);
    }
}
