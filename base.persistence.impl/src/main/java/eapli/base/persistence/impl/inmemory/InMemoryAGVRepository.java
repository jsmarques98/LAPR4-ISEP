package eapli.base.persistence.impl.inmemory;

import eapli.base.agvmanagement.domain.AGV;
import eapli.base.agvmanagement.domain.IDAGV;
import eapli.base.agvmanagement.repository.AGVRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;


public  class InMemoryAGVRepository extends InMemoryDomainRepository<AGV, IDAGV>
        implements AGVRepository {

}
