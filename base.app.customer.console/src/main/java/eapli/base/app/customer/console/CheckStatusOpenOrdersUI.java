package eapli.base.app.customer.console;

import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.ordermanagement.domain.OrderItem;
import eapli.framework.presentation.console.AbstractUI;

import java.util.List;

public class CheckStatusOpenOrdersUI extends AbstractUI {

    private CheckStatusOpenOrdersController checkStatusOpenOrdersController;
    private List<CustomerOrder> ordersList;

    public CheckStatusOpenOrdersUI() {
    }

    @Override
    protected boolean doShow() {
        checkStatusOpenOrdersController = new CheckStatusOpenOrdersController();
        if (checkStatusOpenOrdersController.testServerConnection()) {
            ordersList = checkStatusOpenOrdersController.getCustomerOpenOrders();
            if(ordersList.size()!=0) {
                System.out.println("\nYour Open Orders:\n");

                for(CustomerOrder co : ordersList){
                    System.out.println("    Order Date: " +  co.orderDate() + "\n");
                    System.out.println("    Order Status: " + co.status() + "\n");
                    System.out.println("    Products: \n");


                    for(OrderItem oi : co.orderItems()){
                        System.out.println("        Product: " + oi.product().shortDescription());
                        System.out.println("        Price: " + oi.product().basePrice()+"\n");
                    }
                    System.out.println("===================================================================");
                }
            }else{
                System.out.println("You dont have any open orders!");
            }


        } else {
            System.out.println("Connection with server failed");
        }
        return true;
    }

    @Override
    public String headline() {
        return "My Open Orders";
    }
}