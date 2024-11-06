package test.L02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class L02_DriverMethodsTest {

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String amazonUrl = "https://www.amazon.com";

        // Amazon sayfasına gidiniz
        driver.get(amazonUrl);

        // Sayfa başlığını konsola yazdırınız
        String amazonActualTitle = driver.getTitle(); // gidilen sayfa başlığını verir
        System.out.println("amazon sayfa başlığı " + amazonActualTitle);

        // sayfa başlığıınn amazon içerdiğini test edin
        System.out.println(amazonActualTitle.contains("Amazon"));

        // Sayfa url konsola yazdırın
        String amazonActualUrl = driver.getCurrentUrl();
        System.out.println("amazon sayfa url " + amazonActualUrl);

        // Sayfa url amazon içeriyor mu test edin
        System.out.println(amazonActualUrl.contains("amazon"));

        // Sayfa handle değerini yazdırın
        String amazonWindowHandle = driver.getWindowHandle();
        System.out.println("Handle değeri " + amazonWindowHandle);

        // sayfa html kodlarında "gateway" kelimesi geçtiğini test edin
        if(driver.getPageSource().contains("Gateway")){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }


        // sayfayı kapatın
        driver.close();

    }
}
