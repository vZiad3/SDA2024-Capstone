package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.*;
import java.util.List;
import java.util.Properties;
import java.util.Random;

public class RemoteUnitsPage {

    public RemoteUnitsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    Faker faker = new Faker();
    String[][] departmentName = {{"Sales","Sa"}, {"Marketing","M"}, {"Human Resources","HR"}
            ,{"Finance","F"}, {"Engineering","E"}, {"Customer Service","CS"}, {"","QA"}};

    // Generate a random index
    Random random = new Random();
    int index = random.nextInt(departmentName.length);

       // System.out.println(departmentName[index][0]+departmentName[index][1] );

    @FindBy(xpath = "//div[@class='row']//div[@class='col-4']//b")
    public List<WebElement> remoteUnitDiv;

    @FindBy(xpath = "//div[@class='col']//button[@class='btn btn-info float-end text-white']")
    public WebElement addRemoteUnitButton;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameField;
    @FindBy(xpath = "//input[@name='short_name']")
    public WebElement shortNameField;

    @FindBy(xpath = "//div[@class=' css-hlgwow']//input[@type='text']")
    public WebElement departmentTypeField;

    @FindBy(xpath = "//input[@id='react-select-3-input']")
    public WebElement rolesField;
    @FindBy(xpath = "//input[@name='description']")
    public WebElement descriptionField;

    @FindBy(xpath = "//div[@role='group']//button[@class='btn btn-info text-white px-3']")
    public WebElement saveRemoteUnitButton;

    @FindBy(xpath = "//span[@class='text-danger']")
    public WebElement errorMessage;

    @FindBy(xpath = "//button[@class='btn btn-info float-end text-white']")
    public WebElement editRemoteUnitButton;
    @FindBy(xpath = "//button[@class='btn btn-danger text-light fw-bold float-end']")
    public WebElement deleteRemoteUnitButton;

    @FindBy(xpath = "//input[@id='search']")
    public WebElement search;

    @FindBy(xpath = "//div[@class='col']//h3")
    public WebElement departmentH;

    @FindBy(xpath = "//div[@class='modal-footer']//button[@class='btn btn-danger']")
    public WebElement confirmButton;





    public Boolean remoteUnitDisplayed() {

        return remoteUnitDiv.get(0).isDisplayed();

    }
    public int remoteUnitCount() {

       return remoteUnitDiv.size();
    }

    public Boolean addRemoteUnit()  {
        //home page
        //Click the "Add New Remote Unit" button.
        addRemoteUnitButton.click();

        //Enter a name in the field.
        nameField.sendKeys(departmentName[index][0]);

        set(departmentName[index][0]);

        //Select the department type from the dropdown menu.
        departmentTypeField.sendKeys("Remote", Keys.ENTER);
        //Enter a description in the field.
        descriptionField.sendKeys(faker.lorem().paragraph());
        //Select roles from the dropdown menu.
        rolesField.sendKeys("Accountant", Keys.ENTER);

        rolesField.sendKeys("Busi", Keys.ENTER);

        //Enter a short name in the field.
        shortNameField.sendKeys(departmentName[index][1]);

        //Click the "Save" button.
        saveRemoteUnitButton.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return Driver.getDriver().getPageSource().contains("New department successfully created");

    }

    public String  addRemoteUnitWithoutname(){
        //Click the "Add New Remote Unit" button.
        addRemoteUnitButton.click();
        //Select the department type from the dropdown menu.
        departmentTypeField.sendKeys("Remote", Keys.ENTER);
        //Click the "Save" button.
        saveRemoteUnitButton.click();

        return errorMessage.getText();
    }

    public String addRemoteUnitWithoutDepartment(){
        //Click the "Add New Remote Unit" button.
        addRemoteUnitButton.click();
        //Enter a name in the field.
        nameField.sendKeys(departmentName[index][0]);
        //Click the "Save" button.
        saveRemoteUnitButton.click();
        return errorMessage.getText();


    }

    public Boolean addChangeRemoteUnit()  {
        //home page
        //Click the "Add New Remote Unit" button.
        addRemoteUnitButton.click();

        //Enter a name in the field.
        nameField.sendKeys(departmentName[index][0]);
        //Select the department type from the dropdown menu.
        departmentTypeField.sendKeys("Remote", Keys.ENTER);

        nameField.clear();
        //Enter a name in the field.
        nameField.sendKeys("Test");
        //Select the department type from the dropdown menu.
        departmentTypeField.sendKeys("Team", Keys.ENTER);

        //Click the "Save" button.
        saveRemoteUnitButton.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return Driver.getDriver().getPageSource().contains("New department successfully created");

    }


    public Boolean editRemoteUnit()  {
        //home page
        //select div
        search.sendKeys(ConfigReader.getProperty("namedePartment"));
        remoteUnitDiv.get(0).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Click the "Edit Remote Units" button.
        editRemoteUnitButton.click();
        //Refreshing or reloading the page,
        Driver.getDriver().navigate().refresh();
        //Edit a name in the field.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        nameField.clear();
        nameField.sendKeys("Test");
        nameField.clear();
        nameField.sendKeys(ConfigReader.getProperty("namedePartment"));


        //Click the "Save" button.
        saveRemoteUnitButton.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return Driver.getDriver().getPageSource().contains("Changes successfully saved");

    }


    public String deleteRemoteUnit()  {
        //home page
        //select div
        search.sendKeys(ConfigReader.getProperty("namedePartment"));
        remoteUnitDiv.get(0).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Click the "Edit Remote Units" button.
        editRemoteUnitButton.click();
        //Refreshing or reloading the page,
        Driver.getDriver().navigate().refresh();
        //Edit a name in the field.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Click the "Delete Department" button.
        deleteRemoteUnitButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Click the "Confirm" button.
        confirmButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Verify delete remote unit.
        System.out.println(departmentH.getText());
        return departmentH.getText();
    }

    public void set(String namedePartment) {
        // Load existing properties
        Properties properties = new Properties();
        try (InputStream inputStream = new FileInputStream("configuration.properties")) {
            properties.load(inputStream);
        } catch (IOException e) {
            System.err.println("Error loading properties from file: " + e.getMessage());
        }

        // Add the new property
        properties.setProperty("namedePartment", namedePartment);

        // Save properties to the file
        try (OutputStream outputStream = new FileOutputStream("configuration.properties")) {
            properties.store(outputStream, null);
            System.out.println("Property added to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing properties to file: " + e.getMessage());
        }
    }
}

