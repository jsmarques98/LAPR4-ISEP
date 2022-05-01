package eapli.base.agvmanagement.domain;

import eapli.base.productmanagement.domain.Reference;
import eapli.base.warehousemanagement.domain.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AGVTest {
    private AGV agv;
    private AGV agv2;
    private AGV agv3;

    @BeforeEach
    void setUp(){
        IDAGV idagv = new IDAGV("1");
        IDAGV idagv2 = new IDAGV("2");
        Autonomy autonomy = new Autonomy(200);
        Autonomy autonomy2 = new Autonomy(201);
        MaxWeight maxWeight = new MaxWeight(1000.0);
        MaxWeight maxWeight2 = new MaxWeight(1001.0);
        Model model = new Model("AGV1");
        Model model2 = new Model("AGV2");
        ShortDescription shortDescription = new ShortDescription("Agv model 1");
        ShortDescription shortDescription2 = new ShortDescription("Agv model 2");
        AGVDock agvDock = new AGVDock("1",new Begin(1,2),new End(1,2),new Depth(1,2),"a",new Warehouse("Warehouse",10,12,1,"cm"));
        agv = new AGV(idagv,autonomy,maxWeight,model,shortDescription,agvDock);
        agv2 = new AGV(idagv2,autonomy2,maxWeight2,model2,shortDescription2,agvDock);
        agv3 = new AGV(idagv,autonomy2,maxWeight2,model2,shortDescription2,agvDock);
    }

    @Test
    void testAGVMustHaveLocation(){
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    AGV agv = new AGV(new IDAGV("1"),new Autonomy(200), new MaxWeight(1000.0),new Model("AGV1") ,new ShortDescription("Agv model 1"),null);
                }
        );
        assertEquals("At least one of the required method parameters is null", exception.getMessage());
    }

    @Test
    void testAGVEqualsPassesSameIDAGV(){
        assertTrue(agv.equals(agv3));

    }

    @Test
    void testAGVEqualsFailsDifferentAGV(){
        assertFalse(agv.equals(agv2));
    }

    @Test
    void testAGVEqualsAreTheSameForTheSameInstance(){
        assertTrue(agv.equals(agv));
    }
}