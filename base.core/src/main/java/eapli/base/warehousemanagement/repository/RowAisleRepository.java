package eapli.base.warehousemanagement.repository;

import eapli.base.warehousemanagement.domain.RowAisle;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

public interface RowAisleRepository extends DomainRepository<Integer, RowAisle> {

    default Optional<RowAisle> findById(Integer id){
        return ofIdentity(id);
    }

}
