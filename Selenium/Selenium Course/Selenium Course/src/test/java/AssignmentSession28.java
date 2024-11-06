package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class AssignmentSession28 {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        List<WebElement> links = driver.findElements(By.partialLinkText("Selenium"));

        for (WebElement link: links){
            link.click();
        }

        Set<String> windowIDs = driver.getWindowHandles();

        for (String windowID: windowIDs){
            String title = driver.switchTo().window(windowID).getTitle();
            System.out.println(title);
            if(title.equals("Selenium - Wikipedia")){
                driver.close();
                break;
            }
        }
    }
}
