package eapli.base.app.customer.console;

import eapli.base.Application;
import eapli.base.CommunicationProtocol.Orders_API;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class CheckStatusOpenOrdersController {
    private Orders_API api;
    private SystemUser systemUser;
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    public CheckStatusOpenOrdersController(){
        systemUser = authz.session().get().authenticatedUser();
        try{
            this.api = (Orders_API) Class.forName(Application.settings().getOrdersAPI()).getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean testServerConnection(){
        return api.testServerConnection();
    }

    public List<CustomerOrder> getCustomerOpenOrders(){
        return api.getCustomerOpenOrders(systemUser.email());
    }
}
