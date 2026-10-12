Feature: Selenium practice web form

  Scenario: Submit a form successfully
    Given I open the Selenium practice form
    When I enter "Way.com" in the text box
    And I submit the form
    Then I should see the confirmation message "Received!"