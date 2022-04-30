package eapli.base.app.backoffice.console.presentation.product;

import eapli.base.app.backoffice.console.presentation.MainMenu;
import eapli.base.app.backoffice.console.presentation.category.AddCategoryUI;
import eapli.base.categorymanagement.domain.Category;
import eapli.base.productmanagement.application.AddProductController;
import eapli.base.productmanagement.dto.ProductDTO;
import eapli.framework.actions.Actions;
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

import javax.swing.*;
import java.awt.*;
import java.io.File;
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
        String shortDescription = Console.readLine("Short Description: ");
        String longDescription = Console.readLine("Long Description: ");
        String technicalDescription = Console.readLine("Technical Description: ");
        String productionCode = Console.readLine("Production Code: ");
        String reference = Console.readLine("Reference: ");
        Double volume = Console.readDouble("Volume: ");
        Double weight = Console.readDouble("Weight: ");
        System.out.println("Product warehouse location");
        Integer rowID = Console.readInteger("Row ID:");
        Integer aisleID = Console.readInteger("Aisle ID:");
        Integer shelve = Console.readInteger("Shelve");
        System.out.println("Chose pictures:");
        List<String> picturesPaths = new ArrayList<>();
        FileDialog fd = new FileDialog(new JFrame());
        fd.setVisible(true);

        File[] f = fd.getFiles();


        ProductDTO productDTO = new ProductDTO(categories.get(0),uniqueInternalCode,barcode,basePrice,brand,shortDescription,productionCode,reference,volume,weight,fd.getFiles()[0].getAbsolutePath(),rowID,aisleID,longDescription,technicalDescription);
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
        int counter = 0;
        categoriesMenu.addItem(MenuItem.of(counter++, "Cancel",() -> new MainMenu().doShow()));
        List<Category> categoriesList = (List<Category>) controller.getCategories();
        if (categoriesList.size()!=0) {
            for (final Category category : categoriesList) {
                categoriesMenu.addItem(MenuItem.of(counter++, category.toString(), () -> categories.add(category)));
            }
        }else{
            System.out.println("You cant create Products because there is no categories.");
        }
        return categoriesMenu;
    }

    @Override
    public String headline() {
        return "ADD PRODUCT";
    }

}




