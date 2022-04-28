package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.warehousemanagement.domain.Aisle;
import eapli.base.warehousemanagement.repository.AisleRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class JpaAisleRepository extends JpaAutoTxRepository<Aisle,Integer,Integer> implements AisleRepository {

    public JpaAisleRepository(String persistenceUnitName) {
        super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(), "id");
    }

    public JpaAisleRepository(TransactionalContext tx){
        super(tx,"id");
    }

    @Override
    public Optional<Aisle> findById(Integer id){
        final Map<String,Object> params = new HashMap<>();
        params.put("id",id);
        return matchOne("e.id=:id",params);
    }

}
