package eapli.base.app.customer.console;

import eapli.base.Application;
import eapli.base.CommunicationProtocol.Orders_API;
import eapli.base.CommunicationProtocol.utils.ProductsData;
import eapli.base.productmanagement.domain.Product;

import java.lang.reflect.InvocationTargetException;

import java.util.List;

public class AddProductShoppingCartController {
    private Orders_API api;
    private ProductsData productsData;


    public AddProductShoppingCartController(){
        productsData = new ProductsData();
        try{



            this.api = (Orders_API) Class.forName(Application.settings().getOrdersAPI()).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

//    public List<Product> getProducts(){
//        api.testServerConnection();
//        productsData = api.getProducts();
//        return productsData.products;
//
//    }


    public void testServerConnection(){
        api.testServerConnection();
    }

}
