package pages;

import Utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleInformation {

    public VehicleInformation(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "custom_entity_type_ModelName-uid-5cca6862946e7")
    public WebElement modelname;

    @FindBy(id = "custom_entity_type_Make-uid-5cca6862947f3")
    public WebElement make;

    @FindBy(id = "s2id_custom_entity_type_Canberequested-uid-5cca686294935")
    public WebElement canberequested;


    @FindBy(partialLinkText = "Yes")
    public WebElement yes;


}
