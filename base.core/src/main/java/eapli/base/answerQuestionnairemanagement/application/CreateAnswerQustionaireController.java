package eapli.base.answerQuestionnairemanagement.application;

import eapli.base.answerQuestionnairemanagement.domain.AnswerQuestionaire;
import eapli.base.answerQuestionnairemanagement.repositories.AnswerQuestionaireRepository;
import eapli.base.categorymanagement.domain.Category;
import eapli.base.customermanagement.domain.Customer;
import eapli.base.customermanagement.repositories.CustomerRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.questionnairemanagement.domain.AlphanumericalCode;
import eapli.base.questionnairemanagement.domain.Questionnaire;
import eapli.base.questionnairemanagement.repositories.QuestionnaireRepository;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

import javax.persistence.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class CreateAnswerQustionaireController {
    private final RepositoryFactory repositoryFactory;
    private final AnswerQuestionaireRepository answerQuestionaireRepository;
    private final CustomerRepository customerRepository;
    private File file;
    private SystemUser systemUser;
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;
    private Customer customer;

    public CreateAnswerQustionaireController() {
        repositoryFactory = PersistenceContext.repositories();
        answerQuestionaireRepository = repositoryFactory.answerQuestionaire();
        customerRepository = repositoryFactory.customers();
        systemUser = authz.session().get().authenticatedUser();
        entityManagerFactory = Persistence.createEntityManagerFactory("eapli.base");
        entityManager = entityManagerFactory.createEntityManager();

    }

    public AnswerQuestionaire createAnswerQustionaire(Questionnaire q, String answerQuestionaire) {
        return answerQuestionaireRepository.save(new AnswerQuestionaire(customer, q));
    }

    public boolean questionnaire(Questionnaire q) {
        try {
            file = new File("base.core/src/main/resources/questionnaireAux.txt");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.write(q.questionnaire());
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean deleteAuxFile() {
        if (file.delete())
            return true;
        return false;
    }

    public Set<Questionnaire> getQuestionnaires() {
        EmailAddress email = systemUser.email();
        customer = customerRepository.findByEmail(email).get();
        Set<Questionnaire> questionnaireList = customer.questionnaires();
        Set<Questionnaire> aux = new HashSet<>(questionnaireList);
        for (Questionnaire questionnaire : questionnaireList) {

            Query query = entityManager.createQuery("SELECT id from AnswerQuestionaire  where questionnaire=?1 and customer=?2");
            query.setParameter(1, questionnaire);
            query.setParameter(2, customer);

            if(query.getResultList().size()!=0){
                aux.remove(questionnaire);
            }

        }

        return aux;
    }


}
