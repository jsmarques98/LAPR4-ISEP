package eapli.base.infrastructure.bootstrapers.demo;

import eapli.base.clientusermanagement.application.AcceptRefuseSignupFactory;
import eapli.base.clientusermanagement.application.AcceptRefuseSignupRequestController;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.myclientuser.application.SignupController;
import eapli.base.agvmanagement.application.AddAGVController;
import eapli.base.agvmanagement.domain.AGV;
import eapli.base.agvmanagement.domain.Autonomy;
import eapli.framework.actions.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class AgvBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            CategoryBootstrapper.class);

    private final AddAGVController controller = new AddAGVController();

    @Override
    public boolean execute() {

        AGV agv, agv1, agv2, agv3;

        agv = controller.createAGV("1234", 60, 500.0, "model1", "only supports 500g" );
        agv1 = controller.createAGV("12345", 70, 1000.0, "model2", "only supports 1000g" );
        agv2 = controller.createAGV("123456", 80, 1500.0, "model3", "only supports 1500g" );
        agv3 = controller.createAGV("1234567", 90, 2000.0, "model4", "only supports 2000g" );

        PersistenceContext.repositories().agvs().save(agv);
        PersistenceContext.repositories().agvs().save(agv1);
        PersistenceContext.repositories().agvs().save(agv2);
        PersistenceContext.repositories().agvs().save(agv3);

        LOGGER.debug("The AGVs were successfully created.");
        return true;
    }
}
