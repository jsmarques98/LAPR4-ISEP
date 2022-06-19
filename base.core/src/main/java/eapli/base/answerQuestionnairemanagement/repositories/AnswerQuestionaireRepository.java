package eapli.base.answerQuestionnairemanagement.repositories;

import eapli.base.answerQuestionnairemanagement.domain.AnswerQuestionaire;

import eapli.base.questionnairemanagement.domain.Questionnaire;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;
import java.util.Optional;

public interface AnswerQuestionaireRepository extends DomainRepository<Integer, AnswerQuestionaire> {

    default Optional<AnswerQuestionaire> findByID (Integer id) {
        return ofIdentity(id);
    }

    List<AnswerQuestionaire> findByQuestionnaire (Questionnaire q);

}
