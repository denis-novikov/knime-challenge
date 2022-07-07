@deleteSpace
Feature: Spaces

  Background:
    Given user is on landing page
    And user is logging in
    And user navigates to Spaces page
    And user click on public space button

  Scenario: Delete space
    When user is in space editor page
    And user delete space
    Then space deleted toast message is visible