package pages;

import Utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenu {

    public TopMenu(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]//i")
    public WebElement fleet;

    @FindBy(partialLinkText = "Vehicles Model")
    public WebElement vehicleModel ;

}
