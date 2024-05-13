package tests.departmentProcess;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.DepartmentsPage;
import pages.HomePage;
import utilities.Driver;

public class US0007 {


    HomePage homePage;
    DepartmentsPage departmentsPage;

    @BeforeMethod
    public void setUp(){

        homePage = new HomePage();
        departmentsPage = new DepartmentsPage();

    }

    @AfterMethod
    public void tearDown(){

        Driver.tearDown();

    }


    @Test
    public void TC000701(){

//        homePage = new HomePage();
//        departmentsPage = new DepartmentsPage();


        homePage.deptP();
        Assert.assertTrue(departmentsPage.DeptCard.isDisplayed());


    }


    @Test
    public void TC000702(){



        homePage.deptP();
        departmentsPage.DeptCardC.click();
        Assert.assertTrue(departmentsPage.AuthRoles.isDisplayed());

//        Driver.tearDown();

    }



    @Test
    public void TC000703(){

//        homePage = new HomePage();
//        departmentsPage = new DepartmentsPage();

        homePage.deptP();
        departmentsPage.DeptCardC.click();
        departmentsPage.EPbtn.click();
        Driver.getDriver().navigate().refresh();

//        Driver.tearDown();
    }


}

