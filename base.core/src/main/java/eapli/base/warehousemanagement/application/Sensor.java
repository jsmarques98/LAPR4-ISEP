package eapli.base.warehousemanagement.application;

import eapli.base.agvmanagement.domain.Position;

public class Sensor {
    private Integer direction;
    private AGVMemory agvMemory;
    private int[][] wharehousePlant;


    public Sensor(Integer direction, AGVMemory AGVMemory) {
        this.direction = direction;
        this.agvMemory = AGVMemory;
        AGVMemory.setFlag(true);
    }

    public void setWharehousePlant(int[][] wharehousePlant) {
        this.wharehousePlant = wharehousePlant;
    }


    public synchronized void viewObstacles() {

        boolean flag = agvMemory.isFlag();
        Position agvPosition = agvMemory.getActualPosition();


        // para cima
        if (direction == 0) {
            if (agvPosition.wsquare() - 2 >= 0 && agvPosition.lsquare() - 1 >= 0) {
                if (wharehousePlant[agvPosition.wsquare() - 2][agvPosition.lsquare() - 1] == 1) {
                    if (direction == agvMemory.getDirection()) {
                        agvMemory.setSpeed(0.0);
                    }

                }
            }
            if (agvPosition.wsquare() - 3 >= 0 && agvPosition.lsquare() - 1 >= 0) {
                if (wharehousePlant[agvPosition.wsquare() - 3][agvPosition.lsquare() - 1] == 1 && flag) {
                    agvMemory.setSpeed(agvMemory.getSpeed() / 2);
                    agvMemory.setFlag(false);

                }
            }

        }
        // baixo
        if (direction == 1) {

            if (agvPosition.lsquare() - 1 >= 0 && agvPosition.wsquare() < wharehousePlant.length) {
                if (wharehousePlant[agvPosition.wsquare()][agvPosition.lsquare() - 1] == 1) {
                    if (direction == agvMemory.getDirection()) {
                        agvMemory.setSpeed(0.0);
                    }
                }
            }
            if (agvPosition.wsquare() + 1 < wharehousePlant.length && agvPosition.lsquare() - 1 >= 0) {
                if (wharehousePlant[agvPosition.wsquare() + 1][agvPosition.lsquare() - 1] == 1 && flag) {
                    agvMemory.setSpeed(agvMemory.getSpeed() / 2);
                    agvMemory.setFlag(false);

                }
            }

        }

        // direita
        if (direction == 2) {
            if (agvPosition.lsquare() < wharehousePlant[0].length && agvPosition.wsquare() - 1 >= 0) {
                if (wharehousePlant[agvPosition.wsquare() - 1][agvPosition.lsquare()] == 1) {
                    if (direction == agvMemory.getDirection()) {
                        agvMemory.setSpeed(0.0);
                    }
                }
            }
            if (agvPosition.lsquare() + 1 < wharehousePlant[0].length && agvPosition.wsquare() - 1 >= 0) {
                if (wharehousePlant[agvPosition.wsquare() - 1][agvPosition.lsquare() + 1] == 1 && flag) {
                    agvMemory.setSpeed(agvMemory.getSpeed() / 2);
                    agvMemory.setFlag(false);
                }
            }
        }


        // esquerda
        if (direction == 3) {
            if (agvPosition.lsquare() - 2 >= 0 && agvPosition.wsquare() - 1 >= 0) {
                if (wharehousePlant[agvPosition.wsquare() - 1][agvPosition.lsquare() - 2] == 1) {
                    if (direction == agvMemory.getDirection()) {
                        agvMemory.setSpeed(0.0);
                    }

                }
            }
            if (agvPosition.lsquare() - 3 >= 0 && agvPosition.wsquare() - 1 >= 0) {
                if (wharehousePlant[agvPosition.wsquare() - 1][agvPosition.lsquare() - 3] == 1 && flag) {
                    agvMemory.setSpeed(agvMemory.getSpeed() / 2);
                    agvMemory.setFlag(false);
                }
            }
        }

    }


}
