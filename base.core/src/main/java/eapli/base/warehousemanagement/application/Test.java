package eapli.base.warehousemanagement.application;

import eapli.base.agvmanagement.domain.*;
import eapli.base.agvmanagement.repository.AGVRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.framework.presentation.console.AbstractUI;

import java.util.List;

public class Test extends AbstractUI {
    private SimulationEngine simulationEngine;
    private AGVRepository agvRepository = PersistenceContext.repositories().agvs();

    public Test() {

    }

    @Override
    protected boolean doShow() {

        AGV agv = agvRepository.findByID(IDAGV.valueOf("1234")).get();

        AGVMemory AGVMemory = new AGVMemory(agv);
        AGVMemory.setSpeed(0.5);
        AGVMemory.setProductPosition(new Position(10, 8));
        AGVMemory.setActualPosition(new Position(3, 3));

        simulationEngine = new SimulationEngine(AGVMemory);
        simulationEngine.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        List<Position> positionList = null;

        while (positionList == null){
            positionList = AGVMemory.getAgvPath();
        }
        positionList.remove(positionList.get(0));

        for (Position position:positionList){

            Position actual= AGVMemory.getActualPosition();
            if(actual.lsquare()!=position.lsquare()){
                if(actual.lsquare()< position.lsquare()){
                    AGVMemory.setDirection(2);
                }else if(actual.lsquare()> position.lsquare()){
                    AGVMemory.setDirection(3);
                }
            }else if(actual.wsquare() != position.wsquare()){
                if(actual.wsquare()< position.wsquare()){
                    AGVMemory.setDirection(1);
                }else if(actual.wsquare()> position.wsquare()){
                    AGVMemory.setDirection(0);
                }
            }

            try {
                Positioning  positioning = new Positioning(AGVMemory);
                positioning.teste();
            } catch (InterruptedException e) {
                System.out.println(e.getCause());
                e.printStackTrace();
            }
        }

        return true;
}

    @Override
    public String headline() {
        return "aasassa";
    }
}
