package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size());

        List<WebElement> allImages = driver.findElements(By.tagName("img"));
        System.out.println(allImages.size());

        driver.findElement(By.linkText("Contact")).click();

        driver.close();
    }
}
