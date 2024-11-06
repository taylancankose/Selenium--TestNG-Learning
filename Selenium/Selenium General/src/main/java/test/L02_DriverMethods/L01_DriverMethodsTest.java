package test.L02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L01_DriverMethodsTest {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String amazonUrl = "https://www.amazon.com";
        String hepsiburadaUrl = "https://www.hepsiburada.com";

        // Amazon sayfasına gidiniz
        driver.get(amazonUrl);

        // Sayfa başlığını konsola yazdırınız
        String amazonActualTitle = driver.getTitle(); // gidilen sayfa başlığını verir
        System.out.println("amazon sayfa başlığı " + amazonActualTitle);

        // Sayfa url konsola yazdırın
        String amazonActualUrl = driver.getCurrentUrl();
        System.out.println("amazon sayfa url " + amazonActualUrl);


        // hepsiburada sayfasına gidiniz
        driver.get(hepsiburadaUrl);

        // Sayfa başlığını konsola yazdırınız
        String hbActualTitle = driver.getTitle(); // gidilen sayfa başlığını verir
        System.out.println("amazon sayfa başlığı " + hbActualTitle);

        // Sayfa url konsola yazdırın
        String hbActualUrl = driver.getCurrentUrl();
        System.out.println("amazon sayfa url " + hbActualUrl);
    }
}
