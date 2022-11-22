package stepdefinitions.exercise;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.Exercise;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Exercise09 {

        Exercise exercise = new Exercise();



    @Given("user launch the browser")
    public void user_launch_the_browser() {

        WebDriver driver = new FirefoxDriver();
        driver.quit();

    }

    @Then("user navigates to the url")
    public void userNavigatesToThe() {
        Driver.getDriver().get(ConfigurationReader.getProperty("exercise_09_url"));
    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        String actualurl = Driver.getDriver().getCurrentUrl();
        String expectedurl = ConfigurationReader.getProperty("exercise_09_url");

        Assert.assertEquals(actualurl, expectedurl);
    }


    @Then("user clicks products button")
    public void userClicksProductsButton() {
        exercise.products.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("products"));

    }
}

