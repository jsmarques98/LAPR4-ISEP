package eapli.base.app.backoffice.console.presentation.order;



import eapli.base.CommunicationProtocol.PrepareOrderAutoController;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

public class PrepareOrderAutoUI extends AbstractUI {
    private PrepareOrderAutoController prepareOrderController =new PrepareOrderAutoController();

    @Override
    protected boolean doShow() {
        if(showPrepareOrderAuto()) {
            System.out.println("Prepare auto Order Activated");
            return true;
        }
        System.out.println("Unsuccessfully prepared order auto execution");
        return false;
    }

    private boolean showPrepareOrderAuto() {
        final Menu categoriesMenu = buildPrepareOrderAutoMenu();
        final MenuRenderer renderer = new VerticalMenuRenderer(categoriesMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildPrepareOrderAutoMenu() {
        final Menu ordersMenu = new Menu();
        int counter = 0;
        ordersMenu.addItem(MenuItem.of(counter++, "Exit", Actions.SUCCESS));
        ordersMenu.addItem(MenuItem.of(counter++, "Activate",() -> activatePrepareOrderAuto()));
        ordersMenu.addItem(MenuItem.of(counter++, "Deactivate",() -> deactivatePrepareOrderAuto()));
        return ordersMenu;
    }

    private boolean activatePrepareOrderAuto(){
        return prepareOrderController.activatePrepareOrderAuto();
    }

    private boolean deactivatePrepareOrderAuto(){
        return prepareOrderController.deactivatePrepareOrderAuto();
    }

    @Override
    public String headline() {
        return "PREPARA ORDER AUTO";
    }
}
