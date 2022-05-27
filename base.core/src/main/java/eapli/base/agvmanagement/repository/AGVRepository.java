package eapli.base.agvmanagement.repository;

import eapli.base.agvmanagement.domain.AGV;
import eapli.base.agvmanagement.domain.CurrentTask;
import eapli.base.agvmanagement.domain.IDAGV;
import eapli.base.warehousemanagement.domain.AGVDock;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;
import java.util.Optional;

public interface AGVRepository extends DomainRepository<IDAGV, AGV> {
    List<AGV> findByAGVDock(AGVDock agvDock);
    default Optional<AGV> findByID(IDAGV id) {
        return ofIdentity(id);
    }

    List<AGV> findByCurrentTask(CurrentTask status);

}
