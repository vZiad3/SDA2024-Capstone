package tests.departmentProcess;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DepartmentsPage;
import pages.HomePage;
import utilities.Driver;

public class US0008{


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
    public void TC000801(){

        homePage.deptP();
        departmentsPage.AddB.click();

        departmentsPage.DeptName.sendKeys("This is for 000801");

        departmentsPage.CHdeptType.click();
        Actions act = new Actions(Driver.getDriver());
        act.sendKeys(Keys.ENTER).perform();

        departmentsPage.SaveButton.click();

        Assert.assertTrue(departmentsPage.SucAlert.size() > 0);

    }

    @Test
    public void TC000803(){


        homePage.deptP();

//        //to locate the add new dept button
//        //to click add new dept button
        departmentsPage.AddNewDept.click();


//        //to locate the name text box
//        //to type in the dept text box
        departmentsPage.DeptName.sendKeys("This is for 000802 Shouldnt be created");

//        //to find the save button
//        //to click add new dept button
        departmentsPage.SaveButton.click();


//        // to find the alert by text and put it in a list for asserting by size
//        //To assert "New department successfully created"
        Assert.assertTrue(departmentsPage.Typealert.isDisplayed());

    }
}
