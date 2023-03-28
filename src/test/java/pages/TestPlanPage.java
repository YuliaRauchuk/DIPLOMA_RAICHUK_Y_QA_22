package pages;

import org.openqa.selenium.WebDriver;

public class TestPlanPage extends HomePage {
    public TestPlanPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean waitForPageLoaded() {

        return false;
    }
}
