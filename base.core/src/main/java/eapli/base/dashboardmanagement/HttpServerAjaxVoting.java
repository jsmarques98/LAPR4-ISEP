package eapli.base.dashboardmanagement;


import eapli.base.agvmanagement.domain.AGV;
import eapli.base.dashboardmanagement.application.ShowDashboardController;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import java.awt.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANDRE MOREIRA (asc@isep.ipp.pt)
 */
public class HttpServerAjaxVoting extends Thread {
    static private final String BASE_FOLDER="base.core/src/main/resources/www";

    static private SSLServerSocket sock;
    static private int port=55034;

    private ShowDashboardController showDashboardController;
    private static List<AGV> agvList;

    public HttpServerAjaxVoting(){
        showDashboardController = new ShowDashboardController();
        showDashboardController.testServerConnection();
        showDashboardController.testAGVManagerReceivesClientBackOffice();
        agvList = showDashboardController.getAgv();
        System.out.println(" sssssssssssssssssssssssssssssssssssssssssssssssssssss");
        System.out.println(agvList.size());
    }
    @Override
    public void run() {
        SSLSocket cliSock;


        accessesCounter=0;
        for(int i=0;i<candidatesNumber; i++) {
            candidateName[i] = "Candidate " + i;
            candidateVotes[i] = 0;
        }

        System.setProperty("javax.net.ssl.keyStore", "base.core/src/main/resources/certificates/dashboard.jks");
        System.setProperty("javax.net.ssl.keyStorePassword", "forgotten");

        try {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(new URI("https://localhost:"+port ));
            }
            SSLServerSocketFactory sslF = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            sock = (SSLServerSocket) sslF.createServerSocket(port);

            while (true) {
                cliSock= (SSLSocket) sock.accept();
                HttpAjaxVotingRequest req = new HttpAjaxVotingRequest(cliSock, BASE_FOLDER);
                req.start();
                incAccessesCounter();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }


    // DATA ACCESSED BY THREADS - LOCKING REQUIRED

    private static final int candidatesNumber = 4;
    private static final String[] candidateName = new String[candidatesNumber];
    private static final int[] candidateVotes = new int[candidatesNumber];
    private static int accessesCounter;

    private static synchronized void incAccessesCounter() { accessesCounter++; }

    public static synchronized String showInfoAGVInHTML(  ) {
        StringBuilder s = new StringBuilder();
        for (AGV agv: agvList) {
            s.append("<tr class=\"active-row\">" +
                    "<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspId:" + agv.id() + "<p></p></td>" +
                    "<td>Current Task: " + agv.currentTask() + "<p></p></td>" +
                    "<td>Begin: " + agv.agvDock().begin() + "<p></p></td>" +
                    "<td>End: " + agv.agvDock().end() + "<p></p></td>" +
                    "<td><p></p></td>"+
                    "</tr>");
        }
        return s.toString();
    }

    public static synchronized void castVote(String i) {
        int cN;
        try { cN=Integer.parseInt(i); }
        catch(NumberFormatException ne) { return; }
        cN--;
        if(cN >= 0 && cN < candidatesNumber) candidateVotes[cN]++;
    }



}