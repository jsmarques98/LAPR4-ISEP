package eapli.base.CommunicationProtocol;

import eapli.base.CommunicationProtocol.utils.DataHandler;
import eapli.base.CommunicationProtocol.utils.MessageCodes;
import eapli.base.CommunicationProtocol.utils.ProductsData;
import eapli.base.CommunicationProtocol.utils.TCPData;
import eapli.base.productmanagement.domain.Product;
import org.springframework.security.core.parameters.P;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;

public class TcpCliOrders implements Orders_API {
    static final int SERVER_PORT = 9999;
    static InetAddress serverIP;
    static Socket socket;
    private DataHandler dataHandler;

    public TcpCliOrders() {
        try {
            serverIP = InetAddress.getByName("vs688.dei.isep.ipp.pt");
        } catch (UnknownHostException ex) {
            System.out.println("Invalid server specified: ");
            System.exit(1);
        }

        try {
            socket = new Socket(serverIP, SERVER_PORT);
            dataHandler = new DataHandler(socket);
        }
        catch(IOException ex) {
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
            try {
                socket.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
            return false;
        }
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
            socket.close();

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return productsData;
    }

}
