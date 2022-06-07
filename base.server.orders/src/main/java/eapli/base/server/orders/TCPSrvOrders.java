package eapli.base.server.orders;

import eapli.base.CommunicationProtocol.utils.*;
import eapli.base.productmanagement.domain.Product;
import eapli.base.server.orders.application.OrdersController;

import java.io.*;
import java.net.*;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

class TcpSrvOrders {
    static ServerSocket sock;

    public static void main(String args[]) throws Exception {
        Socket cliSock;
        System.out.println("Server ON \n");
        try {
            sock = new ServerSocket(9999);
        }
        catch(IOException ex) {
            System.out.println("Failed to open server socket\n");
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