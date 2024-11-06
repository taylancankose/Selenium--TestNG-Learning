package test.L07_Faker;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import test.utilities.TestBase;

public class L02_Faker extends TestBase {

    @Test
    public void faker() throws InterruptedException{
        Faker faker = new Faker();
        driver.get("https://facebook.com");

        driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();

        WebElement firstName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        firstName.sendKeys(faker.name().firstName(), Keys.TAB, faker.name().lastName(), Keys.TAB, faker.internet().emailAddress(), Keys.TAB , faker.internet().password());
        Thread.sleep(3000);
    }
}
