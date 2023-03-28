package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



@Log4j2
public class ProjectPage extends HomePage {


    public final static By NAME_INPUT = By.cssSelector("input#name");
    private final static By ANNOUNCEMENT_LOCATOR = By.cssSelector("//textarea[@id='announcement']");
    private final static By SUITE_MODE_LOCATOR = By.xpath("//*[@id=\"suite_mode_single\"]");

    private final static By SAVE_PROJECT_BUTTON_LOCATOR = By.xpath("//*[@id=\"accept\"]");
    private final static By CANCEL_PROJECT_BUTTON_LOCATOR = By.cssSelector("/a[@id='admin-integration-form-cancel']");

    private final static By EDIT_PROJECT_LOCATOR = By.cssSelector("//div[@class='icon-small-edit']");
    private final static By DELETE_PROJECT_CONFIRMATION_MESSAGE_LOCATOR = By.cssSelector("//div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix']");



    public ProjectPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean waitForPageLoaded() {
        return false;
    }

    @Step("Project Name")
    public void setProjectName(String name) {
        log.info("Project Name");
        driver.findElement(NAME_INPUT).sendKeys(name);
    }

    @Step("Setting Announcement")
    public void setAnnouncement(String name) {
        log.info("Setting Announcement");
        driver.findElement(ANNOUNCEMENT_LOCATOR).sendKeys(name);
    }

    @Step("Click Suite Mode Locator")
    public void clickSuiteModeLocator() {
        log.info("Click Suite Mode Locator");
        driver.findElement(SUITE_MODE_LOCATOR).click();
    }

    @Step("Click Project Button Locator")
    public void clickSaveProjectButtonLocator() {
        log.info("Click Project Button Locator");
        driver.findElement(SAVE_PROJECT_BUTTON_LOCATOR).click();
    }

    @Step("Click Cancel Project Button Locator")
    public void setCancelProjectButtonLocator() {
        log.info("Click Cancel Project Button Locator");
        driver.findElement(CANCEL_PROJECT_BUTTON_LOCATOR).click();
    }

    @Step("Click Edit Project Locator")
    public void setEditProjectLocator() {
        log.info("Click Edit Project Locator");
        driver.findElement(EDIT_PROJECT_LOCATOR).click();
    }
    @Step("Displayed Delete Project Confirmation Message Locator")
    public void isDisplayedDeleteProjectConfirmationMessageLocator() {
        log.info("Displayed Delete Project Confirmation Message Locator");
        driver.findElement(DELETE_PROJECT_CONFIRMATION_MESSAGE_LOCATOR).isDisplayed();
    }

    public boolean isAccessMessageDisplayed() {
        return true;
    }

}
