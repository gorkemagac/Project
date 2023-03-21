Feature: Adding file to favourites

  Scenario:User should be able to add any file to favorites from its own three dots menu
    When user clicks three dots of the file
    And clicks Add to Favourites button
    Then file is added to the favourites