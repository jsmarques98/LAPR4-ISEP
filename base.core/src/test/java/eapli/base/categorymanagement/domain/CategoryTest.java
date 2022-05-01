package eapli.base.categorymanagement.domain;

import eapli.base.productmanagement.domain.*;
import eapli.base.warehousemanagement.domain.RowAisle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category;

    @BeforeEach
    void setUp(){

        CategoryID categoryID = new CategoryID("12345");
        Description description = new Description("computers");
        category = new Category(categoryID, description);
    }

    @Test
    void testEnsureCategoriesEqualsPassesSameCID(){
        // product with the same UIC but the others attributes are all different

        Category category2 = new Category(new CategoryID("12345"),new Description("drink"));
        assertTrue(category.equals(category2));
    }

    @Test
    void testEnsureCategoriesEqualsFailsDifferentCID(){
        // product with the same UIC but the others attributes are all different

        Category category2 = new Category(new CategoryID("12346"),new Description("drink"));
        assertFalse(category.equals(category2));
    }

    @Test
    void testEnsureCategoryEqualsAreTheSameForTheSameInstance(){
        assertTrue(category.equals(category));
    }

    @Test
    void testEnsureProductEqualsFailsForDifferentObjectTypes(){
        String dummy = "Dummy";

        assertFalse(category.equals(dummy));

    }

    @Test
    void getCategoryID() {
        assertTrue(new CategoryID("12345").equals(category.getCategoryID()));
    }

    @Test
    void getDescription() {
        assertEquals(new Description("computers"), (category.getDescription()));
    }

    @Test
    void sameAs() {
        CategoryID categoryID = new CategoryID("12345");
        Description description = new Description("computers");

        Category category2 = new Category(categoryID, description);

        Category category3 = new Category(new CategoryID("12346"), new Description("different") );

        Integer a = 1;

        assertTrue(category2.sameAs(category));
        assertFalse(category2.sameAs(a));
        assertFalse(category.sameAs(category3));


    }

    @Test
    void testToString() {
        String expected="Category:Category ID =12345\n" +
                "Description =computers\n";
        assertEquals(expected,category.toString());
    }

    @Test
    void identity() {
        Category category3 = new Category(new CategoryID("12346"), new Description("different") );


        assertEquals(category.identity(), category.identity());
        assertFalse(category3.identity().equals(category.identity()));
    }
}