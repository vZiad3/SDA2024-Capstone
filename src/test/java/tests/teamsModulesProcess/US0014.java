package tests.teamsModulesProcess;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TeamModulesProcess;
import utilities.Driver;

public class US0014 {

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
    public void TC0014_01() throws InterruptedException {
        //User can edit the teams displayed in the Teams module.
        //Steps
        //Navigate to the Teams module
        //Select the team to be edited.
        //Click on the "Edit team" button for the selected team.
        //Modify the Department name and Department type fields as needed.
        //Save changes

        homePage.teammp();
        TeamModulesProcess teamsModulePage = new TeamModulesProcess();
        teamsModulePage.ValidEdit();
        teamsModulePage.SuccessEdit();


    }
    @Test
    public void TC0014_02(){
        //User can delete Team
        //Navigate to the Teams module
        //Select the team to be deleted.
        //Click on the "Edit team" button for the selected team.
        //click on the "delete department" button
        //Confirm the deletion

        homePage.teammp();
        TeamModulesProcess teamsModulePage = new TeamModulesProcess();
        teamsModulePage.deleteTeam();



    }
}
