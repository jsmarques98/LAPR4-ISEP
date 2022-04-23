package eapli.base.app.backoffice.console.presentation.product;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.productmanagement.application.AddProductController;
import eapli.base.productmanagement.dto.ProductDTO;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class AddProductUI extends AbstractUI {
    private static final Logger LOGGER = LoggerFactory.getLogger(AddProductUI.class);
    private final AddProductController controller = new AddProductController();

    @Override
    protected boolean doShow() {
        if(createProduct()) {
            System.out.println("Successful product creation");
            return true;
        }
        System.out.println("Unsuccessful product creation");
        return false;
    }

    private boolean createProduct() {

        final List<Category> categories = new ArrayList<>();

        boolean show;
        do {
            show = showCategories(categories);
        } while (!show);


        String uniqueInternalCode = Console.readLine("Unique Internal Code: ");
        String barcode = Console.readLine("Barcode: ");
        Double basePrice = Console.readDouble("Base Price: ");
        String brand = Console.readLine("Brand: ");
        String description = Console.readLine("Description: ");
        String productionCode = Console.readLine("Production Code: ");
        String reference = Console.readLine("Reference: ");
        Double volume = Console.readDouble("Volume: ");
        Double weight = Console.readDouble("Weight: ");


        ProductDTO productDTO = new ProductDTO(categories.get(0),uniqueInternalCode,barcode,basePrice,brand,description,productionCode,reference,volume,weight);
        try {
            controller.createProduct(productDTO);
            return true;
        } catch (final IntegrityViolationException e) {
            System.out.println("Unique Internal Code is already in use.");
        } catch (final ConcurrencyException e) {
            LOGGER.error("This should never happen", e);
            System.out.println(
                    "Unfortunately there was an unexpected error in the application. Please try again and if the problem persists, contact your system administrator.");
        }
        return false;
    }

    private boolean showCategories(List<Category> categories) {
        final Menu categoriesMenu = buildCategoriesMenu(categories);
        final MenuRenderer renderer = new VerticalMenuRenderer(categoriesMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildCategoriesMenu(List<Category> categories) {
        final Menu categoriesMenu = new Menu();
        int counter = 1;
        for (final Category category : controller.getCategories()) {
            categoriesMenu.addItem(MenuItem.of(counter++, category.toString(), () -> categories.add(category)));
        }
        return categoriesMenu;
    }

    @Override
    public String headline() {
        return "ADD PRODUCT";
    }

}




