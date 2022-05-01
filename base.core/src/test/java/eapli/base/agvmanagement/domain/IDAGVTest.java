package eapli.base.agvmanagement.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IDAGVTest {
    @Test
    void testIDAGVMustNotBeNullNorEmpty() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    IDAGV idagv = new IDAGV(null);
                }
        );

        assertEquals("idAGV not valid",exception.getMessage());

        Throwable exception2 = assertThrows(
                IllegalArgumentException.class, () -> {
                    IDAGV idagv = new IDAGV("");
                }
        );
        assertEquals("idAGV not valid",exception2.getMessage());
    }
}