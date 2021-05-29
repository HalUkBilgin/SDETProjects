
Feature: CuntactUs with senaryooutline

  Background:
    Given Navigate to automationpractice
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to CuntactUs page


  Scenario Outline: CuntactUs create with senaryo outline

    When Select Subject Heading
    Then Enter your message as "<CuntactUsMessage>" and click send button
    And Success message should be displayed

    Examples:
      | CuntactUsMessage      |
      | izmir5                |
      | canakkale5            |
      | manisa5               |