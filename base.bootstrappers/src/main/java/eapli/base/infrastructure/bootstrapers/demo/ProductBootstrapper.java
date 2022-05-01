
package eapli.base.infrastructure.bootstrapers.demo;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.categorymanagement.domain.CategoryID;
import eapli.base.categorymanagement.domain.Description;
import eapli.base.clientusermanagement.application.AcceptRefuseSignupFactory;
import eapli.base.clientusermanagement.application.AcceptRefuseSignupRequestController;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.myclientuser.application.SignupController;
import eapli.base.productmanagement.dto.ProductDTO;
import eapli.base.productmanagement.application.AddProductController;
import eapli.base.productmanagement.domain.UniqueInternalCode;
import eapli.base.productmanagement.domain.Product;
import eapli.framework.actions.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class ProductBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            ProductBootstrapper.class);

    private final AddProductController controller = new AddProductController();

    @Override
    public boolean execute() {
        ProductDTO dto = new ProductDTO( new Category(CategoryID.valueOf("12345"), Description.valueOf("computers")), "abcd.12345", "1234567890000", 750.0, "Asus", "Gaming", "aaaa.11110", "1234567891", 10.0, 1000.0, "~/LAPR4",1,1,"Asus Gaming Notebook","I5 9600K , RTX 2060 6GB");
        Product p ;
        p = controller.createProduct(dto);
        PersistenceContext.repositories().products().save(p);

        dto = new ProductDTO( new Category(CategoryID.valueOf("12345"), Description.valueOf("computers")), "abcd.12346", "1234567890001", 1000.0, "HP", "Gaming", "aaaa.11111", "1234567892", 10.0, 1000.0, "~/LAPR4",1,2,"HP  Gaming Desktop","I7 8750K , RTX 2070 8GB");
        p = controller.createProduct(dto);
        PersistenceContext.repositories().products().save(p);

        dto = new ProductDTO( new Category(CategoryID.valueOf("12345"), Description.valueOf("computers")), "abcd.12347", "1234567890002", 1000.0, "Apple", "Work", "aaaa.11112", "1234567893", 10.0, 1000.0, "~/LAPR4",1,3,"Macbook air ","M1 , 16gb ram");
        p = controller.createProduct(dto);
        PersistenceContext.repositories().products().save(p);


        dto = new ProductDTO( new Category(CategoryID.valueOf("12346"), Description.valueOf("make up")), "abcd.12340", "1234567890004", 15.99, "Glossier", "lipstick", "aaaa.11114", "1234567895", 10.0, 50.0, "~/LAPR4",1,4,"Red Lipstick","Made of red wax");
        p = controller.createProduct(dto);
        PersistenceContext.repositories().products().save(p);

        dto = new ProductDTO( new Category(CategoryID.valueOf("12346"), Description.valueOf("make up")), "abcd.12341", "1234567890005", 39.99, "Dior", "lipstick", "aaaa.11115", "1234567896", 10.0, 60.0, "~/LAPR4",2,1,"Purple Lipstick","Made of purple wax");
        p = controller.createProduct(dto);
        PersistenceContext.repositories().products().save(p);

        dto = new ProductDTO( new Category(CategoryID.valueOf("12346"), Description.valueOf("make up")), "abcd.12342", "1234567890006", 9.99, "Nyx", "masquera", "aaaa.11116", "1234567897", 10.0, 70.0, "~/LAPR4",2,2,"Bigger eyelashes","Make your eyes more beautiful");
        p = controller.createProduct(dto);
        PersistenceContext.repositories().products().save(p);

        dto = new ProductDTO( new Category(CategoryID.valueOf("12347"), Description.valueOf("furniture")), "abcd.12330", "1234567890007", 199.99, "Area", "chair", "aaaa.11100", "1234567880", 100.0, 1000.0, "~/LAPR4",2,3,"Brown chair","Made of brown wood");
        p = controller.createProduct(dto);
        PersistenceContext.repositories().products().save(p);

        dto = new ProductDTO( new Category(CategoryID.valueOf("12347"), Description.valueOf("furniture")), "abcd.12331", "1234567890008", 99.99, "Ikea", "chair", "aaaa.11101", "1234567881", 100.0, 1000.0, "~/LAPR4",2,4,"Brown chair","Made of brown wood");
        p = controller.createProduct(dto);
        PersistenceContext.repositories().products().save(p);

        dto = new ProductDTO( new Category(CategoryID.valueOf("12347"), Description.valueOf("furniture")), "abcd.12332", "1234567890009", 2000.00, "Gubi", "chair", "aaaa.11102", "1234567882", 100.0, 1000.0, "~/LAPR4",3,1,"Brown chair","Made of the best brown wood");
        p = controller.createProduct(dto);
        PersistenceContext.repositories().products().save(p);

        dto = new ProductDTO( new Category(CategoryID.valueOf("12348"), Description.valueOf("smartphones")), "abcd.12333", "1234567890010", 299.99, "Poco", "poco f3", "aaaa.11103", "1234567883", 50.0, 200.0, "~/LAPR4",3,2,"Poco phone 3","42 mp camera");
        p = controller.createProduct(dto);
        PersistenceContext.repositories().products().save(p);

        dto = new ProductDTO( new Category(CategoryID.valueOf("12348"), Description.valueOf("smartphones")), "abcd.12334", "1234567890011", 899.99, "Apple", "iphone 11", "aaaa.11104", "1234567884", 50.0, 230.0, "~/LAPR4",3,3,"Iphone 11 black","2 cameras");
        p = controller.createProduct(dto);
        PersistenceContext.repositories().products().save(p);

        dto = new ProductDTO( new Category(CategoryID.valueOf("12348"), Description.valueOf("smartphones")), "abcd.12335", "1234567890012", 1099.99, "Apple", "Iphone 12 pro max", "aaaa.11105", "1234567885", 55.0, 300.0, "~/LAPR4",3,4,"Iphone 12 pro max black","3 cameras");
        p = controller.createProduct(dto);
        PersistenceContext.repositories().products().save(p);

        LOGGER.debug("The products were successfuly created.");
        return true;
    }
}

