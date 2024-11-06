package test.L02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L03_NavigateMethods {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Youtube anasayfa gidelim
        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(3000); // 3 saniye bekletelim

        // amazon anasayfa gidelim
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000); // 3 saniye bekletelim

        // Tekrar Youtube anasayfa gidelim
        driver.navigate().back();
        Thread.sleep(3000); // 3 saniye bekletelim

        // Tekrar amazon anasayfa gidelim
        driver.navigate().forward();
        Thread.sleep(3000); // 3 saniye bekletelim

        // sayfayı refresh yapalım
        driver.navigate().refresh();

        // sayfay kapatalım
        driver.quit(); // driver close driver'ı kapatır ama sayfa açık kalır. quit ile aynı zamanda sayfalarda kapanır

    }
}
