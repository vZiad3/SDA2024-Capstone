package tests.userModuleProcess;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.UserModuleProcess;
import utilities.ReusableMethods;

import static org.testng.AssertJUnit.assertTrue;

public class US00016 {

    LogInPage logInPage = new LogInPage();
    UserModuleProcess moduleProcess = new UserModuleProcess();
    @Test
    public void assertDefaultRole () throws InterruptedException {
        logInPage.defaultLogin();
        moduleProcess.button.click();
        ReusableMethods.waitForClickablility(moduleProcess.button,2);
        moduleProcess.userButton.click();
        Thread.sleep(200);
        moduleProcess.firstUsernameIndex.click();
        assertTrue(moduleProcess.defaultRole.isDisplayed());
    }


    @Test
    public void assertUsernameItCanChanged()throws InterruptedException{
        logInPage.defaultLogin();
        moduleProcess.button.click();
        ReusableMethods.waitForClickablility(moduleProcess.button,2);
        moduleProcess.userButton.click();
        ReusableMethods.waitForClickablility(moduleProcess.userButton,2);
        moduleProcess.firstUsernameIndex.click();
        moduleProcess.editIcon.click();
        moduleProcess.emailLabel.click();
        moduleProcess.usernameLabel.click();
        moduleProcess.usernameLabel.clear();
        moduleProcess.usernameLabel.sendKeys(moduleProcess.fakeUsername());
        String usernameFaker = moduleProcess.fakeUsername();
        Assert.assertEquals(usernameFaker,usernameFaker);
        Thread.sleep(200);
        moduleProcess.checkMark.click();

    }


    @Test
    public void ResetPassword() throws InterruptedException {

        logInPage.defaultLogin();
        Thread.sleep(200);
        moduleProcess.button.click();
        Thread.sleep(200);
        ReusableMethods.waitForClickablility(moduleProcess.button,2);
        moduleProcess.userButton.click();
        moduleProcess.thereDots.click();
        moduleProcess.resetPasswordButton.click();
        moduleProcess.confirmButtom.click();
        Assert.assertTrue(moduleProcess.resetPassSuccessMass.size() > 0);
        moduleProcess.closeButtonResetPass.click();

    }





    @Test
    public void addRole()  {
        logInPage.defaultLogin();
        ReusableMethods.waitForClickablility(moduleProcess.button,2);
        moduleProcess.button.click();
        moduleProcess.userButton.click();
        ReusableMethods.waitFor(1);
        moduleProcess.firstUsernameIndex.click();
        moduleProcess.addingRole.click();
        moduleProcess.drobdownRols.click();
        moduleProcess.scrollByThreeElements();
        moduleProcess.saveButton.click();
        //assertTrue(moduleProcess.addingRoleSuccessMass.getSize()>0);
        Assert.assertTrue(moduleProcess.addingRoleSuccessMass.size() > 0);


    }




}
