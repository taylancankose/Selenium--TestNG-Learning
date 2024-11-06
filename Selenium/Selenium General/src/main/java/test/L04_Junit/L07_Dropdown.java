package test.L04_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class L07_Dropdown {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void selectByIndexTest() throws InterruptedException{
        WebElement dropdown = driver.findElement(By.cssSelector("select[id='dropdown']"));
        Select select = new Select(dropdown);

        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByIndex(2);

        select.selectByValue("2");
    }

    @Test
    public void selectByVisibleText() throws InterruptedException{
        WebElement dropdown = driver.findElement(By.cssSelector("select[id='dropdown']"));
        Select select = new Select(dropdown);

        select.selectByVisibleText("Option 1");
        Thread.sleep(2000);
        select.selectByVisibleText("Option 2");
    }

    @Test
    public void printAllTest(){
        WebElement dropdown = driver.findElement(By.cssSelector("select[id='dropdown']"));
        Select select = new Select(dropdown);

        List<WebElement> allOptions = select.getOptions();
        System.out.println(allOptions.size());

        for (WebElement eachOption: allOptions){
            System.out.println(eachOption.getText());
        }
    }
}
