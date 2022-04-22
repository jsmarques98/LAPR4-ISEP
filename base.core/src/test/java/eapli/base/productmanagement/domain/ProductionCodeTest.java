package eapli.base.productmanagement.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.security.core.parameters.P;

import static org.junit.jupiter.api.Assertions.*;

class ProductionCodeTest {
    private ProductionCode pc;

    @BeforeEach
    void setUp(){
        pc = new ProductionCode("aaaa.12345");
    }



    @Test
    void testProductionCodeMustFollowBasePattern(){
        // PC WRONG PATTERN
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    ProductionCode productionCode = new ProductionCode("1234.asdaa");
                }
        );
        assertEquals("Invalid production Code", exception.getMessage());
    }

    @Test
    void valueOf() {
        assertEquals(pc,ProductionCode.valueOf("aaaa.12345"));
    }

    @Test
    void testEquals() {
        ProductionCode pc2 = new ProductionCode("aaab.12345");
        String a = "dummy";

        assertTrue(pc2.equals(pc2));
        assertFalse(pc.equals(pc2));
        assertFalse(pc.equals(a));
        assertFalse(pc.equals(null));
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
        String expected = "aaaa.12345";
        assertEquals(expected,pc.toString());
    }
}