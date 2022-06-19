package eapli.base.agvmanagement.modules;

import eapli.base.agvmanagement.domain.Autonomy;

import java.util.Timer;
import java.util.TimerTask;

public class BSM extends Thread {

    private AGVMemory agvMemory;
    private int aux;

    public BSM(AGVMemory agvMemory) {
        this.agvMemory = agvMemory;
        aux = 0;
    }


    public void reduceAutonomy() {
        if (agvMemory.getActualPosition().equals(agvMemory.getAgvDockPosition())) {
            if (agvMemory.getAgv().autonomy().minutes() <= agvMemory.getAgv().autonomy().maxMinutes())
                agvMemory.getAgv().setAutonomy(new Autonomy(agvMemory.getAgv().autonomy().minutes() + 1));
        } else if (agvMemory.getSpeed() != 0.0) {
            aux++;
            if (aux == 60) {
                agvMemory.getAgv().setAutonomy(new Autonomy(agvMemory.getAgv().autonomy().minutes() - 1));
            }
        }
    }

    public void run() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (agvMemory.getAgv().autonomy().minutes() == agvMemory.getAgv().autonomy().maxMinutes() && agvMemory.isOrderPrepared()) {
                    timer.cancel();
                }else {
                    reduceAutonomy();
                }
            }
        }, 0, 1000);

    }
}
