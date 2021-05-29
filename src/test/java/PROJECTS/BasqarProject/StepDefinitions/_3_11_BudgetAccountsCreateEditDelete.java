package PROJECTS.BasqarProject.StepDefinitions;

import PROJECTS.BasqarProject.Pages.DialogContent;
import cucumber.api.java.en.When;

public class _3_11_BudgetAccountsCreateEditDelete {

    DialogContent dialogContent=new DialogContent();

    @When("^Budget Accounts User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void budget_Accounts_User_edit_the_to(String BudgetAccountsName, String newBudgetAccountsName){

        dialogContent.editAndDeleteFunction(BudgetAccountsName, "edit");
        dialogContent.findElementAndSendKeysFunction("nameInput", newBudgetAccountsName);
        dialogContent.findElementAndClickFunction("saveButton");
    }
}
