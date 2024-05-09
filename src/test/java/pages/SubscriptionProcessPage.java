
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.TestBase;

import java.util.List;

public class SubscriptionProcessPage {

    public SubscriptionProcessPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//div[@class='mb-5']//div[@class='col']")
    public WebElement titleMepership;

    @FindBy(xpath = "//div[@class='card-body p -3']")
    public List<WebElement> mepershipDiv;

    @FindBy(xpath = "//h5[@class='card-title']")
    public WebElement mepershipInfo;



    public void mepershipOne(){
        mepershipDiv.get(0).click();
    }

}