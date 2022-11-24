package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static org.bouncycastle.asn1.cmc.CMCStatus.success;

public class Exercise {

    public Exercise() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='material-icons card_travel']")
    public WebElement products;

    @FindBy(xpath = "//*[text()='All Products']")
    public WebElement allProducts;

    @FindBy(xpath="//input[@id='search_product']")
    public WebElement searchBox;

    @FindBy(xpath="//button[@id='submit_search']")
    public WebElement searchButton;

    @FindBy(xpath= "//h2[@class='title text-center']")
    public WebElement searchedProducts;

    @FindBy(xpath = "(//*[text()='Men Tshirt'])[1]")
    public WebElement menTshirt;


    @FindBy(xpath ="//input[@id='susbscribe_email']")
    public WebElement susbscribemailbutton;

    @FindBy(xpath ="//i[@class='fa fa-arrow-circle-o-right']")
    public WebElement subscribeClick;

    @FindBy(xpath ="//div[@class='alert-success alert']")
    public WebElement alert;

    @FindBy(xpath ="//*[text()='Subscription']")
    public WebElement SubscriptionText;

}
