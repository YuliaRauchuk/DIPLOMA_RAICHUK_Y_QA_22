package tests;

import jdk.jfr.Description;
import lombok.extern.log4j.Log4j2;
import milestones.AddMilestonesPage;
import models.Milestones;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MilestonesPage;
import pages.OverviewPage;
import utils.MilestonesFactory;



@Log4j2
public class MilestonesTests extends BaseTest {
    OverviewPage overviewPage;
    MilestonesPage milestonesPage;
    AddMilestonesPage addMilestonesPage;


    @BeforeClass(alwaysRun = true)
    public void initialise() {
        overviewPage = new OverviewPage(driver);
        milestonesPage = new MilestonesPage(driver);
        addMilestonesPage = new AddMilestonesPage(driver);
    }

    @Description("Positive Create Milestones")
    @Test(groups = {"smoke","positive", "regression"})
    public void createMilestonesTest() throws IndexOutOfBoundsException {
        loginPage.waitForPageLoaded();
        loginPage.clickCheckmarkEmpty();
        loginPage.setEmail(EMAIL);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        dashboardPage.waitForPageLoaded();
        dashboardPage.clickAddProjectButton();
        projectPage.setProjectName("MI PROJECT");
        projectPage.clickSuiteModeLocator();
        projectPage.clickSaveProjectButtonLocator();
        dashboardPage.waitForPageLoaded();
        dashboardPage.clickAddExampleProject();
        dashboardPage.clickAddExampleProjectName("Oop 1");
        dashboardPage.clickAddExampleProjectButton();
        overviewPage.waitForPageLoaded();
        overviewPage.clickMilestonesLink();
        milestonesPage.waitForPageLoaded();
        milestonesPage.clickAddMilestoneButton();
        milestonesPage.setMilestonesName("RAY");
        milestonesPage.setEndData("18.04.2023");
        milestonesPage.clickCheckboxCompleted();
        milestonesPage.clickAddMilestones();
        Assert.assertTrue(milestonesPage.isAccessMessageDisplayed("Successfully added the new milestone."));

    }

    @Description("Positive Test Milestones")
    @Test(groups = {"smoke","positive"})
    public void MilestonesBuilderTest() throws IndexOutOfBoundsException {
        loginPage.waitForPageLoaded();
        loginPage.clickCheckmarkEmpty();
        loginPage.setEmail(EMAIL);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        dashboardPage.waitForPageLoaded();
        dashboardPage.clickAddProjectButton();
        projectPage.setProjectName("MI PROJECT");
        projectPage.clickSuiteModeLocator();
        projectPage.clickSaveProjectButtonLocator();
        dashboardPage.waitForPageLoaded();
        dashboardPage.clickAddExampleProject();
        dashboardPage.clickAddExampleProjectName("Mil 1");
        dashboardPage.clickAddExampleProjectButton();
        overviewPage.waitForPageLoaded();
        overviewPage.clickMilestonesLink();
        milestonesPage.waitForPageLoaded();
        milestonesPage.clickAddMilestoneButton();
        addMilestonesPage.waitForPageLoaded();
        Milestones testMilestones = MilestonesFactory.getFullInfoMilestones();
        milestonesPage.clickCheckboxCompleted();
        milestonesPage.clickAddMilestones();
        milestonesPage.waitForPageLoaded();
        Assert.assertTrue(milestonesPage.isAccessMessageDisplayed("Successfully added the new milestone."));
    }
}






