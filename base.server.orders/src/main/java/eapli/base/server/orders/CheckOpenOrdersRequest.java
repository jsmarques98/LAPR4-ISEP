package eapli.base.server.orders;

import eapli.base.CommunicationProtocol.utils.DataHandler;
import eapli.base.CommunicationProtocol.utils.MessageCodes;
import eapli.base.ordermanagement.domain.CustomerOrder;
import eapli.base.server.orders.application.OrdersController;
import eapli.framework.general.domain.model.EmailAddress;



import java.io.*;
import java.util.List;

public class CheckOpenOrdersRequest {
    private final byte[] userEmail;
    private final DataHandler dataHandler;
    private final OrdersController controller;

    public CheckOpenOrdersRequest(byte[] userEmail, DataHandler dataHandler, OrdersController controller){
        this.userEmail=userEmail;
        this.dataHandler = dataHandler;
        this.controller = controller;
    }


    public boolean execute(){
        try {

            ByteArrayInputStream bIn2 = new ByteArrayInputStream(userEmail);
            ObjectInputStream sIn2 = new ObjectInputStream(bIn2);

            EmailAddress customerEmail = (EmailAddress) sIn2.readObject();

            List<CustomerOrder> orderList = controller.getCustomerOpenOrders(customerEmail);

            ByteArrayOutputStream out2 = new ByteArrayOutputStream();
            ObjectOutputStream os = new ObjectOutputStream(out2);
            os.writeObject(orderList);
            byte[] ordersBytes = out2.toByteArray();
            dataHandler.sendData(ordersBytes, MessageCodes.SUCCESS);
            return true;
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
            return false;
        }
    }
}
