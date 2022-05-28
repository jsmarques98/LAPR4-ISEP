package eapli.base.CommunicationProtocol;

import eapli.base.agvmanagement.domain.IDAGV;

public interface Status_API {
    boolean testConnection();
    boolean testAGVManagerReceivesClientAGVDigitalTwin();
    boolean turnOnAGVDigitalTwin(IDAGV idagv);
}
