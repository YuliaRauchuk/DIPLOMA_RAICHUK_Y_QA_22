package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import utils.AllureUtils;
import utils.PropertyReader;

@Log4j2
public class LoginPage extends BasePage {
    protected final static String BASE_URL = PropertyReader.getProperty("test_rail.url");
    private final static By LOGIN_BUTTON = By.cssSelector(".single-sign-on");
    private final static By EMAIL_INPUT = By.cssSelector("input#name");
    private final static By PASSWORD_INPUT = By.cssSelector("input#password");
    private final static By ERROR_MESSAGE = By.cssSelector(".message.message-success");
    private final static By VALIDATION_ERROR_MESSAGE = By.xpath("//*[contains(text(), 'Password is too short (5 characters required')]");
    private final static By LOGIN_PAGE_CHECKMARK_EMPTY = By.xpath("//*[@id=\"content\"]/form/label/span");
    public final static String ERROR_MESSAGE_TEXT = "Email/Login or Password is incorrect. Please try again.";

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public boolean waitForPageLoaded() {
        return true;
    }


    @Step("Setting email input")
    public void setEmail(String email) {
        log.info("Setting email input");
        driver.findElement(EMAIL_INPUT).sendKeys(email);
    }

    @Step("Setting password input")
    public void setPassword(String password) {
        log.info("Setting password input");
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    @Step("Displayed error message")
    public boolean isErrorMessage() {
        log.info("Displayed error message");
        return driver.findElement(ERROR_MESSAGE).isDisplayed();

    }

    @Step("Check error message text")
    public String getErrorMessageText() {
        log.info("Get error message text");
        return driver.findElement(By.id(ERROR_MESSAGE_TEXT)).getText();
    }
    @Step("check is error message displayed")
    public boolean isErrorMessageDisplayed() {
        log.info("is error message displayed");
        return driver.findElement(ERROR_MESSAGE).isDisplayed();
    }

    @Step("Setting email, password and clicking login button")
    public void login(String email, String password) {
        setEmail(email);
        setPassword(password);
        AllureUtils.attachScreenshot(driver);
        clickLoginButton();

    }

    @Step("Click login button")
    public void clickLoginButton() {
        log.info("Click login button");
        driver.findElement(LOGIN_BUTTON).click();
    }

    @Step("Displayed Validation Error Message")
    public boolean isDisplayedValidationErrorMessage() {
        log.info("Displayed Validation Error Message");
        driver.findElement(VALIDATION_ERROR_MESSAGE).isDisplayed();
        return true;
    }
    @Step("Displayed Checkmark Empty")
    public boolean clickCheckmarkEmpty() {
        log.info("Displayed Checkmark Empty");
        driver.findElement(LOGIN_PAGE_CHECKMARK_EMPTY).click();
        return true;
    }

    public void open() {
        driver.get(BASE_URL);
    }
    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();

    }
}

