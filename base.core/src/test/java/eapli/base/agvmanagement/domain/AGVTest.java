package eapli.base.agvmanagement.domain;

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
        agv = new AGV(idagv,autonomy,maxWeight,model,shortDescription);
        agv2 = new AGV(idagv2,autonomy,maxWeight,model,shortDescription);
    }

    @Test
    void sameAs() {
        assertTrue(agv.sameAs(agv));
        assertFalse(agv.sameAs(agv2));
    }

    @Test
    void identity() {
        assertEquals(agv.getId(), agv.identity());
    }

    @Test
    void testEquals() {
        String dummy = "dummy";
        assertTrue(agv.equals(agv));
        assertFalse(agv.equals(agv2));
        assertFalse(agv.equals(null));
        assertFalse(agv.equals(dummy));
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
        assertEquals(agv.toString(),"AGV:\n" +
                "ID:=IDAGV{idAGV='1'}\n" +
                "Autonomy=200min\n" +
                "Max Weight=1000.0g\n" +
                "Model=AGV1\n" +
                "Short Description=Agv model 1");
    }
}