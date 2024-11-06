package test.L02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L04_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // hepsiburada sayfasına gidelim
        driver.get("https://www.hepsiburada.com");

        // sayfanmın konumunuve boyutlarını yazdırın
        System.out.println("sayfanın konumu " + driver.manage().window().getPosition());
        System.out.println("sayfanın boyutu " + driver.manage().window().getSize());

        // sayfayı simge durumuna getirin
        driver.manage().window().minimize();

        // simge durumunda 3 saniye bekleyip sayfayı maximize yapın
        Thread.sleep(3000);

        // sayfanın konumunu ve boyutlarını maximize edin
        driver.manage().window().maximize();
        System.out.println("sayfanın konumu " + driver.manage().window().getPosition());
        System.out.println("sayfanın boyutu " + driver.manage().window().getSize());

        // sayfayı fullscreen yapalım
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        // sayfanın konumu ve boyutları fullscreen de yazdır
        System.out.println("sayfanın konumu " + driver.manage().window().getPosition());
        System.out.println("sayfanın boyutu " + driver.manage().window().getSize());

        // sayfayı kapatın
        driver.manage().window().maximize();
        driver.close();
    }
}
