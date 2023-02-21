@LoginFeature @Regression
Feature: Techfios billing login page functionality validation

  Background: 
    Given User is on the techfios login page

  @Scenario1 @Smoke
  Scenario: User should be able to login with valid credential
    When User enters user name as "demo@techfios.com"
    When User enters password as "abc123"
    When User clicks on sign in button
    Then User should land on dashboard page

  @Scenario2 
  Scenario: User should be able to login with valid credential
    When User enters user name as "demo2@techfios.com"
    When User enters password as "abc123"
    When User clicks on sign in button
    Then User should land on dashboard page

  @Scenario3 
  Scenario: User should be able to login with valid credential
    When User enters user name as "demo@techfios.com"
    When User enters password as "abc124"
    When User clicks on sign in button
    Then User should land on dashboard page

  @Scenario4
  Scenario: User should be able to login with valid credential
    When User enters user name as "demo2@techfios.com"
    When User enters password as "abc124"
    When User clicks on sign in button
    Then User should land on dashboard page
