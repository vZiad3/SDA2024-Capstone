package tests.RemoteUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RemoteUnitsPage;
import utilities.Driver;

public class US_0010 {

    HomePage homePage;
    RemoteUnitsPage remoteUnitsPage;

    @Test
    public void TC0010_01()  {
        // Test Objective: User should be able to see the remote units

        //Click on "Remote Units" icon on the side menu.
        homePage = new HomePage();
        remoteUnitsPage =new RemoteUnitsPage();
        //Click on "Remote Units" icon on the side menu.
        homePage.remoteUnitClick();
        //Verify that the Remote Units page is displayed.
       Assert.assertTrue(remoteUnitsPage.remoteUnitDisplayed());
       Driver.tearDown();

    }

    @Test
    public void TC0010_02() {
        // Test Objective: User should be able to see the remote

        //Click on "Remote Units" icon on the side menu.
        homePage = new HomePage();
        remoteUnitsPage =new RemoteUnitsPage();
        //Click on "Remote Units" icon on the side menu.
        homePage.remoteUnitClick();
        //Verify that the Remote Units page is displayed.
        Assert.assertTrue(remoteUnitsPage.remoteUnitDisplayed());
        //Verify that at least one remote unit is displayed.
        Assert.assertTrue(remoteUnitsPage.remoteUnitCount()>0);
        Driver.tearDown();

    }

    public void main(){
        homePage = new HomePage();
        remoteUnitsPage =new RemoteUnitsPage();
        //Click on "Remote Units" icon on the side menu.
        homePage.remoteUnitClick();
    }

}
