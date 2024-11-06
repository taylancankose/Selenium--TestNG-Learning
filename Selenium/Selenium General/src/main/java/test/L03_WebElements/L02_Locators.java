package test.L03_WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class L02_Locators {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // herokuya git
        driver.get("https://www.heroku.com");

        // programalama dillerini classname ile alınız bu çok tercih edilmez
        WebElement languages = driver.findElement(By.className("lang-list"));
        System.out.println(languages.getText());

        // sitedeki linkleri tagName ile listeye atın
        WebElement links = driver.findElement(By.tagName("a"));


        // sign in butonunua linkText veya partialTextLink ile tıklayın
        // linkText => text'e göre alırız textin tamamı verilmeli, partial da ise tamamını vermeye gerek yok text de
        WebElement loginBtn = driver.findElement(By.linkText("Log in"));
        loginBtn.click();



    }

}
