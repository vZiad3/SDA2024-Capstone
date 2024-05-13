
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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


    @FindBy(xpath = "//*[@id='MainContent']/div/div[1]/div/h3")
    public WebElement mepershipTitle;



    @FindBy(xpath = "(//a[normalize-space()='My Memberships'])[1]")
    public WebElement mempershipslider;


    public void mepershipOne(){
        mepershipDiv.get(0).click();
    }

    public void clickmempershipclick() {
        // Click on the slider button.
        mempershipslider.click();
    }

}