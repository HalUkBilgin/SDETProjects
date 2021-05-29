package PROJECTS.Project_Cucumber_01.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class DialogContent_P1 extends _Parent_P1 {
    WebElement myElement;

    //buradaki driver silindi çünkü Parentten geliyor.gerek kalmadı
    public DialogContent_P1() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Sign in")
    private WebElement singButton;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "passwd")
    private WebElement passwordInput;

    @FindBy(id = "SubmitLogin")
    private WebElement SubmitLogin;

    @FindBy(id = "contact-link")
    private WebElement contactUs;

    @FindBy(id = "id_contact")
    private WebElement selectSubject;

    @FindBy(id = "message")
    private WebElement messageInput;

    @FindBy(id = "submitMessage")
    private WebElement submitMessage;

    @FindBy(css = ".alert.alert-success")
    private WebElement SuccessMessage;

    @FindBy(linkText = "Specials")
    private WebElement specialsLink;

    @FindBy(id = "search_query_top")
    private WebElement searchInput;

    @FindAll({
            @FindBy(css = "div.right-block>h5")
    })public List<WebElement> dressName;

    @FindAll({
            @FindBy(css = "div.right-block>h5+p+div")
    })public List<WebElement> prices;

    @FindAll({
            @FindBy(xpath = "//ul[@id='homefeatured']//li//h5//a")
    })public List<WebElement> mainpageproducts ;

    @FindBy(css = "button[name='Submit']")
    private WebElement addToCartButton;

    @FindBy(css = "span#our_price_display")
    private WebElement producktPrice;

    @FindBy(css = "i.icon-home")
    private WebElement HomepageButton;

    @FindBy(linkText = "Proceed to checkout")
    private WebElement proceedToCheckoutLink;

    @FindBy(css = "button.button.btn.btn-default.button-medium")
    private WebElement proceedToCheckoutButton;

    @FindBy(css = "p.fancybox-error")
    private WebElement shippingMessage;

    @FindBy(id = "uniform-cgv")
    private WebElement TermsOfServiceCheckbox;

    @FindBy(css = "a[title='Close']")
    private WebElement closeButton;

    @FindBy(css = "p.payment_module")
    private WebElement paymentButton;

    @FindBy(css = "button.button.btn.btn-default.button-medium")
    private WebElement paymentButton2;

    @FindBy(linkText = "Back to orders")
    private WebElement paymentButton3;

    @FindAll({
            @FindBy(xpath = "//table[@id='order-list']//tbody//tr//td[1]")
    })public List<WebElement> orderHistoryProductList;

    @FindBy(xpath = "//table[@class='table table-bordered']//tbody//tr//td[2]")
    private WebElement orderHistoryProduct;

    @FindBy(xpath = "//table[@id='order-list']//tbody/tr[1]//td[1]")
    private WebElement orderHistorySonEklenenUrun;



    public void findElementAndClickFunction(String ElementName) {
        /**
         * Buraya tıklanacak butonun adı gönderilecek
         * Burada adından hangi eleman olduğu bulunuyor
         * ve sonra tıklanıyor.
         */

        switch (ElementName) {
            case "singButton":
                myElement = singButton;
                break;

            case "SubmitLogin":
                myElement = SubmitLogin;
                break;

            case "contactUs":
                myElement = contactUs;
                break;

            case "submitMessage":
                myElement = submitMessage;
                break;

            case "specialsLink":
                myElement = specialsLink;
                break;

            case "addToCartButton":
                myElement = addToCartButton;
                break;

            case "HomepageButton":
                myElement = HomepageButton;
                break;

            case "proceedToCheckoutLink":
                myElement = proceedToCheckoutLink;
                break;

            case "proceedToCheckoutButton":
                myElement = proceedToCheckoutButton;
                break;

            case "TermsOfServiceCheckbox":
                myElement = TermsOfServiceCheckbox;
                break;

            case "closeButton":
                myElement = closeButton;
                break;

            case "paymentButton":
                myElement = paymentButton;
                break;

            case "paymentButton2":
                myElement = paymentButton2;
                break;

            case "paymentButton3":
                myElement = paymentButton3;
                break;

        }

        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String ElementName, String value) {
        /**
         * Buraya tıklanacak butonun adı gönderilecek
         * Burada adından hangi eleman olduğu bulunuyor
         * ve sonra tıklanıyor.
         */

        switch (ElementName) {
            case "emailInput":
                myElement = emailInput;
                break;

            case "passwordInput":
                myElement = passwordInput;
                break;

            case "messageInput":
                myElement = messageInput;
                break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findElementSelectFunction(String ElementName, String value) {

        switch (ElementName) {
            case "selectSubject":
                myElement = selectSubject;
                break;

        }

        selectElement(myElement, value);
    }


    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
            case "SuccessMessage":
                myElement = SuccessMessage;
                break;

            case "shippingMessage":
                myElement = shippingMessage;
                break;

        }

        verifyElementContainsText(myElement, msg);
    }

    String productsName;

    public void findItemAndGetProduct(List<WebElement> mainpageproducts) {

           myElement = mainpageproducts.get(RandomNumberGenerator(mainpageproducts.size()));

           productsName = myElement.getText();

           System.out.println(productsName);

           clickFunction(myElement);

           myElement = producktPrice;

           String price = myElement.getText();

           System.out.println(price);
    }


    public static int RandomNumberGenerator(int max) {

        Random rnd = new Random();

        int RandomMumber = rnd.nextInt(max);

        return RandomMumber;

    }

    public void orderHistoryVerifyContainsText() {

        clickFunction(orderHistorySonEklenenUrun);

        Assert.assertTrue(orderHistoryProduct.getText().contains(productsName));

            System.out.println(orderHistoryProduct.getText());

        }
    }