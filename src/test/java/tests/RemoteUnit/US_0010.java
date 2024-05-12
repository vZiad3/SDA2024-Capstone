package tests.RemoteUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.RemoteUnitsPage;
import utilities.Driver;

public class US_0010 {

    HomePage homePage = new HomePage();
    RemoteUnitsPage remoteUnitsPage =new RemoteUnitsPage();


    @Test
    public void TC0010_01() {
        // Test Objective: User should be able to see the remote units

        homePage.remoteUnitClick();
        //Verify that the Remote Units page is displayed.
       Assert.assertTrue(remoteUnitsPage.remoteUnitDisplayed());

    }

    @Test
    public void TC0010_02() {
        // Test Objective: User should be able to see the remote units
        homePage.remoteUnitClick();
        //Verify that the Remote Units page is displayed.
        Assert.assertTrue(remoteUnitsPage.remoteUnitDisplayed());
        //Verify that at least one remote unit is displayed.
       // Assert.assertTrue(remoteUnitsPage.remoteUnitCount()>1);


    }

}
