package eapli.base.warehousemanagement.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    Warehouse warehouse;

    @BeforeEach
    void setUp(){
        warehouse = new Warehouse("Warehouse",10,12,1,"cm");
    }

    @Test
    void sameAs() {
        Warehouse warehouse1 = new Warehouse("Warehouse",10,12,1,"cm");
        String w = "s";

        assertTrue(warehouse.sameAs(warehouse1));
        assertFalse(warehouse.sameAs(w));
    }

    @Test
    void identity() {
        assertEquals(null,warehouse.identity());
    }

    @Test
    void testEquals() {
        Warehouse warehouse1 = new Warehouse("Warehouse",10,12,1,"cm");
        String w = "s";

        assertTrue(warehouse.sameAs(warehouse1));
        assertFalse(warehouse.sameAs(w));
    }

    @Test
    void testHashCode() {
        assertEquals(1292059469,warehouse.hashCode());
    }
}