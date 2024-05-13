package tests.rolesAndPermissionsProcess;


import org.testng.annotations.Test;
import pages.HomePage;
import pages.RolesAndPermissionsPage;
import utilities.Driver;

public class US0020  {

    @Test
    public void TC03() throws InterruptedException {
        HomePage homePage = new HomePage();
        RolesAndPermissionsPage rolesAndPermissionsPage = new RolesAndPermissionsPage();
        homePage.permissionIconClick();
        rolesAndPermissionsPage.displayPermissions();
        Driver.tearDown();

    }

    @Test
    public void TC04() throws InterruptedException {
        HomePage homePage = new HomePage();
        RolesAndPermissionsPage rolesAndPermissionsPage = new RolesAndPermissionsPage();
        homePage.permissionIconClick();
        rolesAndPermissionsPage.verifyAllPermissionsPresent();
        Driver.tearDown();


    }
}