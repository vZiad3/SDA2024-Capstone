package tests.rolesAndPermissionsProcess;


import org.testng.annotations.Test;
import pages.HomePage;
import pages.RolesAndPermissionsPage;

public class US0020  {
    HomePage homePage = new HomePage();
    RolesAndPermissionsPage rolesAndPermissionsPage = new RolesAndPermissionsPage();

    @Test
    public void TC03() throws InterruptedException {
        homePage.permissionIconClick();
        rolesAndPermissionsPage.displayPermissions();

    }

    @Test
    public void TC04() throws InterruptedException {
        homePage.permissionIconClick();
        rolesAndPermissionsPage.verifyAllPermissionsPresent();

    }
}