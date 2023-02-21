@OtherLoginFeature @Regression
Feature: Techfios other billing login page functionality validation

  Background: 
    Given User is on the techfios login page

  @OtherScenario1 @Smoke
  Scenario Outline: User should be able to login with valid credential
    When User enters user name as "<username>"
    When User enters password as "<password>"
    When User clicks on sign in button
    Then User should land on dashboard page

    Examples: 
      | username           | password |
      | demo@techfios.com  | abc123   |
      | demo2@techfios.com | abc123   |
      | demo@techfios.com  | abc124   |
      | demo2@techfios.com | abc124   |

  @OtherScenario2
  Scenario: User should be able to login with valid credential
    When User enters user name as "demo2@techfios.com"
    When User enters password as "abc123"
    When User clicks on sign in button
    Then User should land on dashboard page

 
