package tests;

import jdk.jfr.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;

@Log4j2
public class TestRunResultsTests extends BaseTest {
    @Override
    public void waitForPageLoaded() {
    }
    @Description("Positive Create TestRun Results Test")
    @Test(groups = {"smoke", "regression"})
    public void positiveCreateTestRunResultsTest() throws IndexOutOfBoundsException {
            loginPage.waitForPageLoaded();
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
            overviewPage.clickTestRunAndResultsLink();
            testRunResultsPage.waitForPageLoaded();
            testRunResultsPage.clickAddTestRunButton();
            testRunResultsPage.setRunNameInput();
            testRunResultsPage.setDescription();
            testRunResultsPage.clickCheckBoxIncludeAllTestCase();
            testRunResultsPage.clickButtonAddTestRun();
            testRunResultsPage.isDisplayedSuccessMessage();
        Assert.assertTrue(testRunResultsPage.isDisplayedSuccessMessage(), "Successfully added the new test run.");

    }
}
