package eapli.base.customermanagement.domain;

import eapli.base.productmanagement.domain.Barcode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NameTest {
private Name name;



    @Test
    void testName(){
        // BARCODE EMPTY
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    Name name = Name.valueOf("");
                }
        );
        assertEquals("Name not valid", exception.getMessage());
    }

}
