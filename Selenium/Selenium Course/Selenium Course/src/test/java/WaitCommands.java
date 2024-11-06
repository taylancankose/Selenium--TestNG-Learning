package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Implicit Wait
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // you just should use 1 time after creating driver instance

        // Explicit Wait
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Thread.sleep(5000);

        driver.manage().window().maximize();

        WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        txtusername.sendKeys("Admin");

        WebElement txtpassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        txtpassword.sendKeys("admin123");

        WebElement loginBtn = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        loginBtn.click();

        // driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

        driver.close();
    }
}
