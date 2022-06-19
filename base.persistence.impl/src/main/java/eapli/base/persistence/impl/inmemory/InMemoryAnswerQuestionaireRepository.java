package eapli.base.persistence.impl.inmemory;

import eapli.base.answerQuestionnairemanagement.domain.AnswerQuestionaire;
import eapli.base.answerQuestionnairemanagement.repositories.AnswerQuestionaireRepository;
import eapli.base.questionnairemanagement.domain.Questionnaire;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.List;

public class InMemoryAnswerQuestionaireRepository extends InMemoryDomainRepository<AnswerQuestionaire,Integer> implements AnswerQuestionaireRepository {
    @Override
    public List<AnswerQuestionaire> findByQuestionnaire(Questionnaire q) {
        return List.of(data().get(q));
    }
}
