
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
        ProductDTO dto = new ProductDTO( new Category(CategoryID.valueOf("12345"), Description.valueOf("computers")), "abcd.12345", "1234567890123", 750.0, "Asus", "Gaming", "aaaa.11111", "1234567890", 10.0, 1000.0, "~/LAPR4",1,1,"Asus Gaming Notebook","I5 9600K , RTX 2060 6GB");
        Product p ;
        p = controller.createProduct(dto);
        PersistenceContext.repositories().products().save(p);
        

        dto = new ProductDTO( new Category(CategoryID.valueOf("123456"), Description.valueOf("make up")), "abcd.12346", "1234567890000", 59.99, "Glossier", "lipstick", "aaaa.11112", "1234567899", 10.0, 50.0, "~/LAPR4",2,2,"Red Lipstick","Made of red wax");
        p = controller.createProduct(dto);
        PersistenceContext.repositories().products().save(p);

        LOGGER.debug("The products were successfuly created.");
        return true;
    }
}

