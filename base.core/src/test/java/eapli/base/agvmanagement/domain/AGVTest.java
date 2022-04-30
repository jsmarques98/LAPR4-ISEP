package eapli.base.agvmanagement.domain;

import eapli.base.warehousemanagement.domain.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AGVTest {
    private AGV agv;
    private AGV agv2;

    @BeforeEach
    void setUp(){
        IDAGV idagv = new IDAGV("1");
        IDAGV idagv2 = new IDAGV("2");
        Autonomy autonomy = new Autonomy(200);
        MaxWeight maxWeight = new MaxWeight(1000.0);
        Model model = new Model("AGV1");
        ShortDescription shortDescription = new ShortDescription("Agv model 1");
        AGVDock agvDock = new AGVDock("1",new Begin(1,2),new End(1,2),new Depth(1,2),"a",new Warehouse("Warehouse",10,12,1,"cm"));
        agv = new AGV(idagv,autonomy,maxWeight,model,shortDescription,agvDock);
        agv2 = new AGV(idagv2,autonomy,maxWeight,model,shortDescription,agvDock);
    }

}