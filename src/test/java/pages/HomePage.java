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


    @FindBy(id = "link2")
    public  WebElement mempership ;

@FindBy(xpath ="//div[@class='col-9']")
public WebElement buttun;


@FindBy(xpath = "//*[@id='Header']/div/div/div/button")
public WebElement slider;




    public void remoteUnitClick()
    {
        log.defaultLogin();

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

    public void mempershipclick()
    {
        log.defaultLogin();
        //Click on "Mepership" icon on the side menu.
        mempership.click();
    }

    public void clickSliderButton() {
        log.defaultLogin();
        // Click on the slider button.
        slider.click();
    }




}



    public void teammp()
    {

        log.defaultLogin();
        //Click on "Departments" icon on the side menu.
        TeammP.click();
    }


    @FindBy(xpath = "//*[@class='list-group-item'][@id='link7']")
    public WebElement TeammP;

    //-----------------------------------------------
    //Department page
//-----------------------------------------------
//    public void teammp()
//    {
//
//        log.defaultLogin();
//        //Click on "Departments" icon on the side menu.
//        TeammP.click();
//    }

}
