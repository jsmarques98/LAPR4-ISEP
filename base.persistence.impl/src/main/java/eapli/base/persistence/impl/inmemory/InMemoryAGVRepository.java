package eapli.base.persistence.impl.inmemory;

import eapli.base.agvmanagement.domain.AGV;
import eapli.base.agvmanagement.domain.IDAGV;
import eapli.base.agvmanagement.repository.AGVRepository;
import eapli.base.warehousemanagement.domain.AGVDock;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.List;


public  class InMemoryAGVRepository extends InMemoryDomainRepository<AGV, IDAGV>
        implements AGVRepository {

    @Override
    public List<AGV> findByAGVDock(AGVDock agvDock) {
        return List.of(data().get(agvDock));
    }
}
