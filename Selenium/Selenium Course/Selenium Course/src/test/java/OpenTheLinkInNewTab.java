import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OpenTheLinkInNewTab {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.akakce.com/");
        driver.manage().window().maximize();

        WebElement registerLink = driver.findElement(By.xpath("//div[@id='H_rl_v8']//a[@rel='nofollow'][normalize-space()='Hesap Aç']"));

        Actions actions = new Actions(driver);

        actions.keyDown(Keys.CONTROL).click(registerLink).keyUp(Keys.CONTROL).perform();

        // switch to opened new tab page
        List<String> windowList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowList.get(1));

        driver.findElement(By.xpath("//input[@id='rnufn']")).sendKeys("Taylee");

        // Home page
        driver.switchTo().window(windowList.get(0));
        driver.findElement(By.xpath("//input[@id='q']")).sendKeys("Monitör kolu");
        actions.keyUp(Keys.ENTER).keyUp(Keys.ENTER).perform();

        // open new page on new tab method 2
        driver.switchTo().newWindow(WindowType.TAB);
        // on new window
        // driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.hepsiburada.com");
    }
}
