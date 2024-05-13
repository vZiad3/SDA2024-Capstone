package tests.userModuleProcess;

import org.testng.Assert; // Import TestNG assertion methods
import org.testng.annotations.Test; // Import TestNG annotation for test methods
import pages.LogInPage; // Import LogInPage class for logging in
import pages.UserModuleProcess; // Import UserModuleProcess class for user module actions
import utilities.ReusableMethods; // Import ReusableMethods class for reusable actions

public class US00015 {

    // Create instances of required page classes
    LogInPage logInPage = new LogInPage();
    UserModuleProcess moduleProcess = new UserModuleProcess();

    // Test method to assert the existence of a user
    @Test
    public void asserTheUserExists() {
        // Login with default credentials
        logInPage.defaultLogin();

        // Wait for page elements to load
        ReusableMethods.waitFor(5);

        // Click on the collapse button
        moduleProcess.button.click();

        // Wait for the button to be clickable
        ReusableMethods.waitForClickablility(moduleProcess.button, 2);

        // Click on the user button
        moduleProcess.userButton.click();

        // Click on the add new button
        moduleProcess.addNewButton.click();

        // Wait for elements to load
        ReusableMethods.waitFor(2);

        // Click on the first dropdown
        moduleProcess.firstToDropdown.click();

        // Scroll and choose an option from the dropdown
        moduleProcess.scrollByThreeElements();

        // Click on the first dropdown again
        moduleProcess.firstToDropdown.click();

        // Wait for elements to load
        ReusableMethods.waitFor(2);

        // Click on the second dropdown
        moduleProcess.sacondToDropdown.click();

        // Scroll and choose an option from the dropdown
        moduleProcess.scrollByThreeElementsInAddingUser();

        // Enter the email address
        moduleProcess.emailInput.sendKeys("exatest@exatest.com");

        // Wait for elements to load
        ReusableMethods.waitFor(3);

        // Click on the register button
        moduleProcess.registerButton.click();

        // Assert that no success message is displayed
        Assert.assertTrue(moduleProcess.successMasseg.size() == 0);

        // Click on the cancel button
        moduleProcess.cancelButton.click();
    }
}
