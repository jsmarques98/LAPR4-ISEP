package eapli.base.warehousemanagement.repository;

import eapli.base.warehousemanagement.domain.AGVDock;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

public interface AGVDockRepository extends DomainRepository<String, AGVDock> {
    default Optional<AGVDock> findById(String id){
        return ofIdentity(id);
    }
}
