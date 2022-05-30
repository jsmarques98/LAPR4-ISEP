package eapli.base.CommunicationProtocol;

import eapli.base.agvmanagement.domain.AGV;

import java.util.List;

public interface Requests_API {
    boolean testServerConnection();
    boolean activateAutoPrepareOrders();
    boolean deactivateAutoPrepareOrders();
    boolean testAGVManagerReceivesClientBackOffice();
    List<AGV> getAGVs();
}
