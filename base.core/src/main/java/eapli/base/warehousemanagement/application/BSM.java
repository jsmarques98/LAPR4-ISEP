package eapli.base.warehousemanagement.application;

import eapli.base.agvmanagement.domain.Autonomy;

public class BSM extends Thread{

    private AGVMemory agvMemory;
    private boolean aux=false;

    public BSM(AGVMemory agvMemory){
        this.agvMemory=agvMemory;
    }

    public void reloadAGV(){
        if(agvMemory.getActualPosition()==agvMemory.getAgvDockPosition()) {
            while (agvMemory.getAgv().autonomy().minutes() <= agvMemory.getAgv().autonomy().maxMinutes()) {
                agvMemory.getAgv().setAutonomy(new Autonomy(agvMemory.getAgv().autonomy().minutes() + 1));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void reduceAutonomy(){
        if(agvMemory.getSpeed()==1)
            agvMemory.getAgv().setAutonomy(new Autonomy(agvMemory.getAgv().autonomy().minutes()-1));
        else if(agvMemory.getSpeed()==0.5){
            if(aux) {
                agvMemory.getAgv().setAutonomy(new Autonomy(agvMemory.getAgv().autonomy().minutes() - 1));
                aux=false;
            }else
                aux=true;
        }
    }
}
