package eapli.base.CommunicationProtocol;

import eapli.base.agvmanagement.domain.AGV;
import eapli.base.warehousemanagement.domain.AGVDock;
import eapli.base.warehousemanagement.domain.Aisle;

import java.util.List;

public interface Requests_API {
    boolean testServerConnection();
    boolean activateAutoPrepareOrders();
    boolean deactivateAutoPrepareOrders();
    boolean testAGVManagerReceivesClientBackOffice();
    List<AGV> getAGVs();

    List<AGVDock> getAGVDocks();

    List<Aisle> getAisles();
}
