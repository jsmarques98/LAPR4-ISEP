package eapli.base.app.backoffice.console.presentation.category;

import eapli.base.categorymanagement.application.AddCategoryController;
import eapli.base.categorymanagement.domain.Category;
import eapli.base.categorymanagement.domain.Description;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AddCategoryUI extends AbstractUI {
    private static final Logger LOGGER = LoggerFactory.getLogger(AddCategoryUI.class);
    private final AddCategoryController controller = new AddCategoryController();

    @Override
    protected boolean doShow() {
        if(createCategory()) {
            System.out.println("Successful category creation");
            return true;
        }
        System.out.println("Unsuccessful category creation");
        return false;
    }

    private boolean createCategory() {
        MecanographicNumber categoryID = MecanographicNumber.valueOf(Console.readLine("CategoryID: "));
        Description description = Description.valueOf(Console.readLine("Description: "));

        Category category = new Category(categoryID,description);
        try {
            controller.createCategory(category);
            return true;
        } catch (final IntegrityViolationException e) {
            System.out.println("Category ID is already in use.");
        } catch (final ConcurrencyException e) {
            LOGGER.error("This should never happen", e);
            System.out.println(
                    "Unfortunately there was an unexpected error in the application. Please try again and if the problem persists, contact your system administrator.");
        }
        return false;
    }

    @Override
    public String headline() {
        return "ADD CATEGORY";
    }

}