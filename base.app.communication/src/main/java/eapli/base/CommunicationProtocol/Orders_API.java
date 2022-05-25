package eapli.base.CommunicationProtocol;

import eapli.base.CommunicationProtocol.utils.ProductsData;

public interface Orders_API {
   ProductsData getProducts();
   boolean testServerConnection();
}
