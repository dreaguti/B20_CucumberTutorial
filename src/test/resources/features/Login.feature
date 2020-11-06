Feature: Login
  Agile Story (or Jira Ticket #): As a user, I should be able to login with correct credentials
  to different accounts and dashboard should be displayed

  #this is how you comment in feature file

  @librarian
  Scenario: Librarian login scenario
    Given user is on the login page
    When user logs in as a librarian
    Then user should see dashboard