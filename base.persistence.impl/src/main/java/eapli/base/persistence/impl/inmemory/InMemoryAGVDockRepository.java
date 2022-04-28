package eapli.base.persistence.impl.inmemory;

import eapli.base.warehousemanagement.domain.AGVDock;
import eapli.base.warehousemanagement.repository.AGVDockRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

public class InMemoryAGVDockRepository extends InMemoryDomainRepository<AGVDock, String> implements AGVDockRepository {
    @Override
    public Optional<AGVDock> findById(String id) {
        return Optional.of(data().get(id));
    }
}
