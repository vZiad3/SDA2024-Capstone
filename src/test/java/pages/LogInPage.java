package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class LogInPage {
    public LogInPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //[@class='login-button'][contains(text(),'Login')]
    @FindBy(xpath = "//a")
    public WebElement loginButton;

    @FindBy(id = "username")
    public WebElement usernameField;
    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement singIn;

    public void login(String name, String password){
        loginButton.click();
        usernameField.sendKeys(name);
        passwordField.sendKeys(password);
        singIn.click();
    }

    public void defaultLogin(){
        Driver.getDriver().get(ConfigReader.getProperty("website"));
        loginButton.click();
        usernameField.sendKeys(ConfigReader.getProperty("email4"));
        passwordField.sendKeys(ConfigReader.getProperty("password4"));
        singIn.click();


    }

}
