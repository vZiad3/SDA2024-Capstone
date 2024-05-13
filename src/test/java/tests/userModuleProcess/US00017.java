package tests.userModuleProcess;

import org.testng.Assert; // Import TestNG assertion methods
import org.testng.annotations.Test; // Import TestNG annotation for test methods
import pages.LogInPage; // Import LogInPage class for logging in
import pages.UserModuleProcess; // Import UserModuleProcess class for user module actions
import utilities.ReusableMethods; // Import ReusableMethods class for reusable actions

public class US00017 {

    // Create instances of required page classes
    LogInPage logInPage = new LogInPage();
    UserModuleProcess moduleProcess = new UserModuleProcess();

    // Test method to assert the successful addition of a new user with correct email
    @Test
    public void AsserTheNewlyUserAdding() throws InterruptedException {
        // Login with default credentials
        logInPage.defaultLogin();

        // Click on the collapse button
        moduleProcess.button.click();

        // Click on the user button after waiting for it to be clickable
        ReusableMethods.waitForClickablility(moduleProcess.userButton, 2).click();

        // Click on the add new button
        moduleProcess.addNewButton.click();

        // Wait for 2 seconds
        ReusableMethods.waitFor(2);

        // Click on the first dropdown
        moduleProcess.firstToDropdown.click();

        // Scroll and choose an option from the dropdown for the first dropdown
        moduleProcess.scrollByThreeElementsInAddingUser();

        // Click on the first dropdown again
        moduleProcess.firstToDropdown.click();

        // Wait for 5 seconds
        ReusableMethods.waitFor(5);

        // Click on the second dropdown
        moduleProcess.sacondToDropdown.click();

        // Scroll and choose an option from the dropdown for the second dropdown
        moduleProcess.scrollByThreeElementsInAddingUser();

        // Enter a fake email address
        moduleProcess.emailInput.sendKeys(moduleProcess.fakeEmail());

        // Wait for 5 seconds
        ReusableMethods.waitFor(5);

        // Click on the register button
        moduleProcess.registerButton.click();

        // Assert that the success message is displayed indicating the user was added successfully
        Assert.assertTrue(moduleProcess.successMasseg.size() > 0);
    }
}
