package test.L04_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class L08_Alert {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void acceptAlert() throws InterruptedException{
        driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
        driver.switchTo().alert().accept();
        WebElement resultText = driver.findElement(By.cssSelector("p[id='result']"));

        String expectedData = "You successfully clicked an alert";
        String actualData = resultText.getText();
        Assert.assertEquals(expectedData, actualData);
        Thread.sleep(3000);
    }

    @Test
    public void dismissAlert() throws InterruptedException{
        driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();

        driver.switchTo().alert().dismiss();

        Thread.sleep(3000);
    }


    @Test
    public void sendKeysAlert() throws InterruptedException{
        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();

        driver.switchTo().alert().sendKeys("test");
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
    }
}
