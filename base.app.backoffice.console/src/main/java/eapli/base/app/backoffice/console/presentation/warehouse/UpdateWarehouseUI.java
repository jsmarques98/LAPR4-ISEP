package eapli.base.app.backoffice.console.presentation.warehouse;



import eapli.base.warehousemanagement.application.UpdateWarehouseController;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.actions.Actions;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


public class UpdateWarehouseUI extends AbstractUI {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpdateWarehouseUI.class);
    private final UpdateWarehouseController controller = new UpdateWarehouseController();

    @Override
    protected boolean doShow() {
        if(updateWarehouse()) {
            System.out.println("Successful warehouse plant update");
            return true;
        }
        System.out.println("Unsuccessful warehouse plant update");
        return false;
    }

    private boolean updateWarehouse() {
        final Menu optionsMenu = new Menu();
        int counter = 0;


        optionsMenu.addItem(MenuItem.of(counter++, "Cancel", Actions.SUCCESS));
        optionsMenu.addItem(MenuItem.of(counter++, "Update Warehouse", () -> {
            try {
                return controller.updateWarehouse();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }));

        final MenuRenderer renderer = new VerticalMenuRenderer(optionsMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    @Override
    public String headline() {
        return "UPDATE WAREHOUSE";
    }
}
