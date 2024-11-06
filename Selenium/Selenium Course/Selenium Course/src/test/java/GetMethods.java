package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

        // title
        String title = driver.getTitle();
        System.out.println("Title: " + title);

        // getcurrent url
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);

        // page source
        String pageSource = driver.getPageSource();
        // System.out.println(pageSource); // source file

        String windowHandler = driver.getWindowHandle();
        System.out.println("window id: " + windowHandler);

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='OrangeHRM, Inc']")));
//        link.click();

        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

        Set<String> windowHandlers = driver.getWindowHandles();
        System.out.println("Window IDS: " + windowHandlers);

        driver.close();
    }
  }
