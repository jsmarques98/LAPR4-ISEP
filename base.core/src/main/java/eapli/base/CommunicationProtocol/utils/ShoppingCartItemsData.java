package eapli.base.CommunicationProtocol.utils;

import eapli.base.customermanagement.domain.Customer;
import eapli.base.productmanagement.domain.Product;
import eapli.framework.general.domain.model.EmailAddress;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCartItemsData implements Serializable {

    public Map<Product, Integer> productsAddedList;
    public EmailAddress email;

    public ShoppingCartItemsData() {
        productsAddedList = new HashMap<>();
    }

    public ShoppingCartItemsData(Map<Product, Integer> productQuantityMap, EmailAddress email) {
        this.productsAddedList = productQuantityMap;
        this.email = email;
    }


}
