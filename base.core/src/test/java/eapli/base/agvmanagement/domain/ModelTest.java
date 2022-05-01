package eapli.base.agvmanagement.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {
    @Test
    void testModelMustNotBeNullNorEmpty() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    Model model = new Model(null);
                }
        );

        assertEquals("Model cannot be null",exception.getMessage());

        Throwable exception2 = assertThrows(
                IllegalArgumentException.class, () -> {
                    Model model = new Model("");
                }
        );

        assertEquals("Invalid Model",exception2.getMessage());
    }
}