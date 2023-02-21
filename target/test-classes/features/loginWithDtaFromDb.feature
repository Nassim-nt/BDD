@DbFeature @Regression
Feature: Techfios billing login page functionality validation with data from DB

  Background: 
    Given User is on the techfios login page

  @DbScenario1 @Smoke
  Scenario: User should be able to login with valid credential
    When User enters "username" from mysql database
    When User enters "password" from mysql database
    When User clicks on sign in button
    Then User should land on dashboard page