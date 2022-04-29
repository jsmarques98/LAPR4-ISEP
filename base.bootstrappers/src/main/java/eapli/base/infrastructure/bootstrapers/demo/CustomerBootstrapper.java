package eapli.base.infrastructure.bootstrapers.demo;


import eapli.base.clientusermanagement.application.AcceptRefuseSignupFactory;
import eapli.base.clientusermanagement.application.AcceptRefuseSignupRequestController;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.customermanagement.domain.Customer;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.myclientuser.application.SignupController;
import eapli.base.customermanagement.dto.CustomerDTO;
import eapli.base.customermanagement.application.AddCustomerController;
import eapli.framework.actions.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Date;

public class CustomerBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            CustomerBootstrapper.class);

    private final AddCustomerController controller = new AddCustomerController();

    @Override
    public boolean execute() {
        CustomerDTO dto = new CustomerDTO("José", "jose@gmail.com", "rua das agras", 115, "4575-160", "Nelas", "Portugal", "M",new Date(2002,9,22), "910505106", "123456");
        Customer c = null;
        c = controller.createCustomer(dto);
        PersistenceContext.repositories().customers().save(c);

        dto = new CustomerDTO("João", "joao@gmail.com", "rua julio dantas", 317, "4150-448", "Porto", "Portugal", "M",new Date(1998, 12, 18) , "910505106", "123457");
        c = controller.createCustomer(dto);
        PersistenceContext.repositories().customers().save(c);

        dto = new CustomerDTO("Luís", "luis@gmail.com", "rua senhora do porto", 882, "4450-575", "Porto", "Portugal", "M",new Date(2002, 10, 11) , "910505106", "123458");
        c = controller.createCustomer(dto);
        PersistenceContext.repositories().customers().save(c);

        dto = new CustomerDTO("José Rocha", "joser@gmail.com", "rua das musas", 34, "4575-061", "Porto", "Portugal", "M",new Date(2002, 10, 13) , "910505109", "123459");
        c = controller.createCustomer(dto);
        PersistenceContext.repositories().customers().save(c);

        dto = new CustomerDTO("Paulo", "paulo@gmail.com", "rua de goa", 67, "4760-723", "Famalicao", "Portugal", "M",new Date(1997, 4, 22) , "910505110", "123450");
        c = controller.createCustomer(dto);
        PersistenceContext.repositories().customers().save(c);

        LOGGER.debug("The customers were successfully created.");
        return true;
    }
}
