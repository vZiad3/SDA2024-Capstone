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

public class US0009{


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
    public void TC000901() throws InterruptedException {
        //-----------------------------------
        //Edit the department Name and Type
        //-----------------------------------
        Actions act = new Actions(Driver.getDriver());


        //to open the dept page
        homePage.deptP();

        // to locate the dept and click on it
        departmentsPage.US0009Dept.click();

        //to refresh the page (bug)
        Driver.getDriver().navigate().refresh();


        Thread.sleep(2000);

        //to click on edit profile
        departmentsPage.EditProf.click();

        //to refresh the page (bug)
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().refresh();


        Thread.sleep(2000);

        //to change the name of the dept
        departmentsPage.CHdeptName.click();
        departmentsPage.CHdeptName.clear();
        departmentsPage.CHdeptName.sendKeys("blahblahUS0009");


        Thread.sleep(2000);

        //to change the type of dept
        //from dept to team
        departmentsPage.CHdeptType.click();
        act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();


        Thread.sleep(2000);


        //to save the new name
        //departmentsPage.SaveButton.click();

        //to cancel the edit
        departmentsPage.CancelButton.click();


    }


    @Test
    public void TC000902() throws InterruptedException {


        //to open the dept page
        homePage.deptP();

        // to locate the dept and click on it
        departmentsPage.US0009Dept.click();

        //to refresh the page (bug)
        Driver.getDriver().navigate().refresh();

        Thread.sleep(2000);

        //to click on edit profile
        departmentsPage.EditProf.click();

        //to refresh the page (bug)
        Driver.getDriver().navigate().refresh();


        Thread.sleep(1000);

        //to change the name of the dept
        departmentsPage.CHdeptName.click();

        Thread.sleep(500);

        departmentsPage.CHdeptName.clear();
        departmentsPage.CHdeptName.sendKeys("blahblahUS0009 Only name");


        Thread.sleep(2000);


        //to save the new name
        //departmentsPage.SaveButton.click();

        //to cancel the edit
        departmentsPage.CancelButton.click();


    }


    @Test
    public void TC000903() throws InterruptedException {


        Actions act = new Actions(Driver.getDriver());


        //to open the dept page
        homePage.deptP();

        // to locate the dept and click on it
        departmentsPage.US0009Dept.click();

        //to refresh the page (bug)
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().refresh();


        Thread.sleep(2000);

        //to click on edit profile
        departmentsPage.EditProf.click();

        //to refresh the page (bug)
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().refresh();


        Thread.sleep(2000);

        //to change the type of dept
        //from dept to team
        departmentsPage.CHdeptType.click();
        act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();


        Thread.sleep(2000);


        //to save the new name
        //departmentsPage.SaveButton.click();

        //to cancel the edit
        departmentsPage.CancelButton.click();


    }


    @Test
    public void TC000905() throws InterruptedException {


        Actions act = new Actions(Driver.getDriver());

        //to open the dept page
        homePage.deptP();

        // to locate the dept and click on it
        departmentsPage.US0009Dept.click();

        //to refresh the page (bug)
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().refresh();


        Thread.sleep(2000);

        //to click on edit profile
        departmentsPage.EditProf.click();

        //to refresh the page (bug)
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().refresh();


        Thread.sleep(2000);

        //to change the type of dept
        //from dept to team
        departmentsPage.CHdeptType.click();

        act.sendKeys(Keys.DELETE).perform();
                //.sendKeys(Keys.ENTER);

        //to save the new name
        departmentsPage.SaveButton.click();

        //to cancel the edit
        //departmentsPage.CancelButton.click();

        Assert.assertTrue(departmentsPage.NoTypeErrorMassage.isDisplayed());

    }



    @Test
    public void TC000906() throws InterruptedException {




        //to open the dept page
        homePage.deptP();

        // to locate the dept and click on it
        departmentsPage.US0009Dept.click();

        //to refresh the page (bug)
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().refresh();


        Thread.sleep(2000);

        //to click on edit profile
        departmentsPage.EditProf.click();

        //to refresh the page (bug)
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().refresh();


        Thread.sleep(2000);

        //to find the delete button
        departmentsPage.DeleteButton.click();

        //to confirm the delete button
        //departmentsPage.ConfirmDeleteButton.click();

        //to cancel the delete button
        departmentsPage.CancelDeleteButton.click();



    }

}
