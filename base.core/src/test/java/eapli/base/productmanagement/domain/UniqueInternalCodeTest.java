package eapli.base.productmanagement.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueInternalCodeTest {
    private UniqueInternalCode uic;

    @BeforeEach
    void setUp(){
        uic = new UniqueInternalCode("aaaa.12345");
    }


    @Test
    void testUniqueInternalCodeMustNotBeNullNorEmpty(){
        // UIC EMPTY
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    UniqueInternalCode uic = new UniqueInternalCode("");
                }
        );
        assertEquals("Invalid unique internal code", exception.getMessage());


        // UIC NULL
        Throwable exception2 = assertThrows(
                IllegalArgumentException.class, () -> {
                    UniqueInternalCode uic2 = new UniqueInternalCode(null);
                }
        );
        assertEquals("Unique internal code cannot be null", exception2.getMessage());



    }

    @Test
    void testUniqueInternalCodeMustFollowBasePattern(){
        // UIC WRONG PATTERN
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    UniqueInternalCode uic = new UniqueInternalCode("1234.asdaa");
                }
        );
        assertEquals("Invalid unique internal code", exception.getMessage());
    }

    @Test
    void valueOf() {
        assertEquals(uic,UniqueInternalCode.valueOf("aaaa.12345"));
    }

    @Test
    void compareTo() {
        UniqueInternalCode uic2 = new UniqueInternalCode("aaab.12345");

        assertEquals(-1,uic.compareTo(uic2));
        assertEquals(0,uic.compareTo(uic));

    }

    @Test
    void testEquals() {
        UniqueInternalCode uic2 = new UniqueInternalCode("aaab.12345");
        String a = "dummy";

        assertTrue(uic2.equals(uic2));
        assertFalse(uic.equals(uic2));
        assertFalse(uic.equals(a));
        assertFalse(uic.equals(null));
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
        String expected = "aaaa.12345";
        assertEquals(expected,uic.toString());
    }
}