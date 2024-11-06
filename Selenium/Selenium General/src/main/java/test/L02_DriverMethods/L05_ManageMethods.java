package test.L02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class L05_ManageMethods {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // sayfayı maximize yapmalıyız genelde, geç açılma tam yüklememe gibi durumlar olabilir, sayfa en büyük hale gelsin ki elementler görünür olsun
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // 15sn sayfadaki tüm elementlerin oluşması için bekler

        // hb sayfasına gidin
        driver.get("https://www.hepsiburada.com");

        // sayfa başlığını hb olduğunu test edin
        String pageTitle = driver.getTitle();
        String expectedPageTitle = "Hepsiburada";
        if(pageTitle.contains(expectedPageTitle)){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }

        // facebook sayfasına gidin
        driver.get("https://www.facebook.com");


        // sayfa url facebook icerdiğini test edin
        if(driver.getCurrentUrl().contains("facebook")){
            System.out.println("facebook test passed");
        }else {
            System.out.println("facebook test failed");
        }

        // hb sayfasına geri dönün
        driver.navigate().back();

        // Geri döndüğünüzü test edin
        if(pageTitle.contains(expectedPageTitle)){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }

        // sayfayı kapatın
        driver.close();
    }
}
