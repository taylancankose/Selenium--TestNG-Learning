package test.L03_WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class L04_css {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // ebay e git
        driver.get("https://www.ebay.com");


        // tag name, attrname, value yine. xpath'e göre daha güvenilir locate alır.
        // 10 element çıkarsa xpath ile indekse göre alırsın ama css de alamazsın
        WebElement searchBox = driver.findElement(By.cssSelector("input[type='text']"));
        searchBox.sendKeys("iphone");
        searchBox.submit();

    }
}
