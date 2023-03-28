package tests;

import jdk.jfr.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;


@Log4j2
public class ProjectTests extends BaseTest {

    @Override
    public void waitForPageLoaded() {
    }
    @Description("Positive Create New Project Test")
    @Test(groups = {"smoke", "regression"})
    public void positiveCreateNewProjectTest() throws IndexOutOfBoundsException {
            loginPage.waitForPageLoaded();
            loginPage.setEmail(EMAIL);
            loginPage.setPassword(PASSWORD);
            loginPage.clickLoginButton();
            dashboardPage.waitForPageLoaded();
            dashboardPage.clickAddProjectButton();
            projectPage.setProjectName("Project New Ray");
            projectPage.clickSuiteModeLocator();
            projectPage.clickSaveProjectButtonLocator();
        Assert.assertTrue(projectPage.isAccessMessageDisplayed(), "Successfully added the new project.");
            dashboardPage.clickDeleteProjectButtonLocator();
            dashboardPage.clickCheckboxDeleteProjectLocator();
            dashboardPage.clickOkButtonLocator();
            dashboardPage.isDisplayedDeleteProjectMessageLocator();
        Assert.assertTrue(dashboardPage.isDisplayedDeleteProjectMessageLocator(), "Successfully deleted the project");
    }
}
