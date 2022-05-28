package eapli.base.app.customer.console;

import eapli.base.Application;
import eapli.base.CommunicationProtocol.Orders_API;
import eapli.base.CommunicationProtocol.utils.ProductsData;
import eapli.base.categorymanagement.repositories.CategoryRepository;
import eapli.base.customermanagement.domain.Customer;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.productmanagement.domain.Product;
import eapli.base.productmanagement.repositories.ProductRepository;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.lang.reflect.InvocationTargetException;

import java.util.List;
import java.util.Map;

public class AddProductShoppingCartController {
    private Orders_API api;
    private ProductsData productsData;
    private SystemUser systemUser;
    private final AuthorizationService authz = AuthzRegistry.authorizationService();



    public AddProductShoppingCartController(){
        productsData = new ProductsData();
        systemUser = authz.session().get().authenticatedUser();
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

    public List<Product> getProducts(){
        productsData = api.getProducts();
        return productsData.products;

    }


    public boolean testServerConnection(){
        return api.testServerConnection();
    }

    public boolean addProductsToShoppingCart(Map<Product,Integer> productsAndQuantities){
        api.saveShoppingCartItems(productsAndQuantities, systemUser.email());
        return true;
    }

}