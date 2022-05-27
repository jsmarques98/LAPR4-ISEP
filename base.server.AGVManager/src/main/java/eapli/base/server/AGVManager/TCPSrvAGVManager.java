package eapli.base.server.AGVManager;

import eapli.base.CommunicationProtocol.utils.MessageCodes;
import eapli.base.CommunicationProtocol.utils.ProductsData;
import eapli.base.CommunicationProtocol.utils.TCPData;
import eapli.base.CommunicationProtocol.utils.DataHandler;
import eapli.base.server.AGVManager.application.AGVManagerController;


import java.io.*;
import java.net.*;
import java.sql.SQLOutput;

class TcpSrvAGVManager {
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
    private AGVManagerController agvManagerController;

    public TcpSrvOrdersThread(Socket cli_s) {
        s=cli_s;
        dataHandler = new DataHandler(cli_s);
        agvManagerController = new AGVManagerController();
    }

    public void run() {
        InetAddress clientIP;
        clientIP = s.getInetAddress();
        System.out.println("New client connection from " + clientIP.getHostAddress() +
                ", port number " + s.getPort()+"\n");

        while (true) {
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
                        s.close();
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
