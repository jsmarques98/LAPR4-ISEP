package eapli.base.agvmanagement.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortDescriptionTest {

    @Test
    void testShortDescriptionMustNotBeNullNorEmpty() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    ShortDescription model = new ShortDescription(null);
                }
        );

        assertEquals("description cannot be null",exception.getMessage());

        Throwable exception2 = assertThrows(
                IllegalArgumentException.class, () -> {
                    ShortDescription model = new ShortDescription("");
                }
        );

        assertEquals("Invalid description",exception2.getMessage());
    }
}