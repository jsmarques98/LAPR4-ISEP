package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.answerQuestionnairemanagement.domain.AnswerQuestionaire;
import eapli.base.answerQuestionnairemanagement.repositories.AnswerQuestionaireRepository;
import eapli.base.questionnairemanagement.domain.Questionnaire;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JpaAnswerQuestionaireRepository extends JpaAutoTxRepository<AnswerQuestionaire, Integer,Integer> implements  AnswerQuestionaireRepository {

    public JpaAnswerQuestionaireRepository(String persistenceUnitName){
        super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(),"id");
    }

    public JpaAnswerQuestionaireRepository(TransactionalContext tx){
        super(tx,"id");
    }

    @Override
    public List<AnswerQuestionaire> findByQuestionnaire(Questionnaire q) {
        final Map<String, Object> params = new HashMap<>();
        params.put("que", q);
        return match("e.questionnaire=:que", params);
    }

}
