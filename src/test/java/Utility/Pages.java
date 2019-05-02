package Utility;

import pages.LoginPage;
import pages.TopMenu;
import step_definitions.createVehicleStepDefinitions;

public class Pages {

    private LoginPage loginPage;
    private TopMenu topMenu;
    private createVehicleStepDefinitions createVehicleStepDefinitions;
    private BrowserUtilities browserUtilities;

    public BrowserUtilities browserUtilities(){
        if (browserUtilities==null)
            browserUtilities =new BrowserUtilities();
        return browserUtilities;
    }

    public LoginPage login() {
        if (loginPage==null)
            loginPage=new LoginPage();
        return loginPage;
    }

    public createVehicleStepDefinitions createVehicleStepDefinitions() {
        if (createVehicleStepDefinitions==null)
            createVehicleStepDefinitions=new createVehicleStepDefinitions();
        return createVehicleStepDefinitions;
    }

    public TopMenu topMenu() {
        if (topMenu==null)
            topMenu=new TopMenu();
        return topMenu;
    }
}
