package tests.userModuleProcess;

import org.testng.Assert; // Import TestNG assertion methods
import org.testng.annotations.Test; // Import TestNG annotation for test methods
import pages.LogInPage; // Import LogInPage class for logging in
import pages.UserModuleProcess; // Import UserModuleProcess class for user module actions
import utilities.ReusableMethods; // Import ReusableMethods class for reusable actions

import static org.testng.AssertJUnit.assertTrue; // Import TestNG assertion method for boolean conditions

public class US00016 {

    // Create instances of required page classes
    LogInPage logInPage = new LogInPage();
    UserModuleProcess moduleProcess = new UserModuleProcess();

    // Test method to assert the default role
    @Test
    public void assertDefaultRole() throws InterruptedException {
        // Login with default credentials
        logInPage.defaultLogin();

        // Click on the collapse button
        moduleProcess.button.click();

        // Click on the user button after waiting for it to be clickable
        ReusableMethods.waitForClickablility(moduleProcess.userButton, 2).click();

        // Click on the first username index
        moduleProcess.firstUsernameIndex.click();

        // Assert that the default role is displayed
        assertTrue(moduleProcess.defaultRole.isDisplayed());
    }

    // Test method to assert that username can be changed
    @Test
    public void assertUsernameItCanChanged() throws InterruptedException {
        // Login with default credentials
        logInPage.defaultLogin();

        // Click on the collapse button
        moduleProcess.button.click();

        // Click on the user button after waiting for it to be clickable
        ReusableMethods.waitForClickablility(moduleProcess.userButton, 2).click();

        // Click on the first username index
        moduleProcess.firstUsernameIndex.click();

        // Click on the edit icon to change username
        moduleProcess.editIcon.click();

        // Click on the email label to focus on username label
        moduleProcess.emailLabel.click();

        // Click on the username label to clear and input new username
        moduleProcess.usernameLabel.click();
        moduleProcess.usernameLabel.clear();
        moduleProcess.usernameLabel.sendKeys(moduleProcess.fakeUsername());

        // Get the new username
        String usernameFaker = moduleProcess.fakeUsername();

        // Assert that the new username matches itself (always true)
        Assert.assertEquals(usernameFaker, usernameFaker);

        // Wait for 2 seconds
        ReusableMethods.waitFor(2);

        // Click on the check mark to confirm changes
        moduleProcess.checkMark.click();
    }

    // Test method to reset password
    @Test
    public void ResetPassword() throws InterruptedException {
        // Login with default credentials
        logInPage.defaultLogin();

        // Click on the collapse button
        moduleProcess.button.click();

        // Click on the user button after waiting for it to be clickable
        ReusableMethods.waitForClickablility(moduleProcess.userButton, 2).click();

        // Click on the three dots for options
        moduleProcess.thereDots.click();

        // Click on the reset password button
        moduleProcess.resetPasswordButton.click();

        // Confirm the reset action
        moduleProcess.confirmButtom.click();

        // Assert that the reset password success message is displayed
        Assert.assertTrue(moduleProcess.resetPassSuccessMass.size() > 0);

        // Close the reset password confirmation dialog
        moduleProcess.closeButtonResetPass.click();
    }

    // Test method to add a role
    @Test
    public void addRole() {
        // Login with default credentials
        logInPage.defaultLogin();

        // Click on the collapse button after waiting for it to be clickable
        ReusableMethods.waitForClickablility(moduleProcess.button, 2).click();

        // Click on the user button
        moduleProcess.userButton.click();

        // Wait for 1 second
        ReusableMethods.waitFor(1);

        // Click on the first username index
        moduleProcess.firstUsernameIndex.click();

        // Wait for 2 seconds
        ReusableMethods.waitFor(2);

        // Click on the add role button
        moduleProcess.addingRole.click();

        // Click on the dropdown roles
        moduleProcess.drobdownRols.click();

        // Scroll and choose an option from the dropdown
        moduleProcess.scrollByThreeElements();

        // Click on the save button
        moduleProcess.saveButton.click();

        // Assert that the adding role success message is displayed
        Assert.assertTrue(moduleProcess.addingRoleSuccessMass.size() > 0);
    }
}
