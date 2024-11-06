package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverManager;

public class N11Login {
    public N11Login() {
        PageFactory.initElements(DriverManager.getDriver(),this);
    }

    @FindBy(css = "input[type='text']")
    public WebElement email;

    @FindBy(css = "input[type='password']")
    public WebElement password;

    @FindBy(xpath = "(//*[text()='Giriş Yap'])[2]")
    public WebElement loginBtn;

    @FindBy(xpath = "//div[@class='error-message']")
    public WebElement errorMsg;
}
