package PROJECTS.Project_Cucumber_02.B.StepDefinitions;


import PROJECTS.Project_Cucumber_02.B.Pages.DialogContent_P2B;
import PROJECTS.Project_Cucumber_02.B.Utilities.Driver_P2B;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class _01_LoginSteps {

    WebDriver driver;

    @Given("^Navigate to zero$")
    public void navigate_to_zero() {
        driver = Driver_P2B.getDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^Enter username and password and click Login button$")
    public void enter_username_and_password_and_click_Login_button()  {

        DialogContent_P2B dialogContent = new DialogContent_P2B();

        dialogContent.findElementAndSendKeysFunction("username","username");

        dialogContent.findElementAndSendKeysFunction("password","password");

        dialogContent.findElementAndClickFunction("loginButton");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }




        //dialogContent.gotItBtn.click();
      //  dialogContent.findElementAndClickFunction("gotItBtn");

        /**
         * Siteyle ilgili yaptığım genel işlemler
         * 1- bir butona tıklamak ne gerekiyor: bekleme , kaydırma gerekebiliyor.
         * 2- bir inputa veri göndermek için ne gerekiyor : bekleme, kaydırma, clear
         */
    }

    @Then("^User should login successfully$")
    public void user_should_login_successfully() {

    }

}
