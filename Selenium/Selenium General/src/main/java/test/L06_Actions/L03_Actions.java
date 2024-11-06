package test.L06_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.utilities.TestBase;

public class L03_Actions extends TestBase {

    @Test
    public void dragAndDrop() throws InterruptedException{
        driver.get("https://demoqa.com/droppable");

        Actions actions = new Actions(driver);

        WebElement draggedE = driver.findElement(By.xpath("//*[text()='Drag me']"));
        WebElement targetE = driver.findElement(By.xpath("(//*[text()='Drop here'])[1]"));

        actions.dragAndDrop(draggedE, targetE).perform();

        WebElement result = driver.findElement(By.xpath("//*[text()='Dropped!']"));
        Assert.assertEquals("Dropped!", result.getText());
        Thread.sleep(3000);

    }


    @Test
    public void doubleClick() throws InterruptedException{
        driver.get("https://www.ebay.com");

        Actions actions = new Actions(driver);

        actions.click(driver.findElement(By.xpath("//input[@type='text']"))).perform();
        actions.clickAndHold(driver.findElement(By.xpath("//input[@type='text']"))).perform();

        actions.doubleClick(driver.findElement(By.xpath("//input[@type='text']"))).perform();

        actions.click(driver.findElement(By.xpath("//input[@type='text']"))).keyDown(Keys.SHIFT).sendKeys("i")
                .keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).perform();
    }
}
