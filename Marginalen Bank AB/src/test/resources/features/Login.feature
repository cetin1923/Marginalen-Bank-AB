Feature: The user is NOT able to log in with invalid credentials

  @login @all

  Scenario: Verify that the user is NOT able log in to the WebPage
    Given the user is on the web page
    When the user enters invalid credentials
    Then the user should NOT be able to login
    And the title contains "Marginalen - Ett fel har inträffat eller sessionen har stängts"
