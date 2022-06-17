package eapli.base.warehousemanagement.application;

import eapli.base.agvmanagement.domain.*;
import eapli.base.agvmanagement.repository.AGVRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.framework.presentation.console.AbstractUI;

import java.util.List;

public class Test extends AbstractUI {
    private SimulationEngine simulationEngine;
    private AGVRepository agvRepository;

    public Test() {
        agvRepository = PersistenceContext.repositories().agvs();
    }

    @Override
    protected boolean doShow() {

        AGV agv = agvRepository.findByID(IDAGV.valueOf("1234")).get();

        AGVMemory AGVMemory = new AGVMemory(agv);
        AGVMemory.setSpeed(1.0);
        AGVMemory.setProductPosition(new Position(10, 8));
        AGVMemory.setActualPosition(new Position(2, 3));

        simulationEngine = new SimulationEngine(AGVMemory);
        simulationEngine.start();

        ControlSystem controlSystem = new ControlSystem(AGVMemory);
        controlSystem.start();


        return true;
    }

    @Override
    public String headline() {
        return "aasassa";
    }
}
