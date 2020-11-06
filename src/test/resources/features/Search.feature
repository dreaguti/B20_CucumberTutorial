Feature: Search
  Agile Story: As a user, I should be able to search when I am on Google search page

  Background: User should be on google search page
    Given user is on the google search page

  Scenario: Google default title verification
    Given user is on the google search page
    Then user should see title is Google

    @wip #workinprogress -- can be anything
      #"apple" -- putting quotes around it makes it parameterization
  Scenario:
    When user searches "apple"
    Then user should see "apple" in the title

