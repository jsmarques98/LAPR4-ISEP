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

import java.io.*;
import java.util.*;

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
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Unsuccessful answer questionnaire  creation");
        return false;
    }

    private boolean createAnswerQuestionnair() throws IOException {
        final List<Questionnaire> questionnaires = new ArrayList<>();
        System.out.println();
        if (!showQuestionnaires(questionnaires))
            return false;
        createAnswerQustionaireController.questionnaire(questionnaires.get(0));
        Scanner in = new Scanner(new FileReader("base.core/src/main/resources/questionnaireAux.txt"));
        String answer = "";
        String line = null;
        try {
            //header
            line = in.nextLine();
            while (!line.substring(4, 5).equals("S")) {
                answer += line;
                answer += "\n";
                line = in.nextLine();
            }
            boolean aux = false;
            //repetir secçoes
            do {
                if (line.length() > 19) {
                    aux = !line.substring(8, 19).equals("QUESTION ID");
                } else {
                    aux = true;
                }
                //secçoes
                while (aux) {
                    answer += line;
                    answer += "\n";
                    line = in.nextLine();
                    if (line.length() > 19) {
                        aux = !line.substring(8, 19).equals("QUESTION ID");
                    } else {
                        aux = true;
                    }
                }
                //repetir questoes
                do {
                    do {
                        answer += line;
                        answer += "\n";
                        line = in.nextLine();


                        if (line.length() > 19) {
                            aux = !line.substring(8, 19).equals("QUESTION ID");
                        } else {
                            aux = true;
                        }
                    } while (aux && !line.substring(4, 5).equals("S") && !line.substring(0, 1).equals("E"));
                    answer += "        RESPONSE:";
                    answer += "A";
                    answer += "\n";
                } while (!aux);
            } while (line.substring(4, 5).equals("S"));
            if (line.substring(0, 1).equals("E")) {
                answer += line;
                answer += "\n";
            }
        } catch (NoSuchElementException e) {

        }

        File file1 = new File("base.core/src/main/resources/questionnaireAux.txt");
        PrintWriter printWriter = new PrintWriter(file1);
        printWriter.write(answer);
        printWriter.close();
        System.out.println(answer);
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
        Set<Questionnaire> questionnaireList = createAnswerQustionaireController.getQuestionnaires();

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