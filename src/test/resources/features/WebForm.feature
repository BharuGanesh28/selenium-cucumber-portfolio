Feature: Selenium practice web form

  Scenario: Submit a form with a personal QA test value
    Given I open the Selenium practice form
    When I enter "Bharathi QA Practice" in the text box
    And I submit the form
    Then I should see the confirmation message "Received!"

  Scenario: Submit a form with another test value
    Given I open the Selenium practice form
    When I enter "Automation Testing" in the text box
    And I submit the form
    Then I should see the confirmation message "Received!"

    
  Scenario: Submit the form with an empty text box
    Given I open the Selenium practice form
    And I submit the form
    Then I should see the confirmation message "Received!"