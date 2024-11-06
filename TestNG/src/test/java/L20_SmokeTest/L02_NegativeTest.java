package L20_SmokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.N11Login;
import utilities.ConfigReader;
import utilities.DriverManager;

public class L02_NegativeTest {
    @Test
    public void positiveTest() {
        DriverManager.getDriver().get("https://www.n11.com/giris-yap");

        N11Login n11 = new N11Login();

        n11.email.sendKeys(ConfigReader.getProperty("emailvalid") + "sajkda");
        n11.password.sendKeys(ConfigReader.getProperty("passwordvalid") + "sadas");

        n11.loginBtn.click();

        Assert.assertTrue(n11.errorMsg.isDisplayed());
    }
}
