package PROJECTS.Project_Cucumber_01.StepDefinitions;



import PROJECTS.Project_Cucumber_01.Pages.DialogContent_P1;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class _03_SpecialsSteps {

    DialogContent_P1 dialogContent = new DialogContent_P1();

    @Then("^Navigate to Specials page$")
    public void navigate_to_Specials_page(){

        dialogContent.findElementAndClickFunction("specialsLink");


    }

    @Then("^Comparison of discounted products$")
    public void comparison_of_discounted_products() {

        Assert.assertTrue(dialogContent.dressName.size()==dialogContent.prices.size());

    }



}
