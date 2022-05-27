package eapli.base.CommunicationProtocol;

import eapli.base.AppSettings;
import eapli.base.Application;

import java.lang.reflect.InvocationTargetException;

public class PrepareOrderAutoController {
    private Requests_API api;


    public PrepareOrderAutoController() {
        try{
            this.api = (Requests_API) Class.forName(Application.settings().getAGVManagerAPI()).getDeclaredConstructor().newInstance();
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

    public void testServerConnection(){
        api.testServerConnection();
    }

    public boolean deactivatePrepareOrderAuto(){
        return api.deactivateAutoPrepareOrders();
    }

    public boolean activatePrepareOrderAuto(){
        return api.activateAutoPrepareOrders();
    }

}
