Feature: Budget Accounts Create Edit Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create, edit and delete a Budget Accounts

    And Click on the element in the left class
      | budget         |
      | setup6         |
      | budgetAccounts |

    And Click on the element in the content class
      | BudgetAccountsAddButton |

    When User sending the keys in the form content class
      | codeInput | 1.3.5           |
      | nameInput | Budget Accounts |


    And Click on the element in the content class
      | type               |
      | typeOptions        |
      | balanceType        |
      | balanceTypeOptions |
      | saveButton         |

    Then Success message should be displayed

    And Click on the element in the left class
      | budget         |
      | setup6         |
      | budgetAccounts |



    When Budget Accounts User edit the "Budget Accounts" to "My Budget Accounts "

    Then Success message should be displayed



    And Click on the element in the left class
      | budget         |
      | setup6         |
      | budgetAccounts |


    When User delete the "My Budget Accounts"

    Then Success message should be displayed
