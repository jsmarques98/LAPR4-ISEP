package eapli.base.questionnairemanagement.domain;


import eapli.base.customermanagement.domain.Customer;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Questionnaire implements AggregateRoot<AlphanumericalCode> {

    @Version
    private Long version;

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id_db;

    public Integer getId_db() {
        return id_db;
    }

    @Column
    private AlphanumericalCode alphanumericalCode;

    @Column
    private Description description;

    @Column
    @Lob
    private String questionnaire;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "Questionnaire_Customer",
            joinColumns = {@JoinColumn(name = "questionnaire_id")},
            inverseJoinColumns = {@JoinColumn(name = "customer_id")}
    )
    private Set<Customer> customers=new HashSet<>();

    public Questionnaire(AlphanumericalCode id, Description description, String questionnaire) {
        super();
        this.alphanumericalCode = id;
        this.description = description;
        this.questionnaire = questionnaire;

    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        customer.questionnaires().add(this);
    }

    public Set<Customer> customers() {
        return customers;
    }

    public Description description() {
        return description;
    }

    public Questionnaire() {
    }

    @Override
    public boolean equals(final Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    @Override
    public boolean sameAs(final Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public AlphanumericalCode identity() {
        return this.alphanumericalCode;
    }

    public String questionnaire() {
        return questionnaire;
    }
}
