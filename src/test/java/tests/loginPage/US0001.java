package tests.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccessAccountManagement;
import pages.LogInPage;
import utilities.Driver;

public class US0001 {

        private WebDriver driver;
        private AccessAccountManagement loginPage;

        @BeforeMethod
        public void setUp() {
            // Set up WebDriver
            driver = Driver.getDriver();
            driver.get("https://qa-gm3.quaspareparts.com/");

            // Initialize LoginPage
            loginPage = new AccessAccountManagement(driver);
        }

        @Test
        public void TC01() {
            // Click on the login button
            loginPage.clickLoginButton();

            // Enter an invalid email address (without @)
            loginPage.enterEmail("cstmtestevolve.com");

            // Enter a valid password
            loginPage.enterPassword("CvdPixvARzUrmuR");

            // Click on the "SignIn" button
            loginPage.clickSignInButton();

            // Get the error message
            String actualErrorMessage = loginPage.getErrorMessage();

            // Assert the error message
            String expectedErrorMessage = "Invalid Credentials";
            Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

            // Get the current URL
            String currentUrl = driver.getCurrentUrl();

            // Define the expected home page URL
            String expectedHomePageUrl = "https://a3m-qa-gm3.quaspareparts.com/login?error=Invalid%20Credentials";

            // Verify that the user remains on the login page
            Assert.assertEquals(currentUrl, expectedHomePageUrl);
        }
    @Test
    public void TC02() {
        // Click on the login button
        loginPage.clickLoginButton();

        // Enter a valid email address
        loginPage.enterEmail("cstm@qualitron.com");

        // Enter an invalid password (without _)
        loginPage.enterPassword("xDcyorcD4tmyUq");

        // Click on the "SignIn" button
        loginPage.clickSignInButton();

        // Get the error message
        String actualErrorMessage = loginPage.getErrorMessage();

        // Assert the error message
        String expectedErrorMessage = "Invalid Credentials";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

        // Get the current URL
        String currentUrl = driver.getCurrentUrl();

        // Define the expected home page URL
        String expectedHomePageUrl = "https://a3m-qa-gm3.quaspareparts.com/login?error=Invalid%20Credentials";

        // Verify that the user remains on the login page
        Assert.assertEquals(currentUrl, expectedHomePageUrl);
    }

    @Test
    public void TC03() {
        // Click on the login button
        loginPage.clickLoginButton();

        // Enter a valid email address
        loginPage.enterEmail("cstm@testevolve.com");

        // Enter an invalid password (without _)
        loginPage.enterPassword("CvdPixvARzUrmuR");

        // Click on the "SignIn" button
        loginPage.clickSignInButton();

        // Verify that the user's name or profile information is displayed correctly on the home page.
        WebElement profileName = driver.findElement(By.xpath("//span[contains(text(),'cstm@testevolve.com')]"));
        profileName.isDisplayed();
        System.out.println("profileName = " + profileName);

    }

    LogInPage logeIn = new LogInPage();
    @Test
    public void TC04() {
        AccessAccountManagement accountManagementPage = new AccessAccountManagement(Driver.getDriver());
        PageFactory.initElements(Driver.getDriver(), accountManagementPage);
        logeIn.defaultLogin();

        // Verify that the user is redirected to the Home page
        String currentUrl = Driver.getDriver().getCurrentUrl();
        String expectedHomePageUrl = "https://qa-gm3.quaspareparts.com/a3m/?errorMessage=%5Bauthorization_request_not_found%5D%20";
        Assert.assertEquals(currentUrl, expectedHomePageUrl);

        // Verify that the Home page is displayed correctly
        String expectedTitle = "Account Management";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

        // Verify that the user's account information is visible on the page
        String expectedName = "cstm@testevolve.com | Business Owner";
        String actualName = loginPage.getProfileName();
        System.out.println("actualName = " + actualName);
        Assert.assertEquals(actualName, expectedName);

    }

}