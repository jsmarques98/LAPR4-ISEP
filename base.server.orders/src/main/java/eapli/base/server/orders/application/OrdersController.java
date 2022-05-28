package eapli.base.server.orders.application;

import eapli.base.customermanagement.domain.Customer;
import eapli.base.customermanagement.repositories.CustomerRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.productmanagement.domain.Product;
import eapli.base.productmanagement.repositories.ProductRepository;
import eapli.base.shoppingCartmanagement.domain.ShoppingCart;
import eapli.base.shoppingCartmanagement.domain.ShoppingCartItem;
import eapli.base.shoppingCartmanagement.repositories.ShoppingCartRepository;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrdersController {
    private final ProductRepository productRepository;
    private final CustomerRepository customerRepository;
    private final RepositoryFactory repositoryFactory;
    private final ShoppingCartRepository shoppingCartRepository;


    public OrdersController(){
        repositoryFactory = PersistenceContext.repositories();
        productRepository = repositoryFactory.products();
        customerRepository = repositoryFactory.customers();
        shoppingCartRepository = repositoryFactory.shoppingCart();
    }


    public void saveShoppingCart(Map<Product, Integer> productQuantityMap, EmailAddress emailAddress){
      Customer customer = customerRepository.findByEmail(emailAddress).get();
      List <ShoppingCartItem>shoppingCartItemList=new ArrayList<>();
        for (Map.Entry<Product, Integer> entry : productQuantityMap.entrySet()) {
            shoppingCartItemList.add(new ShoppingCartItem( entry.getKey(), entry.getValue()));
            System.out.println("Product: " + entry.getKey() + " Quantidade: "+ entry.getValue());
        }
        shoppingCartRepository.save(new ShoppingCart(customer, shoppingCartItemList));
    }

    public List<Product> getProducts(){
        return (List<Product>) productRepository.findAll();
    }
}
