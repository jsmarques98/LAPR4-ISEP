package eapli.base.server.AGVManager;

import eapli.base.CommunicationProtocol.utils.MessageCodes;
import eapli.base.CommunicationProtocol.utils.ProductsData;
import eapli.base.CommunicationProtocol.utils.TCPData;
import eapli.base.CommunicationProtocol.utils.DataHandler;
import eapli.base.agvmanagement.domain.AGV;
import eapli.base.agvmanagement.domain.IDAGV;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.server.AGVManager.application.AGVManagerController;



import java.io.*;
import java.net.*;
import java.util.List;


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
        int aux_client;

        while(true) {
            cliSock=sock.accept();
            TcpSrvAGVManagerThread srvAGVManagerThread = new TcpSrvAGVManagerThread(cliSock);
            Thread t = new Thread(srvAGVManagerThread);
            t.start();
            t.join();
            srvAGVManagerThread.getAux_client();
            aux_client= srvAGVManagerThread.getAux_client();

            if (aux_client==0){
                new Thread(new TcpSrvAGVManagerThreadBackOffice(cliSock)).start();
            }else if (aux_client==1){
                new Thread(new TcpSrvAGVManagerThreadAGVDigitalTwin(cliSock)).start();
            }

        }
    }
}



class TcpSrvAGVManagerThreadBackOffice implements Runnable {
    private Socket s;
    private ObjectOutputStream sOut;
    private ObjectInputStream sIn;
    private DataHandler dataHandler;
    private ProductsData productsData = new ProductsData();
    private AGVManagerController agvManagerController;

    private boolean flag_autoprepareorder = true;

    public TcpSrvAGVManagerThreadBackOffice(Socket cli_s) {
        s=cli_s;
        dataHandler = new DataHandler(cli_s);
        agvManagerController = new AGVManagerController();
    }

    public void run() {
        InetAddress clientIP;
        clientIP = s.getInetAddress();
        System.out.println("New client Back Office connection from " + clientIP.getHostAddress() +
                ", port number " + s.getPort()+"\n");

        boolean flag=true;
        while (flag) {
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
                        flag =false;
                        break;
                    case 5:
                        System.out.println("Client asking to activate Auto Prepare Order (5)\n");

                        List<CustomerOrder> orderList = agvManagerController.getOrdersByStatusAndDate();
                        List<AGV> agvList = agvManagerController.getAGVFree();
                        int lco = orderList.size();

                        int la = agvList.size();

                        int i = 0;
                        while(flag_autoprepareorder){
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

class TcpSrvAGVManagerThreadAGVDigitalTwin implements Runnable {
    private Socket s;
    private ObjectOutputStream sOut;
    private ObjectInputStream sIn;
    private DataHandler dataHandler;
    private AGVManagerController agvManagerController;



    public TcpSrvAGVManagerThreadAGVDigitalTwin(Socket cli_s) {
        s=cli_s;
        dataHandler = new DataHandler(cli_s);
        agvManagerController = new AGVManagerController();
    }

    public void run() {
        InetAddress clientIP;
        clientIP = s.getInetAddress();
        System.out.println("New client AGV Digital Twin connection  from " + clientIP.getHostAddress() +
                ", port number " + s.getPort()+"\n");

        boolean flag=true;
        while (flag) {
            try {
                sIn = new ObjectInputStream(s.getInputStream());

                Object o = sIn.readObject();

                TCPData data = (TCPData) o;

                switch (data.messageCode()) {

                    case 0:
                        System.out.println("COMMTEST Code (0) received from client.\n");
                        dataHandler.sendData(new byte[0], MessageCodes.ACK);
                        System.out.println("Sending ACK Code (2) to client");

                        System.out.println("Afinal Ã©s inteligente");
                        break;

                    case 1:
                        System.out.println("DISCONN Code (1) received from client.\n");
                        dataHandler.sendData(new byte[0], MessageCodes.ACK);
                        System.out.println("Sending ACK Code (2) to client");
                        System.out.println("Client " + clientIP.getHostAddress() + ", port number: " + s.getPort() +
                                " disconnected \n");
                        s.close();
                        flag =false;
                        break;

                    case 10:
                        byte[] receivedData = data.messageData();

                        ByteArrayInputStream bIn = new ByteArrayInputStream(receivedData);
                        ObjectInputStream sIn = new ObjectInputStream(bIn);

                        IDAGV idagv = (IDAGV) sIn.readObject();

                        if(agvManagerController.existsAGV(idagv)) {
                            System.out.println("AGV Digital with ID " + idagv + "Twin Turned ON");

                            dataHandler.sendData(new byte[0], MessageCodes.SUCCESS);
                            System.out.println("Sending Success Code (3) to client");


                        }
                        dataHandler.sendData(new byte[0], MessageCodes.ERROR);

                }
            } catch (IOException ex) {
                break;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}

class TcpSrvAGVManagerThread implements Runnable {
    private Socket s;
    private ObjectOutputStream sOut;
    private ObjectInputStream sIn;
    private DataHandler dataHandler;

    private int aux_client;


    public TcpSrvAGVManagerThread(Socket cli_s) {
        s=cli_s;
        dataHandler = new DataHandler(cli_s);
    }

    public void run() {
        InetAddress clientIP;
        clientIP = s.getInetAddress();
        System.out.println("New client connection from " + clientIP.getHostAddress() +
                ", port number " + s.getPort()+"\n");

        boolean flag=true;
        while (flag) {
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
                        flag =false;
                        break;
                    case 8:
                        System.out.println("Client from back office");
                        dataHandler.sendData(new byte[0], MessageCodes.ACK);
                        System.out.println("Sending ACK Code (2) to client");
                        aux_client = 0;
                        flag = false;

                        break;
                    case 9:
                        System.out.println("Client from AGV Digital Twin");
                        dataHandler.sendData(new byte[0], MessageCodes.ACK);
                        System.out.println("Sending ACK Code (2) to client");
                        aux_client=1;
                        flag =false;
                        break;

                }
            } catch (IOException ex) {
                break;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    public int getAux_client(){
        return aux_client;
    }
}