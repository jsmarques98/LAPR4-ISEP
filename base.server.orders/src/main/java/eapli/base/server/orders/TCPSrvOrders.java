package eapli.base.server.orders;

import eapli.base.CommunicationProtocol.utils.*;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.server.orders.application.OrdersController;
import eapli.framework.general.domain.model.EmailAddress;
import org.springframework.transaction.annotation.Transactional;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import java.io.*;
import java.net.*;
import java.util.List;

class TcpSrvOrders {
    static final String TRUSTED_STORE = "orders_server_J.jks";
    static final String KEYSTORE_PASS = "forgotten";
    static SSLServerSocket sock;


    public static void main(String args[]) throws Exception {
        // Trust these certificates provided by authorized clients
        System.setProperty("javax.net.ssl.trustStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.trustStorePassword", KEYSTORE_PASS);

        // Use this certificate and private key as server certificate
        System.setProperty("javax.net.ssl.keyStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.keyStorePassword", KEYSTORE_PASS);

        SSLServerSocketFactory sslF = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
        Socket cliSock;

        System.out.println("Server ON \n");
        try {
            sock = (SSLServerSocket) sslF.createServerSocket(9999);
            sock.setNeedClientAuth(true);
        }
        catch(IOException ex) {
            System.out.println("Failed to open server socket\n");
            System.out.println(ex.getCause());
            System.out.println(ex.getMessage());
            System.exit(1);
        }

        while(true) {
            cliSock=sock.accept();
            new Thread(new TcpSrvOrdersThread(cliSock)).start();
        }
    }
}



class TcpSrvOrdersThread implements Runnable {
    private Socket s;
    private ObjectOutputStream sOut;
    private ObjectInputStream sIn;
    private DataHandler dataHandler;
    private ProductsData productsData = new ProductsData();
    private OrdersController ordersController;


    public TcpSrvOrdersThread(Socket cli_s) {
        s=cli_s;
        dataHandler = new DataHandler(cli_s);
        ordersController = new OrdersController();
    }


    public void run() {
        InetAddress clientIP;
        clientIP = s.getInetAddress();
        System.out.println("New client connection from " + clientIP.getHostAddress() +
                ", port number " + s.getPort()+"\n");
        boolean a = true;
        while (a) {
            try {
                sIn = new ObjectInputStream(s.getInputStream());

                Object o = sIn.readObject();

                TCPData data = (TCPData) o;

                switch (data.messageCode()) {

                    case 0:
                        System.out.println("COMMTEST Code (0) received from client.\n");
                        dataHandler.sendData(new byte[0], MessageCodes.ACK);
                        System.out.println("Sending ACK Code (2) to client");

                        break;

                    case 1:
                        System.out.println("DISCONN Code (1) received from client.\n");
                        dataHandler.sendData(new byte[0], MessageCodes.ACK);
                        System.out.println("Sending ACK Code (2) to client");
                        System.out.println("Client " + clientIP.getHostAddress() + ", port number: " + s.getPort() +
                                " disconnected \n");
                        a=false;
                        s.close();
                        break;

                    case 4:
                        System.out.println("Client asking for products (4)\n");
                        productsData.products = ordersController.getProducts();

                        ByteArrayOutputStream out = new ByteArrayOutputStream();


                        try {
                            ObjectOutputStream os = new ObjectOutputStream(out);
                            os.writeObject(productsData.products);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        byte[] productsBytes = out.toByteArray();

                        System.out.println("Sending list of products to client.\n");
                        dataHandler.sendData(productsBytes, MessageCodes.SUCCESS);
                        break;

                    case 7:

                        System.out.println("Client asking to save shopping cart (7)\n");

                        ShoppingCartItemsData shoppingCartItemsData;


                        byte[] receivedData = data.messageData();
                        System.out.println(receivedData.length);


                        ByteArrayInputStream bIn = new ByteArrayInputStream(receivedData);
                        ObjectInputStream sIn = new ObjectInputStream(bIn);

                        shoppingCartItemsData = (ShoppingCartItemsData) sIn.readObject();

                        ordersController.saveShoppingCart(shoppingCartItemsData.productsAddedList,shoppingCartItemsData.email);

                        System.out.println("Saving shopping cart.\n");
                        dataHandler.sendData(new byte[0], MessageCodes.SUCCESS);
                        break;

                    case 15:

                        System.out.println("Client asking to get Customer Open Orders (15)");

                        CheckOpenOrdersRequest checkOpenOrdersRequest = new CheckOpenOrdersRequest(data.messageData(),dataHandler,ordersController);

                        checkOpenOrdersRequest.execute();

                        System.out.println("Sending list of orders to client.\n");

                        break;
                }

            } catch (IOException ex) {
                break;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}