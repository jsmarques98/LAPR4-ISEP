package eapli.base.customermanagement.domain;


import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.customermanagement.dto.CustomerDTO;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.representations.dto.DTOable;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Customer implements AggregateRoot<Integer>, DTOable<CustomerDTO> {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Version
    private Long version;

    @Column
    private Address address;

    @Column
    private EmailAddress email;

    @Column
    private Name name;

    @Column
    private PhoneNumber phoneNumber;

    @Column
    private VatId vatId;

    @Column
    private Date birthDate;

    public Customer() {
    }

    @Override
    public int compareTo(Integer other) {
        return AggregateRoot.super.compareTo(other);
    }

    @Override
    public CustomerDTO toDTO() {
        return null;
    }

    public Customer(Address address, EmailAddress email, Name name, PhoneNumber phoneNumber, VatId vatId, Date birthDate) {
        this.address = address;
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.vatId = vatId;
        this.birthDate = birthDate;
    }

    public Long getVersion() {
        return version;
    }


    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    @Override
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public Integer identity() {
        return this.id;
    }

    @Override
    public boolean hasIdentity(Integer id) {
        return AggregateRoot.super.hasIdentity(id);
    }
}
