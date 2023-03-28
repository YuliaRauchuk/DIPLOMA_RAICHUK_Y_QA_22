package pages;


import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;

@Log4j2
public class ToDoPage extends BasePage{
    public ToDoPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean waitForPageLoaded() {
        return false;
    }

}
