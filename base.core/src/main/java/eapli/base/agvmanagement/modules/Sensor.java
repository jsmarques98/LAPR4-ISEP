package eapli.base.agvmanagement.modules;

import eapli.base.agvmanagement.domain.Position;

import java.util.Arrays;

public class Sensor {
    private Integer direction;
    private AGVMemory agvMemory;
    private int[][] wharehousePlant;


    public Sensor(Integer direction, AGVMemory AGVMemory) {
        this.direction = direction;
        this.agvMemory = AGVMemory;
        AGVMemory.setFlag(true);
    }

    public synchronized  void setWharehousePlant(int[][] wharehousePlant) {
        this.wharehousePlant = wharehousePlant;
    }


    public synchronized  boolean[] viewObstacles() {
        boolean[] booleans = new boolean[2];
        Arrays.fill(booleans, true);
        boolean flag = agvMemory.isFlag();
        Position agvPosition = agvMemory.getActualPosition();


        // para cima
        if (direction == 0) {
            if (agvPosition.wsquare() - 2 >= 0 && agvPosition.lsquare() - 1 >= 0) {
                if (wharehousePlant[agvPosition.wsquare() - 2][agvPosition.lsquare() - 1] == 1) {
                    if (direction == agvMemory.getDirection()) {
                        booleans[0] = false;
                    }

                }
            }
            if (agvPosition.wsquare() - 3 >= 0 && agvPosition.lsquare() - 1 >= 0) {
                if (wharehousePlant[agvPosition.wsquare() - 3][agvPosition.lsquare() - 1] == 1) {
                    booleans[1] = false;
                }
            }

        }
        // baixo
        if (direction == 1) {

            if (agvPosition.lsquare() - 1 >= 0 && agvPosition.wsquare() < wharehousePlant.length) {
                if (wharehousePlant[agvPosition.wsquare()][agvPosition.lsquare() - 1] == 1) {
                    if (direction == agvMemory.getDirection()) {
                        booleans[0] = false;
                    }
                }
            }
            if (agvPosition.wsquare() + 1 < wharehousePlant.length && agvPosition.lsquare() - 1 >= 0) {
                if (wharehousePlant[agvPosition.wsquare() + 1][agvPosition.lsquare() - 1] == 1) {
                    booleans[1] = false;
                }
            }

        }

        // direita
        if (direction == 2) {
            if (agvPosition.lsquare() < wharehousePlant[0].length && agvPosition.wsquare() - 1 >= 0) {
                if (wharehousePlant[agvPosition.wsquare() - 1][agvPosition.lsquare()] == 1) {
                    if (direction == agvMemory.getDirection()) {
                        booleans[0] = false;
                    }
                }
            }
            if (agvPosition.lsquare() + 1 < wharehousePlant[0].length && agvPosition.wsquare() - 1 >= 0) {
                if (wharehousePlant[agvPosition.wsquare() - 1][agvPosition.lsquare() + 1] == 1) {
                    booleans[1] = false;
                }
            }
        }


        // esquerda
        if (direction == 3) {
            if (agvPosition.lsquare() - 2 >= 0 && agvPosition.wsquare() - 1 >= 0) {
                if (wharehousePlant[agvPosition.wsquare() - 1][agvPosition.lsquare() - 2] == 1) {
                    if (direction == agvMemory.getDirection()) {
                        System.out.println("aaaaaaaaaaa");
                        booleans[0] = false;
                    }
                }
            }
            if (agvPosition.lsquare() - 3 >= 0 && agvPosition.wsquare() - 1 >= 0) {
                if (wharehousePlant[agvPosition.wsquare() - 1][agvPosition.lsquare() - 3] == 1) {
                    booleans[1] = false;
                }
            }
        }

        // para cima esquerda
        if (direction == 4) {
            if (agvPosition.wsquare() - 2 >= 0 && agvPosition.lsquare() - 2 >= 0) {
                if (wharehousePlant[agvPosition.wsquare() - 2][agvPosition.lsquare() - 2] == 1) {
                    if (direction == agvMemory.getDirection()) {
                        booleans[0] = false;
                    }
                }
            }
            if (agvPosition.wsquare() - 3 >= 0 && agvPosition.lsquare() - 3 >= 0) {
                if (wharehousePlant[agvPosition.wsquare() - 3][agvPosition.lsquare() - 3] == 1) {
                    booleans[1] = false;
                }
            }
        }

        // para cima  direita
        if (direction == 5) {
            if (agvPosition.wsquare() - 2 >= 0 && agvPosition.lsquare() < wharehousePlant[0].length) {
                if (wharehousePlant[agvPosition.wsquare() - 2][agvPosition.lsquare()] == 1) {
                    if (direction == agvMemory.getDirection()) {
                        booleans[0] = false;
                    }
                }
            }
            if (agvPosition.wsquare() - 3 >= 0 && agvPosition.lsquare() + 1 < wharehousePlant[0].length) {
                if (wharehousePlant[agvPosition.wsquare() - 3][agvPosition.lsquare() + 1] == 1) {
                    booleans[1] = false;
                }
            }
        }

        // baixo esquerda
        if (direction == 6) {

            if (agvPosition.lsquare() - 2 >= 0 && agvPosition.wsquare() < wharehousePlant.length) {
                if (wharehousePlant[agvPosition.wsquare()][agvPosition.lsquare() - 2] == 1) {
                    if (direction == agvMemory.getDirection()) {
                        booleans[0] = false;
                    }
                }
            }
            if (agvPosition.wsquare() + 1 < wharehousePlant.length && agvPosition.lsquare() - 3 >= 0) {
                if (wharehousePlant[agvPosition.wsquare() + 1][agvPosition.lsquare() - 3] == 1) {
                    booleans[1] = false;
                }
            }
        }

        // baixo direita
        if (direction == 7) {

            if (agvPosition.lsquare() < wharehousePlant[0].length && agvPosition.wsquare() < wharehousePlant.length) {
                if (wharehousePlant[agvPosition.wsquare()][agvPosition.lsquare()] == 1) {
                    if (direction == agvMemory.getDirection()) {
                        booleans[0] = false;
                    }
                }
            }
            if (agvPosition.wsquare() + 1 < wharehousePlant.length && agvPosition.lsquare() + 1 < wharehousePlant[0].length) {
                if (wharehousePlant[agvPosition.wsquare() + 1][agvPosition.lsquare() + 1] == 1 ) {
                    booleans[1] = false;
                }
            }
        }
        return booleans;
    }
}
