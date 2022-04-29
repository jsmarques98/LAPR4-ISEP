package eapli.base.warehousemanagement.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AisleTest {

    Warehouse warehouse;
    Aisle aisle;

    @BeforeEach
    void setUp(){
        warehouse = new Warehouse("Warehouse",10,12,1,"cm");
        Begin b = new Begin(1,1);
        End e = new End(1,2);
        Depth d = new Depth(1,1);
        aisle = new Aisle(1,b,e,d,"w+",warehouse);
    }

    @Test
    void sameAs() {
        Warehouse warehouse1 = new Warehouse("Warehouse",10,12,1,"cm");
        Begin b = new Begin(1,1);
        End e = new End(1,2);
        Depth d = new Depth(1,1);
        Aisle aisle1 = new Aisle(1,b,e,d,"w+",warehouse1);
        String w = "s";

        assertTrue(aisle.sameAs(aisle1));
        assertFalse(aisle.sameAs(w));
    }

    @Test
    void identity() {
        assertEquals(1,aisle.identity());
    }

    @Test
    void testEquals() {
        Warehouse warehouse1 = new Warehouse("Warehouse",10,12,1,"cm");
        Begin b = new Begin(1,1);
        End e = new End(1,2);
        Depth d = new Depth(1,1);
        Aisle aisle1 = new Aisle(1,b,e,d,"w+",warehouse1);
        String w = "s";

        assertTrue(aisle.sameAs(aisle1));
        assertFalse(aisle.sameAs(w));
    }

    @Test
    void testHashCode() {
        assertEquals(860838143,aisle.hashCode());
    }
}