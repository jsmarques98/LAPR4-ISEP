package eapli.base.warehousemanagement.repository;

import eapli.base.warehousemanagement.domain.Aisle;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

public interface AisleRepository extends DomainRepository<Integer, Aisle> {
    default Optional<Aisle> findById(Integer id){
        return ofIdentity(id);
    }
}
