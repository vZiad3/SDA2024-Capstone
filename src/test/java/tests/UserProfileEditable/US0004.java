package tests.UserProfileEditable;

import org.testng.annotations.Test;
import pages.LogInPage;
import pages.UserProfileEditable;
import utilities.Driver;


public class US0004 {



 // @BeforeClass
 // public void setup() {
 //     logInPage.defaultLogin2();
 // }


  @Test //Valid Password
  public void TC0004_01() {
      UserProfileEditable ProfilePage = new UserProfileEditable();
      LogInPage logInPage = new LogInPage();

      logInPage.defaultLogin2();
      ProfilePage.ClickChangePasswordButton();
      ProfilePage.validPassword();
      ProfilePage.successAssert();
      Driver.tearDown();
  }

    @Test  //Password Less 8
    public void TC0004_02() {
        UserProfileEditable ProfilePage = new UserProfileEditable();
        LogInPage logInPage = new LogInPage();

       logInPage.defaultLogin2();
        ProfilePage.ClickChangePasswordButton();
        ProfilePage.PasswordLess8();
        ProfilePage.ErrorAssertForPassword();
        Driver.tearDown();
    }

    @Test //Password With Upper Case
    public void TC0004_03() {
        UserProfileEditable ProfilePage = new UserProfileEditable();
        LogInPage logInPage = new LogInPage();
       logInPage.defaultLogin2();
     ProfilePage.ClickChangePasswordButton();
       // ProfilePage.DeletePassword();
        ProfilePage.PasswordWithUpperCase();
        ProfilePage.ErrorAssertForPassword();
        Driver.tearDown();
    }

    @Test  //Password Without Special Case
    public void TC0004_04() {
        UserProfileEditable ProfilePage = new UserProfileEditable();
        LogInPage logInPage = new LogInPage();
       logInPage.defaultLogin2();
       ProfilePage.ClickChangePasswordButton();
       // ProfilePage.DeletePassword();
        ProfilePage.PasswordWithoutSpecialCase();
        ProfilePage.ErrorAssertForPassword();
        Driver.tearDown();
    }

    @Test  //Password Contains Special Characters But No Uppercase Letter
    public void TC0004_05() {
        UserProfileEditable ProfilePage = new UserProfileEditable();
        LogInPage logInPage = new LogInPage();
        logInPage.defaultLogin2();
       ProfilePage.ClickChangePasswordButton();
      //  ProfilePage.DeletePassword();
        ProfilePage.PasswordContainsSpecialCharactersButNoUppercaseLetter();
        ProfilePage.ErrorAssertForPassword();
        Driver.tearDown();
    }


}
