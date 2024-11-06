package test.L05_HandleWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class L01_HandleWindows {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void test01() throws InterruptedException{
        driver.get("https://www.ebay.com");
        String firstPageWHD = driver.getWindowHandle();

        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("ebay"));

        // driver.switchTo().newWindow(WindowType.WINDOW); // yeni sayfa yapar bu
        driver.switchTo().newWindow(WindowType.TAB); // yeni sekme açar
        driver.get("https://www.bestbuy.com");
        Thread.sleep(2000);
        String secondPageWHD = driver.getWindowHandle();


        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains("Best Buy"));
        Thread.sleep(2000);

        driver.switchTo().window(firstPageWHD);
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("bicycle", Keys.ENTER);

        Thread.sleep(2000);
        driver.switchTo().window(secondPageWHD);

        WebElement logo = driver.findElement(By.xpath("(//img[@class='logo'])[1]"));
        Assert.assertTrue(logo.isDisplayed()); // logo var mı kontrol
        Thread.sleep(2000);
    }
}
