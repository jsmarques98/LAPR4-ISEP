package eapli.base.persistence.impl.jpa;
import eapli.base.Application;
import eapli.base.customermanagement.domain.Customer;
import eapli.base.customermanagement.repositories.CustomerRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaCustomerRepository extends JpaAutoTxRepository<Customer, Integer, Integer>
        implements CustomerRepository {


    public JpaCustomerRepository(String persistenceUnitName) {
        super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(), "id");
    }

    public JpaCustomerRepository(TransactionalContext tx) {
        super(tx, "id");
    }


}
