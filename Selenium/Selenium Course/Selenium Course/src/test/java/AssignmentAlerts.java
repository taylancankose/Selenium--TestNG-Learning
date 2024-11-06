package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AssignmentAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.manage().window().maximize();

        List<WebElement> radios = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='radio']"));
        for (WebElement radio:radios){
            radio.click();
            Thread.sleep(2000);
        }

        WebElement dynamicButton = driver.findElement(By.xpath("//button[@name='start']"));
        System.out.println(dynamicButton.getText());
        dynamicButton.click();
        System.out.println(dynamicButton.getText());

    }
}
