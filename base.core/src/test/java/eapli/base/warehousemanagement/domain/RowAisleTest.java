package eapli.base.warehousemanagement.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RowAisleTest {

    Warehouse warehouse;
    Aisle aisle;

    RowAisle row;

    @BeforeEach
    void setUp(){
        warehouse = new Warehouse("Warehouse",10,12,1,"cm");
        Begin b = new Begin(1,1);
        End e = new End(1,2);
        Depth d = new Depth(1,1);
        Shelve s = new Shelve(1);
        aisle = new Aisle(1,b,e,d,"w+",warehouse);
        row = new RowAisle(1,aisle,b,e,s);
    }

    @Test
    void sameAs() {
        Warehouse warehouse1 = new Warehouse("Warehouse",10,13,1,"cm");
        Begin b = new Begin(1,1);
        End e = new End(1,2);
        Depth d = new Depth(1,1);
        Aisle aisle1 = new Aisle(1,b,e,d,"w+",warehouse1);
        Shelve s = new Shelve(1);
        RowAisle row1 = new RowAisle(1,aisle1,b,e,s);
        String w = "s";

        assertTrue(row.sameAs(row));
        assertFalse(row.sameAs(w));
    }

    @Test
    void identity() {
        assertEquals(1,row.identity());
    }

    @Test
    void testEquals() {
        Warehouse warehouse1 = new Warehouse("Warehouse",10,12,1,"cm");
        Begin b = new Begin(1,1);
        End e = new End(1,2);
        Depth d = new Depth(1,1);
        Aisle aisle1 = new Aisle(1,b,e,d,"w+",warehouse1);
        Begin b1 = new Begin(1,1);
        End e1 = new End(1,2);
        Depth d1 = new Depth(1,1);
        Shelve s = new Shelve(1);
        aisle = new Aisle(1,b1,e1,d1,"w+",warehouse);
        RowAisle row1 = new RowAisle(1,aisle,b1,e1,s);
        String w = "s";

        assertTrue(row.sameAs(row1));
        assertFalse(aisle.sameAs(w));
    }

    @Test
    void testHashCode() {
        assertEquals(868806018,row.hashCode());
    }
}