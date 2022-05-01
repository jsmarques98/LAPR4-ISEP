package eapli.base.customermanagement.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class VatidTest {
    private VatId vatId;

    @Test
    void testVatId(){
        // BARCODE EMPTY
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    VatId vatId = VatId.valueOf(null);
                }
        );
        assertEquals("vatId not valid", exception.getMessage());
    }
}
