package eapli.base.CommunicationProtocol;

import eapli.base.CommunicationProtocol.utils.ProductsData;
import eapli.base.customermanagement.domain.Customer;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.productmanagement.domain.Product;
import eapli.framework.general.domain.model.EmailAddress;

import java.util.List;
import java.util.Map;

public interface Orders_API {
   ProductsData getProducts();
   boolean testServerConnection();

   boolean saveShoppingCartItems(Map<Product, Integer> productQuantityMap, EmailAddress email);

   List<CustomerOrder> getCustomerOpenOrders(EmailAddress emailAddress);
}
