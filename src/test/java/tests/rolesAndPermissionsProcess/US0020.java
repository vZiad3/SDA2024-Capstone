package tests.rolesAndPermissionsProcess;


import org.testng.annotations.Test;
import pages.HomePage;
import pages.RolesAndPermissionsPage;

public class US0020  {
    HomePage homePage = new HomePage();
    RolesAndPermissionsPage rolesAndPermissionsPage = new RolesAndPermissionsPage();

    @Test
    public void TC03() throws InterruptedException {
       // HomePage homePage = new HomePage();
       // RolesAndPermissionsPage rolesAndPermissionsPage = new RolesAndPermissionsPage();
        homePage.permissionIconClick();
        rolesAndPermissionsPage.displayPermissions();

    }

    @Test
    public void TC04() throws InterruptedException {
        //HomePage homePage = new HomePage();
        //RolesAndPermissionsPage rolesAndPermissionsPage = new RolesAndPermissionsPage();
        homePage.permissionIconClick();
        rolesAndPermissionsPage.verifyAllPermissionsPresent();

    }
}