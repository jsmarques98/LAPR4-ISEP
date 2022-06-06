package eapli.base.app.backoffice.console.presentation.order;

import eapli.base.ordermanagement.application.AccessOrderController;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.ordermanagement.domain.OrderStatus;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

import java.util.ArrayList;
import java.util.List;

public class AccessOrderUi extends AbstractUI {
    private final AccessOrderController accessOrderController = new AccessOrderController();
    private  List<CustomerOrder> customerOrderAllList=new ArrayList<>();
    private  final List<CustomerOrder> customerOrderList=new ArrayList<>();
    private OrderStatus findStatus, changeStatus;
   private boolean flag=true;


   public AccessOrderUi(OrderStatus findStatus, OrderStatus changeStatus){
       this.findStatus = findStatus;
       this.changeStatus = changeStatus;
   }

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
        customerOrderAllList= accessOrderController.findOrder(findStatus);
        if (customerOrderAllList.size() == 0) {
            System.out.println("There aren't any orders!");
        }
        else {
            while (flag) {
                showCustomerOrderOptions();
            }
            accessOrderController.setStatusCustomerOrderList(customerOrderList, changeStatus);
        }
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
