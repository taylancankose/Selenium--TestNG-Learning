package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverManager;

public class OpenSourcePage {
    public OpenSourcePage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(xpath="(//input)[2]")
    public WebElement username;

    @FindBy(xpath="(//input)[3]")
    public WebElement password;

    @FindBy(xpath="//button")
    public WebElement loginBtn;
}
