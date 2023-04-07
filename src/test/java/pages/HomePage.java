package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@Log4j2
public abstract class HomePage extends BasePage {

    private final static By LOG_OUT_BUTTON = By.xpath("//*[@id=\"navigation-user-logout\"]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Click LogOut Button")
    public void clickLogOutButton() {
        log.info("Click LogOut Button");
        driver.findElement(LOG_OUT_BUTTON).click();
    }
}

