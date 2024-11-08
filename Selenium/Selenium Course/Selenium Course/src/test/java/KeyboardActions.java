import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.time.Duration;

public class KeyboardActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://text-compare.com");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome");

        // Ctrl + A will Select the text
        act.keyDown(Keys.CONTROL).sendKeys("A") // First pressing the key
            .keyUp(Keys.CONTROL).perform(); // Then releasing the key and perform

        // Ctrl + C will copy the text into clipboard
        act.keyDown(Keys.CONTROL).sendKeys("C") // First pressing the key
                .keyUp(Keys.CONTROL).perform(); // Then releasing the key and perform

        // Tab  shift to 2nd box
        act.keyDown(Keys.SHIFT) // First pressing the key
            .keyUp(Keys.SHIFT).perform(); // Then releasing the key and perform

        // Ctrl + V  paste the text
        act.keyDown(Keys.CONTROL).sendKeys("V") // First pressing the key
            .keyUp(Keys.CONTROL).perform(); // Then releasing the key and perform

        // last key you press keyUp it first
        // CTRL + SHIFT + A
        // act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
    }
}
