package Utility;

import pages.LoginPage;
import pages.TopMenu;

public class Pages {

    private LoginPage loginPage;
    private TopMenu topMenu;

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
}
