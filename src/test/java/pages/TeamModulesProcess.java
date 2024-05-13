package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import utilities.Driver;

import java.util.List;

public class TeamModulesProcess {


    public TeamModulesProcess() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "link7")
    public WebElement teamButton;


    @FindBy(xpath = "//*[@id='MainContent']/div/div[1]/div[1]/h3")
    public WebElement teamTitle;

    @FindBy(xpath = "//*[@id='MainContent']/div/div[1]/div[2]/a/button")
    public WebElement addButton;

    @FindBy(id = "name")
    public WebElement teamNameField;

    @FindBy(xpath = "//*[@id='MainContent']/div/div/div/div/div[2]/div[2]/div[3]/div/div")
    public WebElement departmentType;

    @FindBy(xpath = "//*[@id='MainContent']/div/div/div/div/div[2]/div[5]/div/span/div/button[1]")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@id='MainContent']/div[1]/div/a/button")
    public WebElement editButton;


    @FindBy(xpath = "//*[@id='MainContent']/div/div[3]/div/div[1]/div/div/p/div[1]/div[2]/a")
    public WebElement team;

    @FindBy(xpath = "//*[@id='MainContent']/div/div[2]/div/button")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[.='Confirm']")
    public WebElement confirmButton;

    public void clickOnAddButton() {
        addButton.click();
    }

    public void AddNewTeam() {
        teamNameField.sendKeys("Test Team 1");
        departmentType.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        saveButton.click();

    }

    public void successesMsg() {
        List<WebElement> SucAlert = Driver.getDriver().findElements(By.xpath("//*[text()='New department successfully created']"));
        //To assert "New department successfully created"
        Assert.assertTrue(SucAlert.size() > 0);
    }

    public void AddNewTeamWithoutName() {
        departmentType.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        saveButton.click();


    }

    public void errorMsgName(){
        WebElement errorMsg = Driver.getDriver().findElement(By.xpath("//*[@id='MainContent']/div/div/div/div/div[2]/div[2]/div[1]/span"));
        Assert.assertTrue(errorMsg.isDisplayed(), "error Msg is not displayed");

    }

    public void AddNewTeamWithoutType(){
        teamNameField.sendKeys("Test Team 1");

        saveButton.click();
    }
    public void errorMsgType(){
        WebElement ErrorMsg = Driver.getDriver().findElement(By.xpath("//*[@id='MainContent']/div/div/div/div/div[2]/div[2]/div[3]/span"));
        Assert.assertTrue(ErrorMsg.isDisplayed(), "Element is not displayed");

    }


    public void ValidEdit() throws InterruptedException {
        team.click();
        editButton.click();
        Thread.sleep(2000);
        teamNameField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Thread.sleep(2000);
        teamNameField.sendKeys(Keys.DELETE);
        Thread.sleep(2000);
        teamNameField.sendKeys("Edit test");
        Thread.sleep(2000);
        departmentType.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        saveButton.click();

    }

    public void SuccessEdit(){
        List<WebElement> Alert = Driver.getDriver().findElements(By.xpath("//*[text()='Changes successfully saved']"));
        //To assert "Changes successfully saved"
        Assert.assertTrue(Alert.size() > 0);

    }

    public void deleteTeam(){
        team.click();
        editButton.click();
        deleteButton.click();
        confirmButton.click();



    }

}