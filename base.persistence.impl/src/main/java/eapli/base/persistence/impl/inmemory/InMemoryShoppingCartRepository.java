package eapli.base.persistence.impl.inmemory;

import eapli.base.shoppingCartmanagement.domain.ShoppingCart;
import eapli.base.shoppingCartmanagement.repositories.ShoppingCartRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryShoppingCartRepository extends InMemoryDomainRepository<ShoppingCart, Integer> implements ShoppingCartRepository {

}
