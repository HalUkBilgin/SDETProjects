package PROJECTS.Project_Cucumber_02.B.StepDefinitions;


import PROJECTS.Project_Cucumber_02.B.Pages.DialogContent_P2B;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;

public class _03_ForeignCurrencySteps {

    DialogContent_P2B dialogContent= new DialogContent_P2B();

    @Given("^User select Currency and given amount$")
    public void userSelectCurrencyAndGivenAmount(DataTable elements) {
        dialogContent.findElementAndClickFunction("purchaseForeign");
        List <List<String>> dataTablesElements = elements.asLists(String.class);
        for (int i = 0; i < dataTablesElements.size(); i++) {
            dialogContent.findCountriesAndClick(dataTablesElements.get(i).get(0));
            dialogContent.findElementAndSendKeysFunction("amount", dataTablesElements.get(i).get(1));
            }
        }

    @Then("^User click Purchase$")
    public void userClickPurchase() {
 dialogContent.findElementAndClickFunction("purchaseButton");
    }

    @Then("^User select  as \"([^\"]*)\"$")
    public void userSelectAs(String radioButton)  {
        dialogContent.findElementAndClickFunction(radioButton);
    }
}
