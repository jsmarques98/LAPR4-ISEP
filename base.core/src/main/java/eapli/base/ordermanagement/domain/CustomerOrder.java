package eapli.base.ordermanagement.domain;

import eapli.base.customermanagement.domain.Customer;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class CustomerOrder implements AggregateRoot<Integer> {
    @Version
    private Long version;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idOrder;


    @Column
    private Double price;

    @Enumerated
    private OrderStatus status;

    @Column
    private LocalDateTime orderDate;

    @ManyToOne
    private Customer customer;

    public CustomerOrder() {}

    public CustomerOrder(Customer customerId) {
        this.customer = customerId;
        this.status = OrderStatus.paymentSucceeded;
        this.orderDate=LocalDateTime.now();
    }

    @Override
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public Integer identity() {
        return this.idOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerOrder that = (CustomerOrder) o;
        return Objects.equals(price, that.price) && Objects.equals(customer, that.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, idOrder, price, customer);
    }

    @Override
    public String toString() {
        return "CustomerOrder ID =" + idOrder + "\n"+
                "Price = " + price +"\n"+
                "Customer= " + customer;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void changeStatus(OrderStatus status) {
        this.status = status;
    }
}
