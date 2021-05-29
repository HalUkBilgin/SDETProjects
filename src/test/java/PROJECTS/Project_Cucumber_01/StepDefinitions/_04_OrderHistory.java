package PROJECTS.Project_Cucumber_01.StepDefinitions;


;
import PROJECTS.Project_Cucumber_01.Pages.DialogContent_P1;
import cucumber.api.java.en.Then;

public class _04_OrderHistory {

    DialogContent_P1 dialogContent = new DialogContent_P1();

    @Then("^Click to Home Page$")
    public void click_to_Home_Page() {

        dialogContent.findElementAndClickFunction("HomepageButton");
    }

    @Then("^Click to click to product$")
    public void click_to_click_to_product() {

        dialogContent.findItemAndGetProduct(dialogContent.mainpageproducts);
    }

    @Then("^Click to Add to cart$")
    public void click_to_Add_to_cart() {

        dialogContent.findElementAndClickFunction("addToCartButton");

    }

    @Then("^Click to Proceed to Checkout button$")
    public void click_to_Proceed_to_Checkout_button() {

        dialogContent.findElementAndClickFunction("proceedToCheckoutLink");
        dialogContent.findElementAndClickFunction("proceedToCheckoutLink");
        dialogContent.findElementAndClickFunction("proceedToCheckoutButton");
    }

    @Then("^Click to processCarrier button und Error message should be displayed$")
    public void click_to_processCarrier_button_und_Error_message_should_be_displayed()  {

        dialogContent.findElementAndClickFunction("proceedToCheckoutButton");
        dialogContent.findElementAndVerifyContainsText("shippingMessage","You must agree to the terms of service before continuing");
        dialogContent.findElementAndClickFunction("closeButton");
    }

    @Then("^Click to TermsOfServiceCheckbox und Click to processCarrier button$")
    public void click_to_TermsOfServiceCheckbox_und_Click_to_processCarrier_button() {

        dialogContent.findElementAndClickFunction("TermsOfServiceCheckbox");
        dialogContent.findElementAndClickFunction("proceedToCheckoutButton");

    }

    @Then("^Click to Payment button$")

    public void click_to_Payment_button() {

        dialogContent.findElementAndClickFunction("paymentButton");
        dialogContent.findElementAndClickFunction("paymentButton2");
        dialogContent.findElementAndClickFunction("paymentButton3");
    }


    @Then("^Verification of the product in the Order History$")
    public void verification_of_the_product_in_the_Order_History() {

        dialogContent.orderHistoryVerifyContainsText();
    }

}
