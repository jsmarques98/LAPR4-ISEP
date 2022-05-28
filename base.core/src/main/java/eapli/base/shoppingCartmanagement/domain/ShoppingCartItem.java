package eapli.base.shoppingCartmanagement.domain;


import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.productmanagement.domain.Product;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class ShoppingCartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Version
    private Long version;

    @ManyToOne
    private Product product;

    @Column
    private  Integer quantity;



    public ShoppingCartItem(Product product,Integer quantity) {
        this.product = product;
        this.quantity=quantity;
    }

    public ShoppingCartItem() {
    }




}
