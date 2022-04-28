package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.warehousemanagement.domain.AGVDock;
import eapli.base.warehousemanagement.repository.AGVDockRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class JpaAGVDockRepository extends JpaAutoTxRepository<AGVDock,String,String> implements AGVDockRepository {

    public JpaAGVDockRepository(String persistenceUnitName) {
        super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(), "id");
    }

    public JpaAGVDockRepository(TransactionalContext tx){
        super(tx,"id");
    }

    @Override
    public Optional<AGVDock> findById(String id){
        final Map<String,Object> params = new HashMap<>();
        params.put("id",id);
        return matchOne("e.id=:id",params);
    }

}
