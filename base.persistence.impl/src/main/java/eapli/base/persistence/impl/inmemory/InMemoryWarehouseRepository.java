package eapli.base.persistence.impl.inmemory;

import eapli.base.warehousemanagement.domain.Warehouse;
import eapli.base.warehousemanagement.repository.WarehouseRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

public class InMemoryWarehouseRepository extends InMemoryDomainRepository<Warehouse, Long> implements WarehouseRepository {
    @Override
    public Optional<Warehouse> findById(Long id) {
        return Optional.of(data().get(id));
    }
}
