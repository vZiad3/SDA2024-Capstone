package SubscriptionProcess;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.SubscriptionProcessPage;
import utilities.Driver;

public class US_0005 {

    HomePage homePage;
    SubscriptionProcessPage subscriptionProcessPage;

    @Test
    public void TC1() {

        homePage = new HomePage();
        homePage.mempershipclick();
         subscriptionProcessPage = new SubscriptionProcessPage();


        // Verify if the element is present
        Assert.assertEquals(subscriptionProcessPage.titleMepership.getText()
                 , "My Memberships");
    Driver.tearDown();
    }


    @Test
    public void TC2() {

        homePage = new HomePage();
        homePage.mempershipclick();
        subscriptionProcessPage = new SubscriptionProcessPage();
        subscriptionProcessPage.mepershipOne();

        // Verify if the element is present
        Assert.assertEquals(subscriptionProcessPage.mepershipInfo.getText()
                , "Membership Information");
        Driver.tearDown();
        

    }
}
