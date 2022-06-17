package eapli.base.warehousemanagement.application;

import eapli.base.agvmanagement.domain.AGV;
import eapli.base.agvmanagement.domain.Position;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AGVMemory {
    private Position actualPosition;

    private Position productPosition;

    private Position agvDockPosition;

    private int[][] warehousePlant;

    private boolean flag;
    private boolean flag1;

    private List<Position> agvPath=new ArrayList<>();

    private AGV agv;

    private Double speed;

    private  int direction;

    List<Sensor> sensors =new ArrayList<>();



    public List<Sensor> getSensors() {
        return sensors;
    }

    public synchronized int getDirection() {
        return direction;
    }

    public synchronized void setDirection(int direction) {
        this.direction = direction;
    }

    public AGVMemory(AGV agv){
        this.agv= agv;
        for (int i=0;i<4;i++)
            sensors.add(new Sensor(i,this));
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
    public synchronized boolean isFlag1() {
        return flag1;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    public void setFlag1(boolean flag) {
        this.flag1 = flag;
    }

    @Override
    public String toString() {
        return agvPath.toString();
    }
}
