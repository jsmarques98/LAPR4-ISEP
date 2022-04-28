package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.warehousemanagement.domain.Warehouse;
import eapli.base.warehousemanagement.repository.WarehouseRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class JpaWarehouseRepository extends JpaAutoTxRepository<Warehouse,Long,Long> implements WarehouseRepository {

    public JpaWarehouseRepository(String persistenceUnitName){
        super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(),"id");
    }

    public JpaWarehouseRepository(TransactionalContext tx){
        super(tx,"id");
    }

    @Override
    public Optional<Warehouse> findById(Long id){
        final Map<String,Object> params = new HashMap<>();
        params.put("id",id);
        return matchOne("e.id=:id",params);
    }
}
