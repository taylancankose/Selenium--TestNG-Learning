package L19_Pom;

import org.testng.annotations.Test;
import pages.OpenSourcePage;
import utilities.DriverManager;

public class L03_PageUsage {

    @Test
    public void test(){
        DriverManager.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        OpenSourcePage ops = new OpenSourcePage();
        ops.username.sendKeys("Admin");
        ops.password.sendKeys("admin123");
        ops.loginBtn.click();
    }
}
