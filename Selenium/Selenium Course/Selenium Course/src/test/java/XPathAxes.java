package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XPathAxes {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        driver.manage().window().maximize();

        String text = driver.findElement(By.xpath("//a[contains(text(), 'Zomato')]/self::a")).getText();
        System.out.println("Self: " + text);

        text =driver.findElement(By.xpath("//a[contains(text(), 'Zomato')]/parent::td")).getText();
        System.out.println("Parent: " + text);

        List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(), 'Zomato', 'L&T')]/ancestor::tr/childs"));
        System.out.println(childs);
    }
}
