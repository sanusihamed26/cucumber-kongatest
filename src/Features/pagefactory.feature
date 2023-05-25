Feature: konga test functionality
  Scenario: check for validity of Konga
    Given user is on the konga homepage
    And user clicks on the login/signup button
    When user enters username and password
    And user clicks on the submit button
    Then user select the items and checkout successfully