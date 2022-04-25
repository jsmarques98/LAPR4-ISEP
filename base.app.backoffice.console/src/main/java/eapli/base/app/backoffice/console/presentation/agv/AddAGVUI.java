package eapli.base.app.backoffice.console.presentation.agv;

import eapli.base.agvmanagement.application.AddAGVController;
import eapli.base.agvmanagement.domain.IDAGV;
import eapli.base.agvmanagement.domain.MaxWeight;
import eapli.base.agvmanagement.domain.Model;
import eapli.base.agvmanagement.domain.ShortDescription;
import eapli.base.app.backoffice.console.presentation.product.AddProductUI;
import eapli.base.categorymanagement.domain.Category;
import eapli.base.productmanagement.application.AddProductController;
import eapli.base.productmanagement.dto.ProductDTO;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class AddAGVUI extends AbstractUI {
    private static final Logger LOGGER = LoggerFactory.getLogger(AddProductUI.class);
    private final AddAGVController controller = new AddAGVController();

    @Override
    protected boolean doShow() {
        if(createAGV()) {
            System.out.println("Successful agv creation");
            return true;
        }
        System.out.println("Unsuccessful agv creation");
        return false;
    }

    private boolean createAGV() {


        String idAgv = Console.readLine("AgvId:");
        String description = Console.readLine("description:");
        String model = Console.readLine("model:");
        Double weight = Console.readDouble("weight:");
        Integer autonomy = Console.readInteger("autonomy:");
        String location = Console.readLine("location:");


        try {
            controller.createAGV(idAgv,autonomy,weight,model,description);
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



    @Override
    public String headline() {
        return "ADD PRODUCT";
    }

}
