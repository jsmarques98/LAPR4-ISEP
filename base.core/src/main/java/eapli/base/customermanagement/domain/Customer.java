package eapli.base.customermanagement.domain;



import eapli.base.customermanagement.dto.CustomerDTO;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.representations.dto.DTOable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

@Entity
public class Customer implements AggregateRoot<Integer>, DTOable<CustomerDTO> {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Version
    private Long version;

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

    @ElementCollection
    @CollectionTable(name = "customer_adress", joinColumns = @JoinColumn(name = "customer_id"))
    private List<AdressCostumer> address = new ArrayList<>();

    public Customer() {}


    public Customer(EmailAddress email, Name name, PhoneNumber phoneNumber, VatId vatId, Date birthDate, List<AdressCostumer> addresss) {
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.vatId = vatId;
        this.birthDate = birthDate;
        this.address = addresss;
    }

    @Override
    public int compareTo(Integer other) {
        return AggregateRoot.super.compareTo(other);
    }

    @Override
    public CustomerDTO toDTO() {
        return null;
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
