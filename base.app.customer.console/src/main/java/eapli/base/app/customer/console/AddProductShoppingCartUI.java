package eapli.base.app.customer.console;

import eapli.base.Application;
import eapli.base.productmanagement.domain.Product;
import eapli.framework.actions.Action;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.application.UserManagementService;
import eapli.framework.infrastructure.authz.application.UserSession;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.SystemUserDetails;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;


public class AddProductShoppingCartUI extends AbstractUI {
    private static final Logger LOGGER = LoggerFactory.getLogger(AddProductShoppingCartUI.class);
    private AddProductShoppingCartController addProductShoppingCartController ;
    private List<Product> productsList = new ArrayList<>();
    private Map<Product, Integer> productsAddedList = new HashMap<>();
    private boolean flag =true;

    public AddProductShoppingCartUI(){

    }

    @Override
    protected boolean doShow() {
        addProductShoppingCartController = new AddProductShoppingCartController();
        if(addProductShoppingCartController.testServerConnection()){
            productsList = addProductShoppingCartController.getProducts();
            while(flag) {
                showProducts();
            }

            addProductShoppingCartController.addProductsToShoppingCart(productsAddedList);

        } else {
            System.out.println("Connection with server failed");
        }
        return true;
    }

    @Override
    public String headline() {
        return "ADD PRODUCTS TO SHOPPING CART";
    }

    public boolean showProducts(){
        final Menu productsMenu = buildProductsMenu();
        final MenuRenderer renderer = new VerticalMenuRenderer(productsMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildProductsMenu(){
        final Menu productsMenu = new Menu();
        int count = 1;
        for (Product p: productsList) {
            productsMenu.addItem(MenuItem.of(count++, productToString(p), () ->addChoosedProductToCart(p)));
        }
        productsMenu.addItem(MenuItem.of(0, "Finish", () -> finishAddingProducts()));
        return productsMenu;
    }


    public boolean finishAddingProducts(){
        flag = false;
        return flag;
    }

    public boolean addChoosedProductToCart(Product product) {
        Integer quantity = Console.readInteger("Choose Quantity: \n");
        productsAddedList.put(product, quantity);
        productsList.remove(product);
        return true;
    }

    public String productToString(Product product) {
        return "Product: " + product.shortDescription() + "\n" + "Price: " + product.basePrice() + "\n";
    }
}