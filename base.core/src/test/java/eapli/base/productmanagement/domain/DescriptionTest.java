package eapli.base.productmanagement.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescriptionTest {
    private Description description;

    @BeforeEach
    void setUp(){
        description = new Description("drink");
    }

    @Test
    void testDescriptionMustNotBeNullOrEmpty(){
        // DESCRIPTION EMPTY
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    Description description = new Description("");
                }
        );
        assertEquals("Invalid description", exception.getMessage());


        // DESCRIPTION NULL
        Throwable exception2 = assertThrows(
                IllegalArgumentException.class, () -> {
                    Description description2 = new Description(null);
                }
        );
        assertEquals("Description cannot be null", exception2.getMessage());

    }

    @Test
    void valueOf() {
        assertEquals(description,Description.valueOf("drink"));
    }

    @Test
    void testEquals() {
        Description description2 = new Description("food");
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