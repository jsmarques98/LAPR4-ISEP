package eapli.base.ordermanagement.repositories;


import eapli.base.categorymanagement.domain.Category;
import eapli.base.ordermanagement.domain.OrderItem;
import eapli.base.productmanagement.domain.Product;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;
import java.util.Optional;

public interface OrderItemRepository  extends DomainRepository<Integer, OrderItem> {



    default Optional<OrderItem> findById(Integer id) {
        return ofIdentity(id);
    }
}
