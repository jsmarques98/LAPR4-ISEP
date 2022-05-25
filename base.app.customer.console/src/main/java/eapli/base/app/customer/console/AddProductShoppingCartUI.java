package eapli.base.app.customer.console;

import eapli.base.productmanagement.domain.Product;
import eapli.framework.presentation.console.AbstractUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AddProductShoppingCartUI extends AbstractUI {
    private static final Logger LOGGER = LoggerFactory.getLogger(AddProductShoppingCartUI.class);
    private AddProductShoppingCartController addProductShoppingCartController ;

    public AddProductShoppingCartUI(){
        addProductShoppingCartController = new AddProductShoppingCartController();
    }
    @Override
    protected boolean doShow() {
        addProductShoppingCartController.testServerConnection();
        return true;
    }

    @Override
    public String headline() {
        return "ADD PRODUCT TO SHOPPING CART";
    }
}
