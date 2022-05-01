package eapli.base.app.backoffice.console.presentation.order;

import eapli.base.app.backoffice.console.presentation.Costumer.AddCustomerUI;
import eapli.base.app.backoffice.console.presentation.catalog.ShowCatalogUI;
import eapli.base.app.backoffice.console.presentation.product.AddProductUI;
import eapli.base.customermanagement.domain.Customer;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.ordermanagement.application.RegisterOrderController;
import eapli.base.productmanagement.domain.Product;
import eapli.base.productmanagement.domain.Reference;
import eapli.base.productmanagement.repositories.ProductRepository;
import eapli.framework.actions.Action;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.ShowUiAction;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;


public class RegisterOrderForClientUI extends AbstractUI {
    private static final Logger LOGGER = LoggerFactory.getLogger(AddProductUI.class);
    private final RegisterOrderController controller = new RegisterOrderController();
    private List<String> productsUIC = new ArrayList<>();
    private boolean flag = true;

    @Override
    protected boolean doShow() {
        if (registerOrder()) {
            System.out.println("Successful order registration");
            return true;
        }
        System.out.println("Unsuccessful order registration");
        return false;
    }

    private boolean registerOrder() {

        try {
            showCustomerOptions();
            return true;
        } catch (final IntegrityViolationException e) {
            System.out.println("Id is already in use.");
        } catch (final ConcurrencyException e) {
            LOGGER.error("This should never happen", e);
            System.out.println("Unfortunately there was an unexpected error in the application. Please try again and if the problem persists, contact your system administrator.");
        }
        return false;
    }

    private boolean showCustomerOptions() {
        final Menu customerOptions = buildCustomerOptions();
        final MenuRenderer renderer = new VerticalMenuRenderer(customerOptions, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildCustomerOptions() {
        final Menu genderMenu = new Menu();
        int counter = 1;
        genderMenu.addItem(MenuItem.of(counter++, "Create customer", () -> createClientFirstThenOrder()));
        genderMenu.addItem(MenuItem.of(counter++, "Existing customer", () -> createOrderForCustomer()));
        return genderMenu;
    }

    public boolean createClientFirstThenOrder() {
        AddCustomerUI customerUI = new AddCustomerUI();
        Action action = new ShowUiAction(customerUI);
        action.execute();

        createOrderForCustomer();
        return true;
    }

    public boolean createOrderForCustomer() {
        String customerVATID = Console.readLine("Insert customer VAT ID:");
        Customer customer = controller.getCustomerByVATID(customerVATID);

        controller.createOrderForCustomer(customer);

        getProducts();

        return true;
    }

    private boolean getProducts() {
        while (flag == true) {

            showOrderOptions();
        }
        controller.createOrderItem(productsUIC);
        return true;
    }

    private boolean showOrderOptions() {
        final Menu orderOptions = buildOrderOptions();
        final MenuRenderer renderer = new VerticalMenuRenderer(orderOptions, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildOrderOptions() {
        final Menu genderMenu = new Menu();
        int counter = 1;
        ShowCatalogUI showCatalog = new ShowCatalogUI();
        genderMenu.addItem(MenuItem.of(counter++, "Insert product UIC", () -> productsUIC.add(Console.readLine("UIC"))));
        genderMenu.addItem(MenuItem.of(counter++, "Search in catalog", showCatalog::show));
        genderMenu.addItem(MenuItem.of(counter++, "Finish Order", () -> finishOrder()));
        return genderMenu;
    }

    public boolean finishOrder() {
        flag = false;
        return flag;
    }

    @Override
    public String headline() {
        return "REGISTER ORDER FOR CLIENT";
    }
}