package tests.loginPage;

import pages.AccessAccountManagement;
import pages.LogInPage;
import utilities.Driver;
import utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

public class US0003 {
    LogInPage logeIn = new LogInPage();
    @Test
    public void TC01() {
        AccessAccountManagement accountManagementPage = new AccessAccountManagement(Driver.getDriver());
        PageFactory.initElements(Driver.getDriver(), accountManagementPage);
        logeIn.defaultLogin();

        accountManagementPage.clickDropdownMenu();

        // Verify that the drop-down menu expands
        Assert.assertTrue(accountManagementPage.isExpandedDropdownDisplayed());

        // Verify that the username and role are displayed at the top of the expanded drop-down menu
        Assert.assertTrue(accountManagementPage.isUsernameAndRoleDisplayed());
    }

    @Test
    public void TC02() {

        AccessAccountManagement accountManagementPage = new AccessAccountManagement(Driver.getDriver());
        PageFactory.initElements(Driver.getDriver(), accountManagementPage);
        logeIn.defaultLogin();

        String currentUrl = Driver.getDriver().getCurrentUrl();
        String expectedHomePageUrl = "https://qa-gm3.quaspareparts.com/a3m/?errorMessage=%5Bauthorization_request_not_found%5D%20";
        // Verify that the user is redirected to the home page
        Assert.assertEquals(currentUrl, expectedHomePageUrl);

        accountManagementPage.clickDropdownMenu();

        // Verify that the drop-down menu expands
        Assert.assertTrue(accountManagementPage.isExpandedDropdownDisplayed());

        // Click on the "My Subscriptions" option
        accountManagementPage.clickMySubscriptionsOption();

        // Assert that a My Subscription page is opened
        String MySubscriptionPageUrl = accountManagementPage.getCurrentUrl();
        String expectedMySubscriptionPageUrl = "https://qa-gm3.quaspareparts.com/a3m/?errorMessage=%5Bauthorization_request_not_found%5D%20#/subscriptions";
        Assert.assertEquals(MySubscriptionPageUrl, expectedMySubscriptionPageUrl);

        Driver.getDriver().navigate().back();
        accountManagementPage.clickDropdownMenu();

        // Click on the "My Memberships" option
        accountManagementPage.clickMyMembershipsOption();

        // Assert that a My Memberships page is opened
        String MyMembershipsPageUrl = accountManagementPage.getCurrentUrl();
        String expectedMyMembershipsPageUrl = "https://qa-gm3.quaspareparts.com/a3m/?errorMessage=%5Bauthorization_request_not_found%5D%20#/mymemberships";
        Assert.assertEquals(MyMembershipsPageUrl, expectedMyMembershipsPageUrl);

        Driver.getDriver().navigate().back();
        accountManagementPage.clickDropdownMenu();

        // Click on the "Logout" option
        accountManagementPage.clickLogoutOption();
        Assert.assertTrue(accountManagementPage.isButtonDisplayed());

    }

}
