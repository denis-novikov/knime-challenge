@createSpace
Feature: Spaces

  Background:
    Given user is on landing page
    And user is logging in
    And user navigates to Spaces page

    Scenario: Create new public space
      When user click on public space button
      Then new space created toast message is visible
      When user navigates to Spaces page
      Then 'New space' is visible in users dashboard
