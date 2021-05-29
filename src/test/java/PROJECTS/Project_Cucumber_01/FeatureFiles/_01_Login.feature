

Feature: Login Functionality

  #username ve password girerek login doğrulama
  Scenario: Login with valid username and password

    #siteyi aç - basgara a git
    Given Navigate to automationpractice
    #username ve passwordu gir ve login butonuna tıklat
    When Enter username and password and click Login button
    #Login olduğunu doğrula
    Then User should login successfully



