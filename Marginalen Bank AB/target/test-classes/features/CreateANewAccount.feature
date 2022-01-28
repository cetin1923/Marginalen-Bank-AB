Feature: Users should be able to create a new saving account
  @NewAccount @all
  Scenario: Create an account
    Given the user is on the web page
    When the user clicks on SPARA tab
    And the user clicks on SPARKONTO sub tab
    And the user clicks on BORJA SPARA NU button
    Then the user is able land on to PERSONUPPGIFTER page
    When the user types the required personal info
    And the user clicks on the forward button
    Then the user lands on FRAGOR page
    When the user selects the related FRAGOR checkboxes
    And the user clicks on the forward button
    Then the user lands on ANVANDNING page
    When the user selects the related ANVANDNING checkboxes
    And the clicks on the forward button
    Then the user lands on the GRANSKA%SKICKA page
    When the user clicks on the SKICKA ANSOKAN button
    Then the user makes application for a new account successfully.

