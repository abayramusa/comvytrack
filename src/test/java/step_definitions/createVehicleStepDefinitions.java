package step_definitions;

import Utility.BrowserUtilities;
import Utility.Driver;
import Utility.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TopMenu;
import pages.VehicleInformation;

import javax.swing.*;

public class createVehicleStepDefinitions {

    Actions action= new Actions(Driver.getDriver());
    VehicleInformation vehicleInformation= new VehicleInformation();

    Pages pages = new Pages();

    @When("user clicks on the fleet")
    public void user_clicks_on_the_fleet() throws InterruptedException {
       Thread.sleep(7000);
        action.moveToElement(pages.topMenu().fleet).perform();
        System.out.println("text1 : " +pages.topMenu().fleet.getText());

    }

    @Then("user clicks on the vehicle model")
    public void user_clicks_on_the_vehicle_model() {
        BrowserUtilities.wait(5);
        System.out.println("text2 : " +pages.topMenu().vehicleModel.getText());
        pages.topMenu().vehicleModel.click();
    }

    @Then("user clicks on hte create vehicle model")
    public void user_clicks_on_hte_create_vehicle_model() {
        BrowserUtilities.wait(5);
        pages.topMenu().createvehicleModel.click();
    }


    @When("user created a vehicle")
    public void user_created_a_vehicle() {
        pages.login().open();
        pages.login().loginPage();
        vehicleInformation.modelname.sendKeys("Honda");
        vehicleInformation.make.sendKeys("Accord");
        vehicleInformation.canberequested.click();

    }

}
