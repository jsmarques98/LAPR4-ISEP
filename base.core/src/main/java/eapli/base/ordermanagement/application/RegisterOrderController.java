package eapli.base.ordermanagement.application;

import eapli.base.customermanagement.domain.Customer;
import eapli.base.customermanagement.domain.VatId;
import eapli.base.customermanagement.repositories.CustomerRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.ordermanagement.domain.OrderItem;
import eapli.base.ordermanagement.repositories.CustomerOrderRepository;
import eapli.base.ordermanagement.repositories.OrderItemRepository;
import eapli.base.ordermanagement.utils.EmailSender;
import eapli.base.productmanagement.domain.Product;
import eapli.base.productmanagement.domain.Reference;
import eapli.base.productmanagement.domain.UniqueInternalCode;
import eapli.base.productmanagement.repositories.ProductRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class RegisterOrderController {
    private final RepositoryFactory repositoryFactory;
    private final CustomerRepository customerRepository;
    private final CustomerOrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;
    private final ProductRepository productRepository;
    private CustomerOrder customerOrder;

    public RegisterOrderController() {
        repositoryFactory = PersistenceContext.repositories();
        customerRepository = repositoryFactory.customers();
        orderRepository = repositoryFactory.customerOrder();
        orderItemRepository = repositoryFactory.orderItem();
        productRepository = repositoryFactory.products();
        customerOrder = new CustomerOrder();
    }

    public Customer getCustomerByVATID(String vatId) {
        return customerRepository.findByVATId(VatId.valueOf(vatId)).get();
    }

    public CustomerOrder createOrderForCustomer(String customerVATID) {
        Customer customer = getCustomerByVATID(customerVATID);
        customerOrder = orderRepository.save(new CustomerOrder(customer));

        return customerOrder;
    }

    public void createOrderItem(List<String> orderItems) {
        double priceTotal = 0.0;
        for (String id : orderItems) {
            Product p = productRepository.findByUniqueInternalCode(UniqueInternalCode.valueOf(id)).get();
            priceTotal += p.basePrice().basePrice();
            orderItemRepository.save(new OrderItem(customerOrder, p));
        }
        customerOrder.setPrice(priceTotal);
        orderRepository.save(customerOrder);
        EmailSender emailSender = new EmailSender();
        String subject="Order Created";
        String message=String.format("an invoice was created with the price of %.2f", priceTotal);
        emailSender.sendEmail(customerOrder.getCustomer().getEmail().toString(),subject,message);
    }
}
