package eapli.base.productmanagement.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarcodeTest {
    private Barcode barcode;

    @BeforeEach
    void setUp(){
        barcode=new Barcode("1234567890123");
    }

    @Test
    void testBarcodeMustNotBeNullNorEmpty(){
        // BARCODE EMPTY
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    Barcode barcode = new Barcode("");
                }
        );
        assertEquals("Invalid barcode", exception.getMessage());


        // BARCODE NULL
        Throwable exception2 = assertThrows(
                IllegalArgumentException.class, () -> {
                    Barcode barcode2 = new Barcode(null);
                }
        );
        assertEquals("Barcode cannot be null", exception2.getMessage());
    }

    @Test
    void valueOf() {
        assertEquals(barcode,Barcode.valueOf("1234567890123"));
    }

    @Test
    void testEquals() {
        Barcode barcode2 = new Barcode("9876543210123");
        String a = "dummy";

        assertTrue(barcode2.equals(barcode2));
        assertFalse(barcode.equals(barcode2));
        assertFalse(barcode.equals(a));
        assertFalse(barcode.equals(null));
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
        String expected = "1234567890123";
        assertEquals(expected,barcode.toString());
    }
}