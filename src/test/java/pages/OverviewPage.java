package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@Log4j2
public class OverviewPage extends BasePage {

    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean waitForPageLoaded() {
        return true;
    }

    private final static By MILESTONES_LINK = By.xpath("//*[@id=\"navigation-milestones\"]");
    private final static By DASHBOARD_LINK = By.xpath("//*[@id=\"navigation-dashboard\"]");
    private final static By TODO_LINK = By.xpath("//*[@id=\"navigation-todos\"]");
    private final static By OVERVIEW_LINK = By.xpath("//*[@id=\"navigation-projects\"]");
    private final static By TEST_RUN_AND_RESULTS_LINK = By.xpath("//*[@id=\"navigation-runs\"]");
    private final static By TEST_CASES_LINK = By.xpath("//*[@id=\"navigation-suites\"]");
    private final static By REPORTS_LINK = By.xpath("//*[@id=\"navigation-reports\"]");

    @Step("Click Add Milestones Link")
    public void clickMilestonesLink() {
        log.info("Click Add Milestones Link");
        driver.findElement(MILESTONES_LINK).click();
    }
    @Step("Click Dashboard Link")
    public void clickDashboardLink() {
        log.info("Click Dashboard Link");
        driver.findElement(DASHBOARD_LINK).click();
    }
    @Step("Click Overview Link")
    public void clickOverviewLink() {
        log.info("Click Overview Link");
        driver.findElement(OVERVIEW_LINK).click();
    }

    @Step("Click TODO link")
    public void clickToDoLink() {
        log.info("Click TODO Link");
        driver.findElement(TODO_LINK).click();
    }

    @Step("Click Test Cases Link")
    public void clickTestCasesLink() {
        log.info("Click Test Cases Link");
        driver.findElement(TEST_CASES_LINK).click();
    }
    @Step("Click TestRun And Results Link")
    public void clickTestRunAndResultsLink() {
        log.info("Click TestRun And Results Link");
        driver.findElement(TEST_RUN_AND_RESULTS_LINK).click();
    }
    @Step("Click Reports Link")
    public void clickReportsLink() {
        log.info("Click Reports Link");
        driver.findElement(REPORTS_LINK).click();

    }
}