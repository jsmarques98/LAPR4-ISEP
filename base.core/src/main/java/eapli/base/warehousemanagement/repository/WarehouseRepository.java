package eapli.base.warehousemanagement.repository;

import eapli.base.warehousemanagement.domain.Warehouse;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

public interface WarehouseRepository extends DomainRepository<Long, Warehouse> {
    default Optional<Warehouse> findById(Long id){
        return ofIdentity(id);
    }
}
