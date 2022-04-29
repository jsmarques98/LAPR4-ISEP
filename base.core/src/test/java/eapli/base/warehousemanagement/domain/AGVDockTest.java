package eapli.base.warehousemanagement.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AGVDockTest {

    Warehouse warehouse;
    AGVDock agvDock;

    @BeforeEach
    void setUp(){
        warehouse = new Warehouse("Warehouse",10,12,1,"cm");
        Begin b = new Begin(1,1);
        End e = new End(1,2);
        Depth d = new Depth(1,1);
        agvDock = new AGVDock("D1",b,e,d,"l-",warehouse);
    }

    @Test
    void sameAs() {
        Warehouse warehouse1 = new Warehouse("Warehouse",10,13,1,"cm");
        Begin b = new Begin(1,1);
        End e = new End(1,2);
        Depth d = new Depth(1,1);
        AGVDock agvDock1 = new AGVDock("D1",b,e,d,"l-",warehouse1);
        String w = "s";

        assertTrue(agvDock.sameAs(agvDock1));
        assertFalse(agvDock.sameAs(w));
    }

    @Test
    void identity() {
        assertEquals("D1",agvDock.identity());
    }

    @Test
    void testEquals() {
        Warehouse warehouse1 = new Warehouse("Warehouse",10,13,1,"cm");
        Begin b = new Begin(1,1);
        End e = new End(1,2);
        Depth d = new Depth(1,1);
        AGVDock agvDock1 = new AGVDock("D1",b,e,d,"l-",warehouse1);
        String w = "s";

        assertTrue(agvDock.sameAs(agvDock1));
        assertFalse(agvDock.sameAs(w));
    }

    @Test
    void testHashCode() {
        assertEquals(-1839222080,agvDock.hashCode());
    }
}