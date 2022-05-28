package eapli.base.shoppingCartmanagement.domain;

import eapli.base.customermanagement.domain.AdressCostumer;
import eapli.base.customermanagement.domain.Customer;
import eapli.base.ordermanagement.domain.OrderStatus;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class ShoppingCart implements AggregateRoot<Integer>  {
    @Version
    private Long version;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idShoppingCart;


    @Column
    private Double price;


    @ManyToOne
    private Customer customer;

    @OneToMany
    private List<ShoppingCartItem> shoppingCartItemList = new ArrayList<>();

    public ShoppingCart() {}

    public ShoppingCart(Customer customer,List<ShoppingCartItem> shoppingCartItemList, Double price) {
        this.customer = customer;
        this.shoppingCartItemList=shoppingCartItemList;
        this.price = price;
    }

    @Override
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public Integer identity() {
        return this.idShoppingCart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCart that = (ShoppingCart) o;
        return Objects.equals(price, that.price) && Objects.equals(customer, that.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, idShoppingCart, price, customer);
    }

    @Override
    public String toString() {
        return "CustomerOrder ID =" + idShoppingCart + "\n"+
                "Price = " + price +"\n"+
                "Customer=" + customer;

    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }
}
