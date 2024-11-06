package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverManager;

public class EbayMainPage {

    public EbayMainPage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(css="input[type='text']")
    public WebElement searchBox;
}
