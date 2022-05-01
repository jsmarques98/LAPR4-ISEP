package eapli.base.agvmanagement.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxWeightTest {

    @Test
    void testMaxWeightMustNotBeNull() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    MaxWeight idagv = new MaxWeight(null);
                }
        );

        assertEquals("Max Weight cannot be null",exception.getMessage());
    }

    @Test
    void testMaxWeightCannotBeNegative() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    MaxWeight idagv = new MaxWeight(-1.0);
                }
        );

        assertEquals("Invalid Max Weight",exception.getMessage());
    }

}