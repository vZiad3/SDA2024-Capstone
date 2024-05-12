package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class LogInPage1 {


        public LogInPage1() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        //[@class='login-button'][contains(text(),'Login')]
        @FindBy(xpath = "//a")
        public WebElement loginButton;

        @FindBy(id = "username")
        public WebElement usernameField;
        @FindBy(id = "password")
        public WebElement passwordField;

        @FindBy(xpath = "//button[@type='submit']")
        public WebElement singIn;

        public void login(String name, String password) {
            loginButton.click();
            usernameField.sendKeys(name);
            passwordField.sendKeys(password);
            singIn.click();
        }

        public void defaultLogin() {
            Driver.getDriver().get(ConfigReader.getProperty("website"));
            loginButton.click();
            usernameField.sendKeys(ConfigReader.getProperty("email3"));
            passwordField.sendKeys(ConfigReader.getProperty("password3"));
            singIn.click();

        }


        @FindBy(xpath = "/html/body/div/a")
        public WebElement loginButtonn;

        @FindBy(id = "username")
        public WebElement emailField;



        @FindBy(xpath = "//button[@type='submit']")
        public WebElement SignInButton;

        @FindBy(xpath = "//h5[@class='pb-1 help-block']")
        public WebElement errorMessage;


        public void invalidEmail() {
            emailField.sendKeys("cstmtestevolve.com");
            passwordField.sendKeys("xDcy_orcD4tmyUq");
            SignInButton.click();
            // Get the text of the error message
            String actualErrorMessage = errorMessage.getText();

            // Assert the error message
            String expectedErrorMessage = "Invalid Credentials";
            Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
        }

        public void invalidPassword() {
            emailField.sendKeys("cstm@qualitron.com");
            passwordField.sendKeys("xDcyorcD4tmyUq");
            SignInButton.click();

            // Get the text of the error message
            String actualErrorMessage = errorMessage.getText();

            // Assert the error message
            String expectedErrorMessage = "Invalid Credentials";
            Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
        }


    }

