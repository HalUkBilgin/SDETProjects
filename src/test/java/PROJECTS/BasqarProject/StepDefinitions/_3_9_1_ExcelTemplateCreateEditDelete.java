package PROJECTS.BasqarProject.StepDefinitions;

import PROJECTS.BasqarProject.Pages.DialogContent;
import cucumber.api.java.en.When;

public class _3_9_1_ExcelTemplateCreateEditDelete {

    DialogContent dialogContent=new DialogContent();


    @When("^Excel Template User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void excel_Template_User_edit_the_to(String ExcelTemplateName, String newExcelTemplateName)  {

        dialogContent.editAndDeleteFunction(ExcelTemplateName, "edit");
        dialogContent.findElementAndSendKeysFunction("nameInput", newExcelTemplateName);
        dialogContent.findElementAndClickFunction("saveButton");

    }

    @When("^Salary Types User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void salary_Types_User_edit_the_to(String salaryTypesName, String newsalaryTypesName)  {

        dialogContent.editAndDeleteFunction(salaryTypesName, "edit");
        dialogContent.findElementAndSendKeysFunction("nameInput", newsalaryTypesName);
        dialogContent.findElementAndClickFunction("saveButton");


    }


}
