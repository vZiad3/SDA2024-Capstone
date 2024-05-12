package utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestBase {

    protected static WebDriver driver;


    @BeforeSuite

    public void BeforeSuite() {
        {
            driver = new ChromeDriver();
            //driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().window().maximize();

            //Go to URL: https://qa-gm3.quaspareparts.com/
            driver.get("https://qa-gm3.quaspareparts.com/");

            // Find the login button element using the XPath expression
            WebElement loginButton = driver.findElement(By.xpath("//html/body/div/a"));
            // Click on the login button
            loginButton.click();

            // Enter a valid email address
            WebElement emailField = driver.findElement(By.id("username"));
            emailField.sendKeys("cstm@testevolve.com");

            // Enter a valid password
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("CvdPixvARzUrmuR");

            // Click on the "SignIn" button
            WebElement SignIn = driver.findElement(By.xpath("//button[@type='submit']"));
            SignIn.click();

        }

  /*  @AfterMethod
    public void afterMethod(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
*/
    }
    //@AfterMethod
    //public void afterMethod(){
    //    if(driver != null){
    //        driver.quit();
    //        driver = null;
    //    }
    //}

}