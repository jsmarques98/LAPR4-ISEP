package eapli.base.ordermanagement.domain;

import eapli.base.productmanagement.domain.Product;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
public class OrderItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Version
    private Long version;

    @ManyToOne
    private Product product;

    public OrderItem(Product product) {
        this.product = product;
    }

    public OrderItem() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return  Objects.equals(product, orderItem.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, product);
    }

    @Override
    public String toString() {
        return "CustomerOrder item ID =" + id + "\n" +
                "Product=" + product;
    }

    public Product product() {
        return product;
    }
}
