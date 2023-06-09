package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Input extends BaseElement  {

    private final static String INPUT_LOCATOR = "//input[@name = '%s']";

    public Input(WebDriver driver, String label) {
        super(driver, label);
        this.label = label;
    }

    public void setValue(String value)  {
        WebElement input = driver.findElement(By.xpath(String.format(INPUT_LOCATOR, this.label)));
        scrollIntoView(input);
        input.sendKeys(value);
    }
}
