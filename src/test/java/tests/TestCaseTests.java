package tests;

import jdk.jfr.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;


@Log4j2
public class TestCaseTests extends BaseTest {
    @Override
    public void waitForPageLoaded() {
    }

    @Description(" Create Test Case Tests")
    @Test(groups = {"smoke", "positive", "all"})
    public void createPositiveTestCase() throws IndexOutOfBoundsException{
        loginPage.waitForPageLoaded();
        loginPage.setEmail(EMAIL);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        dashboardPage.waitForPageLoaded();
        dashboardPage.clickAddProjectButton();
        projectPage.setProjectName("Pro-Case");
        projectPage.clickSuiteModeLocator();
        projectPage.clickSaveProjectButtonLocator();
        dashboardPage.isDisplayedDeleteProjectMessageLocator();
        dashboardPage.waitForPageLoaded();
        dashboardPage.clickAddExampleProject();
        dashboardPage.clickAddExampleProjectName("NEW-y");
        dashboardPage.clickAddExampleProjectButton();
        overviewPage.waitForPageLoaded();
        overviewPage.clickTestCasesLink();
        testCasePage.waitForPageLoaded();
        testCasePage.clickAddTestCase();
        testCasePage.clickTitleLocator("New Test Case");
        testCasePage.clickSectionDropdownLocator("Test Cases");
        testCasePage.clickTemplateDropdownLocator("Test Case (Text)");
        testCasePage.clickTypeDropdownLocator("Other");
        testCasePage.clickPriorityDropdownLocator("Medium");
        testCasePage.clickEstimateLocator("AAA");
        testCasePage.clickReferencesLocator("QWE");
        testCasePage.clickAutomationDropdownLocator("None");
        testCasePage.clickPreconditionLocator("SDK");
        testCasePage.clickStepsLocator("Open Tab," +
                "Check One, " +
                "Check Two, " +
                "Check Three, " +
                "Check Four");
        testCasePage.clickExpectedResultLocator("Working");
        testCasePage.clickAddTestCaseButton();
        testCasePage.isDisplayedSuccessMessage();
        Assert.assertTrue(testCasePage.isDisplayedSuccessMessage(), "Successfully added the new test case.");
           testCasePage.waitForPageLoaded();
            testCasePage.clickEditButtonLocator();
            testCasePage.clickTitleLocator("TITLE CASE");
            testCasePage.clickSectionDropdownLocator("Test Cases");
            testCasePage.clickTemplateDropdownLocator("Test Case (Text)");
            testCasePage.clickTypeDropdownLocator("Other");
            testCasePage.clickPriorityDropdownLocator("High");
            testCasePage.clickStepsLocator("Open Tab," +
                    "One, " +
                    "Two, " +
                    "Three");
            testCasePage.clickSaveTestCaseButtonLocator();
            testCasePage.idDisplayedUpdateSuccessMessage();
        Assert.assertTrue(testCasePage.idDisplayedUpdateSuccessMessage(), "Successfully updated the test case.");
            testCasePage.clickDeleteThisTestCaseButtonLocator();
            testCasePage.clickMarkAsDeletedButtonLocator();
        Assert.assertTrue(testCasePage.idDisplayedSuccessMessageDeleteTestCaseLocator(), "Successfully flagged the test case as deleted.");
    }
}



