package eapli.base.infrastructure.bootstrapers.demo;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.categorymanagement.domain.CategoryID;
import eapli.base.categorymanagement.domain.Description;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.productmanagement.application.AddProductController;
import eapli.base.productmanagement.domain.Product;
import eapli.base.productmanagement.dto.ProductDTO;
import eapli.base.warehousemanagement.application.UpdateWarehouseController;
import eapli.framework.actions.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.io.IOException;

public class WarehouseBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            WarehouseBootstrapper.class);

    private final UpdateWarehouseController controller = new UpdateWarehouseController();

    @Override
    public boolean execute() {
        try {
            System.out.println("adsadadad \n asdadhbadadb \n sadjhhadgsahd \n");
            controller.updateWarehouse();
            System.out.println("adsadadad \n asdadhbadadb \n sadjhhadgsahd \n");

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        LOGGER.debug("The products were successfuly created.");
        return true;
    }
}
