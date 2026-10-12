package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebFormPage {

    private WebDriver driver;

    private By textBox = By.id("my-text-id");
    private By submitButton = By.cssSelector("button");
    private By confirmationMessage = By.id("message");

    public WebFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openForm() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    }

    public void enterText(String text) {
        WebElement input = driver.findElement(textBox);
        input.sendKeys(text);
    }

    public void submitForm() {
        driver.findElement(submitButton).click();
    }

    public String getConfirmationMessage() {
        return driver.findElement(confirmationMessage).getText();
    }
}