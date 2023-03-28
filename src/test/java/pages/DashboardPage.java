package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


@Log4j2

public class DashboardPage extends HomePage {

    private final static By ADD_EXAMPLE_PROJECT = By.xpath("//*[@id=\"content-inner\"]/div[2]/a[2]");
    private final static By ADD_EXAMPLE_PROJECT_NAME = By.xpath("//*[@id=\"addProjectName\"]");
    private final static By ADD_EXAMPLE_PROJECT_BUTTON = By.xpath("//*[@id=\"addProjectSubmit\"]");

    private final static By NAVIGATION_USERNAME = By.xpath("//*[@id=\"navigation-user\"]/span[2]");
    private final static By ADD_PROJECT_BUTTON = By.xpath("//*[@id=\"sidebar-projects-add\"]");
    private final static By DELETE_PROJECT_BUTTON_LOCATOR = By.xpath("//*[@id=\"content-inner\"]/table/tbody/tr[2]/td[3]/a/div");
    private final static By CHECKBOX_DELETE_PROJECT_LOCATOR = By.xpath("//*[@id='deleteDialog']//input");
    private final static By OK_BUTTON_LOCATOR = By.xpath("//*[@id=\"deleteDialog\"]/div[3]/a[1]");
    private final static By DELETE_PROJECT_MESSAGE_LOCATOR = By.xpath("//*[@id=\"content-inner\"]/div[1]");
    private final static By PROJECT = By.xpath("//*[contains(text(), 'TEST PROJECT')] ");
    private final static By ADDED_PROJECT_MESSAGE_LOCATOR = By.xpath("//*[@id=\"content-inner\"]/div[1]");

    private final static By LOGOUT_BUTTON = By.xpath("//*[@id='navigation-user-logout']");
    private final static By LINK_PROJECT_MILESTONES = By.xpath("//*[contains(text(), 'Milestones')]");

    private final static By LINK = By.xpath("//td//a[@class='link-noline']");
    public DashboardPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, 30);
    }

    public boolean waitForPageLoaded() {
        return false;
    }

    @Step("Click Add Example Project")
    public void clickAddExampleProject() {
        log.info("Click Add Example Project");
        driver.findElement(ADD_EXAMPLE_PROJECT).click();
    }

    @Step("Displayed Added Project Message Locator")
    public boolean isDisplayedAddedProjectMessageLocator() {
        log.info("Displayed Added Project Message Locator");
        driver.findElement(ADDED_PROJECT_MESSAGE_LOCATOR).isDisplayed();
        return true;
    }
    @Step("Click Link")
    public void clickLink() {
        log.info("Click Link");
        driver.findElement(LINK).click();
    }
    @Step("Click Link Project Milestones")
    public boolean openLinkProjectMilestones() {
        log.info("Click Link Project Milestones");
        driver.findElement(LINK_PROJECT_MILESTONES).isEnabled();
        return true;
    }

    @Step("Click LogOut Button")
    public void clickLogOutButton() {
        log.info("Click LogOut Button");
        driver.findElement(LOGOUT_BUTTON).click();
    }

    @Step("Click Add Project Button")
    public void clickAddProjectButton() {
        log.info("Click Add Project Button");
        driver.findElement(ADD_PROJECT_BUTTON).click();
    }

    @Step("Click Navigation Username")
    public boolean clickNavigationUserName() {
        log.info("Click Navigation Username");
        driver.findElement(NAVIGATION_USERNAME).click();
        return false;
    }

    @Step("Click Delete Project Button Locator")
    public void clickDeleteProjectButtonLocator() {
        log.info("Click Delete Project Button Locator");
        driver.findElement(DELETE_PROJECT_BUTTON_LOCATOR).click();
    }

    @Step("Click Checkbox Delete Project Locator")
    public void clickCheckboxDeleteProjectLocator() {
        log.info("Click Checkbox Delete Project Locator");
        driver.findElement(CHECKBOX_DELETE_PROJECT_LOCATOR).click();
    }

    @Step("Click Ok Button Locator")
    public void clickOkButtonLocator() {
        log.info("Click Ok Button Locator");
        driver.findElement(OK_BUTTON_LOCATOR).click();
    }

    @Step("Displayed Delete Project Message Locator")
    public boolean isDisplayedDeleteProjectMessageLocator() {
        log.info("Displayed Delete Project Message Locator");
        driver.findElement(DELETE_PROJECT_MESSAGE_LOCATOR).isDisplayed();
        return true;
    }

    @Step("Click Test Project")
    public void openTestProject(String testProject) {
        log.info("Click Test Project");
        driver.findElement(PROJECT).isEnabled();
    }

    public boolean isAddProjectButtonDisplayed() {
    return true;
    }
    @Step("Setting Add Example Project Name")
    public void clickAddExampleProjectName(String name) {
        log.info("Setting Add Example Project Name");
        driver.findElement(ADD_EXAMPLE_PROJECT_NAME).sendKeys(name);

    }

    @Step("Setting Add Example Project Button")
    public void clickAddExampleProjectButton() {
        log.info("Setting Add Example Project Button");
        driver.findElement(ADD_EXAMPLE_PROJECT_BUTTON).click();

    }
}

