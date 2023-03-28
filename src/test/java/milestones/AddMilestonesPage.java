package milestones;


import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import pages.HomePage;


@Log4j2
public class AddMilestonesPage extends HomePage {
    public AddMilestonesPage(WebDriver driver) {
        super(driver);
    }

 @Override
    public boolean waitForPageLoaded() {
        return true;
    }
}




