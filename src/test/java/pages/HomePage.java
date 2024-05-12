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
    ReusableMethods reusableMethods = new ReusableMethods();


    @FindBy(id = "link6")
    public WebElement remoteUnitIcon ;

    public void remoteUnitClick() {
           log = new LogInPage();
           log.defaultLogin();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Click on "Remote Units" icon on the side menu.
        remoteUnitIcon.click();

    }

    public void EnterRemoteUnitClick() {
        log = new LogInPage();
        log.enterLogin();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Click on "Remote Units" icon on the side menu.
        remoteUnitIcon.click();

    }


}
