package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@Log4j2
public class TestCasePage extends BasePage {

    public TestCasePage(WebDriver driver) {
        super(driver);
    }
    private final static By ADD_TEST_CASE = By.xpath("//*[@id=\"sidebar-cases-add\"]");
    private final static By TITLE_LOCATOR = By.xpath("//*[@id=\"title\"]");
    private final static By SECTION_DROPDOWN_LOCATOR = By.xpath("//*[@id=\"section_id_chzn\"]/a/span");
    private final static By TEMPLATE_DROPDOWN_LOCATOR = By.xpath("//*[@id=\"template_id_chzn\"]/a/span");
    private final static By TYPE_DROPDOWN_LOCATOR = By.xpath("//*[@id=\"type_id_chzn\"]/a/span");
    private final static By PRIORITY_DROPDOWN_LOCATOR = By.xpath("//*[@id=\"priority_id_chzn\"]/a/span");
    private final static By ESTIMATE_LOCATOR = By.xpath("//*[@id=\"estimate\"]");
    private final static By REFERENCES_LOCATOR = By.xpath("//*[@id=\"refs\"]");
    private final static By AUTOMATION_DROPDOWN_LOCATOR = By.xpath("//*[@id=\"custom_automation_type_chzn\"]/a/span");
    private final static By PRECONDITION_LOCATOR = By.xpath("//*[@id=\"custom_preconds_display\"]");
    private final static By STEPS_LOCATOR = By.xpath("//*[@id=\"custom_steps_display\"]");
    private final static By EXPECTED_RESULT_LOCATOR = By.xpath("//*[@id=\"custom_expected_display\"]");
    private final static By ADD_TEST_CASE_BUTTON = By.xpath("//*[@id=\"accept\"]");
    private final static By ADD_AND_NEXT_BUTTON = By.xpath("//*[@id=\"accept_and_next\"]");
    private final static By CANCEL_BUTTON_LOCATOR = By.xpath("//*[@id=\"form\"]/div[2]/a");
    private final static By SUCCESS_MESSAGE = By.xpath("//*[@id=\"content-inner\"]/div[1]"); //"Successfully added the new test case."
    private final static By FIELD_TITLE_SUCCESS_MESSAGE = By.xpath("//*[@id=\"content-inner\"]/div[3]");


    private final static By EDIT_BUTTON_LOCATOR = By.xpath("//a[contains(@class,'button-edit')]");
    private final static By DELETE_BUTTON_LOCATOR = By.cssSelector("//a[@id='deleteCasesDisabled']//span[@class='button-text']");

    private final static By SAVE_TEST_CASE_BUTTON_LOCATOR = By.xpath("//*[@id=\"accept\"]");
    private final static By DELETE_THIS_TEST_CASE_BUTTON_LOCATOR = By.xpath("//*[@id=\"sidebar\"]/div[1]/div[3]/a/span");
    private final static By MARK_AS_DELETED_BUTTON_LOCATOR = By.xpath("//*[@id='casesDeletionDialog']/div[3]/div/a[2]");
    private final static By SUCCESS_MESSAGE_DELETE_TEST_CASE_LOCATOR = By.xpath("//*[@id=\"content-inner\"]/div[1]");
    private final static By UPDATE_SUCCESS_MESSAGE = By.cssSelector("//*[@id=\"content-inner\"]/div[1]");
    @Override
    public boolean waitForPageLoaded() {

        return false;
    }

    @Step("Click Add Test Cases")
    public void clickAddTestCase() {
        log.info("Click Add Test Cases");
        driver.findElement(ADD_TEST_CASE).click();
    }

    @Step("Setting Title Locator")
    public void clickTitleLocator(String newTestCase) {
        log.info("Setting Title Locator");
        driver.findElement(TITLE_LOCATOR).click();
    }

    @Step("Click Section Dropdown Locator")
    public void clickSectionDropdownLocator(String testCases) {
        log.info("Click Section Dropdown Locator");
        driver.findElement(SECTION_DROPDOWN_LOCATOR).click();
    }

    @Step("Click Template Dropdown Locator")
    public void clickTemplateDropdownLocator(String s) {
        log.info("Click Template Dropdown Locator");
        driver.findElement(TEMPLATE_DROPDOWN_LOCATOR).click();
    }

    @Step("Click Type Dropdown Locator")
    public void clickTypeDropdownLocator(String other) {
        log.info("Click Type Dropdown Locator");
        driver.findElement(TYPE_DROPDOWN_LOCATOR).click();
    }

    @Step("Click Priority Dropdown Locator")
    public void clickPriorityDropdownLocator(String medium) {
        log.info("Click Priority Dropdown Locator");
        driver.findElement(PRIORITY_DROPDOWN_LOCATOR).click();
    }

    @Step("Click Estimate Locator")
    public void clickEstimateLocator(String aaa) {
        log.info("Click Estimate Locator");
        driver.findElement(ESTIMATE_LOCATOR).click();
    }

    @Step("Click References Locator")
    public void clickReferencesLocator(String qwe) {
        log.info("Click References Locator");
        driver.findElement(REFERENCES_LOCATOR).click();
    }

    @Step("Click Automation Dropdown Locator")
    public void clickAutomationDropdownLocator(String none) {
        log.info("Click Automation Dropdown Locator");
        driver.findElement(AUTOMATION_DROPDOWN_LOCATOR).click();
    }

    @Step("Click Precondition Locator")
    public void clickPreconditionLocator(String sdk) {
        log.info("Click Precondition Locator");
        driver.findElement(PRECONDITION_LOCATOR).click();
    }

    @Step("Click Steps Locator")
    public void clickStepsLocator(String s) {
        log.info("Click Steps Locator");
        driver.findElement(STEPS_LOCATOR).click();
    }

    @Step("Click Expected Result Locator")
    public void clickExpectedResultLocator(String working) {
        log.info("Click Expected Result Locator");
        driver.findElement(EXPECTED_RESULT_LOCATOR).click();
    }

    @Step("Click Add Test Case Button")
    public void clickAddTestCaseButton() {
        log.info("Click Add Test Case Button");
        driver.findElement(ADD_TEST_CASE_BUTTON).click();
    }

    @Step("Click Add And Next Button")
    public void clickAddAndNextButton() {
        log.info("Click Add And Next Button");
        driver.findElement(ADD_AND_NEXT_BUTTON).click();
    }

    @Step("Click Cancel Button")
    public void clickCancelButtonLocator() {
        log.info("Click Cancel Button");
        driver.findElement(CANCEL_BUTTON_LOCATOR).click();
    }

    @Step("Displayed Success Message")
    public boolean isDisplayedSuccessMessage() {
        log.info("Displayed Success Message");
        driver.findElement(SUCCESS_MESSAGE).isDisplayed();
        return true;
    }
    @Step("Displayed Field Title Success Message")
    public boolean isDisplayedFieldTitleSuccessMessage() {
        log.info("Displayed Field Title Success Message");
        driver.findElement(FIELD_TITLE_SUCCESS_MESSAGE).isDisplayed();
        return true;
    }


    @Step("Click Edit Button Locator")
    public void clickEditButtonLocator() {
        log.info("Click Edit Button Locator");
        driver.findElement(EDIT_BUTTON_LOCATOR).click();
    }

    @Step("Click Delete Button Locator")
    public void clickDeleteButtonLocator() {
        log.info("Click Delete Button Locator");
        driver.findElement(DELETE_BUTTON_LOCATOR).click();
    }

    @Step("Click Save Test Case Button Locator")
    public void clickSaveTestCaseButtonLocator() {
        log.info("Click Save Test Case Button Locator");
        driver.findElement(SAVE_TEST_CASE_BUTTON_LOCATOR).click();
    }

    @Step("Click Delete This Test Case Button Locator")
    public void clickDeleteThisTestCaseButtonLocator() {
        log.info("Click Delete This Test Case Button Locator");
        driver.findElement(DELETE_THIS_TEST_CASE_BUTTON_LOCATOR).click();
    }

    @Step("Click Mark As Deleted Button Locator")
    public void clickMarkAsDeletedButtonLocator() {
        log.info("Click Mark As Deleted Button Locator");
        driver.findElement(MARK_AS_DELETED_BUTTON_LOCATOR).click();
    }

    @Step("Displayed Success Message Delete Test Case Locator")
    public boolean idDisplayedSuccessMessageDeleteTestCaseLocator() {
        log.info("Displayed Success Message Delete Test Case Locator");
        driver.findElement(SUCCESS_MESSAGE_DELETE_TEST_CASE_LOCATOR).isDisplayed();
        return false;
    }

    @Step("Displayed Update Success Message")
    public boolean idDisplayedUpdateSuccessMessage() {
        log.info("Displayed Update Success Message");
        driver.findElement(UPDATE_SUCCESS_MESSAGE).isDisplayed();
        return false;
    }
}
