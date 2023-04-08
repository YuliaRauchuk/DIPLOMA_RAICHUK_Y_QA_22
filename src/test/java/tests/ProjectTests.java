package tests;

import jdk.jfr.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

@Log4j2
public class ProjectTests extends BaseTest {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    ProjectPage projectPage;

    @BeforeClass(alwaysRun = true)
    public void initialise() {
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        projectPage = new ProjectPage(driver);
    }

    @Description("Positive Create New Project Test")
    @Test(groups = {"smoke", "positive", "regression"})
    public void positiveCreateNewProjectTest() throws IndexOutOfBoundsException {
        loginPage.waitForPageLoaded();
        loginPage.clickCheckmarkEmpty();
        loginPage.setEmail(EMAIL);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        dashboardPage.waitForPageLoaded();
        dashboardPage.clickAddProjectButton();
        projectPage.setProjectName("Project New Ray");
        projectPage.clickSuiteModeLocator();
        projectPage.clickSaveProjectButtonLocator();
        Assert.assertTrue(projectPage.isAccessMessageDisplayed(), "Successfully added the new project.");
    }

    @Description("Positive Delete Project Test")
    @Test(groups = {"smoke", "all", "regression"})
    public void positiveUpdateProjectTest() throws IndexOutOfBoundsException {
        loginPage.waitForPageLoaded();
        loginPage.clickCheckmarkEmpty();
        loginPage.setEmail(EMAIL);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        dashboardPage.waitForPageLoaded();
        dashboardPage.clickAddProjectButton();
        projectPage.setProjectName("Del Project Ray");
        projectPage.clickSuiteModeLocator();
        projectPage.clickSaveProjectButtonLocator();
        dashboardPage.waitForPageLoaded();
        dashboardPage.clickAddExampleProject();
        dashboardPage.clickAddExampleProjectName("Del-del");
        dashboardPage.clickAddExampleProjectButton();
        Assert.assertTrue(overviewPage.waitForPageLoaded());

    }
}