package L19_Pom;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.EbayMainPage;
import utilities.DriverManager;

public class L02_PageUsage {

    @Test
    public void test() {
        DriverManager.getDriver().get("https://www.ebay.com");

        EbayMainPage emp = new EbayMainPage();
        emp.searchBox.sendKeys("bisiklet", Keys.ENTER);
    }
}
