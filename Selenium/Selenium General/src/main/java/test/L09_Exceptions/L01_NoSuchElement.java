package test.L09_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import test.utilities.TestBase;

public class L01_NoSuchElement extends TestBase {

    @Test
    public void test01(){
        driver.get("https://www.ebay.com/");

        WebElement searchBox = driver.findElement(By.cssSelector("input[type='text2']"));

        searchBox.sendKeys("java");
    }
}
