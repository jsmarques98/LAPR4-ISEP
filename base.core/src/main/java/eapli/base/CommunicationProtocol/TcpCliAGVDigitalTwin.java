package eapli.base.CommunicationProtocol;

import com.google.gson.stream.JsonToken;
import eapli.base.CommunicationProtocol.utils.DataHandler;
import eapli.base.CommunicationProtocol.utils.MessageCodes;
import eapli.base.CommunicationProtocol.utils.TCPData;
import eapli.base.agvmanagement.domain.IDAGV;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpCliAGVDigitalTwin implements Status_API{
    static final int SERVER_PORT = 9999;
    static InetAddress serverIP;
    static Socket socket;
    private DataHandler dataHandler;

    public TcpCliAGVDigitalTwin() {
        try {
            serverIP = InetAddress.getByName("vs113.dei.isep.ipp.pt");
        } catch (UnknownHostException ex) {
            System.out.println("Invalid server specified: ");
            System.exit(1);
        }

        try {
            socket = new Socket(serverIP, SERVER_PORT);
            dataHandler = new DataHandler(socket);
        } catch (IOException ex) {
            System.out.println("Failed to establish TCP connection");
            System.exit(1);
        }
    }

    @Override
    public boolean testConnection() {
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
    public boolean testAGVManagerReceivesClientAGVDigitalTwin() {
        TCPData message;
        try {

            dataHandler.sendData(new byte[0], MessageCodes.CONNCLIAGVDT);
            message = dataHandler.readData();


            if (message.messageCode() == 2) {
                System.out.println("Server connection received AGV Digital Twin!\n");
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
    public boolean turnOnAGVDigitalTwin(IDAGV idagv) {
        TCPData message;
        try{
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream os = new ObjectOutputStream(out);

            os.writeObject(idagv);

            byte[] idagvBytes = out.toByteArray();

            dataHandler.sendData(idagvBytes, MessageCodes.TURNONAGVDT);

            message = dataHandler.readData();


            if (message.messageCode()==3) {
                System.out.println("AGV Digital Twin Turned ON");
                System.out.println("Waiting for AGV Manager to send requests");

                InputStream is = socket.getInputStream();

                byte a[] = is.readAllBytes();



                return true;
            }else {
                System.out.println("Failed trying to Turn AGV Digital Twin on");
                return false;
            }

        } catch (IOException e) {
            e.printStackTrace();
            try {
                socket.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            return false;
        }
    }
}