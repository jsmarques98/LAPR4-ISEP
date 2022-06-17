package eapli.base.warehousemanagement.application;

import eapli.base.agvmanagement.domain.AGV;
import eapli.base.agvmanagement.domain.Position;
import eapli.base.agvmanagement.repository.AGVRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.warehousemanagement.application.graph.matrix.MatrixGraph;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class ControlSystem extends Thread {
    private AGVMemory agvMemory;
    private MatrixGraph<Position, Integer> warehousePlant;
    private AGVRepository agvRepository;
    private Positioning positioning;
    private Sensor[] sensors;

    public ControlSystem(AGVMemory AGVMemory) {
        this.agvMemory = AGVMemory;
        this.agvMemory.setFlag1(true);
        agvRepository = PersistenceContext.repositories().agvs();
        positioning = new Positioning(AGVMemory);

    }


    public void aa() {

        List<Position> positionList = new ArrayList<>();

        positionList = agvMemory.getAgvPath();

        if (positionList.size() >= 2) {
            Position position = positionList.get(1);
            Position actual = agvMemory.getActualPosition();
            if (actual.lsquare() != position.lsquare()) {
                if (actual.lsquare() < position.lsquare()) {
                    agvMemory.setDirection(2);
                } else if (actual.lsquare() > position.lsquare()) {
                    agvMemory.setDirection(3);
                }
            } else if (actual.wsquare() != position.wsquare()) {
                if (actual.wsquare() < position.wsquare()) {
                    agvMemory.setDirection(1);
                } else if (actual.wsquare() > position.wsquare()) {
                    agvMemory.setDirection(0);
                }
            }
            List<Sensor> sensors = agvMemory.getSensors();
            for (Sensor sensor : sensors) {
                sensor.viewObstacles();
            }

            Position position1 = positioning.calculateNewPosition();
            if (!position1.equals(agvMemory.getActualPosition())) {
                positionList.remove(positionList.get(0));
                agvMemory.setActualPosition(position1);
                AGV agv = agvMemory.getAgv();
                agv.setPosition(position1);
                agvRepository.save(agv);
                if (!agvMemory.isFlag()) {
                    agvMemory.setSpeed(agvMemory.getSpeed() * 2);
                    agvMemory.setFlag(true);
                }
            }
        }
    }


    public void run() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                aa();
            }
        }, 0, 100);
    }
}
