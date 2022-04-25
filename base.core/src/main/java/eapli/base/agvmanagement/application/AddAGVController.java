package eapli.base.agvmanagement.application;

import eapli.base.agvmanagement.domain.*;
import eapli.base.agvmanagement.repository.AGVRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;


public class AddAGVController {


    private final AGVRepository agvRep;
    private final RepositoryFactory repositoryFactory;


    public AddAGVController(){

        repositoryFactory = PersistenceContext.repositories();
        agvRep = repositoryFactory.agvs();
    }

    public AGV createAGV(String idAgv,Integer autonomy,Double weight,String model,String description){

        return agvRep.save(new AGV(IDAGV.valueOf(idAgv),Autonomy.valueOf(autonomy), MaxWeight.valueOf(weight),Model.valueOf(model),ShortDescription.valueOf(description)));
    }
}
