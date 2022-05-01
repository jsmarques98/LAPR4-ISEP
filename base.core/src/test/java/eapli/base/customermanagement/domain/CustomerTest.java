package eapli.base.customermanagement.domain;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.categorymanagement.domain.CategoryID;
import eapli.base.productmanagement.domain.*;
import eapli.base.warehousemanagement.domain.RowAisle;
import eapli.framework.general.domain.model.EmailAddress;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomerTest {

    Customer customer;


    @BeforeEach
    void setUp() {
        EmailAddress email = EmailAddress.valueOf("j@gmail.com");
        Date birthDate = new Date(2002, 9, 22);
        PhoneNumber phoneNumber = PhoneNumber.valueOf("910758577");
        String gender = "Male";
        Name name = Name.valueOf("José Rocha");
        VatId vatId = VatId.valueOf("99");
        AdressCostumer adressCostumer = new AdressCostumer("Rua das agras", 115, "4575-160", "nelas", "Portugal");
        ;
        List<AdressCostumer> adressCostumerList = new ArrayList<>();
        adressCostumerList.add(adressCostumer);
        customer = new Customer(email, name, phoneNumber, vatId, birthDate, adressCostumerList, gender);
    }

    @Test
    void testEnsureCustumerEqualsPassesSame() {
        EmailAddress email = EmailAddress.valueOf("j@gmail.com");
        Date birthDate = new Date(2002, 9, 22);
        PhoneNumber phoneNumber = PhoneNumber.valueOf("910758577");
        String gender = "Male";
        Name name = Name.valueOf("José Rocha");
        VatId vatId = VatId.valueOf("99");
        AdressCostumer adressCostumer = new AdressCostumer("Rua das agras", 115, "4575-160", "nelas", "Portugal");
        ;
        List<AdressCostumer> adressCostumerList = new ArrayList<>();
        adressCostumerList.add(adressCostumer);
        Customer customer1 = new Customer(email, name, phoneNumber, vatId, birthDate, adressCostumerList, gender);
        assertTrue(customer.equals(customer1));
    }

    @Test
    void testEnsureCustumerEqualsFailsDifferentEmail() {
        EmailAddress email = EmailAddress.valueOf("joao@gmail.com");
        Date birthDate = new Date(2002, 9, 22);
        PhoneNumber phoneNumber = PhoneNumber.valueOf("910758577");
        String gender = "Male";
        Name name = Name.valueOf("José Rocha");
        VatId vatId = VatId.valueOf("99");
        AdressCostumer adressCostumer = new AdressCostumer("Rua das agras", 115, "4575-160", "nelas", "Portugal");
        ;
        List<AdressCostumer> adressCostumerList = new ArrayList<>();
        adressCostumerList.add(adressCostumer);
        Customer customer1 = new Customer(email, name, phoneNumber, vatId, birthDate, adressCostumerList, gender);
        assertFalse(customer.equals(customer1));
    }

    @Test
    void testEnsureCustumerEqualsFailsDifferentPhoneNumer() {
        EmailAddress email = EmailAddress.valueOf("j@gmail.com");
        Date birthDate = new Date(2002, 9, 22);
        PhoneNumber phoneNumber = PhoneNumber.valueOf("910758579");
        String gender = "Male";
        Name name = Name.valueOf("José Rocha");
        VatId vatId = VatId.valueOf("99");
        AdressCostumer adressCostumer = new AdressCostumer("Rua das agras", 115, "4575-160", "nelas", "Portugal");
        ;
        List<AdressCostumer> adressCostumerList = new ArrayList<>();
        adressCostumerList.add(adressCostumer);
        Customer customer1 = new Customer(email, name, phoneNumber, vatId, birthDate, adressCostumerList, gender);
        assertFalse(customer.equals(customer1));
    }
    @Test
    void testEnsureCustumerEqualsFailsDifferentGender() {
        EmailAddress email = EmailAddress.valueOf("j@gmail.com");
        Date birthDate = new Date(2002, 9, 22);
        PhoneNumber phoneNumber = PhoneNumber.valueOf("910758577");
        String gender = "Maleeee";
        Name name = Name.valueOf("José Rocha");
        VatId vatId = VatId.valueOf("99");
        AdressCostumer adressCostumer = new AdressCostumer("Rua das agras", 115, "4575-160", "nelas", "Portugal");
        ;
        List<AdressCostumer> adressCostumerList = new ArrayList<>();
        adressCostumerList.add(adressCostumer);
        Customer customer1 = new Customer(email, name, phoneNumber, vatId, birthDate, adressCostumerList, gender);
        assertFalse(customer.equals(customer1));
    }
    @Test
    void testEnsureCustumerEqualsFailsDifferentName() {
        EmailAddress email = EmailAddress.valueOf("j@gmail.com");
        Date birthDate = new Date(2002, 9, 22);
        PhoneNumber phoneNumber = PhoneNumber.valueOf("910758577");
        String gender = "Male";
        Name name = Name.valueOf("José Pedro Rocha");
        VatId vatId = VatId.valueOf("99");
        AdressCostumer adressCostumer = new AdressCostumer("Rua das agras", 115, "4575-160", "nelas", "Portugal");
        ;
        List<AdressCostumer> adressCostumerList = new ArrayList<>();
        adressCostumerList.add(adressCostumer);
        Customer customer1 = new Customer(email, name, phoneNumber, vatId, birthDate, adressCostumerList, gender);
        assertFalse(customer.equals(customer1));
    }
    @Test
    void testEnsureCustumerEqualsPassesVatId() {
        EmailAddress email = EmailAddress.valueOf("j@gmail.com");
        Date birthDate = new Date(2002, 9, 22);
        PhoneNumber phoneNumber = PhoneNumber.valueOf("910758577");
        String gender = "Male";
        Name name = Name.valueOf("José Rocha");
        VatId vatId = VatId.valueOf("9889");
        AdressCostumer adressCostumer = new AdressCostumer("Rua das agras", 115, "4575-160", "nelas", "Portugal");
        ;
        List<AdressCostumer> adressCostumerList = new ArrayList<>();
        adressCostumerList.add(adressCostumer);
        Customer customer1 = new Customer(email, name, phoneNumber, vatId, birthDate, adressCostumerList, gender);
        assertFalse(customer.equals(customer1));
    }
    @Test
    void testEnsureCustumerEqualsPassesAddres() {
        EmailAddress email = EmailAddress.valueOf("j@gmail.com");
        Date birthDate = new Date(2002, 9, 22);
        PhoneNumber phoneNumber = PhoneNumber.valueOf("910758577");
        String gender = "Male";
        Name name = Name.valueOf("José Rocha");
        VatId vatId = VatId.valueOf("9889");

        List<AdressCostumer> adressCostumerList = new ArrayList<>();
        Customer customer1 = new Customer(email, name, phoneNumber, vatId, birthDate, adressCostumerList, gender);
        assertFalse(customer.equals(customer1));
    }

}
