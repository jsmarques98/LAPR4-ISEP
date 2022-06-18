package eapli.base.warehousemanagement.application;

import eapli.base.agvmanagement.domain.AGV;
import eapli.base.agvmanagement.domain.Position;
import eapli.base.ordermanagement.domain.CustomerOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AGVMemory {
    private Position actualPosition;

    private List<Position> productsPositions;
    private int indexProductsPosition;

    private Position agvDockPosition;

    private Position destination;


    private int[][] warehousePlant;

    private boolean flag;
    private boolean orderPrepared;

    private List<Position> agvPath = new ArrayList<>();

    private AGV agv;

    private Double speed;

    private boolean stop;

    private int direction;

    List<Sensor> sensors = new ArrayList<>();


    public List<Sensor> getSensors() {
        return sensors;
    }

    public synchronized int getDirection() {
        return direction;
    }

    public synchronized void setDirection(int direction) {
        this.direction = direction;
    }

    public AGVMemory(AGV agv) {
        this.agv = agv;
        actualPosition = agv.position();
        this.indexProductsPosition = 0;
        for (int i = 0; i < 4; i++)
            sensors.add(new Sensor(i, this));
        stop = false;
        orderPrepared = false;
    }

    public Position getDestination() {
        return destination;
    }

    public void setDestination(Position destination) {
        this.destination = destination;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public boolean isStop() {
        return stop;
    }

    public synchronized void setActualPosition(Position actualPosition) {
        this.actualPosition = actualPosition;
    }

    public synchronized void setAgvDockPosition(Position agvDockPosition) {
        this.agvDockPosition = agvDockPosition;
    }

    public synchronized void setAgvPath(List<Position> agvPath) {
        this.agvPath = agvPath;
    }

    public synchronized void setProductsPositions(List<Position> productPosition) {
        this.productsPositions = productPosition;
    }

    public synchronized void setWarehousePlant(int[][] warehousePlant) {
        this.warehousePlant = warehousePlant;
    }

    public synchronized Position getActualPosition() {
        return actualPosition;
    }

    public synchronized List<Position> getProductPosition() {
        return productsPositions;
    }

    public synchronized Position getAgvDockPosition() {
        return agvDockPosition;
    }

    public synchronized int[][] getWarehousePlant() {
        return warehousePlant;
    }

    public synchronized List<Position> getAgvPath() {
        return agvPath;
    }

    public synchronized AGV getAgv() {
        return agv;
    }

    public synchronized void setAgv(AGV agv) {
        this.agv = agv;
    }

    public synchronized Double getSpeed() {
        return speed;
    }

    public synchronized void setSpeed(Double speed) {
        this.speed = speed;
    }

    public synchronized boolean isFlag() {
        return flag;
    }

    public synchronized boolean isOrderPrepared() {
        return orderPrepared;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setOrderPrepared(boolean orderPrepared) {
        this.orderPrepared = orderPrepared;
    }

    public Position getNextProductPosition() {
        Position position = null;
        if (productsPositions.size()>1) {
            productsPositions.remove(productsPositions.get(0));
            position = productsPositions.get(0);
        }
        return position;
    }

    @Override
    public String toString() {
        return agvPath.toString();
    }
}
