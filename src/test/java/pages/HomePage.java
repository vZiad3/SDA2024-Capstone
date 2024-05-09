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

    @FindBy(id = "link2")
    public  WebElement mempership ;

@FindBy(xpath = "//div[@class='col-9']")
public WebElement buttun;
    public void remoteUnitClick()
    {
        log.defaultLogin();
        //Click on "Remote Units" icon on the side menu.
        remoteUnitIcon.click();
    }

    public void mempershipclick()
    {
        log.defaultLogin();
        //Click on "Remote Units" icon on the side menu.
        mempership.click();
    }


}