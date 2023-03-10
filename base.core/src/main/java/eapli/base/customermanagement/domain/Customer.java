package eapli.base.customermanagement.domain;


import eapli.base.answerQuestionnairemanagement.domain.AnswerQuestionaire;
import eapli.base.customermanagement.dto.CustomerDTO;
import eapli.base.questionnairemanagement.domain.Questionnaire;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.representations.dto.DTOable;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

@Entity
public class Customer implements AggregateRoot<Integer>, DTOable<CustomerDTO> {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

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
    private LocalDate birthDate;

    @Column
    String gender;

    @ElementCollection
    @CollectionTable(name = "customer_adress", joinColumns = @JoinColumn(name = "customer_id"))
    private List<AdressCostumer> address = new ArrayList<>();


    @ManyToMany(mappedBy = "customers", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<Questionnaire> questionnaires = new HashSet<>();

    public Customer() {
    }



    public Customer(EmailAddress email, Name name, PhoneNumber phoneNumber, VatId vatId, LocalDate birthDate, List<AdressCostumer> addresss, String gender) {
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.vatId = vatId;
        this.birthDate = birthDate;
        this.address = addresss;
        this.gender = gender;
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

    public EmailAddress getEmail() {
        return email;
    }

    public VatId getVatId() {
        return vatId;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<AdressCostumer> getAddress() {
        return address;
    }

    public Set<Questionnaire> questionnaires() {
        return questionnaires;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public Name getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(email, customer.email) && Objects.equals(name, customer.name) && Objects.equals(phoneNumber, customer.phoneNumber) && Objects.equals(vatId, customer.vatId) && Objects.equals(birthDate, customer.birthDate) && Objects.equals(gender, customer.gender) && Objects.equals(address, customer.address);
    }

    @Override
    public String toString() {
        return "Customer{" +"name=" + name +
                ",vatId=" + vatId +
                '}';
    }
}
