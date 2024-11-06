package L18_Annotation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class L02_BeforeGroup {
    WebDriver driver;

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("her şeyden önce beforesuit sahip method 1 kere çalışır");
    }

    @BeforeGroups({"a", "b"})
    public void beforeGroup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @BeforeGroups({"c"})
    public void beforeGroup2() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test(groups = "a")
    public  void  test01() {
        String ebay = "https://www.ebay.com";
        driver.get(ebay);
    }

    @Test(groups = "b")
    public  void  test02() {
        String youtube = "https://www.youtube.com";
        driver.get(youtube);
    }

    @Test(groups = "c")
    public  void  test03() {
        String facebook = "https://www.facebook.com";
        driver.get(facebook);
    }

    @AfterGroups({"a", "b"})
    public void afterGroup(){
        driver.close();
    }
}
