package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public abstract class HomePage extends BasePage {


    private final static By ADMINISTRATION_TAB = By.xpath("//*[@id=\"navigation-admin\"]");
    private final static By UPGRADE_BUTTON = By.xpath("//*[@id=\"pendo-image-badge-035eb248\"]");
    private final static By MY_SETTING_BUTTON = By.xpath("//*[@id=\"navigation-user-settings\"]");
    private final static By LOG_OUT_BUTTON = By.xpath("//*[@id=\"navigation-user-logout\"]");
    private final static By SEARCH_FIELD = By.xpath("//*[@id=\"search_query\"]");

    protected WebDriverWait wait;

    public HomePage(WebDriver driver) {

        super(driver);
        this.wait = new WebDriverWait(driver, 30);

    }
    public boolean waitForPageLoaded(){
        return false;
    }


    @Step("Click Administration Tab")
    public void clickAdministrationTab() {
        log.info("Click Administration Tab");
        driver.findElement(ADMINISTRATION_TAB).click();

    }
    @Step("Click Upgrade Button")
    public void clickUpgradeButton() {
        log.info("Click Upgrade Button");
        driver.findElement(UPGRADE_BUTTON).click();

    }

    @Step("Click My Setting Button")
    public void clickMySettingButton() {
        log.info("Click My Setting Button");
        driver.findElement(MY_SETTING_BUTTON).click();

    }
    @Step("Click LogOut Button")
    public void clickLogOutButton() {
        log.info("Click LogOut Button");
        driver.findElement(LOG_OUT_BUTTON).click();

    }
    @Step("Click Search Field")
    public void clickSearchField() {
        log.info("Click Search Field");
        driver.findElement(SEARCH_FIELD).click();

    }
}
