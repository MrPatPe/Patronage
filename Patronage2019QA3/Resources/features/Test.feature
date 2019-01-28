Feature: Test #1

  Scenario: LogIn to Automationpractice
    Given User is on Automationpractice page
    When User press Sign In button
    Then I am on Automationpractice sign in page

  Scenario: Writing phrase in search engine
    Given User is on Automationpractice page
    When I search Automationpractice with phrase "black"
    Then Search query have phrase "black"

