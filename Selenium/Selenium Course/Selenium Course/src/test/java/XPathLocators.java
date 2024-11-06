package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        // driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Mac");

        // xpath with multiple attributes
        // driver.findElement(By.xpath("//input[@placeholder='Search'][@name='search']")).sendKeys("Mac");


        // xpath with 'and' 'or'  operators
        // driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search']")).sendKeys("Mac");
        // driver.findElement(By.xpath("//input[@placeholder='Search' or @name='search']")).sendKeys("Mac");


        // xpath with inner text
        // driver.findElement(By.xpath("//a[text()='MacBook']")).click();
        // boolean displayText = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
        // System.out.println(displayText);

        // String value = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
        // System.out.println(value);


        // xpath with contains()
        // boolean value = driver.findElement(By.xpath("//input[contains(@placeholder, 'Sea')]")).isDisplayed();
        // System.out.println(value);


        // xpath with start-with()
        driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Sea')]")).sendKeys("Mac");

        // chained xpath
        boolean img = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
        System.out.println(img);


        driver.close();
    }
}
