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

import java.util.ArrayList;
import java.util.List;

public class CreateSurveyUI extends AbstractUI {

    private QuestionnaireController controller = new QuestionnaireController();
    private List<Category> categories = new ArrayList<>();

    @Override
    protected boolean doShow() {
        if (createSurvey()) {
            System.out.println("Successful survey created");
            return true;
        }
        System.out.println("Unsuccessful survey creation");
        return false;
    }

    private boolean createSurvey() {
        String id = Console.readLine("Alphanumerical Code: ");
        String description = Console.readLine("Description: ");
        findCustomers();
        return controller.createQuestionnaire(id, description);
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
