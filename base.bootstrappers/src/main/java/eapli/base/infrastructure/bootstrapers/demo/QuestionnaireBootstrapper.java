package eapli.base.infrastructure.bootstrapers.demo;

import eapli.base.agvmanagement.application.AddAGVController;
import eapli.base.agvmanagement.domain.AGV;
import eapli.base.customermanagement.domain.Customer;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.questionnairemanagement.application.QuestionnaireController;
import eapli.base.questionnairemanagement.domain.AlphanumericalCode;
import eapli.base.questionnairemanagement.domain.Description;
import eapli.framework.actions.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuestionnaireBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            QuestionnaireBootstrapper.class);

    private final QuestionnaireController controller = new QuestionnaireController();

    @Override
    public boolean execute() {
        List<Customer> customerList = (List<Customer>) PersistenceContext.repositories().customers().findAll();
        try {
            controller.createQuestionnaireByTxtFile("base.core/src/main/java/eapli/base/questionnairemanagement/flieTXT/test.txt", AlphanumericalCode.valueOf("123456"), Description.valueOf("Primeiro questionario"),customerList);
            controller.createQuestionnaireByTxtFile("base.core/src/main/java/eapli/base/questionnairemanagement/flieTXT/test0.txt", AlphanumericalCode.valueOf("1234567"), Description.valueOf("Segundo questionario"),customerList);
        } catch (IOException e) {
            e.printStackTrace();
        }


        LOGGER.debug("Questionnaires successfully created.");
        return true;
    }
}
