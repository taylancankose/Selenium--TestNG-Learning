package test.L06_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import test.utilities.TestBase;

public class L02_Actions extends TestBase {

    @Test
    public void contextClick() throws InterruptedException{
        driver.get("https://the-internet.herokuapp.com/context_menu");

        Actions actions = new Actions(driver);

        actions.contextClick(driver.findElement(By.id("hot-spot"))).perform();
        Thread.sleep(3000);

        driver.switchTo().alert().accept();
        Thread.sleep(2000);
    }
}
