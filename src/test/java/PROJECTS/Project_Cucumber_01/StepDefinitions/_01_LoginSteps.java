package PROJECTS.Project_Cucumber_01.StepDefinitions;



import PROJECTS.Project_Cucumber_01.Pages.DialogContent_P1;
import PROJECTS.Project_Cucumber_01.Utilities.Driver_P1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class _01_LoginSteps {

    WebDriver driver;

    @Given("^Navigate to automationpractice$")
    public void navigate_to_automationpractice() {

        driver = Driver_P1.getDriver();
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @When("^Enter username and password and click Login button$")
    public void enter_username_and_password_and_click_Login_button() {

        DialogContent_P1 dialogContent = new DialogContent_P1();

        dialogContent.findElementAndClickFunction("singButton");

        dialogContent.findElementAndSendKeysFunction("emailInput","suzun35@gmail.com");

        dialogContent.findElementAndSendKeysFunction("passwordInput","izmir1985");

        dialogContent.findElementAndClickFunction("SubmitLogin");






    }

    @Then("^User should login successfully$")
    public void user_should_login_successfully() {

        String title = driver.getTitle();

        Assert.assertEquals(title,"My account - My Store");

    }

}
