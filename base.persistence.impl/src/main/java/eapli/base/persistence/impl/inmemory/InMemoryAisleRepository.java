package eapli.base.persistence.impl.inmemory;

import eapli.base.warehousemanagement.domain.Aisle;
import eapli.base.warehousemanagement.repository.AisleRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

public class InMemoryAisleRepository extends InMemoryDomainRepository<Aisle, Integer> implements AisleRepository {
    @Override
    public Optional<Aisle> findById(Integer id){
        return  Optional.of(data().get(id));
    }
}
