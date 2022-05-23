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
import eapli.framework.io.util.Console;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            CustomerBootstrapper.class);

    private final AddCustomerController controller = new AddCustomerController();

    @Override
    public boolean execute() {
        List<String> addresses = new ArrayList<String>();
        addresses.add("rua das agras");
        addresses.add("115");
        addresses.add("4575-160");
        addresses.add("Nelas");
        addresses.add("Portugal");

        CustomerDTO dto = new CustomerDTO("José Monteiro", "jose@gmail.com", addresses, "Male", LocalDate.of(2002,9,22), "910505106", "123456");
        Customer c = null;
        c = controller.createCustomer(dto);
        PersistenceContext.repositories().customers().save(c);
        System.out.println(c);
        addresses = new ArrayList<String>();
        addresses.add("rua julio dantas");
        addresses.add("317");
        addresses.add("4150-448");
        addresses.add("Porto");
        addresses.add("Portugal");
        dto = new CustomerDTO("João Marques", "joao@gmail.com", addresses, "Male", LocalDate.of(1998, 12, 18) , "910505106", "123457");
        c = controller.createCustomer(dto);
        PersistenceContext.repositories().customers().save(c);
        addresses = new ArrayList<String>();
        addresses.add("rua senhora do porto");
        addresses.add("882");
        addresses.add("4450-575");
        addresses.add("Porto");
        addresses.add("Portugal");
        dto = new CustomerDTO("Luís Ferreira", "luis@gmail.com", addresses, "Male", LocalDate.of(2002, 10, 11) , "910505106", "123458");
        c = controller.createCustomer(dto);
        PersistenceContext.repositories().customers().save(c);
        addresses = new ArrayList<String>();
        addresses.add("rua das musas");
        addresses.add("34");
        addresses.add("4450-061");
        addresses.add("Porto");
        addresses.add("Portugal");
        dto = new CustomerDTO("José Rocha", "joser@gmail.com", addresses, "Male", LocalDate.of(2002, 10, 13) , "910505109", "123459");
        c = controller.createCustomer(dto);
        PersistenceContext.repositories().customers().save(c);
        addresses = new ArrayList<String>();
        addresses.add("rua da goa");
        addresses.add("67");
        addresses.add("4760-723");
        addresses.add("Famalicão");
        addresses.add("Portugal");
        dto = new CustomerDTO("Paulo Couto", "paulo@gmail.com", addresses, "Male",LocalDate.of(1997, 4, 22) , "910505110", "123450");
        c = controller.createCustomer(dto);
        PersistenceContext.repositories().customers().save(c);

        LOGGER.debug("The customers were successfully created.");
        return true;
    }
}
