package eapli.base.productmanagement.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    private Volume volume;


    @BeforeEach
    void setUp(){
        volume = new Volume(20.0);
    }

    @Test
    void testVolumeMustNotNull(){
        // VOLUME NULL
        Throwable exception2 = assertThrows(
                IllegalArgumentException.class, () -> {
                    Volume volume = new Volume(null);
                }
        );
        assertEquals("Volume cannot be null", exception2.getMessage());
    }

    @Test
    void testVolumeCanNotBeNegative(){
        // VOLUME LESS THAN 0
        Throwable exception2 = assertThrows(
                IllegalArgumentException.class, () -> {
                    Volume volume = new Volume(-0.2);
                }
        );
        assertEquals("Invalid Volume", exception2.getMessage());
    }

    @Test
    void valueOf() {
        assertEquals(volume,Volume.valueOf(20.0));
    }

    @Test
    void getVolume() {
        assertEquals(volume.getVolume(),20.0);
    }

    @Test
    void testEquals() {
        Volume volume2 = new Volume(1.0);
        String a = "dummy";

        assertTrue(volume2.equals(volume2));
        assertFalse(volume.equals(volume2));
        assertFalse(volume.equals(a));
        assertFalse(volume.equals(null));
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
        String expected = "20.0 mm^3";
        assertEquals(expected,volume.toString());
    }
}