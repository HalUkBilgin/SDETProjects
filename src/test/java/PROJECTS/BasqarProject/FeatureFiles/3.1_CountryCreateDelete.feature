Feature: Country Create Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create and delete a Country

    And Click on the element in the left class
      | setupOne   |
      | parameters |
      | country    |

    And Click on the element in the content class
      | addButton |

    When User sending the keys in the form content class
      | nameInput | Romanya |
      | codeInput | Grup5   |

    And Click on the element in the content class
      | saveButton |

    Then Success message should be displayed

    When User delete the "Romanya"

    Then Success message should be displayed





