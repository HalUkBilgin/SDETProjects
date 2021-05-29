package PROJECTS.BasqarProject.StepDefinitions;

import PROJECTS.BasqarProject.Pages.DialogContent;
import cucumber.api.java.en.When;

public class _3_10_2_SalaryConstantsCreateEditDelete {

    DialogContent dialogContent=new DialogContent();

    @When("^Salary Modifiers User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void salary_Modifiers_User_edit_the_to(String Description, String newDescription) throws Throwable {

        dialogContent.editAndDeleteFunction(Description, "edit");
        dialogContent.findElementAndSendKeysFunction("description", newDescription);
        dialogContent.findElementAndClickFunction("saveButton");
    }

    @When("^Salary Constants User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void salary_Constants_User_edit_the_to(String SalaryConstantsName, String newSalaryConstantsName)  {

        dialogContent.editAndDeleteFunction(SalaryConstantsName, "edit");
        dialogContent.findElementAndSendKeysFunction("salaryConstantNameInput", newSalaryConstantsName);
        dialogContent.findElementAndClickFunction("saveButton");


    }


}
