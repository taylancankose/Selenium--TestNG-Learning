package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleCheckboxes {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        driver.manage().window().maximize();

        //1- select specific checkbox
        // driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //2- select all the checkboxes (you should find a common attribute)
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//        for (WebElement checkbox: checkboxes){
//            checkbox.click();
//        }
//        for(int i=0; i<checkboxes.size();i++){
//            checkboxes.get(i).click();
//        }

        //3- select last 3 checkboxes. Since total is 7
//        for(int i=4; i<checkboxes.size();i++){
//           checkboxes.get(i).click();
//        }

        //4- select first 3 checkboxes. Since total is 7
//        for(int i=0; i<3;i++){
//            checkboxes.get(i).click();
//        }

        // Unselect checkboxes
        for(int i=0; i<3;i++){
            checkboxes.get(i).click();
        }
        for (WebElement checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                checkbox.click();
            }
        }
    }
}
