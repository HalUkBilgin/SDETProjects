Feature: Pay Bills

    Scenario: Login
    Given Navigate to Zero Bank
    When  Enter username and password and click Login button


  Scenario Outline: Add new Payee with senaryo outline

    And Click payBills and AddNewPayee
      | payBills     |
      | AddNewPayee  |

    When User sending the keys in the form content class
      | payeeName    | <PayeeName>    |
      | payeeAddress | <PayeeAddress> |
      | Account      | <PayeeAccount> |
      | payeeDetails | <PayeeDetails> |

    And Click on the element in the content class
      | AddButton |

    Then Success message should be displayed

    Examples:
      | PayeeName       | PayeeAddress         | PayeeAccount     | PayeeDetails       |
      | Huseyin         | Izmir                | 1200             | Aylik odeme        |
      | Bekir           | Ankara               |                  | Aylik odeme        |

