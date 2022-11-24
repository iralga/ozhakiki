package stepdefinitions.exercise;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.Exercise;
import utilities.ConfigurationReader;
import utilities.Driver;


public class Exercise10 {
    Exercise exercise = new Exercise();
    @Then("User scrolls down to footer")
    public void user_scrolls_down_to_footer() {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

        Actions action= new Actions(Driver.getDriver());
        action.sendKeys(Keys.END).perform();

    }
    @Then("Verify text {string}")
    public void verify_text(String string) {
        Assert.assertTrue(exercise.SubscriptionText.isDisplayed());

    }
    @Then("Enter email address in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button() {

        exercise.susbscribemailbutton.sendKeys(ConfigurationReader.getProperty("exercise_10_email"));
        exercise.subscribeClick.click();
    }
    @Then("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) {
        Assert.assertTrue(exercise.alert.isDisplayed());

    }
}
