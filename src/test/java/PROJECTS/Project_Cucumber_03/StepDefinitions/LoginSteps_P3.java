package PROJECTS.Project_Cucumber_03.StepDefinitions;


import PROJECTS.Project_Cucumber_04.Pages.DialogContent;
import PROJECTS.Project_Cucumber_04.Utilities.Driver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginSteps_P3 {

    WebDriver driver;
    DialogContent dialogContent = new DialogContent();

    @Given("^Navigate to automationpractice$")
    public void navigate_to_automationpractice() {

        driver = Driver.getDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @When("^Enter username and password and click Sign in button$")
    public void enter_username_and_password_and_click_Sign_in_button()  {

        dialogContent.findElementAndClickFunction("signIn");
        dialogContent.findElementAndSendKeysFunction("email","huzun3517@gmail.com");
        dialogContent.findElementAndSendKeysFunction("passwrod","izmir1984");
        dialogContent.findElementAndClickFunction("submitLogin");
    }


    @Then("^User clicks social media links and verifies$")
    public void user_clicks_social_media_links_and_verifies(DataTable elements) {

        List<String> elementsToClick = elements.asList(String.class);

        String anaSaydaID = driver.getWindowHandle();

        for (int i = 0; i < elementsToClick.size(); i++) {
            dialogContent.findElementAndClickFunction(elementsToClick.get(i));

            dialogContent.changePageAndAssert(anaSaydaID,elementsToClick.get(i));
        }
    }
}
