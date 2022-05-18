package eapli.base.infrastructure.bootstrapers.demo;

import eapli.base.clientusermanagement.application.AcceptRefuseSignupFactory;
import eapli.base.clientusermanagement.application.AcceptRefuseSignupRequestController;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.myclientuser.application.SignupController;
import eapli.base.ordermanagement.application.RegisterOrderController;
import eapli.base.categorymanagement.domain.Category;
import eapli.base.categorymanagement.domain.Description;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.ordermanagement.domain.OrderItem;
import eapli.framework.actions.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;


public class OrderBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            OrderBootstrapper.class);

    private final RegisterOrderController controller = new RegisterOrderController();

    @Override
    public boolean execute() {

        List<String> list = new ArrayList<>();

        list.add("abcd.12345");
        list.add("abcd.12346");
        list.add("abcd.12347");
        list.add("abcd.12340");
        list.add("abcd.12341");
        list.add("abcd.12342");
        list.add("abcd.12330");

        CustomerOrder order;
        CustomerOrder order1;
        CustomerOrder order2;
        CustomerOrder order3;
        CustomerOrder order4;
        CustomerOrder order5;
        CustomerOrder order6;

        OrderItem orderItem;

        order = controller.createOrderForCustomer("123459");
        controller.createOrderItem(list);

        order1 = controller.createOrderForCustomer("123456");
        controller.createOrderItem(list);

        order2 = controller.createOrderForCustomer("123457");
        controller.createOrderItem(list);

        order3 = controller.createOrderForCustomer("123458");
        controller.createOrderItem(list);

        order4 = controller.createOrderForCustomer("123450");
        controller.createOrderItem(list);

        order5 = controller.createOrderForCustomer("123459");
        controller.createOrderItem(list);

        order6 = controller.createOrderForCustomer("123456");
        controller.createOrderItem(list);





        LOGGER.debug("The categories were successfully created.");
        return true;
    }
}