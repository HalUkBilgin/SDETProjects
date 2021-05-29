Feature: Pay Bills2

    Background:
    Given Navigate to Zero Bank
    When  Enter username and password and click Login button


  Scenario Outline: Add new Payee with senaryo outline2

    And Click payBills and purchase foreign currency
      | payBills        |
      | Currency        |
      | DollarsButton   |
      | currencyButton  |

    When Select Currency

    And User sending the keys in the form content class
      | amount    | <Amount>    |


    And Click on the element in the content class
      | purchase |

    Then Success message should be displayed

    Examples:
      | Amount               |
      | 1200                 |


