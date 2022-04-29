package eapli.base.warehousemanagement.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeginTest {
    private Begin begin;

    @BeforeEach
    void setUp(){
        begin = new Begin(1,2);
    }

    @Test
    void valueOf() {
        assertEquals(begin,Begin.valueOf(1,2));
    }


    @Test
    void testEquals() {
        Begin b1 = new Begin(1,1);
        int b = 1;
        assertTrue(b1.equals(b1));
        assertFalse(begin.equals(b1));
        assertFalse(begin.equals(b));
        assertFalse(begin.equals(null));
    }

    @Test
    void tesBeginCanNotBeNegative() {
        Throwable exception2 = assertThrows(
                IllegalArgumentException.class, () -> {
                    Begin b = new Begin();
                    b =  b.valueOf(1,-1);
                }
        );
        assertEquals("Invalid Begin", exception2.getMessage());

        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    Begin b = new Begin();
                    b =  b.valueOf(-1,1);
                }
        );
        assertEquals("Invalid Begin", exception2.getMessage());
    }

}