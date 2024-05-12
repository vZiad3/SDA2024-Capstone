package tests.userModuleProcess;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.UserModuleProcess;
import utilities.ReusableMethods;

public class US00017 {


    LogInPage logInPage = new LogInPage();
    UserModuleProcess moduleProcess = new UserModuleProcess();

    @Test
    public void AsserTheNewlyUserAdding() throws InterruptedException {
        //WithCorrectEmail

        logInPage.defaultLogin();
        moduleProcess.button.click();
        ReusableMethods.waitForClickablility(moduleProcess.button,2).click();
        ReusableMethods.waitFor(5);
        moduleProcess.addNewButton.click();
        ReusableMethods.waitFor(5);
        moduleProcess.firstToDropdown.click();
        moduleProcess.scrollByThreeElements();
        moduleProcess.firstToDropdown.click();
        ReusableMethods.waitFor(5);
        moduleProcess.sacondToDropdown.click();
        moduleProcess.scrollByThreeElements();
        moduleProcess.emailInput.sendKeys(moduleProcess.fakeEmail());
        ReusableMethods.waitFor(5);
        moduleProcess.registerButton.click();
        Assert.assertTrue(moduleProcess.successMasseg.size() > 0);


    }


}
