package tests;

import jdk.jfr.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MilestonesPage;
import pages.OverviewPage;

@Log4j2
public class MilestonesTests extends BaseTest {
    OverviewPage overviewPage;
    MilestonesPage milestonesPage;

    @Override
    public void waitForPageLoaded() {
    }
    @BeforeClass(alwaysRun = true)
    public void initialise() {
        overviewPage = new OverviewPage(driver);
        milestonesPage = new MilestonesPage(driver);
    }

    @Description("Positive Create Milestones")
    @Test(groups = {"smoke","positive"})
    public void createMilestonesTest() throws IndexOutOfBoundsException {
        loginPage.waitForPageLoaded();
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
        milestonesPage.setMilestonesName("Ray");
        milestonesPage.setDescription("Description Milestones");
        milestonesPage.setStartData("22.03.2023");
        milestonesPage.setEndData("18.04.2023");
        milestonesPage.clickCheckboxCompleted();
        milestonesPage.clickAddMilestones();
        milestonesPage.isAccessMessageDisplayed();
        Assert.assertTrue(milestonesPage.isAccessMessageDisplayed(), "Checking for a message about the successfully added the new milestone");
    }
}


