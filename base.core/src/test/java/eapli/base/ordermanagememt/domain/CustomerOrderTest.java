package eapli.base.ordermanagememt.domain;

import eapli.base.customermanagement.domain.*;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.framework.general.domain.model.EmailAddress;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomerOrderTest {

    CustomerOrder customerOrder;

    @BeforeEach
    void setUp() {

        EmailAddress email = EmailAddress.valueOf("j@gmail.com");
        LocalDate birthDate = LocalDate.of(2002, 9, 22);
        PhoneNumber phoneNumber = PhoneNumber.valueOf("910758577");
        String gender = "Male";
        Name name = Name.valueOf("José Rocha");
        VatId vatId = VatId.valueOf("9889");
        List<AdressCostumer> adressCostumerList = new ArrayList<>();
        Customer customer1 = new Customer(email, name, phoneNumber, vatId, birthDate, adressCostumerList, gender);
        customerOrder = new CustomerOrder(customer1);
    }

    @Test
    void testEnsureCustomerOrderEquals() {

        EmailAddress email = EmailAddress.valueOf("j@gmail.com");
        LocalDate birthDate = LocalDate.of(2002, 9, 22);
        PhoneNumber phoneNumber = PhoneNumber.valueOf("910758577");
        String gender = "Male";
        Name name = Name.valueOf("José Rocha");
        VatId vatId = VatId.valueOf("9889");
        List<AdressCostumer> adressCostumerList = new ArrayList<>();
        Customer customer1 = new Customer(email, name, phoneNumber, vatId, birthDate, adressCostumerList, gender);
        CustomerOrder customerOrder1 = new CustomerOrder(customer1);

        assertTrue(customerOrder.equals(customerOrder1));


    }

    @Test
    void testEnsureCustomerOrderFailsDifferentCustomer() {
        EmailAddress email = EmailAddress.valueOf("jOAO@gmail.com");
        LocalDate birthDate = LocalDate.of(2002, 9, 22);
        PhoneNumber phoneNumber = PhoneNumber.valueOf("9107585997");
        String gender = "Maleee";
        Name name = Name.valueOf("José Pedro Rocha");
        VatId vatId = VatId.valueOf("9889");
        List<AdressCostumer> adressCostumerList = new ArrayList<>();
        Customer customer1 = new Customer(email, name, phoneNumber, vatId, birthDate, adressCostumerList, gender);
        CustomerOrder customerOrder1 = new CustomerOrder(customer1);

       Assertions.assertFalse(customerOrder.equals(customerOrder1));
    }

    @Test
    void testEnsureCustomerOrderFailsDifferentPrice() {
        EmailAddress email = EmailAddress.valueOf("jOAO@gmail.com");
        LocalDate birthDate = LocalDate.of(2002, 9, 22);
        PhoneNumber phoneNumber = PhoneNumber.valueOf("9107585997");
        String gender = "Maleee";
        Name name = Name.valueOf("José Pedro Rocha");
        VatId vatId = VatId.valueOf("9889");
        List<AdressCostumer> adressCostumerList = new ArrayList<>();
        Customer customer1 = new Customer(email, name, phoneNumber, vatId, birthDate, adressCostumerList, gender);
        CustomerOrder customerOrder1 = new CustomerOrder(customer1);
        customerOrder1.setPrice(20.0);
        Assertions.assertFalse(customerOrder.equals(customerOrder1));
    }
}
