package eapli.base.warehousemanagement.application;

import eapli.base.agvmanagement.domain.AGV;
import eapli.base.agvmanagement.domain.Position;
import eapli.base.agvmanagement.repository.AGVRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.warehousemanagement.domain.*;
import eapli.base.warehousemanagement.repository.AGVDockRepository;
import eapli.base.warehousemanagement.repository.AisleRepository;
import eapli.base.warehousemanagement.repository.WarehouseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class SimulationEngine extends Thread {
    private final RepositoryFactory repositoryFactory;
    private final WarehouseRepository warehouseRepository;
    private final AisleRepository aisleRepository;
    private final AGVDockRepository agvDockRepository;
    private final AGVRepository agvRepository;
    private final AGVMemory AGVMemory;
    private int[][] array;
    private List<Sensor> sensors = new ArrayList<>();


    public SimulationEngine(AGVMemory AGVMemory) {
        repositoryFactory = PersistenceContext.repositories();
        this.warehouseRepository = repositoryFactory.warehouse();
        aisleRepository = repositoryFactory.aisle();
        agvDockRepository = repositoryFactory.aGVDock();
        agvRepository = repositoryFactory.agvs();
        this.AGVMemory = AGVMemory;

        for(int i =0;i<4;i++) {
            Sensor sensor = new Sensor(i, AGVMemory);
            sensors.add(sensor);
            sensor.start();
        }
    }

    public void run() {

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                mappingWorld();
                RoutePlanner routePlanner = new RoutePlanner(AGVMemory);
                routePlanner.createRoutePlanner();
            }
        }, 0, 100);

    }

    public synchronized void mappingWorld() {
        createArray();
        aisle();
        agvDock();
        agv();
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        sendInfoPlantToSensors();
        AGVMemory.setWarehousePlant(array);
    }

    public synchronized void createArray() {
        Warehouse warehouse = (Warehouse) (warehouseRepository.findAll()).iterator().next();
        array = new int[warehouse.width() / warehouse.square()][warehouse.length() / warehouse.square()];
    }

    public synchronized void sendInfoPlantToSensors() {
        for(int i =0;i<4;i++)
            sensors.get(i).setWharehousePlant(array);
        for(int i =0;i<4;i++)
            sensors.get(i).doNotify();



    }

    public synchronized void aisle() {


        List<Aisle> aisleList = (List<Aisle>) aisleRepository.findAll();
        for (Aisle aisle : aisleList) {
            int depth = Math.abs(aisle.depth().dwsquare() - aisle.begin().bwsquare());
            String a = aisle.accessibilityR();

            Begin begin = aisle.begin();
            End end = aisle.end();
            for (int i = begin.bwsquare() - 1; i < end.ewsquare(); i++) {
                for (int j = begin.blsquare() - 1; j < end.elsquare(); j++) {
                    if (depth != 0) {
                        for (int x = 1; x <= depth; x++) {
                            if (a.equals("w-")) {
                                array[i + depth][j] = 1;
                            } else if (a.equals("w+")) {
                                array[i - depth][j] = 1;
                            }
                        }
                    }
                    array[i][j] = 1;
                }
            }
        }
    }

    public synchronized void agv() {
        List<AGV> agvList = (List<AGV>) PersistenceContext.repositories().agvs().findAll();
        agvList.remove(AGVMemory.getAgv());
        for (AGV agv : agvList) {
            Position position = agv.position();
            array[position.wsquare() - 1][position.lsquare() - 1] = 1;
        }
    }

    public synchronized void agvDock() {

        List<AGVDock> agvDockList = (List<AGVDock>) agvDockRepository.findAll();
        for (AGVDock agvDock : agvDockList) {
            Begin begin = agvDock.begin();
            End end = agvDock.end();
            for (int i = begin.bwsquare() - 1; i < end.ewsquare(); i++) {
                for (int j = begin.blsquare() - 1; j < end.elsquare(); j++) {
                    array[i][j] = 1;
                }
            }
        }
    }
}
