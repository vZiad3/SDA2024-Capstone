package tests.teamsModulesProcess;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
<<<<<<< HEAD

import java.util.List;
=======
import pages.HomePage;
import pages.TeamModulesProcess;
import utilities.Driver;
>>>>>>> b23687b515ce3e1e386f7c8f1e47f3a415eff62e


public class US0013  {


    HomePage homePage;
    TeamModulesProcess teamModulesProcess;

    @BeforeMethod
    public void setUp(){

        homePage = new HomePage();
        teamModulesProcess = new TeamModulesProcess();

    }

    @AfterMethod
    public void tearDown(){

        Driver.tearDown();

    }
    @Test
    public void TC0013_01() {
        TeamModulesProcess  teamModulesProcess = new TeamModulesProcess();
        homePage.teammp();
        Assert.assertTrue(teamModulesProcess.teamTitle.isDisplayed());

    }

    @Test
    public void TC0013_02() {
        homePage.teammp();
        TeamModulesProcess teamsModulePage = new TeamModulesProcess();
        teamsModulePage.clickOnAddButton();
        teamsModulePage.AddNewTeam();
        teamsModulePage.successesMsg();


    }

    @Test
    public void TC0013_03() {
        homePage.teammp();
        TeamModulesProcess teamsModulePage = new TeamModulesProcess();
        teamsModulePage.clickOnAddButton();
        teamsModulePage.AddNewTeamWithoutName();
        teamsModulePage.errorMsgName();
    }

    @Test
    public void TC0013_04() {
        homePage.teammp();
        TeamModulesProcess teamsModulePage = new TeamModulesProcess();
        teamsModulePage.clickOnAddButton();
        teamsModulePage.AddNewTeamWithoutType();
        teamsModulePage.errorMsgType();
    }
}