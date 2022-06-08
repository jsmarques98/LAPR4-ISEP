package eapli.base.CommunicationProtocol;

import eapli.base.Application;
import eapli.base.CommunicationProtocol.utils.DataHandler;
import eapli.base.CommunicationProtocol.utils.MessageCodes;
import eapli.base.CommunicationProtocol.utils.TCPData;
import eapli.base.agvmanagement.domain.AGV;
import eapli.base.productmanagement.domain.Product;


import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;


public class TcpCliAGVManager implements Requests_API {
    static final int SERVER_PORT = 9999;
    static InetAddress serverIP;
    static SSLSocket socket;
    static final String certificate = "base.server.AGVManager/src/main/resources/certificates/agvmanager_server/client1_agvmanager_J.jks";
    static final String keystorePassword = Application.settings().getTrustedStorePassword();
    private DataHandler dataHandler;

    public TcpCliAGVManager() {

        // Trust these certificates provided by authorized clients
        System.setProperty("javax.net.ssl.trustStore", certificate);
        System.setProperty("javax.net.ssl.trustStorePassword", keystorePassword);

        // Use this certificate and private key as server certificate
        System.setProperty("javax.net.ssl.keyStore", certificate);
        System.setProperty("javax.net.ssl.keyStorePassword", keystorePassword);
        SSLSocketFactory sslF = (SSLSocketFactory) SSLSocketFactory.getDefault();

        try {
            serverIP = InetAddress.getByName("vs113.dei.isep.ipp.pt");
        } catch (UnknownHostException ex) {
            System.out.println("Invalid server specified: ");
            System.exit(1);
        }

        try {

            socket = (SSLSocket) sslF.createSocket(serverIP, SERVER_PORT);

            dataHandler = new DataHandler(socket);

        } catch (IOException ex) {
            System.out.println("Failed to establish TCP connection");
            System.exit(1);
        }
    }


    @Override
    public boolean testServerConnection() {
        TCPData message;
        try {

            dataHandler.sendData(new byte[0], MessageCodes.COMTEST);
            message = dataHandler.readData();


            if (message.messageCode() == 2) {
                System.out.println("Server connection is ok!\n");
                return true;
            } else {
                System.out.println("Server connection failed!\n");
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
    public boolean activateAutoPrepareOrders() {
        TCPData message;
        try {
            dataHandler.sendData(new byte[0], MessageCodes.ACTIVATEAUTOPREPAREORDER);
            message = dataHandler.readData();


            if (message.messageCode()==3){
                System.out.println("Auto prepare order is activated!\n");
                return true;
            }else{
                System.out.println("Failed to activate auto prepare order!\n");
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
    public boolean deactivateAutoPrepareOrders() {
        TCPData message;
        try {

            dataHandler.sendData(new byte[0], MessageCodes.DEACTIVATEAUTOPREPAREORDER);

            message = dataHandler.readData();


            if (message.messageCode()==3){
                System.out.println("Auto prepare order is deactivated!\n");
                return true;
            }else{
                System.out.println("Failed to activate auto prepare order!\n");
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
    public boolean testAGVManagerReceivesClientBackOffice() {
        TCPData message;
        try {

            dataHandler.sendData(new byte[0], MessageCodes.CONNCLIBO);
            message = dataHandler.readData();


            if (message.messageCode() == 2) {
                System.out.println("Server connection received Back Office!\n");
                return true;
            } else {
                System.out.println("Server connection failed!\n");
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
    public List<AGV> getAGVs() {
        TCPData message;
        try {

            dataHandler.sendData(new byte[0], MessageCodes.GETAGVS);

            message = dataHandler.readData();



            byte[] receivedData = message.messageData();
            ByteArrayInputStream bIn = new ByteArrayInputStream(receivedData);
            ObjectInputStream sIn2 = new ObjectInputStream(bIn);
            List<AGV> agvList = (List<AGV>) sIn2.readObject();

            return agvList;

        } catch (IOException e) {
            e.printStackTrace();
            try {
                socket.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
