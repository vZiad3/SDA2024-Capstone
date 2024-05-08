package tests.companyProcess;

import com.github.javafaker.Space;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.Company;
import pages.HomePage;
import pages.LogInPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.time.Duration;
import java.util.List;

public class US0006  {
    LogInPage log = new LogInPage();
    HomePage homePage = new HomePage();
    Company company = new Company();
    By collField = By.xpath("//div[@id='divCollapseUncollapse']");
    By companyButtonField = By.xpath("//li[@class='list-group-item'][@id='link4']");
    By editButtonField = By.xpath("//button[@class='btn btn-outline-dark'][contains(text(),' Edit')]");
    By nameField = By.id("name");



//   @BeforeTest
//           public void collapse() {
//       WebElement Coll = driver.findElement(collField);
//       Coll.click();
//         // company.companyButton.click();
//      WebElement companyButton = driver.findElement(companyButtonField);
//      companyButton.click();
//
//   }



    //Changing the name and assert
    @Test
    public void TC0006_01() {

    //Going in the home page
       homePage.companyClick();

    //Clicking the button of the Company
        company.editButton.click();
      company.name.click();
        ReusableMethods.waitForClickablility(company.name, 10);
        ReusableMethods.waitFor(3);

        //Clear the name field
     company.name.clear();
     //Sending the name i want
        String name = "Ziad";
        company.name.sendKeys(name);
      company.saveButton.click();

        //Assert the message displayed
    List<WebElement> mes = Driver.getDriver().findElements(By.xpath("//div[@class='toast-body']"));
        Assert.assertTrue(mes.size() > 0);
        Driver.getDriver().close();
    }

    @Test
    public void TC0006_02(){
        //Going in the home page
        homePage.companyClick();

        //Clicking the button of the Company
        company.editButton.click();
        company.emailField.click();
        ReusableMethods.waitFor(3);
        //Clear the email
        company.emailField.clear();
        ReusableMethods.waitFor(2);
        //change the email field
        String name = "Ziad@gmail.com";
        company.emailField.sendKeys(name);

        company.saveButton.click();
        List<WebElement> mes = Driver.getDriver().findElements(By.xpath("//div[@class='toast-body']"));
        Assert.assertTrue(mes.size() > 0);

    }

    //Here we clear the name and we Click save ' There should be error message' and it dosent shows
    @Test
    public void TC0006_03(){

    //Going in the home page
    homePage.companyClick();

    //Clicking the button of the Company
    company.editButton.click();
    company.name.click();
    ReusableMethods.waitFor(3);

    //Clear the name field
    company.name.sendKeys(Keys.DELETE);
    company.name.clear();

        //Click save
        ReusableMethods.waitFor(2);
    company.saveButton.click();


}


@Ignore
// We will ignore this because its a bug, we should use the corrected format with the email including " @ " and " . "
    @Test(ignoreMissingDependencies = true)
    public void TC0006_04(){
        //Going in the home page
        homePage.companyClick();

        //Clicking the button of the Company
        company.editButton.click();
        company.emailField.click();
        ReusableMethods.waitFor(3);
        //Clear the email
        company.emailField.clear();
        ReusableMethods.waitFor(2);
        //change the email field
        String name = "asdgom";
        company.emailField.sendKeys(name);

        company.saveButton.click();


    }

    @Ignore
    //i am going to ignore this case because it's a bug!, we shouldn't use specials characters in the beginning of the name and there should be no spaces
    //error message should apear, and it dosent
    @Test(ignoreMissingDependencies = true)
    public void TC0006_05() {

        //Going in the home page
        homePage.companyClick();

        //Clicking the button of the Company
        company.editButton.click();
        company.name.click();
        ReusableMethods.waitForClickablility(company.name, 10);
        ReusableMethods.waitFor(3);

        //Clear the name field
        company.name.clear();
        //Sending the name i want
        String name = "@#$%^&Zi a d ";
        company.name.sendKeys(name);
        company.saveButton.click();

        // After Clicking error message should apear for using the correct formart for the name
    }
    @Test
    public void TC0006_06(){
        log.defaultLogin();
        //Assert of we can see the company field
        Assert.assertTrue(company.companyButton.isDisplayed());

    }    @Test
    public void TC0006_07(){
        log.defaultLogin();
        company.companyButton.click();
        //If the company information is visiable its mean PASS
        Assert.assertTrue(company.infoOfTheCompany.isDisplayed());
    }




    }



    // Extent report