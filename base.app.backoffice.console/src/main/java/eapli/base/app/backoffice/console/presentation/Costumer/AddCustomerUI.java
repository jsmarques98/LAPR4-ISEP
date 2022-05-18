package eapli.base.app.backoffice.console.presentation.Costumer;

import eapli.base.app.backoffice.console.presentation.product.AddProductUI;
import eapli.base.customermanagement.application.AddCustomerController;
import eapli.base.customermanagement.dto.CustomerDTO;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;
import org.slf4j.Logger;
import eapli.framework.presentation.console.AbstractUI;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AddCustomerUI extends AbstractUI {
    private static final Logger LOGGER = LoggerFactory.getLogger(AddProductUI.class);
    private final AddCustomerController controller = new AddCustomerController();

    @Override
    protected boolean doShow() {
        if (createCostumer()) {
            System.out.println("Successful costumer creation");
            return true;
        }
        System.out.println("Unsuccessful product creation");
        return false;
    }

    private boolean createCostumer() {
        String name = Console.readLine("Name: ");
        String email = Console.readLine("Email: ");
        String answer =Console.readLine("want to add an address?(y/n) ");
        List<String> addresses = new ArrayList<String>();
        while(answer.equals("y")||answer.equals("Y")||answer.equals("YES")||answer.equals("yes")){
            addresses.add(Console.readLine("Street Name:"));
            addresses.add(Console.readLine("Door Number:"));
            addresses.add(Console.readLine("Postal Code"));
            addresses.add(Console.readLine("City"));
            addresses.add(Console.readLine("Country"));
            answer =Console.readLine("want to add another address?(y/n) ");
        }

        String phoneNumber = Console.readLine("Phone Number: ");
        String vatId = Console.readLine("Vat Id: ");
        LocalDate birthDate = (Console.readDate("Birth date")).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        String name = "luis";
//        String email ="l@gmail.com" ;
//        String streetName ="a" ;
//        Integer doorNumber = 2;
//        String postalCode = "a";
//        String city = "aa";
//        String country ="aa" ;
//        String phoneNumber ="9";
//        String vatId ="9" ;
//        Date birthDate =new Date();

        final List<String> genders = new ArrayList<>();
        System.out.println("Gender");
        boolean show;
        do {
            show = showGenders(genders);
        } while (!show);

        System.out.println(genders.get(0));
        CustomerDTO customerDTO = new CustomerDTO(name, email, addresses, genders.get(0), birthDate, phoneNumber, vatId);
        try {
            controller.createCustomer(customerDTO);
            return true;
        } catch (final IntegrityViolationException e) {
            System.out.println("Id is already in use.");
        } catch (final ConcurrencyException e) {
            LOGGER.error("This should never happen", e);
            System.out.println(
                    "Unfortunately there was an unexpected error in the application. Please try again and if the problem persists, contact your system administrator.");
        }
        return false;
    }
    private boolean showGenders(List<String> gender) {
        final Menu categoriesMenu = buildGenderMenu(gender);
        final MenuRenderer renderer = new VerticalMenuRenderer(categoriesMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildGenderMenu(List<String> gender) {
        final Menu genderMenu = new Menu();
        int counter = 1;
        genderMenu.addItem(MenuItem.of(counter++, "Male",() -> gender.add("Male")));
        genderMenu.addItem(MenuItem.of(counter++, "Female",() -> gender.add("Female")));

        return genderMenu;
    }
    @Override
    public String headline() {
        return "ADD COSTUMER";
    }
}