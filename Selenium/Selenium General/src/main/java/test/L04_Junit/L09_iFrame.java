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

public class L09_iFrame {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/iframe");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void test01() throws InterruptedException{
        WebElement title = driver.findElement(By.xpath("//h3"));
        System.out.println(title.getText());
        Assert.assertTrue(title.isDisplayed());

        WebElement iframeElement = driver.findElement(By.cssSelector("iframe[id='mce_0_ifr']"));
        driver.switchTo().frame(iframeElement);

        WebElement textBox = driver.findElement(By.cssSelector("body[id='tinymce']"));
        driver.findElement(By.xpath("//p")).clear();
        textBox.sendKeys("Hello world");
        Thread.sleep(3000);


        driver.switchTo().parentFrame();

        WebElement elementalSelenium = driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));

        Assert.assertTrue(elementalSelenium.isDisplayed());
        System.out.println(elementalSelenium.getText());
    }
}
