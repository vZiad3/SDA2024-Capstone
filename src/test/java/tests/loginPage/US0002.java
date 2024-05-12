package tests.loginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccessAccountManagement;
import pages.LogInPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBase;

public class US0002  {

    LogInPage logeIn = new LogInPage();
    @Test
    public void TC01()  {
        AccessAccountManagement accountManagementPage = new AccessAccountManagement(Driver.getDriver());
        PageFactory.initElements(Driver.getDriver(), accountManagementPage);
        logeIn.defaultLogin();

        String currentUrl = Driver.getDriver().getCurrentUrl();
        String expectedHomePageUrl = "https://qa-gm3.quaspareparts.com/a3m/?errorMessage=%5Bauthorization_request_not_found%5D%20";
        // Verify that the user is redirected to the home page
        Assert.assertEquals(currentUrl, expectedHomePageUrl);

        ReusableMethods.waitFor(1);

        // Verify that the logo is visible on the home page using @FindBy
        Assert.assertTrue(accountManagementPage.isLogoDisplayed());
    }
    @Test
    public void TC02() {
        AccessAccountManagement accountManagementPage = new AccessAccountManagement(Driver.getDriver());
        PageFactory.initElements(Driver.getDriver(), accountManagementPage);
        logeIn.defaultLogin();

        // Verify that the user is redirected to the home page
        String currentUrl = Driver.getDriver().getCurrentUrl();
        String expectedHomePageUrl = "https://qa-gm3.quaspareparts.com/a3m/?errorMessage=%5Bauthorization_request_not_found%5D%20";
        Assert.assertEquals(currentUrl, expectedHomePageUrl);


        // Verify that the sidebar is visible on the home page
        Assert.assertTrue(accountManagementPage.isSidebarDisplayed());


    }
}
