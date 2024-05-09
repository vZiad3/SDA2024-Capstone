package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class UserProfileEditable {

   public UserProfileEditable() {
  PageFactory.initElements(Driver.getDriver(),this);
  }
 //ReusableMethods R =new ReusableMethods();

  @FindBy (id= "changePasswordButton")
  public WebElement ChangePasswordButton;

    @FindBy (id= "newPassword")
    public WebElement PasswordField1;

    @FindBy (id= "newPassword2")
    public WebElement PasswordField2;

    @FindBy (xpath= "//button[normalize-space()='Confirm']")
    public WebElement ConfirmButton;

    @FindBy (xpath= "//div[@class='alert alert-danger alert-dismissible fade show mt-1']")
    public WebElement errorMessage;

    @FindBy (xpath = "//div[@class='toast-body']")  //delete
    public WebElement SuccessMessage;

    @FindBy (xpath= "//button[@class='btn btn-ghost-dark rounded-circle']//*[name()='svg']")
    public WebElement EditButton;

    @FindBy (id="username")
    public WebElement UserNameField;
    @FindBy (id="email")
    public WebElement emailField;
    @FindBy (xpath= "//span[@class='text-danger']")
    public WebElement EmptyMessage;

    @FindBy (xpath= "//button[@class='btn btn-ghost-primary rounded-circle']//*[name()='svg']")
    public WebElement SaveButton;


    public void ClickChangePasswordButton(){
        // Click the "Change Password" button
        ChangePasswordButton.click();
    }
    public void validPassword(){
        PasswordField1.sendKeys("ValidPassword123@");
        PasswordField2.sendKeys("ValidPassword123@");
    }
    public void ErrorAssertForPassword(){
        List<WebElement> mes = Driver.getDriver().findElements(By.xpath("//div[@class='alert alert-danger alert-dismissible fade show mt-1']"));
        Assert.assertTrue(mes.size() > 0);
    }
    public void ErrorAssertForUser(){
        List<WebElement> mes = Driver.getDriver().findElements(By.xpath("//div[@class='toast-body']"));
        Assert.assertFalse(mes.size() > 0);
    }

    public void EmptyAssert(){
       Assert.assertEquals(EmptyMessage.getText(),"Username cannot be empty");
    }
    public void successAssert(){
        List<WebElement> mes = Driver.getDriver().findElements(By.xpath("//div[@class='toast-body']"));
        Assert.assertTrue(mes.size() > 0);
    }
    public void DeletePassword(){
        // Clear the password fields
        PasswordField1.clear();
        PasswordField2.clear();

    }

    public void PasswordLess8(){
        PasswordField1.sendKeys("Short1$");
        PasswordField2.sendKeys("Short1$");
        ConfirmButton.click();
    }

    public void PasswordWithUpperCase(){
        PasswordField1.sendKeys("PASSWORD123");
        PasswordField2.sendKeys("PASSWORD123");
        ConfirmButton.click();
    }

    public void PasswordWithoutSpecialCase(){
        PasswordField1.sendKeys("Password123");
        PasswordField2.sendKeys("Password123");
        ConfirmButton.click();
    }

    public void PasswordContainsSpecialCharactersButNoUppercaseLetter(){
        PasswordField1.sendKeys("test@123");
        PasswordField2.sendKeys("test@123");
        ConfirmButton.click();
    }

    public void UsernameValidCharacters(){
        EditButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        UserNameField.clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        UserNameField.sendKeys("user_name123");
        SaveButton.click();
    }

    public void UsernameEndsWithSpecialCharacter(){
        EditButton.click();
        UserNameField.clear();
        UserNameField.sendKeys("user-name_");
        SaveButton.click();

    }
    public void setUsernameEmpty(){
        EditButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        UserNameField.clear();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        SaveButton.click();

    }

    public void UsernameStartsWithNumber(){
        EditButton.click();
        UserNameField.clear();
        UserNameField.sendKeys("1username");
        SaveButton.click();
    }
    public void UsernameWithInvalidSpecialCharacter(){
        EditButton.click();
        UserNameField.clear();
        UserNameField.sendKeys("user$name");
        SaveButton.click();
    }



}
