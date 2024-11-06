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

public class L06_Asserion {

    // youtube a git
    // aşağıdaki adları kullanarak 3 test metodu oluşutr ve test et
    // test1 => sayfa başlığının youtube olduğunu test edin
    // test2 => search box reişlebilir olduğunu test edin isEnabled()
    // test3 => wrongtitletest => sayfa başlığının youtube olmadığını doğrulayın

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.youtube.com");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void test01(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "YouTube";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void test02(){
        WebElement searchBox = driver.findElement(By.cssSelector("input[id='search']"));
        Assert.assertTrue(searchBox.isEnabled()); // asserTrue true olmasını ister. true değilse yani test geçmez
    }

    @Test
    public void test03(){
        Assert.assertFalse(driver.getTitle().contains("youtube"));
        Assert.assertNotEquals("youtube", driver.getTitle());
    }
}
