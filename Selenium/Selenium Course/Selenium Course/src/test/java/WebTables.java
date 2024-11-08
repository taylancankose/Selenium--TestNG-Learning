import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebTables {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com");
        driver.manage().window().maximize();

        // find total number of rows in a table
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println(rows);

        // find total number of columns in a table
        int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println(cols);

        // read data from specific row and column
        String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
        System.out.println(bookName);

        // read daTA FROM ALL THE ROWS AND COLUMNS
        for (int r = 2; r <= rows ; r++) {
            for (int c = 1; c <= cols ; c++) {
                String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
                System.out.println(value+"\t");
            }
            System.out.println();
        }
    }
}
