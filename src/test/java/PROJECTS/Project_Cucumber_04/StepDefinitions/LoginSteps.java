package PROJECTS.Project_Cucumber_04.StepDefinitions;

import PROJECTS.Project_Cucumber_04.Pages.DialogContent;
import PROJECTS.Project_Cucumber_04.Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver;
    DialogContent dialogContent = new DialogContent();


    @Given("^Navigate to basqar$")
    public void navigate_to_basqar() {

        driver = Driver.getDriver();
        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

    }

    @When("^Enter username and password and click login button$")
    public void enter_username_and_password_and_click_login_button(){


        dialogContent.findElementAndsendKeysFunctionality("username","daulet2030@gmail.com");
        dialogContent.findElementAndsendKeysFunctionality("password","TechnoStudy123@");
        dialogContent.findElementAndClickFunction("loginButton");
        dialogContent.findElementAndClickFunction("gotItBtn");

    }

    @Then("^User login successfully$")
    public void user_login_successfully(){

    }

}
