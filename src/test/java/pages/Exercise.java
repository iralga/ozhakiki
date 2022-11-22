package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Exercise {

    public Exercise() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='material-icons card_travel']")
    public WebElement products;

}
