package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;


public class UserModuleProcess {





    public UserModuleProcess() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@alt='Collapse']")
    public WebElement button;
    @FindBy(xpath = "//a[normalize-space()='Users']")
    public WebElement userButton;
    @FindBy(xpath = "//button[normalize-space()='+ Add New Member']")
    public WebElement addNewButton;
    @FindBy(xpath = "//*[@class = ' css-19bb58m']")
    public WebElement firstToDropdown;
    @FindBy(xpath = "//*[contains(text(),'Select Role')]/following-sibling::div")
    public WebElement sacondToDropdown;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailInput;
    @FindBy(xpath = "//button[normalize-space()='Register']")
    public WebElement registerButton;
    @FindBy(xpath = "//div[@class='toast-header bg-success text-white']")
    public List<WebElement> successMasseg;
    @FindBy(xpath = "//button[normalize-space()='Close']")
    public WebElement cancelButton;
    @FindBy(xpath = "//tbody/tr[1]/td[7]/div[1]/button[1]")
    public WebElement thereDots;
    @FindBy(xpath = "//div[@id = 'MainContent']//table/tbody/tr[1]/td[2]/a")
    public WebElement firstUsernameIndex;
    @FindBy(xpath = "//span[@class='active-roles-box']")
    public WebElement defaultRole;
    @FindBy(xpath = "//button[@class='btn btn-ghost-dark rounded-circle']//*[name()='svg']")
    public WebElement editIcon;
    @FindBy(xpath = "//label[@id='email']")
    public WebElement emailLabel;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameLabel;
    @FindBy(xpath = "(//a[@class='dropdown-item'][normalize-space()='Reset Password'])[1]")
    public WebElement resetPasswordButton;
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    public WebElement confirmButtom;
    @FindBy(xpath = "//div[@class='callout callout-success']")
    public List<WebElement> resetPassSuccessMass;
    @FindBy(xpath = "//button[normalize-space()='Close']")
    public WebElement closeButtonResetPass;
    @FindBy(css = ".ms-2.cursor-pointer")
     public WebElement addingRole;
    @FindBy(xpath = "//div[@class=' css-19bb58m']")
    public WebElement drobdownRols;
    @FindBy(xpath = "//button[normalize-space()='Save']")
    public WebElement saveButton;
    @FindBy(xpath = "(//*[name()='svg'][@role='img'])[15]")
    public WebElement checkMark;
    @FindBy(xpath = "//p[normalize-space()='New role added for this user successfuly']")
    public List<WebElement> addingRoleSuccessMass;




    public void scrollByThreeElements(){

        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.waitFor(2);
        drobdownRols.click();
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

    }


    public String fakeEmail(){
        Faker faker = new Faker();
        return faker.internet().emailAddress();

    }

    public String fakeUsername(){
        Faker faker = new Faker();
        return faker.name().username();

    }


}






















