import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DatePickerCalendar {

    static void selectFutureDate(WebDriver driver, String month, String year, String date){
        while (true){
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // select month
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // select year


            if (currentMonth.equals(month) && currentYear.equals(year)){
                break;
            }
            WebElement next =  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")); // next
            next.click();
        }

        // select the date
        List<WebElement> allDate = driver.findElements(By.xpath(" //table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        System.out.println(allDate.size());

        for (WebElement dt :allDate){
            System.out.println(dt.getText());
            if (dt.getText().equals(date)){
                dt.click();
                break;
            }
        }
    }

    static void selectPastDate(WebDriver driver, String month, String year, String date){
        while (true){
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // select month
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // select year


            if (currentMonth.equals(month) && currentYear.equals(year)){
                break;
            }
            WebElement prev =  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")); // prev
            prev.click();
        }

        // select the date
        List<WebElement> allDate = driver.findElements(By.xpath(" //table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        System.out.println(allDate.size());

        for (WebElement dt :allDate){
            System.out.println(dt.getText());
            if (dt.getText().equals(date)){
                dt.click();
                break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        // Switch to frame
        driver.switchTo().frame(0);

        // Method 1: using sendKeys
//        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2025"); // MM/DD/YY

        // Method 2: using date picker
        driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // open date picker

       // selectFutureDate(driver, "May", "2026", "16");
       selectPastDate(driver, "May", "2022 ", "16");

    }
}
