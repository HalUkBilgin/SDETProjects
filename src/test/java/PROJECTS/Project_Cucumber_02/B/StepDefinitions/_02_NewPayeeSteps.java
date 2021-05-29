package PROJECTS.Project_Cucumber_02.B.StepDefinitions;


import PROJECTS.Project_Cucumber_02.B.Pages.DialogContent_P2B;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _02_NewPayeeSteps {

    DialogContent_P2B dialogContent = new DialogContent_P2B();

    @Given("^User click Pay Bills$")
    public void userClickPayBills() {
   dialogContent.findElementAndClickFunction("payBills");
    }

    @When("^User click Add new Payee$")
    public void userClickAddNewPayee() {
        dialogContent.findElementAndClickFunction("addNewPayee");
    }

    @When("^User send a Keys name as \"([^\"]*)\" user send info as \"([^\"]*)\" user send info as \"([^\"]*)\"$")
    public void userSendAKeysNameAsUserSendInfoAsUserSendInfoAs(String name, String address, String account) {
       dialogContent.findElementAndSendKeysFunction("name", name);
       dialogContent.findElementAndSendKeysFunction("address", address);
       dialogContent.findElementAndSendKeysFunction("account", account);
       dialogContent.findElementAndClickFunction("addButton");
    }

    @Then("^Success message should be displayed$")
    public void successMessageShouldBeDisplayed() {

        dialogContent.findElementAndVerifyContainsText("message", "successfully");
    }

    @Then("^Success message should not be displayed$")
    public void errorMessageShouldBeDisplayed() {
        dialogContent.isDisplayedMethod("message");
    }
}
