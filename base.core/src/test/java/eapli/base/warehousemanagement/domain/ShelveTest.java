package eapli.base.warehousemanagement.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShelveTest {

    private Shelve shelve;

    @BeforeEach
    void setUp(){
        shelve = new Shelve(1);
    }

    @Test
    void valueOf() {
        assertEquals(shelve,Shelve.valueOf("1"));
    }


    @Test
    void testEquals() {
        Shelve s1 = new Shelve(2);
        int s = 1;
        assertTrue(s1.equals(s1));
        assertFalse(shelve.equals(s1));
        assertFalse(shelve.equals(s));
        assertFalse(shelve.equals(null));
    }

    @Test
    void tesShelveCanNotBeNegative() {
        Throwable exception2 = assertThrows(
                IllegalArgumentException.class, () -> {
                    Shelve e = new Shelve();
                    e =  e.valueOf("-1");
                }
        );
        assertEquals("Invalid Shelve", exception2.getMessage());

    }
}