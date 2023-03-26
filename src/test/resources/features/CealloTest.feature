@CEA10-297
Feature: User should be able to add a file to favorites, rename any file and give some comments on any file.

  Background:
    Given User is on the page and logged in

  @CEA10-293
  Scenario:User should be able to add any file to favorites from its own three dots menu
    When user clicks three dots of the file
    And clicks Add to Favourites button
    Then file is added to the favourites

  @CEA10-294
  Scenario:User should be able to rename any file from its own three dots menu
    When user clicks three dots of a file
    And clicks Rename button
    And types "test" and hits enter
    Then file name is changed to "test"

  @CEA10-295
  Scenario:User should be able to add comment to any file
    When user clicks three dots of the file
    And clicks Details button
    And clicks Comments button
    And types "comment test" to the input box and hits enter
    Then "comment test" is added to the file

  @CEA10-296
  Scenario:User should be able to delete comment from any file
    When user clicks three dots of the file
    And clicks Details button
    And clicks Comments button
    And clicks three dots of the comment test comment
    And clicks Delete comment button
    Then comment test comment gets deleted

