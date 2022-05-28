package eapli.base.app.agvdigitaltwin;

import eapli.base.agvmanagement.domain.IDAGV;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

public class TurnOnAGVDigitalTwinUI extends AbstractUI {
    private TurnOnAGVDigitalTwinController turnOnAGVDigitalTwinController = new TurnOnAGVDigitalTwinController();
    @Override
    protected boolean doShow() {
        if (turnOnAGVDT()) {
            System.out.println("Status updated successfully");
            return true;
        } else {
            System.out.println("Status updated failed");
            return false;
        }
    }

    public boolean turnOnAGVDT(){
        if(turnOnAGVDigitalTwinController.testServerConnection()) {
            if(turnOnAGVDigitalTwinController.testAGVManagerReceivesClientAGVDigitalTwin()) {
                String idagv = Console.readLine("Please insert IDAGV to turn on:");
                if(!turnOnAGVDigitalTwinController.turnOnAGVDigitalTwin(IDAGV.valueOf(idagv))){
                    System.out.println("Failed");
                }
            }
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String headline() {
        return "UPDATE STATUS AGV DIGITAL TWIN";
    }
}
