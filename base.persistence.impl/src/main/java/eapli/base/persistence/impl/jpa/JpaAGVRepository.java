package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.agvmanagement.domain.AGV;
import eapli.base.agvmanagement.domain.IDAGV;
import eapli.base.agvmanagement.repository.AGVRepository;
import eapli.base.warehousemanagement.domain.AGVDock;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JpaAGVRepository extends JpaAutoTxRepository<AGV, IDAGV, IDAGV>
        implements AGVRepository {

    public JpaAGVRepository(String persistenceUnitName) {
        super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(), "id");
    }

    public JpaAGVRepository(TransactionalContext tx) {
        super(tx, "id");
    }


    @Override
    public List<AGV> findByAGVDock(AGVDock agvDock) {
        final Map<String, Object> params = new HashMap<>();
        params.put("location", agvDock);
        return match("e.agvDock=:location", params);
    }
}
