
Feature: Order History


  Background:
    Given Navigate to automationpractice
    When Enter username and password and click Login button
    Then User should login successfully

    Scenario: Product purchase
      Then Click to Home Page
      And Click to click to product
      Then  Click to Add to cart
      And  Click to Proceed to Checkout button
      And  Click to processCarrier button und Error message should be displayed
      And  Click to TermsOfServiceCheckbox und Click to processCarrier button
      And  Click to Payment button
      Then Verification of the product in the Order History




