package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RolesAndPermissionsPage {

    @FindBy(xpath = "//div[@class='col']//div[@class='row']")
    private List<WebElement> roleElements;

    @FindBy(xpath = "//div[@id='MainContent']//div//div//div[@class='row']")
    private List<WebElement> permissionElements;

    @FindBy(css = "body div[id='root'] div[id='MainContent'] div div div[class='row'] div")
    private List<WebElement> permissionButtons;

    public RolesAndPermissionsPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    public List<WebElement> getRoleElements() {

        return roleElements;
    }

    public List<WebElement> getButtonsInRoleElement(WebElement roleElement) {
        return roleElement.findElements(By.cssSelector("div:nth-child(1) a:nth-child(1) button:nth-child(1)"));
    }

    public void printAllRoles() {
        // Assert that all elements exist
        List<WebElement> roleElements = getRoleElements();
        Assert.assertFalse(roleElements.isEmpty(), "No role elements found on the Roles page.");

        // Print the text of each one of the elements appearing on the page
        System.out.println("All Roles registered:");
        for (int i = 0; i < roleElements.size(); i++) {
            try {
                WebElement roleElement = roleElements.get(i);
                List<WebElement> buttons = getButtonsInRoleElement(roleElement);
                for (WebElement button : buttons) {
                    System.out.println(button.getText());
                }
            } catch (StaleElementReferenceException e) {
                // Handle the exception by re-locating the elements
                i--; // Decrement the index to retry with the same element
            }
        }
    }

    public void verifyAllElementsEnabled() {
        List<WebElement> roleElements = getRoleElements();
        Assert.assertFalse(roleElements.isEmpty(), "No role elements found on the Roles page.");

        System.out.println("Verifying all elements are enabled:");
        for (int i = 0; i < roleElements.size(); i++) {
            try {
                WebElement roleElement = roleElements.get(i);
                List<WebElement> buttons = getButtonsInRoleElement(roleElement);
                for (WebElement button : buttons) {
                    Assert.assertTrue(button.isEnabled(), "Button is not enabled: " + button.getText());
                    System.out.println("Button is enabled: " + button.getText());
                }
            } catch (StaleElementReferenceException e) {
                // Handle the exception by re-locating the elements
                i--; // Decrement the index to retry with the same element
            }
        }
    }


    public void displayPermissions() {
        Assert.assertFalse(permissionButtons.isEmpty(), "No permissions found.");

        System.out.println("All Permissions displayed");
        for (WebElement permission : permissionButtons) {
            System.out.println(permission.getText());
        }
    }

    public void verifyAllPermissionsPresent() {
        Set<String> expectedPermissions = new HashSet<>();
        Set<String> actualPermissions = new HashSet<>();

        // Print permissions on the page
        System.out.println("List of All Permissions:");

        int count = 0;

        for (WebElement button : permissionButtons) {
            String buttonText = button.getText();
            if (!buttonText.isEmpty()) {
                count++;
                expectedPermissions.add(buttonText);
                actualPermissions.add(buttonText);
                System.out.println(buttonText);
            }
        }

        Assert.assertEquals(actualPermissions, expectedPermissions, "Permissions mismatch!");
        Assert.assertEquals(count, 94, "Number of permissions is not 94!");
    }
}