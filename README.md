# Selenium + Java + Cucumber Automation Testing

## Project Overview

This personal QA automation portfolio project demonstrates web form testing using Selenium WebDriver, Java, Cucumber BDD, JUnit, and Maven. It showcases automated test execution, assertions, and screenshot capture when a test scenario fails.

## Technologies Used

* Java
* Selenium WebDriver
* Cucumber (BDD)
* JUnit
* Maven
* Chrome browser
* Git and GitHub

## Automated Test Scenarios

### Scenario 1: Submit a form with a personal QA test value

* Open the Selenium practice web form.
* Enter `Bharathi QA Practice` in the text box.
* Submit the form.
* Verify the confirmation message `Received!`.

### Scenario 2: Submit a form with another test value

* Open the Selenium practice web form.
* Enter `Automation Testing` in the text box.
* Submit the form.
* Verify the confirmation message `Received!`.

## Key Features

* BDD-style test scenarios written in Gherkin.
* Automated browser testing using Selenium WebDriver.
* JUnit assertions to validate the confirmation message.
* Automatic screenshot attachment when a scenario fails.
* Cucumber HTML test report.

## Prerequisites

* Java JDK
* Apache Maven
* Google Chrome
* Internet connection

## How to Run

Clone this repository:

```bash
git clone https://github.com/BharuGanesh28/selenium-cucumber-portfolio.git
```

Navigate to the project directory:

```bash
cd selenium-cucumber-portfolio
```

Run the automated tests:

```bash
mvn clean test
```

## Test Results

The project has been executed successfully with two passing scenarios and zero failures.

## Test Report

After running the tests, open the generated HTML report:

`target/cucumber-reports.html`

The report is generated locally and is not automatically published on GitHub.

## Project Purpose

This is a personal learning and QA automation portfolio project. It contains practice code and is not employer-owned or production code.

## Author

Bharathi G

GitHub: [BharuGanesh28](https://github.com/BharuGanesh28)
