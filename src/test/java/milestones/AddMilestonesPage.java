package milestones;

import elements.DropDown;
import elements.Input;
import elements.TextArea;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import models.Milestones;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utils.AllureUtils;


@Log4j2
public class AddMilestonesPage extends HomePage {
    public AddMilestonesPage(WebDriver driver) {
        super(driver);
    }

    @Attachment(value = "screenshot", type = "image/png")
    @Step("fillForm Milestones")
    public void fillForm(Milestones inputMilestones) {
        log.info("fill Milestones form");
        new Input(driver, "Name").setValue(inputMilestones.getName());
        new Input(driver, "References").setValue(inputMilestones.getReferences());
        new DropDown(driver, "Parent").selectByVisibleText(inputMilestones.getParent());
        new TextArea(driver, "Description").setValue(inputMilestones.getDescription());
        new Input(driver, "Start Date").setValue(inputMilestones.getStartDate());
        new Input(driver, "End Date").setValue(inputMilestones.getEndDate());
        AllureUtils.attachScreenshot(driver);
    }
}




