package eapli.base.CommunicationProtocol;

public interface Requests_API {
    boolean testServerConnection();
    boolean activateAutoPrepareOrders();
    boolean deactivateAutoPrepareOrders();
    boolean testAGVManagerReceivesClientBackOffice();
}
