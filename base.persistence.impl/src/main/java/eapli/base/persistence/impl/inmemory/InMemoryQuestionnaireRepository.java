package eapli.base.persistence.impl.inmemory;

import eapli.base.questionnairemanagement.domain.AlphanumericalCode;
import eapli.base.questionnairemanagement.domain.Questionnaire;
import eapli.base.questionnairemanagement.repositories.QuestionnaireRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

public class InMemoryQuestionnaireRepository extends InMemoryDomainRepository<Questionnaire, AlphanumericalCode>
        implements QuestionnaireRepository {

    @Override
    public Optional<Questionnaire> findByAlphanumericalCode(AlphanumericalCode alphanumericalCode) {
        return Optional.empty();
    }
}
