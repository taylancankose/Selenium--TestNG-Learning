package locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsAndPopups {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();

        // 1) Normal alert with OK button
        /* driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        Alert myAlert = driver.switchTo().alert(); // whichever alert window is open that will capture and switch to it
        System.out.println(myAlert.getText());
        myAlert.accept(); // click accept */

        // 2) Conformation Alert - OK & Cancel
        /* driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

        Alert myAlert = driver.switchTo().alert();
        System.out.println(myAlert.getText());
        myAlert.dismiss(); // for dismiss
        // myAlert.accept(); // for accept */

        // 3) Alert with Prompt
        /* driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        Alert myAlert = driver.switchTo().alert();
        System.out.println(myAlert.getText());
        myAlert.sendKeys("Test text");
        myAlert.dismiss();
        // myAlert.accept(); */


        // An alternate way to capture Alert...
        /* driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert myalert = mywait.until(ExpectedConditions.alertIsPresent()); // once alert is open

        System.out.println(myalert.getText());
        myalert.accept(); */


        // Authenticated popup
        // For this syntax is: http://username:password@the-internet.herokuapp.com/basic_auth
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        // driver.close();
    }
}
