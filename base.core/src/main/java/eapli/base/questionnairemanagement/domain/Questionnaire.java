package eapli.base.questionnairemanagement.domain;


import eapli.base.customermanagement.domain.Customer;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Questionnaire implements AggregateRoot<AlphanumericalCode> {

    @Version
    private Long version;

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id_db;

    @Column
    private AlphanumericalCode alphanumericalCode;

    @Column
    private  Description description;


    @Column
    @Lob
    private  String questionnaire;


    @ManyToMany
    List<Customer> customers;


    public Questionnaire(AlphanumericalCode id, Description description, List<Customer> customers,String questionnaire ) {
        this.alphanumericalCode = id;
        this.description=description;
        this.customers = customers;
        this.questionnaire=questionnaire;
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
}
