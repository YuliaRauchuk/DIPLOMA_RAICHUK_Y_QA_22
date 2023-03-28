package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class TestRunResultsPage extends HomePage{

    private final static By RUN_NAME_INPUT = By.xpath("//*[@id=\"name\"]");
    private final static By ADD_TEST_RUN_BUTTON = By.xpath("//*[@id=\"navigation-runs-add\"]/span");
    private final static By DISPLAYED_SUCCESS_MESSAGE = By.xpath("//*[@id=\"content-inner\"]/div[1]");
    private final static By CHECKBOX_INCLUDE_ALL_TESTCASE = By.xpath("//*[@id=\"includeAll\"]");
    private final static By BUTTON_ADD_TEST_RUN = By.xpath("//*[@id=\"accept\"]");
    private final static By DESCRIPTION_INPUT = By.xpath("//*[@id=\"description_display\"]");
    private final static By ADD_TEST_PLAN_BUTTON = By.xpath("//*[@id=\"navigation-plans-add\"]/span");
    private final static By PLAN_NAME_INPUT = By.xpath("//*[@id=\"name\"]"); //*[@id="name"]");
    private final static By PLAN_DESCRIPTION = By.xpath("//*[@id=\"description_display\"]");
    private final static By BUTTON_ADD_TEST_PLAN = By.xpath("//*[@id=\"accept\"]");
    private final static By DISPLAYED_PLAN_SUCCESS_MESSAGE  = By.xpath("//*[@id=\"content-inner\"]/div[1]");


    public TestRunResultsPage(WebDriver driver) {
        super(driver);
    }

   @Step("Setting Run Name Input")
    public void setRunNameInput() {
        log.info("Setting Run Name Input");
        driver.findElement(RUN_NAME_INPUT).sendKeys("RN");
    }

    @Step("Click Add Test Run Button")
    public void clickAddTestRunButton() {
        log.info("Click Add Test Run Button");
        driver.findElement(ADD_TEST_RUN_BUTTON).click();
    }
    @Step("Displayed Success Message")
   public boolean isDisplayedSuccessMessage() {
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
    public void setDescription() {
        log.info("Setting Description");
        driver.findElement(DESCRIPTION_INPUT).sendKeys("New T-RUN");

    }
    @Step("Click Add Test Plan Button")
    public void clickAddTestPlanButton() {
        log.info("Click Add Test Plan Button");
        driver.findElement(ADD_TEST_PLAN_BUTTON).click();
    }
    @Step("Setting Plan Name Input")
    public void setPlanNameInput() {
        log.info("Setting Plan Name Input");
        driver.findElement(PLAN_NAME_INPUT).sendKeys("PLAN R");
    }

    @Step("Setting Plan Description")
    public void setPlanDescription() {
        log.info("Setting Plan Description");
        driver.findElement(PLAN_DESCRIPTION).sendKeys("New T-RUN");
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
    @Override
    public boolean waitForPageLoaded() {
        return false;
    }
}
