package eapli.base.answerQuestionnairemanagement.domain;

import eapli.base.customermanagement.domain.Customer;
import eapli.base.questionnairemanagement.domain.Questionnaire;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;


@Entity
public class AnswerQuestionaire implements AggregateRoot<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Version
    private Long version;

    @ManyToOne
    private Customer customer;

    @ManyToOne(cascade = CascadeType.ALL)
    private Questionnaire questionnaire;

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }


    @Column
    @Lob
    private String answerQuestionaire;

    public AnswerQuestionaire(Customer customer,Questionnaire questionnaire) {
        this.customer = customer;
        this.questionnaire=questionnaire;
    }


    public AnswerQuestionaire() {

    }


    @Override
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public Integer identity() {
        return this.id;
    }

    public Integer getId() {
        return id;
    }
}
