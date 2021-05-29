package PROJECTS.Project_Cucumber_02.B.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent_P2B extends _Parent_P2B {
    WebElement myElement;

    //buradaki driver silindi çünkü Parentten geliyor.gerek kalmadı
    public DialogContent_P2B() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user_login")
    private WebElement username;

    @FindBy(id = "user_password")
    private WebElement password;

    @FindBy(css = "input[name='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//a[text()='Pay Bills']")
    private WebElement payBills;

    @FindBy(xpath = "//a[text()='Add New Payee']")
    private WebElement addNewPayee;

    @FindBy(id = "np_new_payee_name")
    private WebElement name;

    @FindBy(id = "np_new_payee_address")
    private WebElement address;

    @FindBy(id = "np_new_payee_account")
    private WebElement account;

    @FindBy(id = "alert_content")
    private WebElement message;

    public void isDisplayedMethod (String elementName){

        switch (elementName) {
            case "message":
                myElement = message;
                break;
        }
        if (!myElement.isDisplayed() )
            System.out.println("Text has not been added");
    }

    @FindBy(id = "add_new_payee")
    private WebElement addButton;

    @FindBy(xpath = "(//div[@id='tabs']//ul//li)[3]")
    private WebElement purchaseForeign;


    @FindBy(id = "pc_currency")
    private WebElement selectButton;

    @FindAll({
            @FindBy(css = "#pc_currency>option")
    })
    public List<WebElement> countriesCurrency;

    @FindBy(id = "pc_amount")
    private WebElement amount;

    @FindBy(css = "#pc_inDollars_true")
    private WebElement usDollar;

    @FindBy(id = "pc_inDollars_false")
    private WebElement selectedCurrency;

    @FindBy(id = "purchase_cash")
    private WebElement purchaseButton;

    public void findCountriesAndClick(String country){

        selectButton.click();

        for (int j = 0; j < countriesCurrency.size(); j++) {
            if (countriesCurrency.get(j).getText().contains(country ))
            countriesCurrency.get(j).click();
        }
}
    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {
            case "loginButton":
                myElement = loginButton;
                break;

            case "payBills":
                myElement = payBills;
                break;

            case "addNewPayee":
                myElement = addNewPayee;
                break;

            case "addButton":
                myElement = addButton;
                break;

            case "selectButton":
                myElement = selectButton;
                break;

            case "usDollar":
                myElement = usDollar;
                break;

            case "selectedCurrency":
                myElement = selectedCurrency;
                break;

            case "purchaseForeign":
                myElement = purchaseForeign;
                break;

            case "purchaseButton":
                myElement = purchaseButton;
                break;

        }

        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {
            case "username":
                myElement = username;
                break;

            case "password":
                myElement = password;
                break;

            case "name":
                myElement = name;
                break;

            case "address":
                myElement = address;
                break;

            case "account":
                myElement = account;
                break;

            case "amount":
                myElement = amount;
                break;

        }

        sendKeysFunction(myElement, value);
    }


    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
            case "message":
                myElement = message;
                break;
        }

      verifyElementContainsText(myElement, msg);
    }
}
