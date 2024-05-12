package tests.teamsModulesProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class US0014 extends TestBase  {
    @Test
    public void TC0014_01(){
        //User can edit the teams displayed in the Teams module.
        //Steps
        //Navigate to the Teams module
        //Select the team to be edited.
        //Click on the "Edit team" button for the selected team.
        //Modify the Department name and Department type fields as needed.
        //Save changes

        WebElement teamButton = driver.findElement(By.id("link7"));
        teamButton.click();

        WebElement team = driver.findElement(By.xpath("//*[@id='MainContent']/div/div[3]/div/div[1]/div/div/p/div[1]/div[2]/a"));
        team.click();

        WebElement editBtn = driver.findElement(By.xpath("//*[@id='MainContent']/div[1]/div/a/button"));
        editBtn.click();

        WebElement teamNameField = driver.findElement(By.id("name"));
        teamNameField.sendKeys(Keys.CLEAR);
        teamNameField.sendKeys("EditTest");

        WebElement departmentType = driver.findElement(By.xpath("//*[@id='MainContent']/div/div/div/div/div[2]/div[2]/div[3]/div/div"));
        departmentType.click();

        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.ARROW_DOWN).perform();

        actions.sendKeys(Keys.ENTER).perform();

        WebElement SaveButton = driver.findElement(By.xpath("//*[@id='MainContent']/div/div/div/div/div[2]/div[5]/div/span/div/button[1]"));
        SaveButton.click();


        // to find the alert by text and put it in a list for asserting by size
        List<WebElement> Alert = driver.findElements(By.xpath("//*[text()='Changes successfully saved']"));
        //To assert "Changes successfully saved"
        Assert.assertTrue(Alert.size() > 0);




    }
    @Test
    public void TC0014_02(){
        //User can delete Team
        //Navigate to the Teams module
        //Select the team to be deleted.
        //Click on the "Edit team" button for the selected team.
        //click on the "delete department" button
        //Confirm the deletion

        WebElement teamButton = driver.findElement(By.id("link7"));
        teamButton.click();

        WebElement team = driver.findElement(By.xpath("//*[@id='MainContent']/div/div[3]/div/div[1]/div/div/p/div[1]/div[2]/a"));
        team.click();


        WebElement editBtn = driver.findElement(By.xpath("//*[@id='MainContent']/div[1]/div/a/button"));
        editBtn.click();

        WebElement deleteBtn = driver.findElement(By.xpath("//*[@id='MainContent']/div/div[2]/div/button"));
        deleteBtn.click();


        WebElement confirmButton = driver.findElement(By.xpath("//button[.='Confirm']"));
        confirmButton.click();



    }
}
