package eapli.base.infrastructure.bootstrapers.demo;

import eapli.base.clientusermanagement.application.AcceptRefuseSignupFactory;
import eapli.base.clientusermanagement.application.AcceptRefuseSignupRequestController;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.myclientuser.application.SignupController;
import eapli.base.categorymanagement.application.AddCategoryController;
import eapli.base.categorymanagement.domain.Category;
import eapli.base.categorymanagement.domain.Description;
import eapli.framework.actions.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class CategoryBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            CategoryBootstrapper.class);

    private final AddCategoryController controller = new AddCategoryController();

    @Override
    public boolean execute() {

        Category cat, cat1, cat2, cat3;

        cat = controller.createCategory("12345", "computers");
        cat1 = controller.createCategory("123456", "make up");
        cat2 = controller.createCategory("1234567", "furniture");
        cat3 = controller.createCategory("12345678", "smartphones");

        PersistenceContext.repositories().category().save(cat);
        PersistenceContext.repositories().category().save(cat1);
        PersistenceContext.repositories().category().save(cat2);
        PersistenceContext.repositories().category().save(cat3);

        LOGGER.debug("The categories were successfully created.");
        return true;
    }
}
