package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    LogInPage log;


    @FindBy(id = "link6")
    public WebElement remoteUnitIcon ;
    @FindBy(id = "link9")
    private WebElement rolesicon;

    @FindBy(id = "link10")
    private WebElement permissionIcon;

    @FindBy(xpath = "//li[@class='list-group-item'][@id='link4']")

    public WebElement companyButton;

    public void remoteUnitClick() {
           log = new LogInPage();
           log.defaultLogin();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Click on "Remote Units" icon on the side menu.
        remoteUnitIcon.click();

    }
    public void roleClick()
    {
        log.defaultLogin();
        //Click on "Remote Units" icon on the side menu.
        rolesicon.click();
    }

    public void permissionIconClick()
    {
        log.defaultLogin();
        //Click on "Remote Units" icon on the side menu.
        permissionIcon.click();
    }

    @FindBy(xpath = "//*[@class='list-group-item'][@id='link5']")
    public WebElement DeptP;

//-----------------------------------------------
    //Department page
//-----------------------------------------------
    public void deptP()
    {

        log.defaultLogin();
        //Click on "Departments" icon on the side menu.
        DeptP.click();
    }
// team
    @FindBy(xpath = "//*[@class='list-group-item'][@id='link7']")
    public WebElement TeammP;



    public void companyClick(){
       // log.defaultLogin();
        //Click on "Company" icon on the side menu.
        companyButton.click();
    }

<<<<<<< HEAD
=======

>>>>>>> 6763d5b7ec4750f844cfa3c62d21cb5d24059abe
    public void teammp()
    {

        log.defaultLogin();
        //Click on "Departments" icon on the side menu.
        TeammP.click();
    }

}
