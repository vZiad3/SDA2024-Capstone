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
        ReusableMethods.waitForClickablility(moduleProcess.button,2);
        moduleProcess.userButton.click();
        Thread.sleep(500);
        moduleProcess.addNewButton.click();
        Thread.sleep(500);
        moduleProcess.firstToDropdown.click();
        moduleProcess.scrollByThreeElements();
        moduleProcess.firstToDropdown.click();
        Thread.sleep(500);
        moduleProcess.sacondToDropdown.click();
        moduleProcess.scrollByThreeElements();
        moduleProcess.emailInput.sendKeys(moduleProcess.fakeEmail());
        Thread.sleep(200);
        moduleProcess.registerButton.click();
        Assert.assertTrue(moduleProcess.successMasseg.size() > 0);


    }


}
