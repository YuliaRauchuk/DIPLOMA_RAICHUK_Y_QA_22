package pages;


import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

@Log4j2
public class ToDoPage extends BasePage{
    public ToDoPage(WebDriver driver) {
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
