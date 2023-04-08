package tests;

import io.qameta.allure.Attachment;
import jdk.jfr.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static constans.ConstantLogin.LoginTestsConstants.*;


@Log4j2
public class LoginTests extends BaseTest {

    @Attachment
    @Description("Fail login page")
    @Test(dataProvider = "negativeLoginTestData",groups = {"negative", "smoke"})
    public void negativeLoginTests() throws IndexOutOfBoundsException {
        loginPage.waitForPageLoaded();
        loginPage.clickCheckmarkEmpty();
        loginPage.setEmail(EMAIL);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        Assert.assertEquals(loginPage.getErrorMessageText(), "Email/Login or Password is incorrect. Please try again.");
        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Checking for an error message");

    }
    @DataProvider
    public static Object[][] negativeLoginTestData() {
        return new Object[][]{
                {INCORRECT_EMAIL, PASSWORD, ERROR_MESSAGE_TEXT},
                {EMAIL, INCORRECT_PASSWORD, ERROR_MESSAGE_TEXT},
                {INCORRECT_EMAIL, INCORRECT_PASSWORD, ERROR_MESSAGE_TEXT},
        };

    }

    @Description("Check login page")
    @Test(groups = {"all", "positive", "smoke", "regression"})
    public void positiveLoginTests() throws IndexOutOfBoundsException {
            loginPage.waitForPageLoaded();
            loginPage.clickCheckmarkEmpty();
            loginPage.setEmail(EMAIL);
            loginPage.setPassword(PASSWORD);
            loginPage.clickLoginButton();
            dashboardPage.waitForPageLoaded();
        Assert.assertTrue(dashboardPage.isAddProjectButtonDisplayed());
}

    @Description("Check logout page")
    @Test(groups = {"all", "positive", "smoke", "regression"})
    public void logOutLoginTests() throws IndexOutOfBoundsException  {
            loginPage.waitForPageLoaded();
            loginPage.clickCheckmarkEmpty();
            loginPage.setEmail(EMAIL);
            loginPage.setPassword(PASSWORD);
            loginPage.clickLoginButton();
            dashboardPage.waitForPageLoaded();
            dashboardPage.clickNavigationUserName();
        Assert.assertTrue(dashboardPage.jsClickLogOutButton());
    }
}