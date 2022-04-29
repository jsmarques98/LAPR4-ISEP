package eapli.base.persistence.impl.inmemory;

import eapli.base.warehousemanagement.domain.RowAisle;
import eapli.base.warehousemanagement.repository.RowAisleRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

public class InMemoryRowAisleRepository extends InMemoryDomainRepository<RowAisle, Integer> implements RowAisleRepository {
    @Override
    public Optional<RowAisle> findById(Integer id) {
        return Optional.of(data().get(id));
    }

}