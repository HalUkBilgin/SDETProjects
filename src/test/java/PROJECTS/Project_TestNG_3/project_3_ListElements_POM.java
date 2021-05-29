package PROJECTS.Project_TestNG_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class project_3_ListElements_POM {

    public project_3_ListElements_POM(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Log in")
    public WebElement Login;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    public WebElement loginClick;

    @FindBy(linkText = "Contact us")
    public WebElement contactUsClick;

    @FindBy(id = "Enquiry")
    public WebElement enquiry;

    @FindBy(name = "send-email")
    public WebElement submit;

    @FindBy(css = "div.result")
    public WebElement dogrulama;


    /*********************************************/

    @FindBy(xpath = "(//div[@class='listbox']/*/*)[4]/*")
    public WebElement apprShoes;


    @FindBy(xpath = "(//input[@class='button-2 product-box-add-to-cart-button'])[2]")
    public WebElement addToCart;

    @FindBy(css = "div.product-name>h1")
    public WebElement product1;

    @FindBy(id = "add-to-wishlist-button-28")
    public WebElement apprShoeswishListClick;

    @FindBy(xpath = "(//input[@class='button-2 product-box-add-to-cart-button'])[1]")
    public WebElement _50sAddCart;

    @FindBy(css = "div.product-name>h1")
    public WebElement product2;

    @FindBy(id = "add-to-wishlist-button-5")
    public WebElement _50sWishList;

    @FindBy(xpath = "//span[text()='Wishlist']")
    public WebElement wishListClick;

    @FindAll({
            @FindBy(xpath = "//td[@class='product']")

    })

    public List<WebElement> wishTotallist;


}
