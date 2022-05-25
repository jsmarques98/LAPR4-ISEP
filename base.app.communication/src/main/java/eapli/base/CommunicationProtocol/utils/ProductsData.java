package eapli.base.CommunicationProtocol.utils;

import eapli.base.productmanagement.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductsData {
    public List<Product> products;

    public ProductsData(){
        this.products = new ArrayList<>();
    }
}
