package eapli.base.warehousemanagement.application;

import eapli.base.agvmanagement.domain.Position;

public class Sensor extends Thread {
    private Integer direction;
    private AGVMemory AGVMemory;
    private int[][] wharehousePlant;


    public Sensor(Integer direction, AGVMemory AGVMemory) {
        this.direction = direction;
        this.AGVMemory = AGVMemory;
        AGVMemory.setFlag(true);
    }

    public void setWharehousePlant(int[][] wharehousePlant) {
        this.wharehousePlant = wharehousePlant;
    }

    public void run() {

        do{
            viewObstacles();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while (true);

    }


    private synchronized void viewObstacles() {
        try {

            doWait();
            boolean flag = AGVMemory.isFlag();
            Position agvPosition = AGVMemory.getActualPosition();



            // para cima
            if (direction == 0) {
                if (agvPosition.wsquare() - 2 >= 0 && agvPosition.lsquare() -1 >=0) {
                    if (wharehousePlant[agvPosition.wsquare()-2 ][agvPosition.lsquare()-1] == 1 ) {
                        AGVMemory.setSpeed(0.0);

                    }
                }
                if (agvPosition.wsquare() - 3 >= 0 && agvPosition.lsquare() -1 >=0) {
                    if (wharehousePlant[agvPosition.wsquare() - 3][agvPosition.lsquare()-1] == 1 && flag) {
                        AGVMemory.setSpeed(AGVMemory.getSpeed() / 2);
                        AGVMemory.setFlag(false);

                    }
                }

            }
            // baixo
            if (direction == 1) {

                if ( agvPosition.lsquare() -1 >=0 && agvPosition.wsquare()<wharehousePlant.length) {
                    if (wharehousePlant[agvPosition.wsquare() ][agvPosition.lsquare()-1] == 1 ) {
                        AGVMemory.setSpeed(0.0);
                    }
                }
                if (agvPosition.wsquare() + 1 <wharehousePlant.length && agvPosition.lsquare() -1 >=0) {
                    if (wharehousePlant[agvPosition.wsquare() + 1][agvPosition.lsquare()-1] == 1 && flag) {
                        AGVMemory.setSpeed(AGVMemory.getSpeed() / 2);
                        AGVMemory.setFlag(false);

                    }
                }

            }

            // direita
            if (direction == 2) {
                if (agvPosition.lsquare()  < wharehousePlant[0].length && agvPosition.wsquare() - 1 >= 0 ) {
                    if (wharehousePlant[agvPosition.wsquare()-1][agvPosition.lsquare()] == 1) {
                        AGVMemory.setSpeed(0.0);
                    }
                }
                if (agvPosition.lsquare() + 1 < wharehousePlant[0].length && agvPosition.wsquare() - 1 >= 0) {
                    if (wharehousePlant[agvPosition.wsquare()-1][agvPosition.lsquare() + 1] == 1 && flag) {
                        AGVMemory.setSpeed(AGVMemory.getSpeed() / 2);
                        AGVMemory.setFlag(false);
                    }
                }
            }


            // esquerda
            if (direction == 3) {
                if (agvPosition.lsquare() - 2 >= 0 && agvPosition.wsquare() - 1 >= 0) {
                    if (wharehousePlant[agvPosition.wsquare()-1][agvPosition.lsquare()-2] == 1 ) {
                        AGVMemory.setSpeed(0.0);

                    }
                }
                if (agvPosition.lsquare() - 3 >= 0 && agvPosition.wsquare() - 1 >= 0) {
                    if (wharehousePlant[agvPosition.wsquare()-1][agvPosition.lsquare() - 3] == 1 && flag) {
                        AGVMemory.setSpeed(AGVMemory.getSpeed() / 2);
                        AGVMemory.setFlag(false);
                    }
                }
            }

        }catch (NullPointerException e){
            System.out.println(e.getCause());
        }
    }


    public void doNotify() {
        synchronized(this) {
            this.notify();
        }
    }

    public void doWait() {
        synchronized(this){
            try {
                this.wait();
            } catch(InterruptedException e) {
            }
        }
    }
}
