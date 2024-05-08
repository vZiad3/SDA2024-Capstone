package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.Driver;

public class UserModuleProcess {

    public UserModuleProcess() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='divCollapseUncollapse']//*[name()='svg']")
    public WebElement button;

    @FindBy(xpath = "//a[normalize-space()='Users']")
    public WebElement UserButton;

    @FindBy(xpath = "//button[normalize-space()='+ Add New Member']")
    public WebElement AddNewButton;

    public void GetFirstFrame() {

        Driver.getDriver().switchTo().frame("//div[@class='modal-body']");

    }


    public void dropDownDepartments() {
        // first locate the webElement
        Driver.getDriver().getCurrentUrl();
        WebElement element = Driver.getDriver().findElement(By.id("react-select-2-placeholder"));

        Select select = new Select(element);
        element.click();
        select.selectByIndex(2);

    }



    public void dropDownRoles() {
        // first locate the webElement
        Driver.getDriver().getCurrentUrl();
        WebElement element = Driver.getDriver().findElement(By.id("react-select-3-placeholder"));

        Select select = new Select(element);
        element.click();
        select.selectByIndex(3);

    }


    @FindBy(id = "email")
    public WebElement EmailFilled;

    @FindBy(xpath = "//button[normalize-space()='Register']")
    public WebElement RegisterButton;




}
