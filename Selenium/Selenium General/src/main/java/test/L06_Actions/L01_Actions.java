package test.L06_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import test.utilities.TestBase;

public class L01_Actions extends TestBase {

    @Test
    public void moveToElements() {
        driver.get("https://www.ebay.com");

        Actions actions = new Actions(driver);

       actions.moveToElement(driver.findElement(By.xpath("(//*[text()='Electronics'])[2]"))).perform();
    }
}
