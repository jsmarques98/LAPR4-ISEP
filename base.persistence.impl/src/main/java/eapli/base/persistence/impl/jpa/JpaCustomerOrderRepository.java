package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.customermanagement.domain.Customer;
import eapli.base.customermanagement.repositories.CustomerRepository;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.ordermanagement.repositories.CustomerOrderRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JpaCustomerOrderRepository extends JpaAutoTxRepository<CustomerOrder, Integer, Integer>
        implements CustomerOrderRepository {

    public JpaCustomerOrderRepository(String persistenceUnitName) {
        super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(), "idOrder");
    }

    public JpaCustomerOrderRepository(TransactionalContext tx) {
        super(tx, "idOrder");
    }

    @Override
    public List<CustomerOrder> findByCustomer(Customer customer) {
        final Map<String, Object> params = new HashMap<>();
        params.put("customerID", customer);
        return match("e.customer=:customerID", customer);
    }
}