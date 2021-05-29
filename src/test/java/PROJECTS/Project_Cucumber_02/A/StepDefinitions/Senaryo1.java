package PROJECTS.Project_Cucumber_02.A.StepDefinitions;


import PROJECTS.Project_Cucumber_02.A.Pages.DialogContent_P2;
import PROJECTS.Project_Cucumber_02.A.Utilities.Driver_P2;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Senaryo1 {

    WebDriver driver;
    DialogContent_P2 dialogContent = new DialogContent_P2();

    @Given("^Navigate to Zero Bank$")
    public void navigate_to_Zero_Bank() {

        driver = Driver_P2.getDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @When("^Enter username and password and click Login button$")
    public void enter_username_and_password_and_click_Login_button() {

        DialogContent_P2 dialogContent = new DialogContent_P2();

        dialogContent.findElementAndSendKeysFunction("username", "username");
        dialogContent.findElementAndSendKeysFunction("password", "password");
        dialogContent.findElementAndClickFunction("SubmitLogin");
    }


    @And("^Click payBills and AddNewPayee$")
    public void click_payBills_and_AddNewPayee(DataTable elements) {

        List<String> elementsToClick = elements.asList(String.class);

        for(int i=0;i<elementsToClick.size();i++) {
            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }



    @When("^User sending the keys in the form content class$")
    public void user_sending_the_keys_in_the_form_content_class(DataTable elements)  {

        List< List<String> >  elementsNameAndValue = elements.asLists(String.class);

        for(int i=0;i<elementsNameAndValue.size();i++) {
            dialogContent.findElementAndSendKeysFunction( elementsNameAndValue.get(i).get(0),
                    elementsNameAndValue.get(i).get(1));
        }

    }

    @When("^Click on the element in the content class$")
    public void click_on_the_element_in_the_content_class(DataTable elements)  {

        List<String> elementsToClick = elements.asList(String.class);

        for(int i=0;i<elementsToClick.size();i++) {
            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }

    }

    @Then("^Success message should be displayed$")
    public void successMessageShouldBeDisplayed() {

        dialogContent.verifyElementContainsText("messagePositive","successfully");

    }





}