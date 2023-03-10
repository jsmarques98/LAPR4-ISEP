package eapli.base.ordermanagement.application;

import eapli.base.customermanagement.domain.Customer;
import eapli.base.customermanagement.domain.VatId;
import eapli.base.customermanagement.repositories.CustomerRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.ordermanagement.domain.OrderItem;
import eapli.base.ordermanagement.repositories.CustomerOrderRepository;

import eapli.base.ordermanagement.utils.EmailSender;
import eapli.base.productmanagement.domain.Product;
import eapli.base.productmanagement.domain.Reference;
import eapli.base.productmanagement.domain.UniqueInternalCode;
import eapli.base.productmanagement.repositories.ProductRepository;
import org.aspectj.weaver.ast.Or;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

public class RegisterOrderController {
    private final RepositoryFactory repositoryFactory;
    private final CustomerRepository customerRepository;
    private final CustomerOrderRepository orderRepository;
    private final ProductRepository productRepository;


    public RegisterOrderController() {
        repositoryFactory = PersistenceContext.repositories();
        customerRepository = repositoryFactory.customers();
        orderRepository = repositoryFactory.customerOrder();
        productRepository = repositoryFactory.products();

    }

    public Customer getCustomerByVATID(String vatId) {
        return customerRepository.findByVATId(VatId.valueOf(vatId)).get();
    }

    @Transactional
    public CustomerOrder createOrderForCustomer(String customerVATID,List<String> orederItem) {
        Customer customer = getCustomerByVATID(customerVATID);
        List<OrderItem> orderItems = new ArrayList<>();
        Double priceTotal = 0.0;
        for (String id : orederItem) {
            Product p = productRepository.findByUniqueInternalCode(UniqueInternalCode.valueOf(id)).get();
            priceTotal += p.basePrice().basePrice();
            orderItems.add(new OrderItem( p));
        }



        return orderRepository.save(new CustomerOrder(customer,orderItems));
    }
}
