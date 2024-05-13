package tests.RemoteUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RemoteUnitsPage;
import utilities.Driver;

public class US_0011 {



    HomePage homePage;
    RemoteUnitsPage remoteUnitsPage;
    @Test
    public void TC0011_01() {
        // Users should be able to add a new unit in the Remote Units module

        homePage = new HomePage();
        remoteUnitsPage =new RemoteUnitsPage();
        //Click on "Remote Units" icon on the side menu.
        homePage.remoteUnitClick();
        //Verify that the message "New department successfully created" is displayed.
        Assert.assertTrue(remoteUnitsPage.addRemoteUnit());
        Driver.tearDown();
    }

    @Test
    public void TC0011_02() {
        //User should not be able to add a new unit to the Remote Units module without a name.
        homePage = new HomePage();
        remoteUnitsPage =new RemoteUnitsPage();
        //Click on "Remote Units" icon on the side menu.
        homePage.remoteUnitClick();
        //Verify that the message "Please enter a name for department" is displayed.
        Assert.assertEquals(remoteUnitsPage.addRemoteUnitWithoutname(),"Please enter a name for department");
        Driver.tearDown();

    }

    @Test
    public void TC0011_03() {
        //User should not be able to add a new unit to the Remote Units module without a name.

        homePage = new HomePage();
        remoteUnitsPage =new RemoteUnitsPage();
        //Click on "Remote Units" icon on the side menu.
        homePage.remoteUnitClick();
        //Verify that the message "Please enter a name for department" is displayed.
        Assert.assertEquals(remoteUnitsPage.addRemoteUnitWithoutDepartment(),"Please select a type for department");
        Driver.tearDown();

    }
    @Test
    public void TC0011_4() {
        // Users should be able to add a new unit in the Remote Units module
        homePage = new HomePage();
        remoteUnitsPage =new RemoteUnitsPage();
        //Click on "Remote Units" icon on the side menu.
        homePage.remoteUnitClick();
        //Verify that the message "New department successfully created" is displayed.
        Assert.assertTrue(remoteUnitsPage.addChangeRemoteUnit());
        Driver.tearDown();
    }






}
