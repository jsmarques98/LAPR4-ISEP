package eapli.base.app.backoffice.console.presentation.order;

import eapli.base.agvmanagement.domain.AGV;
import eapli.base.ordermanagement.application.PrepareOrderController;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrepareOrderUI extends AbstractUI {

    private PrepareOrderController controller = new PrepareOrderController();
    private List<CustomerOrder> costumersOrderList = new ArrayList<>();
    private List<AGV> agvList=new ArrayList<>();

    @Override
    protected boolean doShow() {
        try {
            if(prepareOrder()) {
                System.out.println("Order successfully prepared");
                return true;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Unsuccessfully prepared order");
        return false;
    }

    private boolean prepareOrder() throws InterruptedException {
        System.out.println("Select one Order:");
        showOrders();
        System.out.println("Select one AGV:");
        showAGVs();
        controller.prepareOrder(costumersOrderList.get(0),agvList.get(0));
        return true;
    }

    private boolean showOrders() {
        final Menu categoriesMenu = buildOrdersMenu();
        final MenuRenderer renderer = new VerticalMenuRenderer(categoriesMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private boolean showAGVs() {
        final Menu categoriesMenu = buildAGVMenu();
        final MenuRenderer renderer = new VerticalMenuRenderer(categoriesMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildOrdersMenu() {
        final Menu ordersMenu = new Menu();
        int counter = 1;
        for(CustomerOrder order : controller.getCustomerOrdersPayed()) {
            ordersMenu.addItem(MenuItem.of(counter++, order.toString(),() -> costumersOrderList.add(order)));
        }
        return ordersMenu;
    }

    private Menu buildAGVMenu() {
        final Menu agvMenu = new Menu();
        int counter = 1;
        for(AGV agv : controller.getAGVFree()) {
            agvMenu.addItem(MenuItem.of(counter++, agv.toString(),() -> agvList.add(agv)));
        }

        return agvMenu;
    }

    @Override
    public String headline() {
        return "PREPARE ORDER";
    }

}
