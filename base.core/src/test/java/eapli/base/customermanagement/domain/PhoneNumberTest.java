package eapli.base.customermanagement.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhoneNumberTest {
private PhoneNumber phoneNumber;



    @Test
    void testPhoneNumber(){

        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    PhoneNumber phoneNumber = PhoneNumber.valueOf("111111111111111111111111111");
                }
        );
        assertEquals("PhoneNumber not valid", exception.getMessage());
    }
}
