package tests.departmentProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.TestBase;

public class US0008 extends TestBase {


    @BeforeTest
    public void Dept(){


        WebElement Coll = driver.findElement(By.xpath("//div[@id='divCollapseUncollapse']"));

        Coll.click();

        WebElement DeptP = driver.findElement(By.xpath("(//a[normalize-space()='Departments'])[1]"));

        DeptP.click();


    }

    @Test
    public void TC000801(){


        //to locate the add new dept button
        WebElement AddB = driver.findElement(By.xpath("//button[text()=' Add New ']"));
        //to click add new dept button
        AddB.click();


        //to locate the name text box
        WebElement DeptName = driver.findElement(By.id("name"));
        //to type in the dept text box
        DeptName.sendKeys("This is for 000801");

        WebElement departmentType = driver.findElement(By.xpath("//*[@id='MainContent']/div/div/div/div/div[2]/div[2]/div[3]/div/div"));
        departmentType.click();

        Actions actions = new Actions(driver);

        // Simulate pressing the down arrow key twice to navigate down in the dropdown
        actions.sendKeys(Keys.ENTER).perform();




        // css-19bb58m

        //to click add new dept button



        //DeptType.click();



    }
}
