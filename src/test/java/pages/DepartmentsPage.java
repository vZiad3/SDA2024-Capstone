package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DepartmentsPage {


    public DepartmentsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@class=\"card-body p-3\"]")
    public WebElement DeptCard;


    @FindBy(linkText = "DoNotDelete")
    public WebElement DeptCardC;


    @FindBy(xpath = "//span[@class='roles-box p-2 me-2']")
    public WebElement AuthRoles;


    @FindBy(xpath = "//button[normalize-space()='Edit Department']")
    public WebElement EPbtn;


    @FindBy(xpath = "//button[text()=' Add New ']")
    public WebElement AddB;


    @FindBy(id = "name")
    public WebElement DeptName;


    @FindBy(xpath = "//button[text()='Save']")
    public WebElement SaveButton;


    @FindBy(xpath = "//button[text()='Cancel']")
    public WebElement CancelButton;


    @FindBy(xpath = "//*[text()='New department successfully created']")
    public List<WebElement> SucAlert;


    @FindBy(xpath = "//button[text()=' Add New ']")
    public WebElement AddNewDept;


    @FindBy(xpath = "//*[text()='Please select a type for department']")
    public WebElement Typealert;


    @FindBy(xpath = "//b[text()='DoNotDelete']")
    public WebElement US0009Dept;

    @FindBy(xpath = "//button[text()=' Edit ']")
    public WebElement EditProf;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement CHdeptName;


    @FindBy(xpath = "//*[@id='MainContent']/div/div/div/div/div[2]/div[2]/div[3]/div/div")
    public WebElement CHdeptType;

    @FindBy(xpath = "//button[@class='btn btn-danger text-light fw-bold float-end']")
    public WebElement DeleteButton;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement CancelDeleteButton;

    @FindBy(xpath = "//button[@class='btn btn-danger']")
    public WebElement ConfirmDeleteButton;

    @FindBy(xpath = "//*[@class='text-danger']")
    public WebElement NoTypeErrorMassage;




}
