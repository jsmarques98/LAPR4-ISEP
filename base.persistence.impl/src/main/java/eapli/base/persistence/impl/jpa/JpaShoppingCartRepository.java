package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.shoppingCartmanagement.domain.ShoppingCart;
import eapli.base.shoppingCartmanagement.repositories.ShoppingCartRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.Map;

public class JpaShoppingCartRepository extends JpaAutoTxRepository<ShoppingCart, Integer, Integer> implements ShoppingCartRepository {
    public JpaShoppingCartRepository(String persistenceUnitName) {
        super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(), "idShoppingCart");
    }

    public JpaShoppingCartRepository(TransactionalContext tx) {
        super(tx, "idShoppingCart");
    }

}
