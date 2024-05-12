package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessAccountManagement {
    private WebDriver driver;

    //US0001
    @FindBy(xpath = "//html/body/div/a")
    private WebElement loginButton;

    @FindBy(id = "username")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signInButton;

    @FindBy(xpath = "//h5[@class='pb-1 help-block']")
    private WebElement errorMessage;

    @FindBy(xpath = "//span[contains(text(),'cstm@testevolve.com')]")
    private WebElement profileName;

    @FindBy(xpath = "//img[@alt='Logo']")
    private WebElement logoElement;

    @FindBy(id = "Sidebar")
    private WebElement sidebarElement;

    //------------------------US0002------------------

    public boolean isLogoDisplayed() {
        return logoElement.isDisplayed();
    }

    public boolean isSidebarDisplayed() {
        return sidebarElement.isDisplayed();
    }


    // ------------------------------------------
    //US0003
    @FindBy(xpath = "//span[contains(text(),'cstm@testevolve.com')]")
    private WebElement dropdownMenu;

    @FindBy(xpath = "//ul[@role='menu']")
    private WebElement expandedDropdown;

    @FindBy(xpath = "//span[contains(text(),'cstm@testevolve.com')]")
    private WebElement usernameAndRoleElement;

    //------------------------US0003------------------
    //------------------------TC0002------------------

    @FindBy(xpath = "//a[normalize-space()='My Subscriptions']")
    private WebElement mySubscriptionsOption;

    @FindBy(xpath = "//a[normalize-space()='My Memberships']")
    private WebElement myMembershipsOption;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    private WebElement logoutOption;
    String expectedMySubscriptionPageUrl = "https://qa-gm3.quaspareparts.com/a3m/?errorMessage=%5Bauthorization_request_not_found%5D%20#/subscriptions";



    public AccessAccountManagement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickDropdownMenu() {
        dropdownMenu.click();
    }

    public boolean isExpandedDropdownDisplayed() {
        return expandedDropdown.isDisplayed();
    }

    public boolean isUsernameAndRoleDisplayed() {
        return usernameAndRoleElement.isDisplayed();
    }


    //-------------------------------------------
    public void clickLoginButton() {
        loginButton.click();
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public String getProfileName() {
        return profileName.getText();
    }

    //------------------------US0003------------------
    //------------------------TC0002------------------


    public void clickMySubscriptionsOption() {
        mySubscriptionsOption.click();
    }

    public void clickMyMembershipsOption() {
        myMembershipsOption.click();
    }

    public void clickLogoutOption() {
        logoutOption.click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public boolean isButtonDisplayed() {
        return loginButton.isDisplayed();
    }

}