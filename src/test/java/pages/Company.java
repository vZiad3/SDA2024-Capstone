package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Company {
    public Company(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    Faker faker = new Faker();
    @FindBy(xpath = "//li[@class='list-group-item'][@id='link4']")

    public WebElement companyButton;
    @FindBy(xpath = "//div[@id='divCollapseUncollapse']")

    public WebElement collapse;
    @FindBy(id = "name")
    public WebElement name;
    @FindBy(xpath = "//button[@class='btn btn-outline-dark'][contains(text(),' Edit')]")
    public WebElement editButton;
    @FindBy(xpath = "//button[@type='button'][contains(text(),'Save')]")
    public WebElement saveButton;

    @FindBy(xpath = "//input[@placeholder='Company Email']")
    public WebElement emailField;
    @FindBy(xpath = "//*[@id='MainContent']//h5[contains(text(),'Company Information')]")
    public WebElement infoOfTheCompany;




}
