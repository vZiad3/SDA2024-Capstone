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
    @FindBy(id = "link9")
    private WebElement rolesicon;

    @FindBy(id = "link10")
    private WebElement permissionIcon;

    public void remoteUnitClick()
    {
        log.defaultLogin();
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

}
