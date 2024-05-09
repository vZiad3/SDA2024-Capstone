package tests.UserProfileEditable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.UserProfileEditable;
import utilities.Driver;
import utilities.TestBase;

import java.util.List;


public class US0004  {

    UserProfileEditable ProfilePage =new UserProfileEditable();
    LogInPage logInPage = new LogInPage();


   @Test //Valid Password
   public void TC0004_01() {
       logInPage.defaultLogin();
     ProfilePage.ClickChangePasswordButton();
       ProfilePage.validPassword();
       ProfilePage.successAssert();
   }

    @Test  //Password Less 8
    public void TC0004_02() {
        logInPage.defaultLogin();
        ProfilePage.ClickChangePasswordButton();
        ProfilePage.PasswordLess8();
        ProfilePage.ErrorAssertForPassword();
    }

    @Test //Password With Upper Case
    public void TC0004_03() {
        logInPage.defaultLogin();
       ProfilePage.DeletePassword();
        ProfilePage.PasswordWithUpperCase();
        ProfilePage.ErrorAssertForPassword();
    }

    @Test  //Password Without Special Case
    public void TC0004_04() {
        logInPage.defaultLogin();
        ProfilePage.DeletePassword();
        ProfilePage.PasswordWithoutSpecialCase();
        ProfilePage.ErrorAssertForPassword();
    }

    @Test  //Password Contains Special Characters But No Uppercase Letter
    public void TC0004_05() {
        logInPage.defaultLogin();
        ProfilePage.DeletePassword();
        ProfilePage.PasswordContainsSpecialCharactersButNoUppercaseLetter();
        ProfilePage.ErrorAssertForPassword();
    }

    @Test  //Update Username valid characters
    public void TC0004_06() {
        logInPage.defaultLogin();
        ProfilePage.UsernameValidCharacters();
        ProfilePage.successAssert();

    }

    @Test  //Update Username ends with special character
    public void TC0004_07() {
        logInPage.defaultLogin();
        ProfilePage.UsernameEndsWithSpecialCharacter();
        ProfilePage.ErrorAssertForUser();

    }

    @Test  //set username empty
    public void TC0004_08() {
        logInPage.defaultLogin();

        ProfilePage.setUsernameEmpty();
     ProfilePage.EmptyAssert();
    }

    @Test  //Update Username starts with a number
    public void TC0004_09() {
        logInPage.defaultLogin();
        ProfilePage.UsernameStartsWithNumber();
        ProfilePage.ErrorAssertForUser();
    }
    @Test  //Update Username contains invalid special character
    public void TC0004_10() {
        logInPage.defaultLogin();
        ProfilePage.UsernameWithInvalidSpecialCharacter();
        ProfilePage.ErrorAssertForUser();
    }


}

