package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.List;

public class RemoteUnitsPage {

    public RemoteUnitsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='row']")
    public List<WebElement> remoteUnitDiv;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement remoteUnitButton;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameField;
    @FindBy(xpath = "//input[@name='short_name']")
    public WebElement shortNameField;
    @FindBy(xpath = "//input[@name='description']")
    public WebElement descriptionField;

    @FindBy(id = "react-select-2-input")
    public WebElement departmentTypeField;

    public Boolean remoteUnitDisplayed() {
        System.out.println(remoteUnitDiv.get(0).getText());
        return remoteUnitDiv.get(0).isDisplayed();
    }

    public int remoteUnitCount() {

        return remoteUnitDiv.size();
    }

    public void addRemoteUnitClick() {
        remoteUnitButton.click();
    }

    public void addRemoteUnit() {
        //home page
        addRemoteUnitClick();


    }
}

