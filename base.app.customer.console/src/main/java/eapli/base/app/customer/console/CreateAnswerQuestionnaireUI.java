package eapli.base.app.customer.console;

import eapli.base.answerQuestionnairemanagement.application.CreateAnswerQustionaireController;
import eapli.base.app.backoffice.console.presentation.MainMenu;
import eapli.base.app.backoffice.console.presentation.category.AddCategoryUI;
import eapli.base.categorymanagement.domain.Category;
import eapli.base.questionnairemanagement.domain.Questionnaire;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CreateAnswerQuestionnaireUI extends AbstractUI {
    private static final Logger LOGGER = LoggerFactory.getLogger(AddCategoryUI.class);
    private final CreateAnswerQustionaireController createAnswerQustionaireController = new CreateAnswerQustionaireController();

    @Override
    protected boolean doShow() {
        try {
            if (createAnswerQuestionnair()) {
                System.out.println("Successful answer questionnaire creation");
                return true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Unsuccessful answer questionnaire  creation");
        return false;
    }

    private boolean createAnswerQuestionnair() throws FileNotFoundException {
        final List<Questionnaire> questionnaires = new ArrayList<>();

         if (!showQuestionnaires(questionnaires))
            return false;
        createAnswerQustionaireController.questionnaire(questionnaires.get(0));
        Scanner in = new Scanner(new FileReader("base.core/src/main/resources/questionnaireAux.txt"));
        String answer = "";
        in.nextLine();
        String line = in.nextLine();
        while (line.length() != 0) {
            System.out.println(line);
            line = in.nextLine();
        }
        System.out.println();
        line = in.nextLine();

        while (line.length() != 0) {
            while (line.length() != 0) {
                line = in.nextLine();
                System.out.println(line);

            }
            line = in.nextLine();

            while (line.length() != 0) {
                answer += line + "\n";
                while (line.length() != 0) {
                    line = in.nextLine();
                    System.out.println(line);
                }
                answer += Console.readLine("Answer: ");
                answer += "\n";
                line = in.nextLine();
            }
            line = in.nextLine();

        }
        line = in.nextLine();
        createAnswerQustionaireController.createAnswerQustionaire(questionnaires.get(0), answer);
        createAnswerQustionaireController.deleteAuxFile();
        return true;
    }

    private boolean showQuestionnaires(List<Questionnaire> questionnaires) {
        final Menu categoriesMenu = buildQuestionnairesMenu(questionnaires);
        final MenuRenderer renderer = new VerticalMenuRenderer(categoriesMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

   private Menu buildQuestionnairesMenu(List<Questionnaire> questionnaires) {
        final Menu questionnaireMenu = new Menu();
        int counter = 0;
        questionnaireMenu.addItem(MenuItem.of(counter++, "Cancel", () -> new MainMenu().doShow()));
       Set<Questionnaire>questionnaireList = createAnswerQustionaireController.getQuestionnaires();

        if (questionnaireList.size() != 0) {
            for (final Questionnaire questionnaire : questionnaireList) {
                questionnaireMenu.addItem(MenuItem.of(counter++, questionnaire.description().toString(), () -> questionnaires.add(questionnaire)));
            }
        } else {
            System.out.println("You cant create Products because there is no categories.");
        }
        return questionnaireMenu;
    }


    @Override
    public String headline() {
        return "ANSWER QUESTIONNAIRE";
    }
}
