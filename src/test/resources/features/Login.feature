Feature: Login
  As a user, I want to be able to log in with a username and password

  Scenario: Log in as store manager
    Given user is on the login page
    When user logs in as a store manager
    Then user should be able to see Dashboard page title