package eapli.base.productmanagement.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortDescriptionTest {
    private ShortDescription description;

    @BeforeEach
    void setUp(){
        description = new ShortDescription("drink");
    }

    @Test
    void testDescriptionMustNotBeNullOrEmpty(){
        // DESCRIPTION EMPTY
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    ShortDescription description = new ShortDescription("");
                }
        );
        assertEquals("Invalid description", exception.getMessage());


        // DESCRIPTION NULL
        Throwable exception2 = assertThrows(
                IllegalArgumentException.class, () -> {
                    ShortDescription description2 = new ShortDescription(null);
                }
        );
        assertEquals("Description cannot be null", exception2.getMessage());

    }

    @Test
    void valueOf() {
        assertEquals(description, ShortDescription.valueOf("drink"));
    }

    @Test
    void testEquals() {
        ShortDescription description2 = new ShortDescription("food");
        String a = "dummy";

        assertTrue(description2.equals(description2));
        assertFalse(description.equals(description2));
        assertFalse(description.equals(a));
        assertFalse(description.equals(null));
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
        String expected="drink";
        assertEquals(expected,description.toString());
    }
}