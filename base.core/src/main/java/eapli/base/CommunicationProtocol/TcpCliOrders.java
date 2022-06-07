package eapli.base.CommunicationProtocol;

import eapli.base.CommunicationProtocol.utils.*;
import eapli.base.customermanagement.domain.Customer;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.productmanagement.domain.Product;
import eapli.framework.general.domain.model.EmailAddress;
import org.springframework.security.core.parameters.P;

import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TcpCliOrders implements Orders_API {
    static final int SERVER_PORT = 9999;
    static final String certificate = "base.server.orders/src/main/resources/certificates/orders_server/client1_orders_J.jks";
    static InetAddress serverIP;
    static SSLSocket socket;
    private DataHandler dataHandler;

    public TcpCliOrders() {



        // Trust these certificates provided by authorized clients
        System.setProperty("javax.net.ssl.trustStore", certificate);
        System.setProperty("javax.net.ssl.trustStorePassword", "forgotten");

        // Use this certificate and private key as server certificate
        System.setProperty("javax.net.ssl.keyStore", certificate);
        System.setProperty("javax.net.ssl.keyStorePassword", "forgotten");
        SSLSocketFactory sslF = (SSLSocketFactory) SSLSocketFactory.getDefault();

        try {
            serverIP = InetAddress.getByName("vs688.dei.isep.ipp.pt");
        } catch (UnknownHostException ex) {
            System.out.println("Invalid server specified: ");
            System.exit(1);
        }

        try {
            socket = (SSLSocket) sslF.createSocket(serverIP, SERVER_PORT);
            dataHandler = new DataHandler(socket);
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Failed to establish TCP connection");
            System.exit(1); }
    }
    @Override
    public boolean testServerConnection(){
        TCPData message;
        try {

            dataHandler.sendData(new byte[0], MessageCodes.COMTEST);

            message = dataHandler.readData();


            if (message.messageCode()==2){
                System.out.println("Server connection is ok!\n");
                return true;
            }else{
                System.out.println("Server connection failed!\n");
                return false;
            }

        } catch ( IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean saveShoppingCartItems(Map<Product, Integer> productQuantityMap, EmailAddress email) {
        TCPData message;
        ShoppingCartItemsData shoppingCartItemsData = new ShoppingCartItemsData();
        shoppingCartItemsData.productsAddedList = productQuantityMap;
        shoppingCartItemsData.email = email;
        try {

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream os = new ObjectOutputStream(out);

            os.writeObject(shoppingCartItemsData);

            byte[] shoppingCartItems = out.toByteArray();



            dataHandler.sendData(shoppingCartItems, MessageCodes.SAVESHOPPINGCART);


            message = dataHandler.readData();

            if (message.messageCode() == 3) {
                System.out.println("Shopping cart saved successfully!\n");
                return true;
            } else {
                System.out.println("Error saving shopping cart!\n");
                return false;
            }

        } catch (IOException e) {
            e.printStackTrace();
            try {
                socket.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
            return false;
        }
    }

    @Override
    public List<CustomerOrder> getCustomerOpenOrders(EmailAddress emailAddress) {
        TCPData message;
        List<CustomerOrder> ordersList= new ArrayList<>();
        try {

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream os = new ObjectOutputStream(out);

            os.writeObject(emailAddress);

            byte[] emailBytes = out.toByteArray();

            dataHandler.sendData(emailBytes, MessageCodes.GETCUSTOMEROPENORDERS);

            message = dataHandler.readData();

            byte[] receivedData = message.messageData();

            ByteArrayInputStream bIn = new ByteArrayInputStream(receivedData);
            ObjectInputStream sIn2 = new ObjectInputStream(bIn);
            ordersList= (List<CustomerOrder>) sIn2.readObject();

            if(message.messageCode()==3)
                System.out.println("Open orders requested successfully");
            else{
                System.out.println("Open orders requested unsuccessfully");
                return null;
            }


        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return ordersList;
    }

    @Override
    public ProductsData getProducts() {
        ProductsData productsData = new ProductsData();
        TCPData message;
        try {
            dataHandler.sendData(new byte[0], MessageCodes.GETPRODUCTS);

            message = dataHandler.readData();

            byte[] receivedData = message.messageData();
            ByteArrayInputStream bIn = new ByteArrayInputStream(receivedData);
            ObjectInputStream sIn2 = new ObjectInputStream(bIn);
            productsData.products = (List<Product>) sIn2.readObject();


        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return productsData;
    }

}
