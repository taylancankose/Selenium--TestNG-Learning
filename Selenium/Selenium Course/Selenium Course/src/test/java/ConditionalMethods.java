package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println("Does logo displayed: " + logo.isDisplayed());

        WebElement firstNameInput = driver.findElement(By.xpath("//input[@id='FirstName']"));
        System.out.println("Does firstname enabled " + firstNameInput.isEnabled());

        WebElement maleSelect = driver.findElement(By.xpath("//input[@id='gender-male']"));
        System.out.println("Does male selected " + maleSelect.isSelected());
        System.out.println("After Selecting");
        maleSelect.click();
        System.out.println("Does male selected " + maleSelect.isSelected());

        driver.quit();
    }
}
