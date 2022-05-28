package eapli.base.app.agvdigitaltwin;

import eapli.base.app.common.console.BaseApplication;
import eapli.framework.infrastructure.eventpubsub.EventDispatcher;

public class BaseAGVDigitalTwin extends BaseApplication {
    public static void main(String[] args) {
        new BaseAGVDigitalTwin().run(args);
    }
    @Override
    protected void doMain(String[] args) {
        // go to main menu
        final MainMenu menu = new MainMenu();
        menu.mainLoop();
    }

    @Override
    protected String appTitle() {
        return "AGV DIGITAL TWIN";
    }

    @Override
    protected String appGoodbye() {
        return "Bye Bye";
    }

    @Override
    protected void doSetupEventHandlers(EventDispatcher dispatcher) {

    }
}
