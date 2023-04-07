package pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class ReportsPage extends BasePage{
    public ReportsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean waitForPageLoaded() {
        return true;
    }
    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
