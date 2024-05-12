package tests.userModuleProcess;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.UserModuleProcess;
import utilities.ReusableMethods;

public class US00015  {


    LogInPage logInPage = new LogInPage();
    UserModuleProcess moduleProcess = new UserModuleProcess();

    @Test
    public void AsserTheUserExists()  {
        //With exists Email
        logInPage.defaultLogin();
        ReusableMethods.waitFor(5);
        moduleProcess.button.click();
        ReusableMethods.waitForClickablility(moduleProcess.button,2);
        moduleProcess.userButton.click();
        moduleProcess.addNewButton.click();
        ReusableMethods.waitFor(3);
        moduleProcess.firstToDropdown.click();
        moduleProcess.scrollByThreeElements();
        moduleProcess.firstToDropdown.click();
        ReusableMethods.waitFor(5);
        moduleProcess.sacondToDropdown.click();
        ReusableMethods.waitFor(3);
        moduleProcess.scrollByThreeElements();
        moduleProcess.emailInput.sendKeys("exatest@exatest.com");
        ReusableMethods.waitFor(3);
        moduleProcess.registerButton.click();
        Assert.assertTrue(moduleProcess.successMasseg.size() == 0);
        moduleProcess.cancelButton.click();

    }

}



