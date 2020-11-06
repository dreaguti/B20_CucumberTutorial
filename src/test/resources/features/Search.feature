Feature: Search
  Agile Story: As a user, I should be able to search when I am on Google search page

  Background: User should be on google search page
    Given user is on the google search page

  Scenario: Google default title verification
    Given user is on the google search page
    Then user should see title is Google

  Scenario: Google title verification after search
    When user searches apple
    Then user should see apple in the title

  @wip #workinprogress -- can be anything
  Scenario: Google title verification after search
    When user searches "dolphin"
    Then user should see "dolphin" in the title
    #"string" -- putting quotes around it makes it parameterization
    #just change the search value in the feature file and it will run accordingly

  @about
  Scenario: Google ABOUT link page title verification
    Then user should see About link
    And user clicks on About link
    Then user should be able to see title Google - About Google, Our Culture & Company News