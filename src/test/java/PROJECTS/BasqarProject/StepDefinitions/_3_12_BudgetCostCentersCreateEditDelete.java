package PROJECTS.BasqarProject.StepDefinitions;

import PROJECTS.BasqarProject.Pages.DialogContent;
import cucumber.api.java.en.When;

public class _3_12_BudgetCostCentersCreateEditDelete {

    DialogContent dialogContent=new DialogContent();

    @When("^Cost Centers User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void cost_Centers_User_edit_the_to(String CostCentersName, String newCostCentersName) throws Throwable {

        dialogContent.editAndDeleteFunction(CostCentersName, "edit");
        dialogContent.findElementAndSendKeysFunction("nameInput", newCostCentersName);
        dialogContent.findElementAndClickFunction("saveButton");
    }


}
