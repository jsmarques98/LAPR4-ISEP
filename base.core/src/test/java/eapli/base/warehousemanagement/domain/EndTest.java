package eapli.base.warehousemanagement.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndTest {

    private End end;

    @BeforeEach
    void setUp(){
        end = new End(1,2);
    }

    @Test
    void valueOf() {
        assertEquals(end,End.valueOf(1,2));
    }


    @Test
    void testEquals() {
        End e1 = new End(1,1);
        int e = 1;
        assertTrue(e1.equals(e1));
        assertFalse(end.equals(e1));
        assertFalse(end.equals(e));
        assertFalse(end.equals(null));
    }

    @Test
    void tesEndCanNotBeNegative() {
        Throwable exception2 = assertThrows(
                IllegalArgumentException.class, () -> {
                    End e = new End();
                    e =  e.valueOf(1,-1);
                }
        );
        assertEquals("Invalid End", exception2.getMessage());

        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    End e = new End();
                    e =  e.valueOf(-1,1);
                }
        );
        assertEquals("Invalid End", exception2.getMessage());
    }
}