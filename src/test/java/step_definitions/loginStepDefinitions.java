package step_definitions;

import Utility.Driver;
import Utility.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class loginStepDefinitions {

    protected Pages pages = new Pages();
LoginPage loginPage=new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
      //  Driver.getDriver().get("http://vytrack.com/");
pages.login().open();

    }

    @When("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
    loginPage.login.click();
    }

    @Then("the enters username and password then clicks on login button")
    public void the_enters_username_and_password_then_clicks_on_login_button() {
    loginPage.username.sendKeys("StoreManager1");
    loginPage.password.sendKeys("Cybertek1");
    loginPage.loginButton.click();
    }



}
