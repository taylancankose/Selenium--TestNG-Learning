package L19_Pom;

import org.testng.annotations.Test;
import utilities.DriverManager;

public class L01_DriverLinkTest {

    @Test
    public void test(){
        DriverManager.getDriver().get("https://www.bestbuy.com");
        DriverManager.getDriver().get("https://www.facebook.com");
    }
}
