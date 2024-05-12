package tests.RemoteUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RemoteUnitsPage;

public class US_0010 {

    HomePage homePage = new HomePage();
    RemoteUnitsPage remoteUnitsPage =new RemoteUnitsPage();

  /*  @BeforeSuite
    public void beforeClass() {
        Driver.getDriver().get(ConfigReader.getProperty("website"));
       String username= ConfigReader.getProperty("email3");
       String password= ConfigReader.getProperty("password3");
        log.login(username, password);
    }*/

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
