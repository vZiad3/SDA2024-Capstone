package tests.SubscriptionProcess;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SubscriptionProcessPage;
import utilities.Driver;

public class US_0005 {


    HomePage homePage;
    SubscriptionProcessPage subscriptionProcessPage;

    @Test
    public void TC1() {
         homePage = new HomePage();
         subscriptionProcessPage = new SubscriptionProcessPage();
        homePage.mempershipclick();
        // Verify if the element is present
        Assert.assertEquals(subscriptionProcessPage.titleMepership.getText()
                , "My Memberships");
        Driver.tearDown();
    }


    @Test
    public void TC2() {
        homePage = new HomePage();
        subscriptionProcessPage = new SubscriptionProcessPage();
        homePage.mempershipclick();
        subscriptionProcessPage.mepershipOne();

        // Verify if the element is present
        Assert.assertEquals(subscriptionProcessPage.mepershipInfo.getText()
                , "Membership Information");
      Driver.tearDown();


    }

    @Test
    public void TC3() {
        homePage = new HomePage();
        subscriptionProcessPage = new SubscriptionProcessPage();

        homePage.clickSliderButton();
        subscriptionProcessPage.clickmempershipclick();
        // Verify if the element is present
        Assert.assertTrue(subscriptionProcessPage.mepershipTitle.isDisplayed() );
          Driver.tearDown();
    }

}