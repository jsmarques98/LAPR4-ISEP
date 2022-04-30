package eapli.base.warehousemanagement.repository;

import eapli.base.warehousemanagement.domain.RowAisle;
import eapli.base.warehousemanagement.domain.RowAisleID;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

public interface RowAisleRepository extends DomainRepository<RowAisleID, RowAisle> {

    default Optional<RowAisle> findById(RowAisleID id){
        return ofIdentity(id);
    }

}
