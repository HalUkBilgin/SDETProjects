package PROJECTS.Project_Cucumber_03.Pages;


import TechnoStudy.Pages._Parent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Set;

;

public class DialogContent_P3 extends _Parent {
    WebDriver driver;
    WebElement myElement;

    //buradaki driver silindi çünkü Parentten geliyor.gerek kalmadı
    public DialogContent_P3() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Sign in")
    private WebElement signIn;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "SubmitLogin")
    private WebElement submitLogin;

    @FindBy(css = "li.facebook")
    private WebElement facebook;

    @FindBy(css = "li.twitter")
    private WebElement twitter;

    @FindBy(css = "li.youtube")
    private WebElement youtube;

    @FindBy(css = "li.google-plus")
    private WebElement google;

    public void isDisplayedMethod(String elementName) {

        switch (elementName) {

        }
        if (!myElement.isDisplayed())
            System.out.println("Text has not been added");
    }


    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {
            case "signIn":
                myElement = signIn;
                break;

            case "submitLogin":
                myElement = submitLogin;
                break;
            case "facebook":
                myElement = facebook;
                break;
            case "twitter":
                myElement = twitter;
                break;
            case "youtube":
                myElement = youtube;
                break;
            case "google":
                myElement = google;
                break;
        }
        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {
            case "email":
                myElement = email;
                break;

            case "passwrod":
                myElement = password;
                break;
        }

        sendKeysFunction(myElement, value);
    }


    public void changePageAndAssert(String anaSaydaID, String title) {

        Set<String> pageIDs = driver.getWindowHandles();

        for (String pageID : pageIDs) {
            if (!pageID.equals(anaSaydaID))
                driver.switchTo().window(pageID);
        }

        String newPageUrl = driver.getCurrentUrl();

        Assert.assertTrue(newPageUrl.contains(title));
        System.out.println(title + " sayfası doğrulandı...");
        driver.close();
        driver.switchTo().window(anaSaydaID);


    }
}
