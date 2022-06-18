package eapli.base.warehousemanagement.application;

import eapli.base.agvmanagement.domain.AGV;
import eapli.base.agvmanagement.domain.CurrentTask;
import eapli.base.agvmanagement.domain.Position;
import eapli.base.agvmanagement.repository.AGVRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.ordermanagement.domain.OrderStatus;
import eapli.base.ordermanagement.repositories.CustomerOrderRepository;
import eapli.base.warehousemanagement.application.graph.matrix.MatrixGraph;
import org.springframework.security.core.parameters.P;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class ControlSystem extends Thread {
    private AGVMemory agvMemory;
    private MatrixGraph<Position, Integer> warehousePlant;
    private AGVRepository agvRepository;
    private CustomerOrderRepository customerOrderRepository;
    private Positioning positioning;
    private boolean aux;
    private boolean isAux;
    private List<Position> orderProductsPositions;
    private CustomerOrder customerOrder;
    private BSM bsm;

    public ControlSystem(AGVMemory AGVMemory, List<Position> orderProductsPositions, CustomerOrder order) {
        this.orderProductsPositions = orderProductsPositions;
        this.agvMemory = AGVMemory;
        this.agvMemory.setProductsPositions(orderProductsPositions);
        this.customerOrder = order;
        agvRepository = PersistenceContext.repositories().agvs();
        positioning = new Positioning(AGVMemory);
        aux = true;
        isAux = true;
        agvMemory.setDestination(orderProductsPositions.get(0));
        customerOrderRepository=PersistenceContext.repositories().customerOrder();
        this.bsm=new BSM(agvMemory);
    }

    public void controlSystem() {
        List<Position> positionList = agvMemory.getAgvPath();
        if (agvMemory.getDestination().equals(new Position(agvMemory.getAgv().agvDock().begin().blsquare(), agvMemory.getAgv().agvDock().begin().bwsquare())) && agvMemory.getActualPosition().equals(
                new Position(agvMemory.getAgv().agvDock().begin().blsquare(), agvMemory.getAgv().agvDock().begin().bwsquare()))) {
            agvMemory.setOrderPrepared(true);
            bsm.reloadAGV();
        }
        if (positionList.size() > 1) {
            calculateNextDirection(positionList.get(1));
            getInfoSensores(positionList);
            calculateNewPosition(positionList);
            isCloseToProduct(positionList);
        }

    }

    public void calculateNextDirection(Position nextPosition) {
        Position actual = agvMemory.getActualPosition();
        if (actual.lsquare() != nextPosition.lsquare()) {
            if (actual.lsquare() < nextPosition.lsquare()) {
                agvMemory.setDirection(2);
            } else if (actual.lsquare() > nextPosition.lsquare()) {
                agvMemory.setDirection(3);
            }
        } else if (actual.wsquare() != nextPosition.wsquare()) {
            if (actual.wsquare() < nextPosition.wsquare()) {
                agvMemory.setDirection(1);
            } else if (actual.wsquare() > nextPosition.wsquare()) {
                agvMemory.setDirection(0);
            }
        }
    }


    public void calculateNewPosition(List<Position> positionList) {
        Position position1 = positioning.calculateNewPosition();
        if (!position1.equals(agvMemory.getActualPosition()) && agvMemory.getAgv().autonomy().squares()>0) {
            positionList.remove(positionList.get(0));
            agvMemory.setActualPosition(position1);
            AGV agv = agvMemory.getAgv();
            agv.setPosition(position1);
            bsm.reduceAutonomy();
            agvRepository.save(agv);
            if (!aux) {
                agvMemory.setSpeed(agvMemory.getSpeed() * 2);
                aux = true;
            }
        }
    }

    public void getInfoSensores(List<Position> positionList) {
        List<Sensor> sensors = agvMemory.getSensors();
        boolean[] booleans;
        boolean aux1 = true;
        for (Sensor sensor : sensors) {
            booleans = sensor.viewObstacles();
            if (booleans[0] == false) {
                aux1 = false;
                agvMemory.setStop(true);
            }
            if (booleans[1] == false && aux == true) {
                aux = false;
                agvMemory.setSpeed(agvMemory.getSpeed() / 2);
            }
        }
        if (aux1) {
            agvMemory.setStop(false);
            isAux = true;
        }
    }

    public void isCloseToProduct(List<Position> positionList) {
        if (isAux && positionList.size() == 2 && agvMemory.isStop()) {
            isAux = false;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Position position = agvMemory.getNextProductPosition();

            if (position == null) {
                agvMemory.setDestination(new Position(agvMemory.getAgv().agvDock().begin().blsquare(), agvMemory.getAgv().agvDock().begin().bwsquare()));
            } else {
                agvMemory.setDestination(position);
            }
            agvMemory.setStop(false);
        }
    }

    public void run() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (!agvMemory.isOrderPrepared()) {
                    controlSystem();
                } else {
                    timer.cancel();
                    customerOrder.changeStatus(OrderStatus.prepared);
                    customerOrderRepository.save(customerOrder);
                    agvMemory.getAgv().changeCurrentTask(CurrentTask.FREE);
                    agvRepository.save(agvMemory.getAgv());
                }
            }
        }, 0, 100);
    }
}
