package eapli.base.app.backoffice.console.presentation.product;

import eapli.base.productmanagement.application.AddProductController;
import eapli.base.productmanagement.dto.ProductDTO;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AddProductUI extends AbstractUI {
    private static final Logger LOGGER = LoggerFactory.getLogger(AddProductUI.class);
    private final AddProductController controller = new AddProductController();

    @Override
    protected boolean doShow() {
        if(createProduct()) {
            saveProduct();
            return true;
        }
        System.out.println("Unsuccessful product creation");
        return false;
    }

    private boolean createProduct() {
        String uniqueInternalCode = Console.readLine("Unique Internal Code: ");
        String barcode = Console.readLine("Barcode: ");
        Double basePrice = Console.readDouble("Base Price: ");
        String brand = Console.readLine("Brand: ");
        String description = Console.readLine("Description: ");
        String productionCode = Console.readLine("Production Code: ");
        String reference = Console.readLine("Reference: ");
        Double volume = Console.readDouble("Volume: ");
        Double weight = Console.readDouble("Weight: ");


        ProductDTO productDTO = new ProductDTO(uniqueInternalCode,barcode,basePrice,brand,description,productionCode,reference,volume,weight);

        return controller.createProduct(productDTO);
    }

    @Override
    public String headline() {
        return "ADD PRODUCT";
    }

    private void saveProduct() {
        int selected_option;
        System.out.println("Do you confirm the entered data?");
        System.out.println(controller.showProduct().toString());

        do {
            selected_option = Console.readInteger(
                    "\nDo you want to save product?\n  1) Yes\n  2) No");
            if(selected_option!=1 && selected_option!=2) {
                System.out.println("Invalid option, try again!");
            }
        } while (selected_option!=1 && selected_option!=2);

        if(selected_option == 1) {
            if(!controller.persistProduct()) {
                System.out.println("Product non persisted");
            }else {
                System.out.println("Product persisted!");
            }
        }else {
            System.out.println("Canceled.");
        }
    }

}




