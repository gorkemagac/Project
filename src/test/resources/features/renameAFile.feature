Feature: Rename a file from menu.

  @wip
  Scenario:User should be able to rename any file from its own three dots menu
    When user clicks three dots of a file
    And clicks Rename button
    And types "test" and hits enter
    Then file name is changed to "test"