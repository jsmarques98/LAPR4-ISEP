package eapli.base.app.backoffice.console.presentation.order;

import eapli.base.ordermanagement.application.FindOrderPreparedController;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

import java.util.ArrayList;
import java.util.List;

public class FindOrderPreparedUi extends AbstractUI {
    private final FindOrderPreparedController findOrderController = new FindOrderPreparedController();
    private  List<CustomerOrder> customerOrderAllList=new ArrayList<>();
    private  final List<CustomerOrder> customerOrderList=new ArrayList<>();
   private boolean flag=true;



    @Override
    protected boolean doShow() {
        if (findOrder()) {
            System.out.println("Success in accessing the list of orders that have already been prepared by the AGVs");
            return true;
        }
        System.out.println("Unsuccessful  in accessing the list of orders that have already been prepared by the AGVs");
        return false;
    }

    private boolean findOrder() {
        customerOrderAllList=findOrderController.findOrder();
        System.out.println(customerOrderAllList.size());
        while(flag) {
            showCustomerOrderOptions();
        }
        findOrderController.setStatusCustomerOrderList(customerOrderList);
        return  true;
    }
    private boolean showCustomerOrderOptions() {
        final Menu customerOrderOptions = buildCustomerOrderMenu();
        final MenuRenderer renderer = new VerticalMenuRenderer(customerOrderOptions, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildCustomerOrderMenu(){
        final Menu productsMenu = new Menu();
        int count = 1;
        System.out.println("Choose an Order for which you want to change the platform for customer delivery.");
        for (CustomerOrder c: customerOrderAllList) {
            productsMenu.addItem(MenuItem.of(count++, c.toString(), () -> addChoosedCustomerOrder(c)));
        }
        productsMenu.addItem(MenuItem.of(0, "Finish", () -> finishAddingCustomerOrder()));
        return productsMenu;
    }


    public boolean finishAddingCustomerOrder(){
        flag = false;
        return flag;
    }



    private boolean addChoosedCustomerOrder(CustomerOrder product) {
        customerOrderList.add(product);
        customerOrderAllList.remove(product);
        return  true;

    }


    @Override
    public String headline() {
        return "Access the list of orders that have already been prepared by the AGVs";
    }
}
