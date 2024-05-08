package tests.companyProcess;

import com.github.javafaker.Space;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Company;
import utilities.TestBase;

import java.time.Duration;

public class US0006 extends TestBase {
    Company company = new Company();
    By collField = By.xpath("//div[@id='divCollapseUncollapse']");
    By companyButtonField = By.xpath("//li[@class='list-group-item'][@id='link4']");
    By editButtonField = By.xpath("//button[@class='btn btn-outline-dark'][contains(text(),' Edit')]");
    By nameField = By.id("name");



    @BeforeTest
            public void collapse() {
        WebElement Coll = driver.findElement(collField);
        Coll.click();
          // company.companyButton.click();
       WebElement companyButton = driver.findElement(companyButtonField);
       companyButton.click();

    }


    @Test
    public void updateName() throws InterruptedException {

//        company.collapse.click();
        WebElement editButton = driver.findElement(editButtonField);
        editButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        company.name.click();
        WebElement name = driver.findElement(nameField);
        name.click();
        name.sendKeys(Keys.DELETE);
    }

}
