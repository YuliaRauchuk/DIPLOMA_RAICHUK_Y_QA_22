package tests;

import jdk.jfr.Description;
import lombok.extern.log4j.Log4j2;
import models.TestCase;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
import testCase.AddTestCasePage;
import testCase.DetailsTestCasePage;
import utils.TestCaseFactory;
import com.github.javafaker.Faker;


@Log4j2
public class TestCaseTests extends BaseTest {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    ProjectPage projectPage;
    TestCasePage testCasePage;
    AddTestCasePage addTestCasePage;
    DetailsTestCasePage detailsTestCasePage;
    OverviewPage overviewPage;
    Faker faker = new Faker();

    @BeforeClass(alwaysRun = true)
    public void initialise() {
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        projectPage = new ProjectPage(driver);
        testCasePage = new TestCasePage(driver);
        addTestCasePage = new AddTestCasePage(driver);
        detailsTestCasePage = new DetailsTestCasePage(driver);
        overviewPage = new OverviewPage(driver);
    }

    @Description(" Create Test Case Tests")
    @Test(groups = {"smoke", "positive", "all", "regression"})
    public void createPositiveTestCase() throws IndexOutOfBoundsException {
        loginPage.waitForPageLoaded();
        loginPage.clickCheckmarkEmpty();
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
        testCasePage.jsClickAddTestCase();
        testCasePage.waitForPageLoaded();
        testCasePage.setTitleName("New Test Case");
        testCasePage.clickSectionName("Test Cases");
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
        Assert.assertTrue(testCasePage.isDisplayedSuccessMessage(), "Successfully added the new test case.");

    }

        @Description("Update Test Case Tests")
        @Test(groups = {"smoke", "positive", "all", "regression"})
        public void updateTestCase() throws IndexOutOfBoundsException {
            loginPage.waitForPageLoaded();
            loginPage.clickCheckmarkEmpty();
            loginPage.setEmail(EMAIL);
            loginPage.setPassword(PASSWORD);
            loginPage.clickLoginButton();
            dashboardPage.waitForPageLoaded();
            dashboardPage.clickAddProjectButton();
            projectPage.setProjectName("New-Case");
            projectPage.clickSuiteModeLocator();
            projectPage.clickSaveProjectButtonLocator();
            dashboardPage.isDisplayedDeleteProjectMessageLocator();
            dashboardPage.waitForPageLoaded();
            dashboardPage.clickAddExampleProject();
            dashboardPage.clickAddExampleProjectName("CaseProjectName");
            dashboardPage.clickAddExampleProjectButton();
            overviewPage.waitForPageLoaded();
            overviewPage.clickTestCasesLink();
            testCasePage.waitForPageLoaded();
            testCasePage.jsClickAddTestCase();
            testCasePage.waitForPageLoaded();
            TestCase testTestCase = TestCaseFactory.getFullInfoTestCase();
            addTestCasePage.waitForPageLoaded();
            addTestCasePage.fillForm(testTestCase);
            testCasePage.clickAddTestCaseButton();
            testCasePage.waitForPageLoaded();
            testCasePage.clickEditButtonLocator();
            testCasePage.setTitleName("TITLE CASE");
            testCasePage.clickSectionName("Test Cases");
            testCasePage.clickTemplateDropdownLocator("Test Case (Text)");
            testCasePage.clickTypeDropdownLocator("Other");
            testCasePage.clickPriorityDropdownLocator("High");
            testCasePage.clickStepsLocator("Open Tab," +
                    "One, " +
                    "Two, " +
                    "Three");
            testCasePage.clickSaveTestCaseButtonLocator();
            Assert.assertTrue(testCasePage.idDisplayedUpdateSuccessMessage(), "Successfully updated the test case.");
        }

    @Description("Delete Test Case Tests")
    @Test(groups = {"smoke", "positive", "all"})
    public void deleteTestCase() throws IndexOutOfBoundsException {
            loginPage.waitForPageLoaded();
            loginPage.clickCheckmarkEmpty();
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
            dashboardPage.clickAddExampleProjectName("Project-qwe");
            dashboardPage.clickAddExampleProjectButton();
            overviewPage.waitForPageLoaded();
            overviewPage.clickTestCasesLink();
            testCasePage.waitForPageLoaded();
            testCasePage.jsClickAddTestCase();
            testCasePage.waitForPageLoaded();
            testCasePage.setTitleName("New Del Test Case");
            testCasePage.clickSectionName("Test Cases");
            testCasePage.clickTemplateDropdownLocator("Test Case (Text)");
            testCasePage.clickTypeDropdownLocator("Other");
            testCasePage.clickPriorityDropdownLocator("LOW");
            testCasePage.clickEstimateLocator("123");
            testCasePage.clickReferencesLocator("New");
            testCasePage.clickAutomationDropdownLocator("None");
            testCasePage.clickPreconditionLocator("Empty");
            testCasePage.clickStepsLocator("# 1" +
                    "# 2" +
                    "# 3" +
                    "Check");
            testCasePage.clickExpectedResultLocator("Ok");
            testCasePage.clickAddTestCaseButton();
            testCasePage.waitForPageLoaded();
            testCasePage.clickEditButtonLocator();
            testCasePage.clickDeleteThisTestCaseButtonLocator();
            testCasePage.clickMarkAsDeletedButtonLocator();
        Assert.assertTrue(testCasePage.idDisplayedSuccessMessageDeleteTestCaseLocator(), "Successfully flagged the test case as deleted.");
    }
}
