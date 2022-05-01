package eapli.base.categorymanagement.domain;

import eapli.base.productmanagement.domain.UniqueInternalCode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryIDTest {

    private CategoryID cid;

    @BeforeEach
    void setUp(){
        cid = new CategoryID("12345");
    }

    @Test
    void testCategoryIDMustNotBeNullNorEmpty(){
        // UIC EMPTY
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    CategoryID cid = new CategoryID("");
                }
        );
        assertEquals("Invalid category id", exception.getMessage());


        // UIC NULL
        Throwable exception2 = assertThrows(
                IllegalArgumentException.class, () -> {
                    CategoryID cid2 = new CategoryID(null);
                }
        );
        assertEquals("Category id cannot be null", exception2.getMessage());

    }

    @Test
    void valueOf() {
        assertEquals(cid,CategoryID.valueOf("12345"));
    }


    @Test
    void testToString() {
        String expected = "12345";
        assertEquals(expected,cid.toString());
    }
}