package eapli.base.server.AGVManager;

import eapli.base.CommunicationProtocol.utils.MessageCodes;
import eapli.base.CommunicationProtocol.utils.ProductsData;
import eapli.base.CommunicationProtocol.utils.TCPData;
import eapli.base.CommunicationProtocol.utils.DataHandler;
import eapli.base.agvmanagement.domain.AGV;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.server.AGVManager.application.AGVManagerController;


import java.io.*;
import java.net.*;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Queue;

class TcpSrvAGVManager {
    static ServerSocket sock;

    public static void main(String args[]) throws Exception {
        Socket cliSock;
        System.out.println("AGV Server ON \n");
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

    private boolean flag_autoprepareorder = true;

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
                    case 5:
                        System.out.println("Client asking to activate Auto Prepare Order (5)\n");

                        List<CustomerOrder> orderList = agvManagerController.getOrdersByStatusAndDate();
                        List<AGV> agvList = agvManagerController.getAGVFree();
                        int lco = orderList.size();

                        int la = agvList.size();

                        int i = 0;
                        while(flag_autoprepareorder){
                            System.out.println("while");
                            if (i == la || i == lco){
                                flag_autoprepareorder = false;
                            }else {
                                agvManagerController.prepareOrder(orderList.get(i),agvList.get(i));
                                i++;
                            }
                        }

                        dataHandler.sendData(new byte[0], MessageCodes.SUCCESS);
                        System.out.println("Sending Success Code (3) to client");
                        break;
                    case 6:
                        System.out.println("Client asking to deactivate Auto Prepare Order (6)\n");

                        flag_autoprepareorder = false;

                        dataHandler.sendData(new byte[0], MessageCodes.SUCCESS);
                        System.out.println("Sending Success Code (3) to client");
                        break;
                }

            } catch (IOException ex) {
                break;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
