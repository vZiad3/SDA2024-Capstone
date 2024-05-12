package tests.RemoteUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RemoteUnitsPage;
import utilities.Driver;

public class US_0012 {

    HomePage homePage;
    RemoteUnitsPage remoteUnitsPage;

    @Test
    public void TC0012_01() {
        // User should be able to edit a unit in the Remote Units module
        homePage = new HomePage();
        remoteUnitsPage =new RemoteUnitsPage();
        //Click on "Remote Units" icon on the side menu.
        homePage.remoteUnitClick();
        //Verify that the message "New department successfully created" is displayed.
        Assert.assertTrue(remoteUnitsPage.editRemoteUnit());
        Driver.tearDown();
    }

    @Test
    public void TC0012_02() {
        // User should be able to edit a unit in the Remote Units module
        homePage = new HomePage();
        remoteUnitsPage =new RemoteUnitsPage();
        //Click on "Remote Units" icon on the side menu.
        homePage.remoteUnitClick();
        //Verify that the message "New department successfully created" is displayed.
        Assert.assertEquals(remoteUnitsPage.deleteRemoteUnit(),"Departments");
        Driver.tearDown();
    }
}
