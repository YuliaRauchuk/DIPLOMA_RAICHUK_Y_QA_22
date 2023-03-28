package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;


@Log4j2
public class LoginPage extends BasePage {

    private final static By LOGIN_PAGE_FORM = By.cssSelector("//*[@id=\"content\"]/form/div[2]/div/label");
    private final static By LOGIN_BUTTON = By.cssSelector(".single-sign-on");
    private final static By EMAIL_INPUT = By.cssSelector("input#name");
    private final static By PASSWORD_INPUT = By.cssSelector("input#password");
    private final static By ERROR_MESSAGE = By.cssSelector(".message.message-success");
    private final static By VALIDATION_ERROR_MESSAGE = By.xpath("//*[contains(text(), 'Password is too short (5 characters required')]");




    public LoginPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, 30);
    }

    public boolean waitForPageLoaded() {
        return true;
    }

    public void open() throws IndexOutOfBoundsException, InterruptedException {
        driver.get("https://jfd.testrail.io");
        Thread.sleep(2000);
    }

    @Step("Displayed Login Page Form")
    public boolean isLoginPageForm() {
        log.info("Displayed Login Page Form");
        driver.findElement(LOGIN_PAGE_FORM).isDisplayed();
        return true;
    }

    @Step("setting email input")
    public void setEmail(String email) {
        log.info("setting email input");
        driver.findElement(EMAIL_INPUT).sendKeys(email);
    }

    @Step("setting password input")
    public void setPassword(String password) {
        log.info("setting password input");
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    @Step("Displayed error message")
    public boolean isErrorMessage() {
        log.info("Displayed error message");
        return driver.findElement(ERROR_MESSAGE).isDisplayed();

    }

    @Step("click login button")
    public void clickLoginButton() {
        log.info("click login button");
        driver.findElement(LOGIN_BUTTON).click();
    }

    @Step("Displayed Validation Error Message")
    public boolean isDisplayedValidationErrorMessage() {
        log.info("Displayed Validation Error Message");
        driver.findElement(VALIDATION_ERROR_MESSAGE).isDisplayed();
        return true;
    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();

    }
}

