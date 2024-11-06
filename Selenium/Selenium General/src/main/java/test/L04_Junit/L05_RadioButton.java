package test.L04_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class L05_RadioButton {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void radioBtn(){
        // create an account btn bas
        WebElement createAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
        createAccount.click();

        WebElement male = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));

        if(!male.isSelected()){
            male.click();
        }
    }
}
