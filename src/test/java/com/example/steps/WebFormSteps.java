
package com.example.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebFormSteps {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Given("I open the Selenium practice form")
    public void openPracticeForm() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    }

    @When("I enter {string} in the text box")
    public void enterText(String text) {
        WebElement textBox = driver.findElement(By.id("my-text-id"));
        textBox.sendKeys(text);
    }

    @When("I submit the form")
    public void submitForm() {
        driver.findElement(By.cssSelector("button")).click();
    }

    @Then("I should see the confirmation message {string}")
    public void verifyConfirmation(String expectedMessage) {
        String actualMessage = driver.findElement(By.id("message")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}