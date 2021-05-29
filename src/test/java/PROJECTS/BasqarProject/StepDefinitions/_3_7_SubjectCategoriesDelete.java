package PROJECTS.BasqarProject.StepDefinitions;

import PROJECTS.BasqarProject.Pages.DialogContent;
import cucumber.api.java.en.Then;

public class _3_7_SubjectCategoriesDelete {

    DialogContent dialogContent=new DialogContent();

    @Then("^Error message should be displayed$")
    public void error_message_should_be_displayed(){

        dialogContent.findElementAndVerifyContainsText("ErrorMessage","Error");
    }
}
