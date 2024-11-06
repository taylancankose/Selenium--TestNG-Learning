package test.L04_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class L03_Test {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test
    public void test01(){
        driver.get("https://www.hepsiburada.com");
    }

    @Test
    public void test02(){
        driver.get("https://www.amazon.com.tr");
    }

    @Test
    public void test03(){
        driver.get("https://www.facebook.com");
    }

}
