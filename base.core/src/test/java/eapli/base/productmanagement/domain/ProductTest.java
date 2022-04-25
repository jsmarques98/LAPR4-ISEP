package eapli.base.productmanagement.domain;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.productmanagement.dto.ProductDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.security.core.parameters.P;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product;

    @BeforeEach
    void setUp(){
        Barcode barcode = new Barcode("1234567891234");
        BasePrice basePrice = new BasePrice(1.2);
        Brand brand = new Brand("CocaCola");
        Description description = new Description("Drink");
        ProductionCode productionCode = new ProductionCode("abcd.12345");
        Reference reference = new Reference("1234567890");
        UniqueInternalCode uniqueInternalCode = new UniqueInternalCode("xyzw.98765");
        Volume volume = new Volume(300.0);
        Weight weight = new Weight(100.0);
        Category category = new Category(new MecanographicNumber("1"),new eapli.base.categorymanagement.domain.Description("drink"));

        Picture picture = new Picture("path1");
        product = new Product(uniqueInternalCode,category,barcode,basePrice,brand,description,productionCode,reference,volume,weight, picture);
    }


    @Test
    void testProductMustBelongToACategory(){

    }

    @Test
    void testEnsureProductsEqualsPassesSameUIC(){
        // product with the same UIC but the others attributes are all different
        Barcode barcode = new Barcode("1234567891234");
        BasePrice basePrice = new BasePrice(1.23);
        Brand brand = new Brand("CocaColaa");
        Description description = new Description("Drinkk");
        ProductionCode productionCode = new ProductionCode("abcd.12346");
        Reference reference = new Reference("1234567890");
        UniqueInternalCode uniqueInternalCode = new UniqueInternalCode("xyzw.98765");
        Volume volume = new Volume(301.0);
        Weight weight = new Weight(101.0);
        Category category = new Category(new MecanographicNumber("1"),new eapli.base.categorymanagement.domain.Description("drink"));
        Picture picture = new Picture("path");
        Product product2 = new Product(uniqueInternalCode,category,barcode,basePrice,brand,description,productionCode,reference,volume,weight, picture);

        assertTrue(product.equals(product2));
    }

    @Test
    void testEnsureProductsEqualsFailsDifferentUIC(){
        //different UIC, but all others attributes are the same
        Barcode barcode = new Barcode("1234567891234");
        BasePrice basePrice = new BasePrice(1.2);
        Brand brand = new Brand("CocaCola");
        Description description = new Description("Drink");
        ProductionCode productionCode = new ProductionCode("abcd.12345");
        Reference reference = new Reference("1234567890");
        UniqueInternalCode uniqueInternalCode = new UniqueInternalCode("xyzw.98766");
        Volume volume = new Volume(300.0);
        Weight weight = new Weight(100.0);
        Category category = new Category(new MecanographicNumber("1"),new eapli.base.categorymanagement.domain.Description("drink"));
        Picture pictures = new Picture("path1");
        Product product2 = new Product(uniqueInternalCode,category,barcode,basePrice,brand,description,productionCode,reference,volume,weight, pictures);

        assertFalse(product.equals(product2));
    }

    @Test
    void testEnsureProductEqualsAreTheSameForTheSameInstance(){
        assertTrue(product.equals(product));
    }

    @Test
    void testEnsureProductEqualsFailsForDifferentObjectTypes(){
        String dummy = "Dummy";

        assertFalse(product.equals(dummy));

    }


    @Test
    void getVersion() {
        assertEquals(null,product.getVersion());
    }

    @Test
    void getUniqueInternalCode() {
        assertTrue(new UniqueInternalCode("xyzw.98765").equals(product.getUniqueInternalCode()));
    }

    @Test
    void getBarcode() {
        assertTrue(new Barcode("1234567891234").equals(product.getBarcode()));

    }

    @Test
    void getBasePrice() {
        assertTrue(new BasePrice(1.2).equals(product.getBasePrice()));
    }

    @Test
    void getBrand() {
        assertTrue(new Brand("CocaCola").equals(product.getBrand()));
    }

    @Test
    void getDescription() {
        assertTrue(new Description("Drink").equals(product.getDescription()));
    }

    @Test
    void getProductionCode() {
        assertTrue(new ProductionCode("abcd.12345").equals(product.getProductionCode()));
    }

    @Test
    void getReference() {
        assertTrue(new Reference("1234567890").equals(product.getReference()));
    }

    @Test
    void getVolume() {
        assertTrue(new Volume(300.0).equals(product.getVolume()));
    }

    @Test
    void getWeight() {
        assertTrue(new Weight(100.0).equals(product.getWeight()));
    }

    @Test
    void testEquals() {
        Barcode barcode = new Barcode("1234567891234");
        BasePrice basePrice = new BasePrice(1.2);
        Brand brand = new Brand("CocaCola");
        Description description = new Description("Drink");
        ProductionCode productionCode = new ProductionCode("abcd.12345");
        Reference reference = new Reference("1234567890");
        UniqueInternalCode uniqueInternalCode = new UniqueInternalCode("xyzw.98765");
        Volume volume = new Volume(300.0);
        Weight weight = new Weight(100.0);

        Picture picture = new Picture("path1");
        Category category = new Category(new MecanographicNumber("1"),new eapli.base.categorymanagement.domain.Description("drink"));
        Product product2 = new Product(uniqueInternalCode,category,barcode,basePrice,brand,description,productionCode,reference,volume,weight, picture);

        Product product3 = new Product(new UniqueInternalCode("hfhd.54321"),category,barcode,basePrice,brand,description,productionCode,reference,volume,weight, picture);

        Integer a = 1;

        assertTrue(product2.equals(product));
        assertFalse(product2.equals(a));
        assertFalse(product.equals(product3));

    }

    @Test
    void testHashCode() {
    }

    @Test
    void sameAs() {
        Barcode barcode = new Barcode("1234567891234");
        BasePrice basePrice = new BasePrice(1.2);
        Brand brand = new Brand("CocaCola");
        Description description = new Description("Drink");
        ProductionCode productionCode = new ProductionCode("abcd.12345");
        Reference reference = new Reference("1234567890");
        UniqueInternalCode uniqueInternalCode = new UniqueInternalCode("xyzw.98765");
        Volume volume = new Volume(300.0);
        Weight weight = new Weight(100.0);
        Category category = new Category(new MecanographicNumber("1"),new eapli.base.categorymanagement.domain.Description("drink"));

        Picture picture = new Picture("path1");
        Product product2 = new Product(uniqueInternalCode,category,barcode,basePrice,brand,description,productionCode,reference,volume,weight, picture);

        Product product3 = new Product(new UniqueInternalCode("hfhd.54321"),category,barcode,basePrice,brand,description,productionCode,reference,volume,weight, picture);

        Integer a = 1;

        assertTrue(product2.sameAs(product));
        assertFalse(product2.sameAs(a));
        assertFalse(product.sameAs(product3));
    }

    @Test
    void testToString() {
        String expected="Product:Category=drink\n" +
                "Unique Internal Code=xyzw.98765\n" +
                "Barcode=1234567891234\n" +
                "Base Price=1.2 €\n" +
                "Brand=CocaCola\n" +
                "Description=Drink\n" +
                "Production Code=abcd.12345\n" +
                "Reference=1234567890\n" +
                "Volume=300.0 mm^3\n" +
                "Weight=100.0 g\n";
        assertEquals(expected,product.toString());
    }

    @Test
    void toDTO() {
        String barcode ="1234567891234";
        Double basePrice = 1.2;
        String brand = "CocaCola";
        String description = "Drink";
        String productionCode = "abcd.12345";
        String reference = "1234567890";
        String uniqueInternalCode ="xyzw.98765";
        Double volume =300.0;
        Double weight = 100.0;
        Category category = new Category(new MecanographicNumber("1"),new eapli.base.categorymanagement.domain.Description("drink"));
        String picture = "path1";
        ProductDTO productDTO = new ProductDTO(category,uniqueInternalCode,barcode,basePrice,brand,description,productionCode,reference,volume,weight,picture);


        Barcode barcode1 = new Barcode("1234567891234");
        BasePrice basePrice1 = new BasePrice(1.2);
        Brand brand1 = new Brand("CocaCola");
        Description description1 = new Description("Drink");
        ProductionCode productionCode1 = new ProductionCode("abcd.12345");
        Reference reference1 = new Reference("1234567890");
        UniqueInternalCode uniqueInternalCode1 = new UniqueInternalCode("xyzw.98765");
        Volume volume1 = new Volume(300.0);
        Weight weight1 = new Weight(100.0);
        Category category1 = new Category(new MecanographicNumber("1"),new eapli.base.categorymanagement.domain.Description("drink"));
        Picture picture2 = new Picture("path1");
        Product product2 = new Product(uniqueInternalCode1,category1,barcode1,basePrice1,brand1,description1,productionCode1,reference1,volume1,weight1, picture2);


        assertEquals(product2.toDTO(),productDTO);
    }

    @Test
    void identity() {
        assertEquals(new UniqueInternalCode("xyzw.98765"), product.identity());
        assertFalse(new UniqueInternalCode("xxzw.98765").equals(product.identity()));
    }
}