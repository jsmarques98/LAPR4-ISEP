package eapli.base.agvmanagement.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutonomyTest {


    @Test
    void testAutonomyMustNotBeNull() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                Autonomy autonomy = new Autonomy(null);
                }
        );

        assertEquals("Autonomy can not be null",exception.getMessage());

    }

    @Test
    void testAutonomyCanNotBeNegative() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    Autonomy autonomy = new Autonomy(-1);
                }
        );

        assertEquals("Invalid Autonomy",exception.getMessage());

    }



}