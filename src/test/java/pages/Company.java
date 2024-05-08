package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Company {
    public Company(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//li[@class='list-group-item'][@id='link4']")

    public WebElement companyButton;
    @FindBy(xpath = "//div[@id='divCollapseUncollapse']")

    public WebElement collapse;
    @FindBy(id = "name")
    public WebElement name;


}
