package eapli.base.warehousemanagement.application;

import eapli.base.agvmanagement.domain.Position;


public class Positioning {

    private AGVMemory agvMemory;
    private double distance;

    public Positioning(AGVMemory AGVMemory) {
        this.agvMemory = AGVMemory;
        distance = 0.0;
    }

    public synchronized Position calculateNewPosition() {

        Position position = new Position(agvMemory.getActualPosition().lsquare(), agvMemory.getActualPosition().wsquare());
        if (!agvMemory.isStop()) {
            distance += agvMemory.getSpeed() * 0.1;

            if (distance >= 1.0) {
                distance = 0.0;
                int direction = agvMemory.getDirection();
                if (direction == 0) {
                    position.setWsquare(position.wsquare() - 1);
                }

                if (direction == 1) {
                    position.setWsquare(position.wsquare() + 1);
                }
                if (direction == 2) {

                    position.setLsquare(position.lsquare() + 1);

                }
                if (direction == 3) {
                    position.setLsquare(position.lsquare() - 1);
                }

            }
        }
        return position;
    }
}

