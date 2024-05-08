package tests.departmentProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.TestBase;

public class US0007 extends TestBase {


    @BeforeTest
        public void Dept(){


        WebElement Coll = driver.findElement(By.xpath("//div[@id='divCollapseUncollapse']"));

        Coll.click();

        WebElement DeptP = driver.findElement(By.xpath("(//a[normalize-space()='Departments'])[1]"));

        DeptP.click();


    }


    @Test
    public void TC000701(){


        WebElement DeptCard = driver.findElement(By.xpath("//*[@class=\"card-body p-3\"]"));

        Assert.assertTrue(DeptCard.isDisplayed());

        }


    @Test
    public void TC000702(){


        //WebElement DeptCardC = driver.findElement(By.xpath("//*[@href=\"#/department/1/366\"]"));
        WebElement DeptCardC = driver.findElement(By.linkText("DoNotDelete"));

        DeptCardC.click();

        WebElement AuthRoles = driver.findElement(By.xpath("//span[@class='roles-box p-2 me-2']"));

        Assert.assertTrue(AuthRoles.isDisplayed());

    }



    @Test
    public void TC000703() throws InterruptedException {

        WebElement EPbtn = driver.findElement(By.xpath("//button[normalize-space()='Edit Department']"));

        EPbtn.click();

        driver.navigate().refresh();




    }


}

