package eapli.base.productmanagement.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrandTest {
    private Brand brand;

    @BeforeEach
    void setUp(){
        brand = new Brand("CocaCola");
    }

    @Test
    void testBrandMustNotBeNullOrEmpty(){
        // BRAND EMPTY
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    Brand brand = new Brand("");
                }
        );
        assertEquals("Invalid brand", exception.getMessage());


        // BRAND NULL
        Throwable exception2 = assertThrows(
                IllegalArgumentException.class, () -> {
                    Brand brand2 = new Brand(null);
                }
        );
        assertEquals("Brand cannot be null", exception2.getMessage());
    }

    @Test
    void valueOf() {
        assertEquals(brand,Brand.valueOf("CocaCola"));
    }

    @Test
    void testEquals() {
        Brand brand2 = new Brand("Tesla");
        String a = "dummy";

        assertTrue(brand2.equals(brand2));
        assertFalse(brand.equals(brand2));
        assertFalse(brand.equals(a));
        assertFalse(brand.equals(null));
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
        String expected="CocaCola";
        assertEquals(expected,brand.toString());
    }
}