package PROJECTS.Project_Cucumber_02.A.StepDefinitions;


import PROJECTS.Project_Cucumber_02.A.Pages.DialogContent_P2;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;


public class Senaryo2 {

    WebDriver driver;
    DialogContent_P2 dialogContent = new DialogContent_P2();

    @And("^Click payBills and purchase foreign currency$")
    public void clickPayBillsAndPurchaseForeignCurrency(DataTable elements) {

        List<String> elementsToClick = elements.asList(String.class);

        for(int i=0;i<elementsToClick.size();i++) {
            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @When("^Select Currency$")
    public void selectCurrency() {

        dialogContent.findElementSelectFunction("selectCurrency","EUR");

    }




}