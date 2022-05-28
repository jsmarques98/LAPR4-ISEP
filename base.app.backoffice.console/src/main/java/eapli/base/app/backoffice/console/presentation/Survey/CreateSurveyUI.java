package eapli.base.app.backoffice.console.presentation.Survey;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.questionnairemanagement.application.QuestionnaireController;
import eapli.framework.actions.Action;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateSurveyUI extends AbstractUI {

    private QuestionnaireController controller = new QuestionnaireController();

    private List<Category> categories = new ArrayList<>();

    @Override
    protected boolean doShow() {
        try {
            if (createSurvey()) {
                System.out.println("Successful survey created");
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Unsuccessful survey creation");
        return false;
    }

    private boolean createSurvey() throws IOException {
        String id = Console.readLine("Alphanumerical Code: ");
        String description = Console.readLine("Description: ");
        String title = Console.readLine("Title: ");

        String welcomeM = Console.readLine("Welcome Message: ");
        List<String> answer;

        List<String> section = new ArrayList<>();
        List<String> questionList;
        Map<String, List<String>> question = new HashMap<>();
        do {
            section.add(Console.readLine("  Section ID: "));
            String sectionId = section.get(section.size() - 1);
            section.add(Console.readLine("  Section Title: "));
            section.add(Console.readLine("  Section Description: "));
            section.add(Console.readLine("  Section Obligatoriness: "));
            section.add(Console.readLine("  Section Repeatability: "));
            questionList = new ArrayList<>();
            do {
                questionList.add(Console.readLine("Question ID: "));
                questionList.add(Console.readLine("Question Text: "));
                questionList.add(Console.readLine("Instruction: "));
                questionList.add(Console.readLine("Type: "));
                questionList.add(Console.readLine(" Question Obligatoriness: "));
                questionList.add(Console.readLine("Extra Info: "));

                answer = new ArrayList<>();
                showAnswer(answer, "Do you want to add another question?");
            } while (answer.get(0).equals("YES"));

            System.out.println("------------------------");
            System.out.println(questionList.size());
            System.out.println("------------------------");
            question.put(sectionId, questionList);
            answer = new ArrayList<>();
            showAnswer(answer, "Do you want to add another section?");
        } while (answer.get(0).equals("YES"));

        String finalM = Console.readLine("Final Message:: ");

        findCustomers();
        return controller.createQuestionnaire(id, description,title,section,question,welcomeM,finalM);
    }

    private boolean showAnswer(List<String> showAnswer, String string) {
        System.out.println(string);
        final Menu categoriesMenu = buildAnswerMenu(showAnswer);
        final MenuRenderer renderer = new VerticalMenuRenderer(categoriesMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildAnswerMenu(List<String> answer) {
        final Menu answerMenu = new Menu();
        int counter = 1;
        answerMenu.addItem(MenuItem.of(counter++, "Yes", () -> answer.add("YES")));
        answerMenu.addItem(MenuItem.of(counter++, "No", () -> answer.add("NO")));
        return answerMenu;
    }


    private boolean findCustomers() {
        final Menu optionsMenu = new Menu();
        int counter = 0;
        optionsMenu.addItem(MenuItem.of(counter++, "Cancel", Actions.SUCCESS));
        optionsMenu.addItem(MenuItem.of(counter++, "Customers who ordered a particular product", findCustomersForProduct()));
        optionsMenu.addItem(MenuItem.of(counter++, "Customers who ordered a product from a certain category", findCustomersForCategory()));
        optionsMenu.addItem(MenuItem.of(counter++, "Customers who ordered a product from a certain Brand", findCustomerForBrand()));
        optionsMenu.addItem(MenuItem.of(counter++, "Customers of a certain age group", findCustomersForAge()));
        optionsMenu.addItem(MenuItem.of(counter++, "Customers of a certain gender", findCustomerForGender()));


        final MenuRenderer renderer = new VerticalMenuRenderer(optionsMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Action findCustomersForProduct() {
        return new Action() {
            @Override
            public boolean execute() {
                String id = Console.readLine("Alphanumerical Code: ");
                controller.getCustomerByProduct(id);
                return true;
            }
        };
    }

    private Action findCustomersForCategory() {
        return new Action() {
            @Override
            public boolean execute() {
                String category = Console.readLine("CategoryID: ");
                controller.getCustomerByCategory(category);
                return true;
            }
        };
    }

    private Action findCustomerForBrand() {
        return new Action() {
            @Override
            public boolean execute() {
                String brand = Console.readLine("Brand: ");
                controller.getCustomerByBrand(brand);
                return true;
            }
        };
    }

    private Action findCustomersForAge() {
        return new Action() {
            @Override
            public boolean execute() {
                Integer age = Console.readInteger("Age: ");
                Integer age1 = Console.readInteger("Age: ");
                controller.getCostumersByAge(age, age1);
                return true;
            }
        };
    }

    private Action findCustomerForGender() {
        return new Action() {
            @Override
            public boolean execute() {
                final List<String> genders = new ArrayList<>();
                System.out.println("Gender");
                boolean show;
                do {
                    show = showGenders(genders);
                } while (!show);

                System.out.println(genders.get(0));
                controller.getCostumersByGender(genders.get(0));
                return true;
            }
        };
    }

    private boolean showGenders(List<String> gender) {
        final Menu categoriesMenu = buildGenderMenu(gender);
        final MenuRenderer renderer = new VerticalMenuRenderer(categoriesMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildGenderMenu(List<String> gender) {
        final Menu genderMenu = new Menu();
        int counter = 1;
        genderMenu.addItem(MenuItem.of(counter++, "Male", () -> gender.add("Male")));
        genderMenu.addItem(MenuItem.of(counter++, "Female", () -> gender.add("Female")));

        return genderMenu;
    }

    @Override
    public String headline() {
        return "CREATE SURVEY";
    }
}