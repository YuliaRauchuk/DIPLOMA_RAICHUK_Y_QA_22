package pages;

import org.openqa.selenium.WebDriver;

public class ReportsPage extends BasePage{
    public ReportsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean waitForPageLoaded() {
        return false;
    }
}
