package PROJECTS.BasqarProject.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class DialogContent extends Parent {

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
            @FindBy(linkText = "Got it!")
    })
    private List<WebElement> gotItBtns;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindAll({
            @FindBy(xpath = "//div[@id='toast-container']")
    })
    private List<WebElement> msjContainers;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement ErrorMessage;

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






    // 3.8 proje
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='title']/input")
    private WebElement inputNamePositionSalary;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortName;


    // 3.5 Hülya hanim

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;

    @FindBy(xpath = "//mat-select[@formcontrolname='id']")
    private WebElement subjectCategory;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    private WebElement subjectOption1;

    @FindBy(xpath = "//mat-select[@formcontrolname='value']")
    private WebElement style;


    // 3.9 Gülsah hanim

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'FIELD.ADD')]//button")
    private WebElement addButtonReports;

    @FindBy(xpath = "//ms-integer-field[contains(@placeholder,'FIELD.ROW_SIZE')]//input")
    private WebElement rowSizeExcelTemplate;

    @FindBy(xpath = "//ms-integer-field[contains(@placeholder,'FIELD.COLUMN_SIZE')]//input")
    private WebElement columnSizeExcelTemplate;

    @FindBy(xpath = "//span[text()='Add Version']")
    private WebElement addVersion;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeButton;

    @FindBy(xpath = "//input[@matchipinputaddonblur='false']")
    private WebElement salaryuserType;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[6]")
    private WebElement salaryuserTypeOption5;


    // 3.1 Yavuz Bey

    @FindBy(xpath = "//mat-select[@formcontrolname='id']")
    private WebElement countrySelect;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[15]")
    private WebElement countryOption15;

    @FindBy(xpath = "//span[contains(text(),'SOMECOUNTRY')]")
    private WebElement SOMECOUNTRY;


    // 3.10 Bekir Bey

    @FindBy(xpath = "//input[@formcontrolname='description']")
    private WebElement description;

    @FindBy(xpath = "//input[@formcontrolname='variable']")
    private WebElement variable;

    @FindBy(xpath = "//input[@formcontrolname='priority']")
    private WebElement priority;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement amount;

    @FindBy(xpath = "//input[@formcontrolname='name']")
    private WebElement salaryConstantNameInput;

    @FindBy(xpath = "//input[@data-placeholder='Valid From']")
    private WebElement validFromInput;

    @FindBy(xpath = "(//mat-month-view[@class='ng-star-inserted']//td)[7]")
    private WebElement calendar;

    @FindBy(xpath = "//ms-text-field[@name='key']/input")
    private WebElement keyInput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='value']/input")
    private WebElement valueInput;


    // 3.11 Deniz Hanim

    @FindBy(xpath = "//span[text()='Type']")
    private WebElement type;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    private WebElement typeOptions;

    @FindBy(xpath = "//mat-select[@formcontrolname='balanceType']")
    private WebElement balanceType;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
    private WebElement balanceTypeOptions;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'GENERAL.BUTTON')]//button")
    private WebElement BudgetAccountsAddButton;

    @FindBy(xpath = "//button[@style='width: 40px;']")
    private WebElement backButton;

    @FindBy(xpath = "//ms-text-field[@type='number']/input")
    private WebElement orderNoInput;

    @FindBy(xpath = "//input[@aria-autocomplete='list']")
    private WebElement expenceAccoundcode;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    private WebElement expenceAccoundcodeOptions;







    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {
            case "loginButton":
                myElement = loginButton;
                break;

            case "gotItBtn":
                // bu eleman yok ise çoklu olarak yinede bulduk
                // eğer gerçekten yok ise size 0 olacağı için
                // bekletmeye düşmesin diye fonksiyonu geri gönderdik.

                if (gotItBtns.size() == 0)
                    return;

                myElement = gotItBtn;
                break;

            case "addButton":
                myElement = addButton;
                break;

            case "saveButton":
                myElement = saveButton;
                break;

            case "yesButton":
                myElement = yesButton;
                break;

            case "subjectCategory":
                myElement = subjectCategory;
                break;

            case "subjectOption1":
                myElement = subjectOption1;
                break;

            case "style":
                myElement = style;
                break;

            case "addButtonReports":
                myElement = addButtonReports;
                break;


            case "addVersion":
                myElement = addVersion;
                break;

            case "closeButton":
                myElement = closeButton;
                break;

            case "salaryuserType":
                myElement = salaryuserType;
                break;

            case "salaryuserTypeOption5":
                myElement = salaryuserTypeOption5;
                break;

            case "countrySelect":
                myElement = countrySelect;
                break;

            case "countryOption15":
                myElement = countryOption15;
                break;

            case "SOMECOUNTRY":
                myElement = SOMECOUNTRY;
                break;

            case "validFromInput":
                myElement = validFromInput;
                break;

            case "calendar":
                myElement = calendar;
                break;

            case "type":
                myElement = type;
                break;

            case "typeOptions":
                myElement = typeOptions;
                break;

            case "balanceType":
                myElement = balanceType;
                break;

            case "balanceTypeOptions":
                myElement = balanceTypeOptions;
                break;

            case "BudgetAccountsAddButton":
                myElement = BudgetAccountsAddButton;
                break;

            case "backButton":
                myElement = backButton;
                break;

            case "expenceAccoundcode":
                myElement = expenceAccoundcode;
                break;

            case "expenceAccoundcodeOptions":
                myElement = expenceAccoundcodeOptions;
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

            case "inputNamePositionSalary":
                myElement = inputNamePositionSalary;
                break;

            case "nameInput":
                myElement = nameInput;
                break;

            case "shortName":
                myElement = shortName;
                break;

            case "codeInput":
                myElement = codeInput;
                break;

            case "rowSizeExcelTemplate":
                myElement = rowSizeExcelTemplate;
                break;

            case "columnSizeExcelTemplate":
                myElement = columnSizeExcelTemplate;
                break;

            case "description":
                myElement = description;
                break;

            case "variable":
                myElement = variable;
                break;

            case "priority":
                myElement = priority;
                break;

            case "amount":
                myElement = amount;
                break;

            case "salaryConstantNameInput":
                myElement = salaryConstantNameInput;
                break;

            case "keyInput":
                myElement = keyInput;
                break;

            case "valueInput":
                myElement = valueInput;
                break;

            case "orderNoInput":
                myElement = orderNoInput;
                break;




        }

        sendKeysFunction(myElement, value);
    }


    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
            case "msjContainer":
                myElement = msjContainer;
                break;

            case "ErrorMessage":
                myElement = ErrorMessage;
                break;
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