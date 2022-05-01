package eapli.base.customermanagement.domain;

import eapli.base.productmanagement.domain.Barcode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdressCostumerTest {
    private AdressCostumer adressCostumer ;

    @BeforeEach
    void setUp(){
        adressCostumer=new AdressCostumer("Rua das agras",115,"4575-160","nelas","Portugal");
    }



    @Test
    void testEquals() {
        AdressCostumer adressCostumer2 = new AdressCostumer("Rua das agrasdss",115,"4575-160","nelas","Portugal");
        String a = "dummy";
        assertTrue(adressCostumer.equals(adressCostumer));
        assertFalse(adressCostumer.equals(adressCostumer2));
        assertFalse(adressCostumer.equals(a));
        assertFalse(adressCostumer.equals(null));
    }


}
