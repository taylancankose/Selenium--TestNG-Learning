package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Dropdowns {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

//        WebElement drpCountryEl = driver.findElement(By.xpath("//select[@id='country']"));
//        Select drpCountry = new Select(drpCountryEl);
//        System.out.println(drpCountry.getOptions().size());
//
//        // select option from dropdown
//
//        // by index
//        drpCountry.selectByIndex(3);
//
//        // by value
//        drpCountry.selectByValue("uk");
//
//        // by visible text
//        drpCountry.selectByVisibleText("China");
//
//        List<WebElement> lists = drpCountry.getOptions();
//        for (int i=0; i< lists.size(); i++){
//            String listText = lists.get(i).getText();
//            System.out.println(listText);
//        }


        // Bootstrap dropdown
        

        // Hidden dropdown

    }
}
