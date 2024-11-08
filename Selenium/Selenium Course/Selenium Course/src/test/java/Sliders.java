import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Sliders {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        Actions act =  new Actions(driver);

        WebElement leftSlider = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
        System.out.println(leftSlider.getLocation());

        act.dragAndDropBy(leftSlider,75,leftSlider.getLocation().getY()).perform(); // will add nearly +75 might depend on screen size pixels might change
        System.out.println(leftSlider.getLocation());

        WebElement rightSlider = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
        System.out.println(rightSlider.getLocation());

        act.dragAndDropBy(rightSlider, -128, rightSlider.getLocation().getY()).perform(); // will sub the value now
        System.out.println(rightSlider.getLocation());
    }
}
