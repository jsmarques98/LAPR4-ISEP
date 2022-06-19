package eapli.base.infrastructure.bootstrapers.demo;

import eapli.base.answerQuestionnairemanagement.application.CreateAnswerQustionaireController;
import eapli.base.customermanagement.domain.Customer;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.questionnairemanagement.application.QuestionnaireController;
import eapli.base.questionnairemanagement.domain.AlphanumericalCode;
import eapli.base.questionnairemanagement.domain.Description;
import eapli.base.questionnairemanagement.domain.Questionnaire;
import eapli.framework.actions.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class QustionnaireAnswerBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            QustionnaireAnswerBootstrapper.class);

    private final CreateAnswerQustionaireController controller = new CreateAnswerQustionaireController();

    @Override
    public boolean execute() {
        Questionnaire questionnaire = PersistenceContext.repositories().questionnaire().findByAlphanumericalCode(AlphanumericalCode.valueOf("12343521")).get();
        List<Customer> customers = (List<Customer>) PersistenceContext.repositories().customers().findAll();


        try {
            controller.createAnswerQuestionnaireByTxtFile("base.core/src/main/java/eapli/base/questionnairemanagement/flieTXT/text3.txt",questionnaire,customers.get(0));
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            controller.createAnswerQuestionnaireByTxtFile("",questionnaire,customers.get(1));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            controller.createAnswerQuestionnaireByTxtFile("",questionnaire,customers.get(2));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            controller.createAnswerQuestionnaireByTxtFile("",questionnaire,customers.get(3));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            controller.createAnswerQuestionnaireByTxtFile("",questionnaire,customers.get(4));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        LOGGER.debug("Questionnaires Answer successfully created.");
        return true;
    }

}
