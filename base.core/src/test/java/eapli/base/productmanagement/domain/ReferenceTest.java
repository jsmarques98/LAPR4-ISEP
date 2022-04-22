package eapli.base.productmanagement.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReferenceTest {
    private Reference reference;

    @BeforeEach
    void setUp(){
        reference = new Reference("123asd1234");
    }


    @Test
    void testReferenceMustNotBeNullNorEmpty(){
        // REFERENCE EMPTY
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    Reference reference = new Reference("");
                }
        );
        assertEquals("Invalid reference", exception.getMessage());


        // REFERENCE NULL
        Throwable exception2 = assertThrows(
                IllegalArgumentException.class, () -> {
                    Reference uic2 = new Reference(null);
                }
        );
        assertEquals("Reference cannot be null", exception2.getMessage());
    }

    @Test
    void valueOf() {
        assertEquals(reference,Reference.valueOf("123asd1234"));
    }

    @Test
    void testEquals() {
        Reference reference2 = new Reference("asd123asdf");
        String a = "dummy";

        assertTrue(reference2.equals(reference2));
        assertFalse(reference.equals(reference2));
        assertFalse(reference.equals(a));
        assertFalse(reference.equals(null));
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
        String expected = "123asd1234";
        assertEquals(expected,reference.toString());
    }
}