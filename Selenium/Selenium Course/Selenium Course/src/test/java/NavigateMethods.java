package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigateMethods {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();

        URL myurl = new URL("https://demo.nopcommerce.com/");
        driver.navigate().to(myurl);
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();
    }
}
