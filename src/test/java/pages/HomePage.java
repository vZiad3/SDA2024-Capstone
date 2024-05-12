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

    public void remoteUnitClick()
    {
        log.defaultLogin();
        //Click on "Remote Units" icon on the side menu.
        remoteUnitIcon.click();
    }

}
