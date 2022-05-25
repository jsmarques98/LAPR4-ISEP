package eapli.base.server.orders.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.productmanagement.domain.Product;
import eapli.base.productmanagement.repositories.ProductRepository;

import java.util.List;

public class OrdersController {
    private ProductRepository productRepository;

    public OrdersController(){
        productRepository = PersistenceContext.repositories().products();
    }


    public List<Product> getProducts(){
        return (List<Product>) productRepository.findAll();
    }
}
