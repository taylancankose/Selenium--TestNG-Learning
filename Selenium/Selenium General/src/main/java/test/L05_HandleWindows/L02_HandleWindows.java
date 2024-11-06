package test.L05_HandleWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;
import java.util.Set;

public class L02_HandleWindows {
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
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement text = driver.findElement(By.xpath("//h3"));
        Assert.assertEquals("Opening a new window", text.getText());

        String firstPageWHD = driver.getWindowHandle();
        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandleSet  = driver.getWindowHandles();
        String secondPageWHD = "";

        for(String each: windowHandleSet){
            if(!each.equals(firstPageWHD)){
                secondPageWHD = each;
            }
        }

        driver.switchTo().window(secondPageWHD);

        WebElement newWindowText = driver.findElement(By.xpath("//h3"));
        Assert.assertEquals("New Window", newWindowText.getText());

        driver.switchTo().window(firstPageWHD);
        Thread.sleep(3000);
    }
}
