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

        AGV agv;

        agv = controller.createAGV("1234", 60, 500.0, "model", "description" );

        PersistenceContext.repositories().agvs().save(agv);

        LOGGER.debug("The AGV was successfully created.");
        return true;
    }
}
