package L20_SmokeTest;

import org.testng.annotations.Test;
import pages.N11Login;
import utilities.ConfigReader;
import utilities.DriverManager;

public class L01_PositiveTest {

    @Test
    public void positiveTest() {
        DriverManager.getDriver().get("https://www.n11.com/giris-yap");

        N11Login n11 = new N11Login();
        System.out.println(ConfigReader.getProperty("emailvalid"));

        n11.email.sendKeys(ConfigReader.getProperty("emailvalid"));
        n11.password.sendKeys(ConfigReader.getProperty("passwordvalid"));

        n11.loginBtn.click();
    }
}
