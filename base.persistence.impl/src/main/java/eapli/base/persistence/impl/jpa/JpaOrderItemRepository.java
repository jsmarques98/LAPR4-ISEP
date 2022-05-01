package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.customermanagement.domain.Customer;
import eapli.base.customermanagement.repositories.CustomerRepository;
import eapli.base.ordermanagement.domain.OrderItem;
import eapli.base.ordermanagement.repositories.OrderItemRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaOrderItemRepository extends JpaAutoTxRepository<OrderItem, Integer, Integer>
        implements OrderItemRepository {

    public JpaOrderItemRepository(String persistenceUnitName) {
        super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(), "id");
    }

    public JpaOrderItemRepository(TransactionalContext tx) {
        super(tx, "id");
    }
}
