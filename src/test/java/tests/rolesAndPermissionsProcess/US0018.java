package tests.rolesAndPermissionsProcess;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.RolesAndPermissionsPage;

public class US0018 {
    HomePage homePage = new HomePage();
    RolesAndPermissionsPage rolesAndPermissionsPage = new RolesAndPermissionsPage();

    @Test
    public void TC01() {

        homePage.roleClick();
        rolesAndPermissionsPage.printAllRoles();

    }
}