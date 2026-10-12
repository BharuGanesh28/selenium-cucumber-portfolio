
package com.example.steps;

import com.example.pages.WebFormPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebFormSteps {

    private WebDriver driver;
    private WebFormPage webFormPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        webFormPage = new WebFormPage(driver);
    }

    @Given("I open the Selenium practice form")
    public void openPracticeForm() {
        webFormPage.openForm();
    }

    @When("I enter {string} in the text box")
    public void enterText(String text) {
        webFormPage.enterText(text);
    }

    @When("I submit the form")
    public void submitForm() {
        webFormPage.submitForm();
    }

    @Then("I should see the confirmation message {string}")
    public void verifyConfirmation(String expectedMessage) {
        String actualMessage = webFormPage.getConfirmationMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (driver != null) {
            if (scenario.isFailed()) {
                byte[] screenshot = ((org.openqa.selenium.TakesScreenshot) driver)
        .getScreenshotAs(OutputType.BYTES);

                scenario.attach(
                        screenshot,
                        "image/png",
                        "Failure Screenshot"
                );
            }

            driver.quit();
        }
    }
}