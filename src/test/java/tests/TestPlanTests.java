package tests;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

public class TestPlanTests extends BaseTest {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    ProjectPage projectPage;
    TestRunResultsPage testRunResultsPage;

    @BeforeClass(alwaysRun = true)
        public void initialise() {
            loginPage = new LoginPage(driver);
            dashboardPage = new DashboardPage(driver);
            projectPage = new ProjectPage(driver);
            overviewPage = new OverviewPage(driver);
            testRunResultsPage = new TestRunResultsPage(driver);
        }


    @Description("Positive Create Test Plan Test")
    @Test(groups = {"smoke", "positive", "regression"})
    public void positiveCreateTestPlanTest() throws IndexOutOfBoundsException {
            loginPage.waitForPageLoaded();
            loginPage.clickCheckmarkEmpty();
            loginPage.setEmail(EMAIL);
            loginPage.setPassword(PASSWORD);
            loginPage.clickLoginButton();
            dashboardPage.waitForPageLoaded();
            dashboardPage.clickAddProjectButton();
            projectPage.setProjectName("Pl-RAY");
            projectPage.clickSuiteModeLocator();
            projectPage.clickSaveProjectButtonLocator();
            dashboardPage.isDisplayedDeleteProjectMessageLocator();
            dashboardPage.waitForPageLoaded();
            dashboardPage.clickAddExampleProject();
            dashboardPage.clickAddExampleProjectName("PLAN12345");
            dashboardPage.clickAddExampleProjectButton();
            overviewPage.waitForPageLoaded();
            overviewPage.clickTestRunResultsLink();
            testRunResultsPage.waitForPageLoaded();
            testRunResultsPage.clickAddTestPlanButton();
            testRunResultsPage.waitForPageLoaded();
            testRunResultsPage.setPlanNameInput("Add_Name");
            testRunResultsPage.setPlanDescription("Create Description");
            testRunResultsPage.clickButtonAddTestPlan();
            testRunResultsPage.isDisplayedPlanSuccessMessage();
        Assert.assertTrue(testRunResultsPage.isDisplayedPlanSuccessMessage(), "Successfully added the new test plan.");

    }
    @Description("Positive Close Test Plan Test")
    @Test(groups = {"smoke", "positive", "all"})
    public void CloseTestPlanTest() throws IndexOutOfBoundsException {
            loginPage.waitForPageLoaded();
            loginPage.clickCheckmarkEmpty();
            loginPage.setEmail(EMAIL);
            loginPage.setPassword(PASSWORD);
            loginPage.clickLoginButton();
            dashboardPage.waitForPageLoaded();
            dashboardPage.clickAddProjectButton();
            projectPage.setProjectName("Plan-RAY");
            projectPage.clickSuiteModeLocator();
            projectPage.clickSaveProjectButtonLocator();
            dashboardPage.isDisplayedDeleteProjectMessageLocator();
            dashboardPage.waitForPageLoaded();
            dashboardPage.clickAddExampleProject();
            dashboardPage.clickAddExampleProjectName("PLAN plan");
            dashboardPage.clickAddExampleProjectButton();
            overviewPage.waitForPageLoaded();
            overviewPage.clickTestRunResultsLink();
            testRunResultsPage.waitForPageLoaded();
            testRunResultsPage.clickAddTestPlanButton();
            testRunResultsPage.setPlanNameInput("Add Name");
            testRunResultsPage.setPlanDescription("Create Description");
            testRunResultsPage.clickButtonAddTestPlan();
            testRunResultsPage.isDisplayedPlanSuccessMessage();
            testRunResultsPage.clickEditButton();
            testRunResultsPage.clickCloseThisTestPlanButton();
            testRunResultsPage.clickYesButtonConfirmationMessage();
        Assert.assertTrue(testRunResultsPage.isDisplayedCloseTestPlanSuccessMessage("Successfully closed the test plan and the related test runs."));

    }
    @Description("Positive Delete Test Plan Test")
    @Test(groups = {"smoke", "positive", "regression"})
    public void DeleteTestPlanTest() throws IndexOutOfBoundsException {
            loginPage.waitForPageLoaded();
            loginPage.clickCheckmarkEmpty();
            loginPage.setEmail(EMAIL);
            loginPage.setPassword(PASSWORD);
            loginPage.clickLoginButton();
            dashboardPage.waitForPageLoaded();
            dashboardPage.clickAddProjectButton();
            projectPage.setProjectName("Del-RAY");
            projectPage.clickSuiteModeLocator();
            projectPage.clickSaveProjectButtonLocator();
            dashboardPage.isDisplayedDeleteProjectMessageLocator();
            dashboardPage.waitForPageLoaded();
            dashboardPage.clickAddExampleProject();
            dashboardPage.clickAddExampleProjectName("PLAN-Ok");
            dashboardPage.clickAddExampleProjectButton();
            overviewPage.waitForPageLoaded();
            overviewPage.clickTestRunResultsLink();
            testRunResultsPage.waitForPageLoaded();
            testRunResultsPage.clickAddTestPlanButton();
            testRunResultsPage.setPlanNameInput("Name_Delete");
            testRunResultsPage.setPlanDescription("Delete Description");
            testRunResultsPage.clickButtonAddTestPlan();
            testRunResultsPage.jsClickLinkEdit();
            testRunResultsPage.clickDeleteThisTestPlanButton();
            testRunResultsPage.clickCheckboxDeleteTestPlan();
            testRunResultsPage.clickOkButtonConformation();
        Assert.assertTrue(testRunResultsPage.isDisplayedDeleteTestPlanSuccessMessage("Successfully deleted the test plan and the related test runs."));
    }
}
