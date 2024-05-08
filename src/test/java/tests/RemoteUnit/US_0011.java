package tests.RemoteUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RemoteUnitsPage;

public class US_0011 {

    HomePage homePage= new HomePage();
    RemoteUnitsPage remoteUnitsPage =new RemoteUnitsPage();
    @Test
    public void TC0011_01() {
        // Users should be able to add a new unit in the Remote Units module
        //Click on "Remote Units" icon on the side menu.
        homePage.remoteUnitClick();


        //Click the "Add New Remote Unit" button.
        //Enter a name in the field.
        //Enter a short name in the field.
        //Select the department type from the dropdown menu.
        //Enter a description in the field.
        //Select roles from the dropdown menu.
        //Click the "Save" button.
        //Verify that the message "New department successfully created" is displayed.


    }
}
