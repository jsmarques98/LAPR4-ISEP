package eapli.base.questionnairemanagement.repositories;


import eapli.base.questionnairemanagement.domain.AlphanumericalCode;
import eapli.base.questionnairemanagement.domain.Questionnaire;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;
import java.util.Optional;

public interface QuestionnaireRepository extends DomainRepository<AlphanumericalCode, Questionnaire> {

    Optional<Questionnaire> findByAlphanumericalCode(AlphanumericalCode alphanumericalCode);

}
