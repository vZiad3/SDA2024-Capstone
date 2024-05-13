package tests.AccessAccountManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AccessAccountManagementPage;
import pages.LogInPage;
import utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

public class US0003 {
    LogInPage logeIn ;
    @Test
    public void TC01() {
        logeIn = new LogInPage();
        AccessAccountManagementPage accountManagementPage = new AccessAccountManagementPage(Driver.getDriver());
        PageFactory.initElements(Driver.getDriver(), accountManagementPage);
        logeIn.defaultLogin();

        accountManagementPage.clickDropdownMenu();

        // Verify that the drop-down menu expands
        Assert.assertTrue(accountManagementPage.isExpandedDropdownDisplayed());

        // Verify that the username and role are displayed at the top of the expanded drop-down menu
        Assert.assertTrue(accountManagementPage.isUsernameAndRoleDisplayed());
        Driver.tearDown();
    }

    @Test
    public void TC02() {
        logeIn = new LogInPage();
        AccessAccountManagementPage accountManagementPage = new AccessAccountManagementPage(Driver.getDriver());
        PageFactory.initElements(Driver.getDriver(), accountManagementPage);
        logeIn.defaultLogin();

        String currentUrl = Driver.getDriver().getCurrentUrl();

        String expectedHomePageUrl = "https://qa-gm3.quaspareparts.com/a3m/?errorMessage=%5Bauthorization_request_not_found%5D%20";
        // Verify that the user is redirected to the home page
        Assert.assertEquals(currentUrl, expectedHomePageUrl);

        accountManagementPage.clickDropdownMenu();
        // Verify that the drop-down menu expands
        Assert.assertTrue(accountManagementPage.isExpandedDropdownDisplayed());

        // Verify that the appropriate menu options are displayed within the drop-down menu
        Assert.assertTrue(accountManagementPage.isMySubscriptionsOptionDisplayed());
        Assert.assertTrue(accountManagementPage.isMyMembershipsOptionDisplayed());
        Assert.assertTrue(accountManagementPage.isLogoutOptionDisplay());


        // Click on the "My Memberships" option
        accountManagementPage.clickMyMembershipsOption();
        WebElement Membership = Driver.getDriver().findElement(By.xpath("//h3[.='My Memberships']"));
        // Assert that a My Memberships page is opened
        Assert.assertTrue(Membership.isDisplayed());

        Driver.getDriver().navigate().back();
        accountManagementPage.clickDropdownMenu();

        // Click on the "Logout" option
        accountManagementPage.clickLogoutOption();

        // Assert that a Logout page is opened
        Assert.assertTrue(accountManagementPage.isButtonDisplayed());

        Driver.tearDown();
    }
}


