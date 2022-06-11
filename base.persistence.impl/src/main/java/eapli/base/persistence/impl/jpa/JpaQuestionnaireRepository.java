package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.questionnairemanagement.domain.AlphanumericalCode;
import eapli.base.questionnairemanagement.domain.Questionnaire;
import eapli.base.questionnairemanagement.repositories.QuestionnaireRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class JpaQuestionnaireRepository extends JpaAutoTxRepository<Questionnaire, AlphanumericalCode, AlphanumericalCode>
        implements QuestionnaireRepository {


    public JpaQuestionnaireRepository(String persistenceUnitName) {
        super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(), "id");
    }

    public JpaQuestionnaireRepository(TransactionalContext tx) {
        super(tx, "id");
    }

    @Override
    public Optional<Questionnaire> findByAlphanumericalCode(AlphanumericalCode alphanumericalCode) {
        final Map<String, Object> alphanumCode = new HashMap<>();
        alphanumCode.put("anc", alphanumericalCode);
        return matchOne("e.alphanumericalCode=:anc", alphanumCode);
    }
}
