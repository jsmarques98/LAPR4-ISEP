package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.agvmanagement.domain.AGV;
import eapli.base.agvmanagement.domain.IDAGV;
import eapli.base.agvmanagement.repository.AGVRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaAGVRepository extends JpaAutoTxRepository<AGV, IDAGV, IDAGV>
        implements AGVRepository {

    public JpaAGVRepository(String persistenceUnitName) {
        super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(), "id");
    }

    public JpaAGVRepository(TransactionalContext tx) {
        super(tx, "id");
    }


}
