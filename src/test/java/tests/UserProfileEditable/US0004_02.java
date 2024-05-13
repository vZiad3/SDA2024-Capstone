package tests.UserProfileEditable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.UserProfileEditable;
import utilities.Driver;

public class US0004_02 {



    @Test  //Update Username valid characters
    public void TC0004_06() {
        UserProfileEditable ProfilePage = new UserProfileEditable();
        LogInPage logInPage = new LogInPage();

         logInPage.defaultLogin2();
        ProfilePage.UsernameValidCharacters();
        ProfilePage.successAssert();
        Driver.tearDown();

    }

    @Test  //Update Username ends with special character
    public void TC0004_07() {
        if(Driver.getDriver() != null)
            Driver.tearDown();
        UserProfileEditable ProfilePage = new UserProfileEditable();
        LogInPage logInPage = new LogInPage();

         logInPage.defaultLogin2();
        ProfilePage.UsernameEndsWithSpecialCharacter();
        ProfilePage.ErrorAssertForUser();
        Driver.tearDown();

    }

    @Test  //set username empty
    public void TC0004_08() {
        if(Driver.getDriver() != null)
            Driver.tearDown();
        UserProfileEditable ProfilePage = new UserProfileEditable();
        LogInPage logInPage = new LogInPage();

        logInPage.defaultLogin2();
        ProfilePage.setUsernameEmpty();
        Driver.tearDown();

    }

    @Test  //Update Username starts with a number
    public void TC0004_09() {
        if(Driver.getDriver() != null)
            Driver.tearDown();
        UserProfileEditable ProfilePage = new UserProfileEditable();
        LogInPage logInPage = new LogInPage();

          logInPage.defaultLogin2();
        ProfilePage.UsernameStartsWithNumber();
        ProfilePage.ErrorAssertForUser();
        Driver.tearDown();

    }

    @Test  //Update Username contains invalid special character
    public void TC0004_10() {
        if(Driver.getDriver() != null)
            Driver.tearDown();
        UserProfileEditable ProfilePage = new UserProfileEditable();
        LogInPage logInPage = new LogInPage();

         logInPage.defaultLogin2();
        ProfilePage.UsernameWithInvalidSpecialCharacter();
        ProfilePage.ErrorAssertForUser();
        Driver.tearDown();

    }

}
