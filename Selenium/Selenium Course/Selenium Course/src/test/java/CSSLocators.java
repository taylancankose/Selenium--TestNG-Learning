package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();

        // tag id & id only
        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts"); // css selector tag id
        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts"); // both are same

        // tag class & class only
        driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
        driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");

        // tag attribute & attribute only
        driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
        driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-shirts");

        // tag class attribute & class attribute
        driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirts");
        driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("T-shirts");

        driver.close();
    }
}
