package tests;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPlanTests extends BaseTest {

    @Override
    public void waitForPageLoaded() {
    }

    @Description("Positive Create Test Plan Test")
    @Test(groups = {"smoke", "positive", "regression"})
    public void positiveCreateTestPlanTest() throws IndexOutOfBoundsException {
            loginPage.waitForPageLoaded();
            loginPage.setEmail(EMAIL);
            loginPage.setPassword(PASSWORD);
            loginPage.clickLoginButton();
            dashboardPage.waitForPageLoaded();
            dashboardPage.clickAddProjectButton();
            projectPage.setProjectName("P-RAY");
            projectPage.clickSuiteModeLocator();
            projectPage.clickSaveProjectButtonLocator();
            dashboardPage.isDisplayedDeleteProjectMessageLocator();
            dashboardPage.waitForPageLoaded();
            dashboardPage.clickAddExampleProject();
            dashboardPage.clickAddExampleProjectName("PLAN12345");
            dashboardPage.clickAddExampleProjectButton();
            overviewPage.waitForPageLoaded();
            overviewPage.clickTestRunAndResultsLink();
            testRunResultsPage.waitForPageLoaded();
            testRunResultsPage.clickAddTestPlanButton() ;
            testRunResultsPage.setPlanNameInput();
            testRunResultsPage.setPlanDescription();
            testRunResultsPage.clickButtonAddTestPlan();
            testRunResultsPage.isDisplayedPlanSuccessMessage();
        Assert.assertTrue(testRunResultsPage.isDisplayedPlanSuccessMessage(), "Successfully added the new test plan.");

    }
}
