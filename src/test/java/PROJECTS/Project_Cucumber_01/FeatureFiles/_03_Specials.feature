
Feature: Compare speacial's items


  Background:
    Given Navigate to automationpractice
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Specials page

    Scenario: Comparison of products
      Then Comparison of discounted products


