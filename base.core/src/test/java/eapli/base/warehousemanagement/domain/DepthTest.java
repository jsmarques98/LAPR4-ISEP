package eapli.base.warehousemanagement.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class DepthTest {
    private Depth depth;

    @BeforeEach
    void setUp(){
        depth = new Depth(1,2);
    }

    @Test
    void valueOf() {
        assertEquals(depth,Depth.valueOf(1,2));
    }


    @Test
    void testEquals() {
        Depth d1 = new Depth(1,1);
        int d = 1;
        assertTrue(d1.equals(d1));
        assertFalse(depth.equals(d1));
        assertFalse(depth.equals(d));
        assertFalse(depth.equals(null));
    }

    @Test
    void tesDepthCanNotBeNegative() {
        Throwable exception2 = assertThrows(
                IllegalArgumentException.class, () -> {
                    Depth d = new Depth();
                    d =  d.valueOf(1,-1);
                }
        );
        assertEquals("Invalid Depth", exception2.getMessage());

        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    Depth d = new Depth();
                    d =  d.valueOf(-1,1);
                }
        );
        assertEquals("Invalid Depth", exception2.getMessage());
    }
}