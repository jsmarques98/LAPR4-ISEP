package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.answerQuestionnairemanagement.domain.AnswerQuestionaire;
import eapli.base.answerQuestionnairemanagement.repositories.AnswerQuestionaireRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaAnswerQuestionaireRepository extends JpaAutoTxRepository<AnswerQuestionaire, Integer,Integer> implements  AnswerQuestionaireRepository {

    public JpaAnswerQuestionaireRepository(String persistenceUnitName){
        super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(),"id");
    }

    public JpaAnswerQuestionaireRepository(TransactionalContext tx){
        super(tx,"id");
    }

}
