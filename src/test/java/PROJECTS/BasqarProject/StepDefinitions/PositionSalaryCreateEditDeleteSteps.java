package PROJECTS.BasqarProject.StepDefinitions;

import PROJECTS.BasqarProject.Pages.DialogContent;
import PROJECTS.BasqarProject.Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class PositionSalaryCreateEditDeleteSteps {

    LeftNav leftNav=new LeftNav();
    DialogContent dialogContent=new DialogContent();

    @And("^Click on the element in the left class$")
    public void clickOnTheElementInTheLeftClass(DataTable elements) {

        List<String> elementsToClick = elements.asList(String.class);

        for(int i=0;i<elementsToClick.size();i++) {

            System.out.println(   elementsToClick.get(i)   );
            leftNav.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @And("^Click on the element in the content class$")
    public void clickOnTheElementInTheContentClass(DataTable elements) {

        List<String> elementsToClick = elements.asList(String.class);

        for(int i=0;i<elementsToClick.size();i++) {

            System.out.println(   elementsToClick.get(i)   );
            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @When("^User sending the keys in the form content class$")
    public void userSendingTheKeysInTheFormContentClass(DataTable elements) {

        List< List<String> >  elementsNameAndValue = elements.asLists(String.class);

        for(int i=0;i<elementsNameAndValue.size();i++) {
            dialogContent.findElementAndSendKeysFunction( elementsNameAndValue.get(i).get(0),
                    elementsNameAndValue.get(i).get(1));
        }
    }

    @Then("^Success message should be displayed$")
    public void success_message_should_be_displayed() {

        dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
    }

    @When("^User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void user_edit_the_to(String PositionSalaryName, String newPositionSalaryName)  {

        dialogContent.editAndDeleteFunction(PositionSalaryName, "edit");
        dialogContent.findElementAndSendKeysFunction("inputNamePositionSalary", newPositionSalaryName);
        dialogContent.findElementAndClickFunction("saveButton");
    }


    @When("^User delete the \"([^\"]*)\"$")
    public void user_delete_the(String PositionSalaryName) {

        dialogContent.editAndDeleteFunction(PositionSalaryName, "delete");
        dialogContent.findElementAndClickFunction("yesButton");
    }


    @When("^Positions User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void positions_User_edit_the_to(String PositionsName, String newPositionsName) {

        dialogContent.editAndDeleteFunction(PositionsName, "edit");
        dialogContent.findElementAndSendKeysFunction("nameInput", newPositionsName);
        dialogContent.findElementAndClickFunction("saveButton");

    }
}
