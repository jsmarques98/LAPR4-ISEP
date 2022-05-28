package eapli.base.app.agvdigitaltwin;

import eapli.base.Application;
import eapli.base.CommunicationProtocol.Requests_API;
import eapli.base.CommunicationProtocol.Status_API;
import eapli.base.agvmanagement.domain.IDAGV;

import java.lang.reflect.InvocationTargetException;

public class TurnOnAGVDigitalTwinController {
    private Status_API api;

    public TurnOnAGVDigitalTwinController() {
        try{
            this.api = (Status_API) Class.forName(Application.settings().getStatusAPI()).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public boolean testServerConnection(){
        return api.testConnection();
    }

    public boolean testAGVManagerReceivesClientAGVDigitalTwin(){
        return api.testAGVManagerReceivesClientAGVDigitalTwin();
    }

    public boolean turnOnAGVDigitalTwin(IDAGV idagv){
        return api.turnOnAGVDigitalTwin(idagv);
    }
}