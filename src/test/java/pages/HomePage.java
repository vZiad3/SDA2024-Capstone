package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    LogInPage log = new LogInPage();


    @FindBy(id = "link6")
    public WebElement remoteUnitIcon ;

    @FindBy(xpath = "//li[@class='list-group-item'][@id='link4']")

    public WebElement companyButton;

    public void remoteUnitClick()
    {
        log.defaultLogin();
        //Click on "Remote Units" icon on the side menu.
        remoteUnitIcon.click();
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

    public void companyClick(){
       // log.defaultLogin();
        //Click on "Company" icon on the side menu.
        companyButton.click();
    }

}
