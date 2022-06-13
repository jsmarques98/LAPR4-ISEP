package eapli.base.dashboardmanagement.application;

import eapli.base.Application;
import eapli.base.CommunicationProtocol.Requests_API;
import eapli.base.agvmanagement.domain.AGV;
import eapli.base.warehousemanagement.domain.AGVDock;
import eapli.base.warehousemanagement.domain.Aisle;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class ShowDashboardController {
    private Requests_API api;

    public ShowDashboardController(){
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

    public boolean testServerConnection(){
        return api.testServerConnection();
    }

    public List<AGV> getAgv(){
        return api.getAGVs();
    }

    public List<AGVDock> getAgvDocks(){
        return api.getAGVDocks();
    }

    public List<Aisle> getAisles(){
        return api.getAisles();
    }


    public boolean testAGVManagerReceivesClientBackOffice(){return api.testAGVManagerReceivesClientBackOffice();}


}
