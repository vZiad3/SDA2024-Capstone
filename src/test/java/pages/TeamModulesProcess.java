package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeamModulesProcess {


    public TeamModulesProcess(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
