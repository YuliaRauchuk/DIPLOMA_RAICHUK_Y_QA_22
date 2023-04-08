package tests;

import jdk.jfr.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

@Log4j2
public class TestRunResultsTests extends BaseTest {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    ProjectPage projectPage;
    OverviewPage overviewPage;
    TestRunResultsPage testRunResultsPage;

    @BeforeClass(alwaysRun = true)
    public void initialise() {
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        projectPage = new ProjectPage(driver);
        overviewPage = new OverviewPage(driver);
        testRunResultsPage = new TestRunResultsPage(driver);
    }
    @Description("Positive Create TestRun Results Test")
    @Test(groups = {"smoke", "regression"})
    public void positiveCreateTestRunResultsTest() throws IndexOutOfBoundsException {
            loginPage.waitForPageLoaded();
            loginPage.clickCheckmarkEmpty();
            loginPage.setEmail(EMAIL);
            loginPage.setPassword(PASSWORD);
            loginPage.clickLoginButton();
            dashboardPage.waitForPageLoaded();
            dashboardPage.clickAddProjectButton();
            projectPage.setProjectName("RUN_RES");
            projectPage.clickSuiteModeLocator();
            projectPage.clickSaveProjectButtonLocator();
            dashboardPage.isDisplayedDeleteProjectMessageLocator();
            dashboardPage.waitForPageLoaded();
            dashboardPage.clickAddExampleProject();
            dashboardPage.clickAddExampleProjectName("RUN-New");
            dashboardPage.clickAddExampleProjectButton();
            overviewPage.waitForPageLoaded();
            overviewPage.clickTestRunResultsLink();
            testRunResultsPage.waitForPageLoaded();
            testRunResultsPage.clickAddTestRunButton();
            testRunResultsPage.setDescription("D_run");
            testRunResultsPage.clickCheckBoxIncludeAllTestCase();
            testRunResultsPage.clickButtonAddTestRun();
        Assert.assertTrue(testRunResultsPage.isDisplayedSuccessMessage("Successfully closed the test plan and the related test runs."), "Successfully added the new test run.");

    }
}
