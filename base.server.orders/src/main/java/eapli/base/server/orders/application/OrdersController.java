package eapli.base.server.orders.application;

import eapli.base.customermanagement.domain.Customer;
import eapli.base.customermanagement.repositories.CustomerRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.ordermanagement.domain.OrderStatus;
import eapli.base.ordermanagement.repositories.CustomerOrderRepository;
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
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class OrdersController {
    private final ProductRepository productRepository;
    private final CustomerRepository customerRepository;
    private final CustomerOrderRepository customerOrderRepository;
    private final RepositoryFactory repositoryFactory;
    private final ShoppingCartRepository shoppingCartRepository;
    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;


    public OrdersController(){
        repositoryFactory = PersistenceContext.repositories();
        productRepository = repositoryFactory.products();
        customerRepository = repositoryFactory.customers();
        customerOrderRepository = repositoryFactory.customerOrder();
        shoppingCartRepository = repositoryFactory.shoppingCart();
        entityManagerFactory = Persistence.createEntityManagerFactory("eapli.base");
        entityManager = entityManagerFactory.createEntityManager();

    }


    public void saveShoppingCart(Map<Product, Integer> productQuantityMap, EmailAddress emailAddress){
        double totalPrice = 0;
        try {

            Customer customer = customerRepository.findByEmail(emailAddress).get();
            List<ShoppingCartItem> shoppingCartItemList = new ArrayList<>();
            for (Map.Entry<Product, Integer> entry : productQuantityMap.entrySet()) {
                if (entry.getValue() > 0) {
                    shoppingCartItemList.add(new ShoppingCartItem(entry.getKey(), entry.getValue()));
                    totalPrice = (entry.getKey().basePrice().basePrice() * entry.getValue()) + totalPrice;
                }
            }
            if (shoppingCartItemList.size() > 0)
                shoppingCartRepository.save(new ShoppingCart(customer, shoppingCartItemList, totalPrice));
        } catch (NoSuchElementException e){
            System.out.println("This email is not linked to any client!");
        }
    }

    public List<Product> getProducts(){
        return (List<Product>) productRepository.findAll();
    }

    @Transactional
    public List<CustomerOrder> getCustomerOpenOrders(EmailAddress emailAddress){


        Customer customer = customerRepository.findByEmail(emailAddress).get();

        Query query = entityManager.createQuery("SELECT idOrder from CustomerOrder where customer = ?1 and status!=?2");
        query.setParameter(1,customer);
        query.setParameter(2, OrderStatus.receivedByCustomer);

        List<CustomerOrder> ordersList = new ArrayList<>();
        List<Integer> ordersID = query.getResultList();
        for( Integer id : ordersID){
            ordersList.add(customerOrderRepository.findByOrderID(id));
        }

        return ordersList;
    }
}
