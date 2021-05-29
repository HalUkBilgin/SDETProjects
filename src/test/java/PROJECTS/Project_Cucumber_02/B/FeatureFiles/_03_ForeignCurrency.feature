Feature: Foreign Currency functionality

  Background:
    Given Navigate to zero
    When Enter username and password and click Login button
    Then User should login successfully
    Given User click Pay Bills

  Scenario Outline: Test Foreign Currency
    Given User select Currency and given amount

      | <CountryName>  |  <Currency> |

    Then User select  as "<radioButton>"

    Then User click Purchase
    And Success message should be displayed

Examples:
    | CountryName | Currency | radioButton |
    | Australia (dollar)  |  500 |   usDollar |
    | Canada  |  300 |  selectedCurrency |
