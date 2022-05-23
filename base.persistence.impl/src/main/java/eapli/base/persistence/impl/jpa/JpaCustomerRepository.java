package eapli.base.persistence.impl.jpa;
import eapli.base.Application;
import eapli.base.categorymanagement.domain.Category;
import eapli.base.customermanagement.domain.Customer;
import eapli.base.customermanagement.domain.VatId;
import eapli.base.customermanagement.repositories.CustomerRepository;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.productmanagement.domain.Product;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class JpaCustomerRepository extends JpaAutoTxRepository<Customer, Integer, Integer>
        implements CustomerRepository {


    public JpaCustomerRepository(String persistenceUnitName) {
        super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(), "id");
    }

    public JpaCustomerRepository(TransactionalContext tx) {
        super(tx, "id");
    }


    @Override
    public Optional<Customer> findByVATId(VatId vatId) {
        final Map<String, Object> params = new HashMap<>();
        params.put("vatId", vatId);
        return matchOne("e.vatId=:vatId", params);
    }

    @Override
    public List<Customer> findByGender(String gender) {
            final Map<String, Object> params = new HashMap<>();
            params.put("gend", gender);
            return match("e.gender=:gend", params);
    }
}
