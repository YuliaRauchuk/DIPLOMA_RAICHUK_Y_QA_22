package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

@Log4j2
public class TestRunResultsPage extends HomePage{

    private final static By RUN_NAME_INPUT = By.xpath("//*[@id=\"name\"]");
    private final static By ADD_TEST_RUN_BUTTON = By.xpath("//*[@id=\"navigation-runs-add\"]/span");
    private final static By DISPLAYED_SUCCESS_MESSAGE = By.xpath("//*[@id=\"content-inner\"]/div[1]");
    private final static By CHECKBOX_INCLUDE_ALL_TESTCASE = By.xpath("//*[@id=\"includeAll\"]");
    private final static By BUTTON_ADD_TEST_RUN = By.xpath("//*[@id=\"accept\"]");
    private final static By DESCRIPTION_INPUT = By.xpath("//*[@id=\"description_display\"]");
    private final static By ADD_TEST_PLAN_BUTTON = By.xpath("//*[@id=\"navigation-plans-add\"]/span");
    private final static By PLAN_NAME_INPUT = By.xpath("//*[@id=\"name\"]");
    private final static By PLAN_DESCRIPTION = By.xpath("//*[@id=\"description_display\"]");
    private final static By BUTTON_ADD_TEST_PLAN = By.xpath("//*[@id=\"accept\"]");
    private final static By DISPLAYED_PLAN_SUCCESS_MESSAGE  = By.xpath("//*[@id=\"content-inner\"]/div[1]");
    private final static By EDIT_BUTTON  = By.xpath("//*[@id=\"content-header\"]/div/div[3]/a[1]/span");
    private final static By CLOSE_THIS_TEST_PLAN_BUTTON  = By.xpath("//*[@id=\"sidebar\"]/div/div[3]/span");
    private final static By YES_BUTTON_CONFIRMATION = By.xpath("//*[@id=\"confirmDialog\"]/div[3]/a[1]");
    private final static By DISPLAYED_CLOSE_TEST_PLAN_SUCCESS_MESSAGE = By.xpath("//*[@id=\"content-inner\"]/div[1]");
    private final static By DELETE_THIS_TEST_PLAN_BUTTON = By.xpath("//*[@id=\"sidebar\"]/div/div[4]/span");
    private final static By CHECKBOX_DELETE_TEST_PLAN = By.xpath("//*[@id=\"deleteDialog\"]/div[2]/div/div");
    private final static By OK_BUTTON_CONFIRMATION = By.xpath("//*[@id=\"deleteDialog\"]/div[3]/a[1]");
    private final static By DISPLAYED_DELETE_TEST_PLAN_SUCCESS_MESSAGE = By.xpath("//*[@id=\"content-inner\"]/div[1]");
    private final static By LINK_EDIT = By.xpath("//*[@id=\"content-header\"]/div/div[3]/a[1]");

    public TestRunResultsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click Link Edit")
    public void jsClickLinkEdit() {
        log.info("Click Link Edit");
        jsClick(driver.findElement(LINK_EDIT));
    }

    @Step("Click Add Test Run Button")
    public void clickAddTestRunButton() {
        log.info("Click Add Test Run Button");
        driver.findElement(ADD_TEST_RUN_BUTTON).click();
    }
    @Step("Displayed Success Message")
   public boolean isDisplayedSuccessMessage(String s) {
        log.info("Displayed Success Message");
        driver.findElement(DISPLAYED_SUCCESS_MESSAGE).isDisplayed();
        return true;
    }

    @Step("Click CheckBox Include All TestCase")
    public void clickCheckBoxIncludeAllTestCase() {
        log.info("Click CheckBox Include All TestCase");
        driver.findElement(CHECKBOX_INCLUDE_ALL_TESTCASE).click();
    }

    @Step("Click Button Add TestRun")
    public void clickButtonAddTestRun() {
        log.info("Click Button Add TestRun");
        driver.findElement(BUTTON_ADD_TEST_RUN).click();
    }

    @Step("Setting Description")
    public void setDescription(String name) {
        log.info("Setting Description");
        driver.findElement(DESCRIPTION_INPUT).sendKeys(name);

    }
    @Step("Click Add Test Plan Button")
    public void clickAddTestPlanButton() {
        log.info("Click Add Test Plan Button");
        driver.findElement(ADD_TEST_PLAN_BUTTON).click();
    }
    @Step("Setting Plan Name Input")
    public void setPlanNameInput(String name) {
        log.info("Setting Plan Name Input");
        driver.findElement(PLAN_NAME_INPUT).sendKeys(name);
    }

    @Step("Setting Plan Description")
    public void setPlanDescription(String name) {
        log.info("Setting Plan Description");
        driver.findElement(PLAN_DESCRIPTION).sendKeys(name);
    }

    @Step("Click Button Add Test Plan")
    public void clickButtonAddTestPlan() {
        log.info("Click Button Add Test Plan");
        driver.findElement(BUTTON_ADD_TEST_PLAN).click();
    }
    @Step("Displayed Plan Success Message")
    public boolean isDisplayedPlanSuccessMessage() {
        log.info("Displayed Plan Success Message");
        driver.findElement(DISPLAYED_PLAN_SUCCESS_MESSAGE).isDisplayed();
        return true;
    }

    @Step("Click Edit Button")
    public void clickEditButton() {
        log.info("Click Edit Button");
        driver.findElement(EDIT_BUTTON).click();
    }
    @Step("Click Close This Test Plan Button")
    public void clickCloseThisTestPlanButton() {
        log.info("Click Close This Test Plan Button");
        driver.findElement(CLOSE_THIS_TEST_PLAN_BUTTON).click();
    }
    @Step("Click Yes Button Confirmation Message")
    public void  clickYesButtonConfirmationMessage() {
        log.info("Click Yes Button Confirmation Message");
        driver.findElement(YES_BUTTON_CONFIRMATION).click();
    }

    @Step("Displayed Close Test Plan Success Message")
    public boolean isDisplayedCloseTestPlanSuccessMessage(String s) {
        log.info("Displayed Close Test Plan Success Message");
        driver.findElement(DISPLAYED_CLOSE_TEST_PLAN_SUCCESS_MESSAGE).isDisplayed();
        return true;
    }
    @Step("Click Delete This Test Plan Button")
    public void clickDeleteThisTestPlanButton() {
        log.info("Click Delete This Test Plan Button");
        driver.findElement(DELETE_THIS_TEST_PLAN_BUTTON).click();
    }
    @Step("Click Click Checkbox Delete Test Plan")
    public void clickCheckboxDeleteTestPlan() {
        log.info("Click Checkbox Delete Test Plan");
        driver.findElement(CHECKBOX_DELETE_TEST_PLAN).click();
    }
    @Step("Click Ok Button Conformation")
    public void clickOkButtonConformation() {
        log.info("Click Ok Button Conformation");
        driver.findElement(OK_BUTTON_CONFIRMATION).click();
    }
    @Step("Click Add Test Run Button")
    public boolean isDisplayedDeleteTestPlanSuccessMessage(String s) {
        log.info("Click Add Test Run Button");
        driver.findElement(DISPLAYED_DELETE_TEST_PLAN_SUCCESS_MESSAGE).isDisplayed();
        return true;
    }
    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
