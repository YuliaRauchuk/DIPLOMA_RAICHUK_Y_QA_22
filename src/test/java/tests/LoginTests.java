package tests;

import jdk.jfr.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.OverviewPage;


@Log4j2
public class LoginTests extends BaseTest {
    @Override
    public void waitForPageLoaded() {
    }
    @BeforeClass
    public void initialise() {

        overviewPage = new OverviewPage(driver);
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
    }
    @Description("Check login page and logout")
    @Test(groups = {"all", "positive", "smoke"})
    public void loginLoginTests() throws IndexOutOfBoundsException {
            loginPage.waitForPageLoaded();
            loginPage.setEmail(EMAIL);
            loginPage.setPassword("QWE");
            loginPage.clickLoginButton();
            loginPage.isDisplayedValidationErrorMessage();
        Assert.assertTrue(loginPage.isDisplayedValidationErrorMessage(), "Password is too short (5 characters required");
            loginPage.setEmail(EMAIL);
            loginPage.setPassword(PASSWORD);
            loginPage.clickLoginButton();
            dashboardPage.waitForPageLoaded();
            dashboardPage.isAddProjectButtonDisplayed();
        Assert.assertTrue(dashboardPage.isAddProjectButtonDisplayed());
            dashboardPage.clickNavigationUserName();
            dashboardPage.waitForPageLoaded();
            dashboardPage.clickLogOutButton();
        Assert.assertTrue(loginPage.waitForPageLoaded());
    }
}