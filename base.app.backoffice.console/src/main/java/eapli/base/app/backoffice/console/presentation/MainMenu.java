/*
 * Copyright (c) 2013-2019 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package eapli.base.app.backoffice.console.presentation;

import eapli.base.app.backoffice.console.presentation.Costumer.AddCustomerUI;
import eapli.base.app.backoffice.console.presentation.Survey.CreateSurveyUI;
import eapli.base.app.backoffice.console.presentation.agv.AddAGVUI;
import eapli.base.app.backoffice.console.presentation.catalog.ShowCatalogUI;
import eapli.base.app.backoffice.console.presentation.category.AddCategoryUI;
import eapli.base.app.backoffice.console.presentation.order.AccessOrderUi;
import eapli.base.app.backoffice.console.presentation.order.PrepareOrderAutoUI;
import eapli.base.app.backoffice.console.presentation.order.PrepareOrderUI;
import eapli.base.app.backoffice.console.presentation.order.RegisterOrderForClientUI;
import eapli.base.app.backoffice.console.presentation.product.AddProductUI;
//import eapli.base.app.backoffice.console.presentation.product.ListProductsUI;
import eapli.base.app.backoffice.console.presentation.warehouse.UpdateWarehouseUI;
import eapli.base.app.common.console.presentation.authz.MyUserMenu;
import eapli.base.Application;
import eapli.base.app.backoffice.console.presentation.authz.AddUserUI;
import eapli.base.app.backoffice.console.presentation.authz.DeactivateUserAction;
import eapli.base.app.backoffice.console.presentation.authz.ListUsersAction;
import eapli.base.app.backoffice.console.presentation.clientuser.AcceptRefuseSignupRequestAction;
import eapli.base.dashboardmanagement.HttpServerAjaxVoting;
import eapli.base.ordermanagement.domain.OrderStatus;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.ExitWithMessageAction;
import eapli.framework.presentation.console.menu.HorizontalMenuRenderer;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

/**
 * TODO split this class in more specialized classes for each menu
 *
 * @author Paulo Gandra Sousa
 */
public class MainMenu extends AbstractUI {

    private static final String RETURN_LABEL = "Return ";

    private static final int EXIT_OPTION = 0;

    // USERS
    private static final int ADD_USER_OPTION = 1;
    private static final int LIST_USERS_OPTION = 2;
    private static final int DEACTIVATE_USER_OPTION = 3;
    private static final int ACCEPT_REFUSE_SIGNUP_REQUEST_OPTION = 4;

    // PRODUCTS
    private static final int ADD_PRODUCT_OPTION = 1;

    //Customers
    private static final int ADD_CUSTOMER_OPTION = 1;

    // CATEGORIES
    private static final int ADD_CATEGORY_OPTION = 1;

    //AGV
    private static final int ADD_AGV_OPTION = 1;

    //CATALOG
    private static final int VIEW_CATALOG_OPTION = 1;

    //Order
    private static final int CREATE_ORDER_OPTION = 1;

    //Warehouse
    private static final int WAREHOUSE_OPTION = 2;
    private static final int UPDATE_WAREHOUSE_OPTION = 1;
    private static final int ORDER1_OPTION = 3;
    private static final int PREPARE_ORDER_OPTION = 1;
    private static final int AUTO_PREPARE_ORDER_OPTION = 2;
    private static final int FIND_ORDER = 3;


    //Survey
    private  static  final int CREATE_SURVEY_OPTION=1;



    // MAIN MENU
    private static final int MY_USER_OPTION = 1;
    private static final int USERS_OPTION = 2;
    private static final int PRODUCT_OPTION = 3;
    private static final int CATEGORY_OPTION = 4;
    private static final int CUSTOMER_OPTION = 5;
    private static final int AGV_OPTION = 6;
    private static final int CATALOG_OPTION = 7;
    private static final int ORDER_OPTION = 8;
    private static final int FIND_ORDER_deliveredByCarrier = 9;

    private static final String SEPARATOR_LABEL = "--------------";

    private static  final int SURVEY_OPTION =2;

    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    @Override
    public boolean show() {
        drawFormTitle();
        return doShow();
    }

    /**
     * @return true if the user selected the exit option
     */
    @Override
    public boolean doShow() {
        final Menu menu = buildMainMenu();
        final MenuRenderer renderer;
        if (Application.settings().isMenuLayoutHorizontal()) {
            renderer = new HorizontalMenuRenderer(menu, MenuItemRenderer.DEFAULT);
        } else {
            renderer = new VerticalMenuRenderer(menu, MenuItemRenderer.DEFAULT);
        }
        return renderer.render();
    }

    @Override
    public String headline() {

        return authz.session().map(s -> "Base [ @" + s.authenticatedUser().identity() + " ]")
                .orElse("Base [ ==Anonymous== ]");
    }

    private Menu buildMainMenu() {
        final Menu mainMenu = new Menu();

        final Menu myUserMenu = new MyUserMenu();
        mainMenu.addSubMenu(MY_USER_OPTION, myUserMenu);

        if (!Application.settings().isMenuLayoutHorizontal()) {
            mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
        }

        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.SALES_CLERK)) {
            final Menu usersMenu = buildUsersMenu();
            mainMenu.addSubMenu(USERS_OPTION, usersMenu);

            final Menu productsMenu = buildProductsMenu();
            mainMenu.addSubMenu(PRODUCT_OPTION, productsMenu);

            final Menu categoryMenu = buildCategoryMenu();
            mainMenu.addSubMenu(CATEGORY_OPTION, categoryMenu);

            final Menu customerMenu = buildCustomerMenu();
            mainMenu.addSubMenu(CUSTOMER_OPTION, customerMenu);

            final Menu agvMenu = buildAGVMenu();
            mainMenu.addSubMenu(AGV_OPTION, agvMenu);

            final Menu catalogMenu = buildCatalogMenu();
            mainMenu.addSubMenu(CATALOG_OPTION, catalogMenu);

            final Menu orderMenu = buildOrderMenu();
            mainMenu.addSubMenu(ORDER_OPTION, orderMenu);

            final Menu fOrder = buildFindOrderMenu();
            mainMenu.addSubMenu(FIND_ORDER_deliveredByCarrier, fOrder);
        }

        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.WAREHOUSE_EMPLOYEE)) {
            HttpServerAjaxVoting a= new HttpServerAjaxVoting();
            a.start();
            final Menu warehouseMenu = buildWarehouseMenu();
            mainMenu.addSubMenu(WAREHOUSE_OPTION, warehouseMenu);
            final Menu prepareOrderMenu = buildPrepareOrderMenu();
            mainMenu.addSubMenu(ORDER1_OPTION, prepareOrderMenu);
        }

        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.SALES_MANAGER)) {
            final Menu surveyMenu = buildSurveyMenu();
            mainMenu.addSubMenu(SURVEY_OPTION, surveyMenu);
        }

        if (!Application.settings().isMenuLayoutHorizontal()) {
            mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
        }

        mainMenu.addItem(EXIT_OPTION, "Exit", new ExitWithMessageAction("Bye, Bye"));

        return mainMenu;
    }

//    private Menu buildAdminSettingsMenu() {
//        final Menu menu = new Menu("Settings >");
//
//        menu.addItem(SET_KITCHEN_ALERT_LIMIT_OPTION, "Set kitchen alert limit",
//                new ShowMessageAction("Not implemented yet"));
//        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);
//
//        return menu;
//    }

    private Menu buildUsersMenu() {
        final Menu menu = new Menu("Users >");

        menu.addItem(ADD_USER_OPTION, "Add User", new AddUserUI()::show);
        menu.addItem(LIST_USERS_OPTION, "List all Users", new ListUsersAction());
        menu.addItem(DEACTIVATE_USER_OPTION, "Deactivate User", new DeactivateUserAction());
        menu.addItem(ACCEPT_REFUSE_SIGNUP_REQUEST_OPTION, "Accept/Refuse Signup Request",
                new AcceptRefuseSignupRequestAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }
    private Menu buildSurveyMenu() {
        final Menu menu = new Menu("Survey >");
        menu.addItem(CREATE_SURVEY_OPTION, "Create survey", new CreateSurveyUI()::show);

        return menu;
    }


    private Menu buildProductsMenu() {
        final Menu menu = new Menu("Products >");
        menu.addItem(ADD_PRODUCT_OPTION, "Add Product", new AddProductUI()::show);
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);
        //menu.addItem(LIST_USERS_OPTION, "List all Products", new ListProductsUI()::show);
        return menu;
    }

    private Menu buildCategoryMenu() {
        final Menu menu = new Menu("Categories >");
        menu.addItem(ADD_CATEGORY_OPTION, "Add Category", new AddCategoryUI()::show);
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);
        return menu;
    }

    private Menu buildCustomerMenu() {
        final Menu menu = new Menu("Customers >");
        menu.addItem(ADD_CUSTOMER_OPTION, "Add Customer", new AddCustomerUI()::show);
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);
        return menu;
    }

    private Menu buildAGVMenu() {
        final Menu menu = new Menu("AGVs >");
        menu.addItem(ADD_AGV_OPTION, "Add AGV", new AddAGVUI()::show);
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);
        return menu;
    }

    private Menu buildCatalogMenu() {
        final Menu menu = new Menu("Catalog >");
        menu.addItem(VIEW_CATALOG_OPTION, "View Catalog", new ShowCatalogUI()::show);
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);
        return menu;
    }

    private Menu buildWarehouseMenu() {
        final Menu menu = new Menu("Warehouse >");

        menu.addItem(UPDATE_WAREHOUSE_OPTION, "Warehouse Management", new UpdateWarehouseUI()::show);
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildPrepareOrderMenu() {
        final Menu menu = new Menu("Order >");

        menu.addItem(PREPARE_ORDER_OPTION, "Prepare Order", new PrepareOrderUI()::show);
        menu.addItem(AUTO_PREPARE_ORDER_OPTION, "Auto Prepare Order", new PrepareOrderAutoUI()::show);
        menu.addItem(FIND_ORDER, "Access the list of orders that have already been prepared by the AGVs", new AccessOrderUi(OrderStatus.prepared,OrderStatus.deliveredByCarrier)::show);

        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildOrderMenu() {
        final Menu menu = new Menu("Order >");

        menu.addItem(CREATE_ORDER_OPTION, "Order Management", new RegisterOrderForClientUI()::show);
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }
    private Menu buildFindOrderMenu() {
        final Menu menu = new Menu("Orders that had been dispatched for customer delivery >");

        menu.addItem(FIND_ORDER, "Access the list of orders that have already been delivered for Transport", new AccessOrderUi(OrderStatus.deliveredByCarrier,OrderStatus.receivedByCustomer)::show);
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }
}