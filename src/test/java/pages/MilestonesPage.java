package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@Log4j2
public class MilestonesPage extends HomePage {

    private final static By ADD_MILESTONES = By.xpath("//*[@id=\"accept\"]");
    private final static By ADD_MILESTONE_BUTTON = By.xpath("//*[@id=\"navigation-milestones-add\"]/span");
    private final static By MILESTONES_NAME = By.xpath("//*[@id=\"name\"]");

    private final static By DESCRIPTION = By.xpath("//*[@id=\"description_display\"]");
    private final static By START_DATA = By.xpath("//*[@id=\"start_on\"]");
    private final static By END_DATA = By.xpath("//*[@id=\"due_on\"]");
    private final static By CHECKBOX_COMPLETED = By.xpath("//*[@id=\"is_completed\"]");
    private final static By MILESTONES_MESSAGE_SUCCESS = By.xpath("//*[@id=\"content-inner\"]/div[1]");

    private final static By EDIT_LINK_MILESTONE_LOCATOR = By.xpath("//*[@id=\"milestone-287\"]/div[3]/div[2]/a[1]");
    private final static By ENTITY_MILESTONES_INPUT_LOCATOR = By.xpath("//*[@id=\"milestone-855992945\"]/span/input");
    private final static By DELETE_THIS_MILESTONE_BUTTON = By.xpath("////*[@id=\"milestone-287\"]/div[5]/a/div");
    private final static By CONFIRM_DELETE_INPUT_LOCATOR = By.xpath("//*[@id=\"confirm-check\"]");
    private final static By CONFIRM_DELETE_BUTTON_LOCATOR = By.xpath("//*[@id=\"bulkDeleteDialog\"]/div[3]/a[1]");


    public MilestonesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean waitForPageLoaded() {
        return true;
    }

    @Step("Click Add Milestone Button")
    public void clickAddMilestoneButton() {
        log.info("Click Add Milestone Button");
        driver.findElement(ADD_MILESTONE_BUTTON).click();

    }

    @Step("Setting Milestones Name")
    public void setMilestonesName(String name) {
        log.info("Setting Milestones Name");
        driver.findElement(MILESTONES_NAME).sendKeys(name);
    }

    @Step("Setting Description")
    public void setDescription(String name) {
        log.info("Setting Description");
        driver.findElement(DESCRIPTION).sendKeys(name);

    }

    @Step("Setting Start Data")
    public void setStartData(String name) {
        log.info("Setting Start Data");
        driver.findElement(START_DATA).sendKeys(name);
    }
    @Step("Setting End Data")
    public void setEndData(String name) {
        log.info("Setting End Data");
        driver.findElement(END_DATA).sendKeys(name);
    }

    @Step("Displayed Message Success Locator")
    public void isDisplayedMessageSuccessLocator(String s) {
        log.info("Displayed Message Success Locator");
        driver.findElement(MILESTONES_MESSAGE_SUCCESS).isDisplayed();
    }

    @Step("Click Checkbox Completed")
    public void clickCheckboxCompleted() {;
        log.info("Click Checkbox Completed");
        driver.findElement(CHECKBOX_COMPLETED).click();

    }

    @Step("Click Add Milestones")
    public void clickAddMilestones() {
        log.info("Click Rerun Button Locator");
        driver.findElement(ADD_MILESTONES).click();

    }
@Step("Click Edit Link Milestone Locator")
    public void clickEditLinkMilestoneLocator() {
        log.info("Click Edit Link Milestone Locator");
        driver.findElement(EDIT_LINK_MILESTONE_LOCATOR).click();
    }

    @Step("click entity milestone checkbox")
    public void clickEntityMilestonesCheckbox() {
        log.info("click entity milestone checkbox");
        driver.findElement(ENTITY_MILESTONES_INPUT_LOCATOR).click();
    }

    @Step("Click Delete This Milestone Button")
    public void clickDeleteThisMilestoneButton() {
        log.info("Click Delete This Milestone Button");
        driver.findElement(DELETE_THIS_MILESTONE_BUTTON).click();
    }

    @Step("Click confirm delete checkbox")
    public void clickConfirmDeleteCheckbox() {
        log.info("click confirm delete checkbox");
        driver.findElement(CONFIRM_DELETE_INPUT_LOCATOR).click();
    }

    @Step("click confirm delete button")
    public void clickConfirmDeleteButton() {
        log.info("click confirm delete button");
        driver.findElement(CONFIRM_DELETE_BUTTON_LOCATOR).click();
    }

    public boolean isAccessMessageDisplayed() {
        return true;
    }
}