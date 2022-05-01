package eapli.base.categorymanagement.domain;

import eapli.base.productmanagement.domain.ShortDescription;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescriptionTest {

    private Description description;

    @BeforeEach
    void setUp(){
        description = new Description("computers");
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
        assertEquals("description cannot be null", exception2.getMessage());

    }


    @Test
    void testEquals() {
        Description description2 = new Description("smartphones");
        String a = "dummy";

        assertTrue(description2.equals(description2));
        assertFalse(description.equals(description2));
        assertFalse(description.equals(a));
        assertFalse(description.equals(null));
    }

    @Test
    void testToString() {
        String expected="computers";
        assertEquals(expected,description.toString());
    }
}