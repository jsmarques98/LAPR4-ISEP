package eapli.base.warehousemanagement.application;

import eapli.base.agvmanagement.domain.AGV;
import eapli.base.agvmanagement.domain.Position;

import java.util.Arrays;
import java.util.List;

public class AGVMemory {
    private Position actualPosition;

    private Position productPosition;

    private Position agvDockPosition;

    private int[][] warehousePlant;

    private boolean flag;

    private List<Position> agvPath;

    private AGV agv;

    private Double speed;

    private  int direction;

    public synchronized int getDirection() {
        return direction;
    }

    public synchronized void setDirection(int direction) {
        this.direction = direction;
    }

    public AGVMemory(AGV agv){
        this.agv= agv;
    }

    public synchronized void setActualPosition(Position actualPosition) {
        this.actualPosition = actualPosition;
    }

    public synchronized void setAgvDockPosition(Position agvDockPosition) {
        this.agvDockPosition = agvDockPosition;
    }

    public synchronized  void setAgvPath(List<Position> agvPath) {
        this.agvPath = agvPath;
    }

    public synchronized void setProductPosition(Position productPosition) {
        this.productPosition = productPosition;
    }

    public synchronized void setWarehousePlant(int[][] warehousePlant) {
        this.warehousePlant = warehousePlant;
    }

    public synchronized Position getActualPosition() {
        return actualPosition;
    }

    public synchronized Position getProductPosition() {
        return productPosition;
    }

    public synchronized  Position getAgvDockPosition() {
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

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return agvPath.toString();
    }
}
