package eapli.base.ordermanagememt.domain;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.categorymanagement.domain.CategoryID;
import eapli.base.customermanagement.domain.*;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.ordermanagement.domain.OrderItem;
import eapli.base.productmanagement.domain.*;
import eapli.base.warehousemanagement.domain.RowAisle;
import eapli.framework.general.domain.model.EmailAddress;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderItemTest {
    private OrderItem orderItem;

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
        CustomerOrder customerOrder = new CustomerOrder(customer1);
        Barcode barcode = new Barcode("1234567891234");
        BasePrice basePrice = new BasePrice(1.2);
        Brand brand = new Brand("CocaCola");
        ShortDescription description = new ShortDescription("Drink");
        LongDescription longDescription = new LongDescription("Drink");
        TechnicalDescription technicalDescription = new TechnicalDescription("Drink");
        ProductionCode productionCode = new ProductionCode("abcd.12345");
        Reference reference = new Reference("1234567890");
        UniqueInternalCode uniqueInternalCode = new UniqueInternalCode("xyzw.98765");
        Volume volume = new Volume(300.0);
        Weight weight = new Weight(100.0);
        Category category = new Category(new CategoryID("1"), new eapli.base.categorymanagement.domain.Description("drink"));

        Picture picture = new Picture("path1");
        Product product = new Product(uniqueInternalCode, category, barcode, basePrice, brand, description, productionCode, reference, volume, weight, picture, new RowAisle(), longDescription, technicalDescription);
        orderItem = new OrderItem(customerOrder,product);
    }
    @Test
    void testEnsureOrderItemEquals() {
        EmailAddress email = EmailAddress.valueOf("j@gmail.com");
        LocalDate birthDate = LocalDate.of(2002, 9, 22);
        PhoneNumber phoneNumber = PhoneNumber.valueOf("910758577");
        String gender = "Male";
        Name name = Name.valueOf("José Rocha");
        VatId vatId = VatId.valueOf("9889");
        List<AdressCostumer> adressCostumerList = new ArrayList<>();
        Customer customer1 = new Customer(email, name, phoneNumber, vatId, birthDate, adressCostumerList, gender);
        CustomerOrder customerOrder = new CustomerOrder(customer1);
        Barcode barcode = new Barcode("1234567891234");
        BasePrice basePrice = new BasePrice(1.2);
        Brand brand = new Brand("CocaCola");
        ShortDescription description = new ShortDescription("Drink");
        LongDescription longDescription = new LongDescription("Drink");
        TechnicalDescription technicalDescription = new TechnicalDescription("Drink");
        ProductionCode productionCode = new ProductionCode("abcd.12345");
        Reference reference = new Reference("1234567890");
        UniqueInternalCode uniqueInternalCode = new UniqueInternalCode("xyzw.98765");
        Volume volume = new Volume(300.0);
        Weight weight = new Weight(100.0);
        Category category = new Category(new CategoryID("1"), new eapli.base.categorymanagement.domain.Description("drink"));

        Picture picture = new Picture("path1");
        Product product = new Product(uniqueInternalCode, category, barcode, basePrice, brand, description, productionCode, reference, volume, weight, picture, new RowAisle(), longDescription, technicalDescription);
       OrderItem orderItem1 = new OrderItem(customerOrder,product);

        assertTrue(orderItem.equals(orderItem1));

    }

    @Test
    void testEnsureOrderItemFailsDifferentCustomer() {
        EmailAddress email = EmailAddress.valueOf("joao@gmail.com");
        LocalDate birthDate = LocalDate.of(2002, 9, 22);
        PhoneNumber phoneNumber = PhoneNumber.valueOf("910758577");
        String gender = "Male";
        Name name = Name.valueOf("José  Pedro Rocha");
        VatId vatId = VatId.valueOf("9889");
        List<AdressCostumer> adressCostumerList = new ArrayList<>();
        Customer customer1 = new Customer(email, name, phoneNumber, vatId, birthDate, adressCostumerList, gender);

       CustomerOrder customerOrder = new CustomerOrder(customer1);

        Barcode barcode = new Barcode("1234567891234");
        BasePrice basePrice = new BasePrice(1.2);
        Brand brand = new Brand("CocaCola");
        ShortDescription description = new ShortDescription("Drink");
        LongDescription longDescription = new LongDescription("Drink");
        TechnicalDescription technicalDescription = new TechnicalDescription("Drink");
        ProductionCode productionCode = new ProductionCode("abcd.12345");
        Reference reference = new Reference("1234567890");
        UniqueInternalCode uniqueInternalCode = new UniqueInternalCode("xyzw.98765");
        Volume volume = new Volume(300.0);
        Weight weight = new Weight(100.0);
        Category category = new Category(new CategoryID("1"), new eapli.base.categorymanagement.domain.Description("drink"));

        Picture picture = new Picture("path1");
        Product product = new Product(uniqueInternalCode, category, barcode, basePrice, brand, description, productionCode, reference, volume, weight, picture, new RowAisle(), longDescription, technicalDescription);
        OrderItem orderItem1 = new OrderItem(customerOrder,product);

        assertFalse(orderItem.equals(orderItem1));

    }
    @Test
    void testEnsureOrderItemFailsDifferentProduct() {
        EmailAddress email = EmailAddress.valueOf("j@gmail.com");
        LocalDate birthDate = LocalDate.of(2002, 9, 22);
        PhoneNumber phoneNumber = PhoneNumber.valueOf("910758577");
        String gender = "Male";
        Name name = Name.valueOf("José Rocha");
        VatId vatId = VatId.valueOf("9889");
        List<AdressCostumer> adressCostumerList = new ArrayList<>();
        Customer customer1 = new Customer(email, name, phoneNumber, vatId, birthDate, adressCostumerList, gender);
        CustomerOrder customerOrder = new CustomerOrder(customer1);
        Barcode barcode = new Barcode("1234567891234");
        BasePrice basePrice = new BasePrice(1.2);
        Brand brand = new Brand("Sumol");
        ShortDescription description = new ShortDescription("Drink");
        LongDescription longDescription = new LongDescription("Drink");
        TechnicalDescription technicalDescription = new TechnicalDescription("Drink");
        ProductionCode productionCode = new ProductionCode("dddd.12345");
        Reference reference = new Reference("1234567897");
        UniqueInternalCode uniqueInternalCode = new UniqueInternalCode("xyzw.11111");
        Volume volume = new Volume(300.0);
        Weight weight = new Weight(100.0);
        Category category = new Category(new CategoryID("1"), new eapli.base.categorymanagement.domain.Description("drink"));

        Picture picture = new Picture("path1");
        Product product = new Product(uniqueInternalCode, category, barcode, basePrice, brand, description, productionCode, reference, volume, weight, picture, new RowAisle(), longDescription, technicalDescription);
        OrderItem orderItem1 = new OrderItem(customerOrder,product);

        assertFalse(orderItem.equals(orderItem1));

    }


    }
