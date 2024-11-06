package test.L03_WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class L01_Locators {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // amazon sayfasına gidin
        driver.get("https://www.amazon.com.tr");

        // by name ile arama kutusunu locate edelim ve içine bicycle aratalım
        // seçeceğin name birden fazla kullanılmamalı, eğer kullanılıyorsa listeye atıp index'den seçebiliriz
       // WebElement searchBox = driver.findElement(By.name("field-keywords")); // inputu seçtik
       //  searchBox.sendKeys("bicycle", Keys.ENTER); // bicycle yaz inputa ve enter'a bas
        // searchBox.submit(); // veya submit'de yapabilirsin


        // by id ile ilk bisiklete tıklatalım
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("bisiklet");
        searchBox.submit();

        // sayfayı kapatalım
        driver.close();
    }
}
