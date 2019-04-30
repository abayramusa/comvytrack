package pages;

import Utility.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    //create constructor to initilize driver
    public LoginPage(){
       PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "LOGIN")
    public WebElement login;

    @FindBy(xpath = "//div[@class='input-prepend']//input")
    public WebElement username ;

    @FindBy(xpath = "//div[@class='input-prepend input-prepend--last']//input")
    public WebElement password;


    @FindBy(id= "_submit")
    public WebElement loginButton;


}
