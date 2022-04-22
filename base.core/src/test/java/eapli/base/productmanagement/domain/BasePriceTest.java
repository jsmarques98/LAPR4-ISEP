package eapli.base.productmanagement.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasePriceTest {
    private BasePrice basePrice;

    @BeforeEach
    void setUp(){
        basePrice = new BasePrice(2.9);
    }


    @Test
    void testBasePriceMustNotNull(){
        // BASEPRICE NULL
        Throwable exception2 = assertThrows(
                IllegalArgumentException.class, () -> {
                    BasePrice basePrice2 = new BasePrice(null);
                }
        );
        assertEquals("Base price cannot be null", exception2.getMessage());
    }

    @Test
    void testBasePriceCanNotBeNegative(){
        // BASEPRICE LESS THAN 0
        Throwable exception2 = assertThrows(
                IllegalArgumentException.class, () -> {
                    BasePrice basePrice2 = new BasePrice(-0.2);
                }
        );
        assertEquals("Invalid base price", exception2.getMessage());
    }

    @Test
    void valueOf() {
        assertEquals(basePrice,BasePrice.valueOf(2.9));
    }

    @Test
    void getBasePrice() {
        assertEquals(2.9, basePrice.getBasePrice());
    }

    @Test
    void testEquals() {
        BasePrice basePrice2 = new BasePrice(3.1);
        String a = "dummy";

        assertTrue(basePrice2.equals(basePrice2));
        assertFalse(basePrice.equals(basePrice2));
        assertFalse(basePrice.equals(a));
        assertFalse(basePrice.equals(null));
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
        String expected = "2.9 €";
        assertEquals(expected,basePrice.toString());
    }
}