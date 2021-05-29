Feature: Subjects Create Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create and delete a Subjects

    And Click on the element in the left class
      | education |
      | setup5    |
      | subject   |

    And Click on the element in the content class
      | addButton |

    When User sending the keys in the form content class
      | nameInput | Statistics |
      | codeInput | mathe99    |

    And Click on the element in the content class
      | subjectCategory |
      | subjectOption1  |
      | style           |
      | subjectOption1  |
      | saveButton      |

    Then Success message should be displayed

    When User delete the "Technology"

    Then Success message should be displayed





