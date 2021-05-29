package PROJECTS.Project_Cucumber_04.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class DialogContent extends Parent{
    WebElement myElement;

    //buradaki driver silindi çünkü Parentten geliyor.gerek kalmadı
    public DialogContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(linkText = "Got it!")
    private WebElement gotItBtn;

    @FindAll({
            @FindBy(xpath = "//div[@id='toast-container']")
    })
    private List<WebElement> msjContainers;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindAll({
            @FindBy(xpath = "//ms-delete-button/button")
    })
    public List<WebElement> deleteButtonList;

    @FindAll({
            @FindBy(xpath = "//ms-edit-button/button")
    })
    public List<WebElement> editButtonList;

    @FindAll({
            @FindBy(xpath = "//table/tbody/tr/td[2]")
    })
    public List<WebElement> nameList;


































    public void findElementAndClickFunction(String ElementName)
    {
        switch (ElementName) {
            case "loginButton" :
                myElement = loginButton;
                break;
            case "gotItBtn":
                myElement = gotItBtn;
                break;
        }
        clickFunction(myElement);
    }

    public void findElementAndsendKeysFunctionality(String ElementName,String value)
    {
        switch (ElementName){
            case "username" :
                myElement = username;
                break;

            case "password" :
                myElement = password;
                break;
        }
        sendKeysFunction(myElement,value);
    }

    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {

        }

        verifyElementContainsText(myElement, msg);
    }

    public void editAndDeleteFunction(String countryName, String editOrDelete) {

        // invisible olma beklemesini, display ise şartına bağladık, yani
        // gözüküyorsa kaybolana kadar bekle.

        if (msjContainers.size()>0) {
            if (msjContainer.isDisplayed())
                wait.until(ExpectedConditions.invisibilityOfAllElements(msjContainer));
        }

        // yukarıdaki bölüm mesajlar kaybolmadan edit ve deleteye tıklatamıyordu ,
        // yukarıdaki kod ile bu eleman invisible olana kadar bekle dedik.

        // aşağıda editOrDelete den gelen edit veya delete kelimesine
        // göre hangi buton tipine tıklatılacaksa onun LİST i alınıyor.
        List<WebElement> btnList = new ArrayList<>();

        if (editOrDelete.equalsIgnoreCase("delete"))
            btnList = waitVisibleListAllElement(deleteButtonList);
        else
            btnList = waitVisibleListAllElement(editButtonList);

        // nameList içerisinde (table ın 2 stunundaki isimlerin olduğu
        // liste) ülke adı aranıyor. bulunduğunda o indexteki butona
        // (edit veya delete) tıklanarak. Dialog penceresi açılıyor.


        // sayfa yenilendiğinde isimler değişiyor, bu yüzden
        // tekrar bulması için süre eklendi.(stale problemini burası çözdü)
        List<WebElement> nameListNew = waitVisibleListAllElement(nameList);
        for (int i = 0; i < nameListNew.size(); i++) {
            if (nameListNew.get(i).getText().equalsIgnoreCase(countryName)) {
                clickFunction(btnList.get(i));
            }
        }

        // ekranda tıklandıktan sonra izleyebilmek için kondu
        // waiting(5000);
    }
}
