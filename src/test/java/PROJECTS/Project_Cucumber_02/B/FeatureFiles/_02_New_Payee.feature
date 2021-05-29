Feature: New Payee functionality

  Background:
    Given Navigate to zero
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario Outline: Test Positiv New Payee functionality

    Given User click Pay Bills

    When User click Add new Payee

    When User send a Keys name as "<PayeeName>" user send info as "<UserAdress>" user send info as "<Account>"

    Then Success message should be displayed

    Examples:
      | PayeeName | UserAdress | Account |
      | Aykut            | Hannover   | 1548796 |
      | Mustafa            | Dresden   | 1548797 |
      | Suleyman            | NRW   | 1548798 |

  Scenario Outline: Test Negativ New Payee functionality

    Given User click Pay Bills

    When User click Add new Payee

    When User send a Keys name as "<PayeeName>" user send info as "<UserAdress>" user send info as "<Account>"

    Then Success message should not be displayed

    Examples:
      | PayeeName | UserAdress | Account |
      | Aykut            | Hannover   |  |
      | Mustafa            |    | 45789 |
      |             | NRW   | 8795 |


