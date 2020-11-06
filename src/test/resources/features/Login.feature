Feature: Login
  Agile Story (or Jira Ticket #): As a user, I should be able to login with correct credentials
  to different accounts and dashboard should be displayed

  Scenario: Librarian login scenario
    Given user is on the login page
    When user logs in as a librarian
    Then user should be able to see dashboard