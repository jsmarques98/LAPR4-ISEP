package eapli.base.agvmanagement.application;

import eapli.base.agvmanagement.domain.*;
import eapli.base.agvmanagement.repository.AGVRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.warehousemanagement.domain.AGVDock;
import eapli.base.warehousemanagement.repository.AGVDockRepository;

import java.util.List;


public class AddAGVController {


    private final AGVRepository agvRep;
    private final RepositoryFactory repositoryFactory;
    private final AGVDockRepository agvDockRepository;
    private AGVDock agvDock;


    public AddAGVController(){

        repositoryFactory = PersistenceContext.repositories();
        agvRep = repositoryFactory.agvs();
        agvDockRepository = repositoryFactory.aGVDock();
    }

    public AGV createAGV(String idAgv,Integer autonomy,Double weight,String model,String description){

        return agvRep.save(new AGV(IDAGV.valueOf(idAgv),Autonomy.valueOf(autonomy), MaxWeight.valueOf(weight),Model.valueOf(model),ShortDescription.valueOf(description),agvDock,Position.valueOf(agvDock.begin().blsquare(),agvDock.begin().bwsquare())));
    }

    private AGVDock getAGVDock(String location){
        return agvDockRepository.findById(location).get();
    }

    public boolean validateAGVDock(String location){
        agvDock = getAGVDock(location);
        if(agvRep.findByAGVDock(agvDock).size()==0)
            return true;
        return false;
    }

    public boolean isPossibleToCreateAGV(){
        Integer agvCounter = 0;
        Integer agvDockCounter = 0;
        for (AGV agv :agvRep.findAll()){
            agvCounter++;
        }
        for (AGVDock agvDock :agvDockRepository.findAll()){
            agvDockCounter++;
        }

        return agvDockCounter > agvCounter;
    }
}
