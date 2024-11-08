import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Dropdowns {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

//        driver.get("https://testautomationpractice.blogspot.com");
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().window().maximize();

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
//        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//
//        driver.findElement(By.xpath("//button[contains(@class, 'multiselect')]")).click(); // opens dropdown options
//
//        // 1) select single option
//        driver.findElement(By.xpath("//input[@value='Java']")).click();
//
//        // 2) capture all options and find out the size
//        List<WebElement> selectItems = driver.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//label"));
//        System.out.println(selectItems.size());
//
//        // 3) printing options from dropdown
//        for (WebElement option: selectItems){
//            System.out.println(option.getText());
//        }
//
//        // 4) select multiple options
//        for (WebElement option: selectItems){
//            System.out.println(option.getText());
//
//            if(option.getText().equals(" Java") || option.getText().equals("Python")){
//                option.click();
//            }
//        }

        // Hidden dropdown
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
        driver.manage().window().maximize();

        // Login
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

        driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[6]/div[1]/div[2]/div[1]/div[1]")).click();
        // select single option
        driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();

        driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[6]/div[1]/div[2]/div[1]/div[1]")).click();
        Thread.sleep(5000);

        // count number of options
        List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));

        System.out.println(options.size());

        for (WebElement op: options){
            System.out.println(op.getText());
        }
    }
}
