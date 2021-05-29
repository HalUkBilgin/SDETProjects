package PROJECTS.Project_Cucumber_02.A.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class DialogContent_P2 extends _Parent_P2 {
    WebElement myElement;

    //buradaki driver silindi çünkü Parentten geliyor.gerek kalmadı
    public DialogContent_P2() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user_login")
    private WebElement username;

    @FindBy(id = "user_password")
    private WebElement password;

    @FindBy(css = "input[name='submit']")
    private WebElement SubmitLogin;

    @FindBy(linkText = "Pay Bills")
    private WebElement payBills;

    @FindBy(linkText = "Add New Payee")
    private WebElement AddNewPayee;

    @FindBy(css = "#np_new_payee_name")
    private WebElement payeeName;

    @FindBy(css = "#np_new_payee_address")
    private WebElement payeeAddress;

    @FindBy(css = "#np_new_payee_account")
    private WebElement Account;

    @FindBy(css = "#np_new_payee_details")
    private WebElement payeeDetails;

    @FindBy(css = "#add_new_payee")
    private WebElement AddButton;

    @FindBy(css = "div#alert_content")
    private WebElement messagePositive;

    @FindBy(xpath = "//a[text()='Purchase Foreign Currency']")
    private WebElement Currency;

    @FindBy(css = "#pc_currency")
    private WebElement selectCurrency;

    @FindBy(css = "#pc_amount")
    private WebElement amount;

    @FindBy(css = "#pc_inDollars_true")
    private WebElement DollarsButton;

    @FindBy(css = "#pc_inDollars_false")
    private WebElement currencyButton;

    @FindBy(id = "purchase_cash")
    private WebElement purchase;















    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {
            case "SubmitLogin":
                myElement = SubmitLogin;
                break;

            case "payBills":
                    myElement = payBills;
                    break;

            case "AddNewPayee":
                myElement = AddNewPayee;
                break;

            case "AddButton":
                myElement = AddButton;
                break;

            case "Currency":
                myElement =  Currency;
                break;

            case "DollarsButton":
                myElement =  DollarsButton;
                break;

            case "currencyButton":
                myElement =  currencyButton;
                break;

            case "purchase":
                myElement =  purchase;
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

            case "payeeName":
                myElement = payeeName;
                break;

            case "payeeAddress":
                myElement = payeeAddress;
                break;

            case "Account":
                myElement = Account;
                break;

            case "payeeDetails":
                myElement = payeeDetails;
                break;

            case "amount":
                myElement = amount;
                break;


        }

        sendKeysFunction(myElement, value);
    }


    public void verifyElementContainsText(String ElementName, String msg) {
        switch (ElementName) {
            case "messagePositive":
                myElement = messagePositive;
                break;

        }

        verifyElementContainsText(myElement, msg);
    }

    public void findElementSelectFunction(String ElementName, String value) {

        switch (ElementName) {
            case "selectCurrency":
                myElement = selectCurrency;
                break;

        }

        selectElement(myElement, value);
    }

    public static int RandomNumberGenerator(int max) {

        Random rnd = new Random();

        int RandomMumber = rnd.nextInt(max);

        return RandomMumber;

    }

}

