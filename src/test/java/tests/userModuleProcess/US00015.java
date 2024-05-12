package tests.userModuleProcess;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.UserModuleProcess;
import utilities.ReusableMethods;

public class US00015  {

//    @BeforeSuite
//    public void beforeTEst(){
//
//
//
//        logInPage.defaultLogin();
//        moduleProcess.button.click();
//        ReusableMethods.waitForClickablility(moduleProcess.button,2);
//        moduleProcess.UserButton.click();
//
//
//    }

    LogInPage logInPage = new LogInPage();
    UserModuleProcess moduleProcess = new UserModuleProcess();

    @Test
    public void AsserTheUserExists() throws InterruptedException {
        //With exists Email
        logInPage.defaultLogin();
        Thread.sleep(200);
        moduleProcess.button.click();
        ReusableMethods.waitForClickablility(moduleProcess.button,2);
        moduleProcess.userButton.click();
        moduleProcess.addNewButton.click();
        Thread.sleep(500);
        moduleProcess.firstToDropdown.click();
        moduleProcess.scrollByThreeElements();
        moduleProcess.firstToDropdown.click();
        Thread.sleep(500);
        moduleProcess.sacondToDropdown.click();
        moduleProcess.scrollByThreeElements();
        moduleProcess.emailInput.sendKeys("exatest@exatest.com");
        Thread.sleep(200);
        moduleProcess.registerButton.click();
        Assert.assertTrue(moduleProcess.successMasseg.size() == 0);
        moduleProcess.cancelButton.click();

    }

}



