Feature: Etsy search feature
  Agile story: User should be able to enter search terms
  and see relevant results in the page and in the title.

  Background: User is on the etsy home page


  Scenario: Title verification
    Then user should see title is as expected

    #expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

  @etsyWip
  Scenario: Title verification after search term
    When user searches "wooden spoon" in the search box
    And user clicks on search button
    Then user will see "wooden spoon" in the title