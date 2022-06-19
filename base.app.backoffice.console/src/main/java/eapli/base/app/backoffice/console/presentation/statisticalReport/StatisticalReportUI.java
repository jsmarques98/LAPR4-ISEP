package eapli.base.app.backoffice.console.presentation.statisticalReport;

import eapli.base.answerQuestionnairemanagement.application.StatisticalReport;
import eapli.base.app.backoffice.console.presentation.MainMenu;
import eapli.base.questionnairemanagement.domain.Questionnaire;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StatisticalReportUI extends AbstractUI {

    private final StatisticalReport statisticalreport = new StatisticalReport();

    public StatisticalReportUI() throws IOException {

    }

    @Override
    protected boolean doShow() {

        try {
            if (createStaticalReport()){
                return  true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean createStaticalReport() throws IOException {
        final List<Questionnaire> questionnaires = new ArrayList<>();
        System.out.println();
        if (!showQuestionnaires(questionnaires))
            return false;
        statisticalreport.createStatisticalReport(questionnaires.get(0));

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
        List<Questionnaire> questionnaireList = (List<Questionnaire>) statisticalreport.findAllQuestionnaire();

        System.out.println("------------------------------");
        System.out.println(questionnaireList);
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
        return "STATICAL REPORT";
    }
}
