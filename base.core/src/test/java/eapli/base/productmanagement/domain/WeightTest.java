package eapli.base.productmanagement.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightTest {

    private Weight weight;


    @BeforeEach
    void setUp(){
        weight = new Weight(20.0);
    }

    @Test
    void testWeightMustNotNull(){
        // Weight NULL
        Throwable exception2 = assertThrows(
                IllegalArgumentException.class, () -> {
                    Weight weight = new Weight(null);
                }
        );
        assertEquals("Weight cannot be null", exception2.getMessage());
    }

    @Test
    void testWeightCanNotBeNegative(){
        // Weight LESS THAN 0
        Throwable exception2 = assertThrows(
                IllegalArgumentException.class, () -> {
                    Weight weight = new Weight(-0.2);
                }
        );
        assertEquals("Invalid weight", exception2.getMessage());
    }


    @Test
    void valueOf() {
        assertEquals(weight,Weight.valueOf(20.0));
    }

    @Test
    void getWeight() {
        assertEquals(weight.weight(),20.0);
    }

    @Test
    void testEquals() {
        Weight weight2 = new Weight(1.0);
        String a = "dummy";

        assertTrue(weight2.equals(weight2));
        assertFalse(weight.equals(weight2));
        assertFalse(weight.equals(a));
        assertFalse(weight.equals(null));
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
        String expected = "20.0 g";
        assertEquals(expected,weight.toString());
    }
}