package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowser {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> windowIDs = driver.getWindowHandles();

        // Set'i niye List'e çeviriyoruz. Çünkü get methodu ve  elemanları spesifik çağıramıyoruz Set'de

        // Approach 1
//        List<String> windowList = new ArrayList<>(windowIDs);
//        String parentID = windowList.get(0);
//        String childID = windowList.get(1);
//
//        System.out.println(driver.getTitle()); // it returns parent window's title
//
//        // switch to child window
//        driver.switchTo().window(childID); // diğer sayfaya geç
//        System.out.println(driver.getTitle());
//
//        // switch to parent window
//        driver.switchTo().window(parentID);
//        System.out.println(driver.getTitle());
//

        // Approach 2
//        for (String winId: windowIDs){
//            String title = driver.switchTo().window(winId).getTitle();
//            if (title.equals("OrangeHRM")){
//                System.out.println(driver.getCurrentUrl());
//            }
//        }


    }
}
