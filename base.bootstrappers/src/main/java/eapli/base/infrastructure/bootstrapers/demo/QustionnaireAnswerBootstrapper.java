package eapli.base.infrastructure.bootstrapers.demo;

import eapli.base.answerQuestionnairemanagement.application.CreateAnswerQustionaireController;
import eapli.base.customermanagement.domain.Customer;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.questionnairemanagement.domain.AlphanumericalCode;
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
        Questionnaire questionnaire = PersistenceContext.repositories().questionnaire().findByAlphanumericalCode(AlphanumericalCode.valueOf("123456")).get();
        Questionnaire questionnaire2 = PersistenceContext.repositories().questionnaire().findByAlphanumericalCode(AlphanumericalCode.valueOf("1234567")).get();
        List<Customer> customers = (List<Customer>) PersistenceContext.repositories().customers().findAll();


        try {
            controller.createAnswerQuestionnaireByTxtFile("base.core/src/main/java/eapli/base/answerQuestionnairemanagement/fileTXT/answer1.txt",questionnaire,customers.get(0));
            controller.createAnswerQuestionnaireByTxtFile("base.core/src/main/java/eapli/base/answerQuestionnairemanagement/fileTXT/answer6.txt",questionnaire2,customers.get(0));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            controller.createAnswerQuestionnaireByTxtFile("base.core/src/main/java/eapli/base/answerQuestionnairemanagement/fileTXT/answer2.txt",questionnaire,customers.get(1));
            controller.createAnswerQuestionnaireByTxtFile("base.core/src/main/java/eapli/base/answerQuestionnairemanagement/fileTXT/answer7.txt",questionnaire2,customers.get(0));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            controller.createAnswerQuestionnaireByTxtFile("base.core/src/main/java/eapli/base/answerQuestionnairemanagement/fileTXT/answer3.txt",questionnaire,customers.get(2));
            controller.createAnswerQuestionnaireByTxtFile("base.core/src/main/java/eapli/base/answerQuestionnairemanagement/fileTXT/answer8.txt",questionnaire2,customers.get(0));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            controller.createAnswerQuestionnaireByTxtFile("base.core/src/main/java/eapli/base/answerQuestionnairemanagement/fileTXT/answer4.txt",questionnaire,customers.get(3));
            controller.createAnswerQuestionnaireByTxtFile("base.core/src/main/java/eapli/base/answerQuestionnairemanagement/fileTXT/answer9.txt",questionnaire2,customers.get(0));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            controller.createAnswerQuestionnaireByTxtFile("base.core/src/main/java/eapli/base/answerQuestionnairemanagement/fileTXT/answer5.txt",questionnaire,customers.get(4));
            controller.createAnswerQuestionnaireByTxtFile("base.core/src/main/java/eapli/base/answerQuestionnairemanagement/fileTXT/answer10.txt",questionnaire2,customers.get(0));
        } catch (IOException e) {
            e.printStackTrace();
        }


        LOGGER.debug("Questionnaires Answer successfully created.");
        return true;
    }

}
