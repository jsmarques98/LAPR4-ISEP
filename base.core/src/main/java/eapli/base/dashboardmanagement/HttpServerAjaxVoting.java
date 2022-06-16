package eapli.base.dashboardmanagement;


import eapli.base.agvmanagement.domain.AGV;
import eapli.base.dashboardmanagement.application.ShowDashboardController;
import eapli.base.warehousemanagement.domain.AGVDock;
import eapli.base.warehousemanagement.domain.Aisle;

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

    private static ShowDashboardController showDashboardController;
    private static List<AGV> agvList;

    public HttpServerAjaxVoting(){
        showDashboardController = new ShowDashboardController();
        showDashboardController.testServerConnection();
        showDashboardController.testAGVManagerReceivesClientBackOffice();

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
        for (AGV agv:  showDashboardController.getAgv()) {
            s.append("<hr><tr class=\"active-row\">" +
                    "<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspId:" + agv.id() + "<p></p></td>" +
                    "<td>Current Task: " + agv.currentTask() + "<p></p></td>" +
                    "<td><p></p></td>"+
                    "</tr><hr>");
        }
        return s.toString();
    }

    private static synchronized List<Integer> getAislesPositionsInGrid (List<Aisle> aisles){
        List<Integer> aislesPositions = new ArrayList<>();
        for(Aisle aisle : aisles){

            int beginX = aisle.begin().blsquare();
            int beginY = aisle.begin().bwsquare();
            int endX = aisle.end().elsquare();


            int depth =  Math.abs(aisle.depth().dwsquare()- beginY);


            String a = aisle.accessibilityR();


            for(int i = beginX-1; i<endX; i++){
                int aux = (beginY-1)*20 + i;
                aislesPositions.add(aux);
                for(int j = 0;j<depth;j++){

                    if(a.equals("w-")) {
                        aux = aux + 20;
                        aislesPositions.add(aux);
                    }else if(a.equals("w+")){
                        aux = aux - 20;
                        aislesPositions.add(aux);
                    }
                }
            }
        }
        return aislesPositions;
    }

    private static synchronized List<Integer> getAGVDocksPositionsInGrid (List<AGVDock> agvDocks){
        List<Integer> agvDockPosition = new ArrayList<>();
        for(AGVDock agvDock : agvDocks){
            agvDockPosition.add((agvDock.begin().blsquare()-1)  +( 20*(agvDock.begin().bwsquare()-1)));
        }
        return agvDockPosition;
    }

    private static synchronized List<Integer> getAGVPositionsInGrid (List<AGV> agvs){
        List<Integer> agvDockPosition = new ArrayList<>();
        for(AGV agv : agvs){
            agvDockPosition.add((agv.position().lsquare()-1)  +( 20*(agv.position().wsquare()-1)));
        }
        return agvDockPosition;
    }

    public static synchronized String showWarehousePlantInHTML(  ) {
        StringBuilder s = new StringBuilder();

        List<Aisle> aisles = showDashboardController.getAisles();
        List<AGVDock> agvDocks = showDashboardController.getAgvDocks();
        List<AGV> agvs = showDashboardController.getAgv();


        List<Integer> aislesPositions = getAislesPositionsInGrid(aisles);
        List<Integer> agvDockPosition = getAGVDocksPositionsInGrid(agvDocks);
        List<Integer> agvPosition = getAGVPositionsInGrid(agvs);

        int x = 360;
        for(int i = 0 ;i<x ;i++){
            if( agvDockPosition.contains(i)) {
                s.append("<div class=\"griditemAGVDock\"></div>\n");
            }else if(aislesPositions.contains(i)){
                s.append("<div class=\"griditemAisle\"></div>\n");
            }else if(agvPosition.contains(i)){
                s.append("<div class=\"griditemAGV\"></div>\n");
            }else {
                s.append("<div class=\"griditemfree\"></div>\n");
            }
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