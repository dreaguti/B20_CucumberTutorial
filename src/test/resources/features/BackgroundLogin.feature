@backgroundLogin
Feature: Login
  Agile Story (or Jira Ticket #): As a user, I should be able to login with correct credentials
  to different accounts and dashboard should be displayed

  #this is how you comment in feature file

  Background: User is on the login page
    Given user is on the login page
    #instead of having this line repeat, we can just copy/paste it here and remove it from below:

  @librarian
  Scenario: Librarian login scenario
    When user logs in as a librarian
    Then user should see dashboard
# && ||
  @student
  Scenario: Student login scenario
    When user logs in as a student
    Then user should see dashboard

  @admin @db
    #before runs here
      #beforeStep runs here
  Scenario: Admin login scenario
    #afterStep runs here
    #beforeStep runs here
    When user logs in as an admin
    #afterStep runs here
    #beforeStep runs here
    Then user should see dashboard
    #afterStep runs here
  #after runs here