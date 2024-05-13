//package tests.teamsModulesProcess;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.util.List;
//
//
//
//public class US0013 extends TestBase {
//
//
//    @Test
//    public void TC0013_01(){
//        // User should be able to view and click on teams
//        // Navigate to the Teams module.
//        // Observe the list of teams displayed.
//        // Click on a team.
//
//        WebElement teamButton = driver.findElement(By.id("link7"));
//        teamButton.click();
//
//    }
//
//    @Test
//    public void TC0013_02() throws InterruptedException {
//        // User can add New Team
//        // Steps
//        // Navigate to the Teams module.
//        // Click on the "Add New Team" button
//        // Fill in the required information for the new team
//        // Save the form.
//
//        WebElement teamButton = driver.findElement(By.id("link7"));
//        teamButton.click();
//
//        WebElement addButton = driver.findElement(By.xpath("//*[@id='MainContent']/div/div[1]/div[2]/a/button"));
//        addButton.click();
//
//        WebElement teamNameField = driver.findElement(By.id("name"));
//        teamNameField.sendKeys("Test Team 1");
//
//        WebElement departmentType = driver.findElement(By.xpath("//*[@id='MainContent']/div/div/div/div/div[2]/div[2]/div[3]/div/div"));
//        departmentType.click();
//
//        Actions actions = new Actions(driver);
//
//        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
//
//        actions.sendKeys(Keys.ENTER).perform();
//
//        WebElement SaveButton = driver.findElement(By.xpath("//*[@id='MainContent']/div/div/div/div/div[2]/div[5]/div/span/div/button[1]"));
//        SaveButton.click();
//
//
//
//        // to find the alert by text and put it in a list for asserting by size
//        List<WebElement> SucAlert = driver.findElements(By.xpath("//*[text()='New department successfully created']"));
//        //To assert "New department successfully created"
//        Assert.assertTrue(SucAlert.size() > 0);
//    }
//
//    @Test
//    public void TC0013_03() {
//        // User cannot add a team without a name
//        // Steps
//        // Navigate to the Teams module
//        // Click on the "Add New Team" button.
//        // Do not fill in the Team Name field
//        // Choose type
//        // Save form
//
//        WebElement teamButton = driver.findElement(By.id("link7"));
//        teamButton.click();
//
//        WebElement addButton = driver.findElement(By.xpath("//*[@id='MainContent']/div/div[1]/div[2]/a/button"));
//        addButton.click();
//
//        //  WebElement teamNameField = driver.findElement(By.id("name"));
//        // teamNameField.sendKeys("Test Team 1");
//
//        WebElement departmentType = driver.findElement(By.xpath("//*[@id='MainContent']/div/div/div/div/div[2]/div[2]/div[3]/div/div"));
//        departmentType.click();
//
//        Actions actions = new Actions(driver);
//
//        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
//
//        actions.sendKeys(Keys.ENTER).perform();
//
//        WebElement SaveButton = driver.findElement(By.xpath("//*[@id='MainContent']/div/div/div/div/div[2]/div[5]/div/span/div/button[1]"));
//        SaveButton.click();
//
//        WebElement errorMsg = driver.findElement(By.xpath("//*[@id='MainContent']/div/div/div/div/div[2]/div[2]/div[1]/span"));
//        Assert.assertTrue(errorMsg.isDisplayed(), "error Msg is not displayed");
//
//    }
//
//    @Test
//    public void TC0013_04(){
//        // User cannot add a team without a type
//        // Steps
//        // Navigate to the Teams module
//        // Click on the "Add New Team" button.
//        // Do not choose a type
//        // Fill the name
//        // Save form
//
//        WebElement teamButton = driver.findElement(By.id("link7"));
//        teamButton.click();
//
//        WebElement addButton = driver.findElement(By.xpath("//*[@id='MainContent']/div/div[1]/div[2]/a/button"));
//        addButton.click();
//
//        WebElement teamNameField = driver.findElement(By.id("name"));
//        teamNameField.sendKeys("Test Team 1");
//
//
//        WebElement SaveButton = driver.findElement(By.xpath("//*[@id='MainContent']/div/div/div/div/div[2]/div[5]/div/span/div/button[1]"));
//        SaveButton.click();
//
//        WebElement ErrorMsg = driver.findElement(By.xpath("//*[@id='MainContent']/div/div/div/div/div[2]/div[2]/div[3]/span"));
//        Assert.assertTrue(ErrorMsg.isDisplayed(), "Element is not displayed");
//
//    }
//}
