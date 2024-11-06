package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class LocatorsDemo {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/"); // open the site
        driver.manage().window().maximize(); // make full screen the page

        // name
        // driver.findElement(By.name("search")).sendKeys("Mac"); // html'deki inputtan aldık

        // id
        // boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed(); // logo görüntülendi mi
        // System.out.println(logoDisplayStatus); // returned true

        // linkText & partialLinkText
        // driver.findElement(By.linkText("Tablets")).click();
        // driver.findElement(By.partialLinkText("Tabl")).click(); // linkText is more prefable

        // classname
        // List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item")); // findElements will return multiple items
        // System.out.println(headerLinks.size());

        // tagname
        // List<WebElement> allAnchors = driver.findElements(By.tagName("a")); // will return all <a> tags
        // System.out.println(allAnchors.size());

        // List<WebElement> allImages = driver.findElements(By.tagName("img"));
        // System.out.println(allImages.size());

        driver.close();
    }
}
