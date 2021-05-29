package PROJECTS.Project_Cucumber_01.Pages;



import PROJECTS.Project_Cucumber_01.Utilities.Driver_P1;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class _Parent_P1 {
    /**
     * Bu dosya diğer bütün page ler için ortak click ve sendkeys
     * için bekleme, scroll ve clear gibi bütün işlemleri tek yerden
     * yapabilmek için eklendi.Bu class diğer pageler tarafından exten edilerek
     * kullanılacak.Böylece tüm pagelerdeki elemanların click ve sendkeys özelliği
     * hem bekleme hem scroll hem de clear özelliği kazanmış olacak.
     */

    WebDriver driver;
    WebDriverWait wait;

    public _Parent_P1() {
        driver = Driver_P1.getDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element);// eleman clikable olana kadar bekle
        scrollToElement(element); // eleman kadar scroll yap
        element.click();// click yap
    }

    public void sendKeysFunction(WebElement element, String value)
    {
        waitUntilVisible(element);// elelman görünüt olana kadar bekle
        scrollToElement(element);// elemana kadar scroll yap
        element.clear();// eleman clear yap
        element.sendKeys(value);// value yi gönder
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilVisible(WebElement element){
       wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element)
    {
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waiting(int ms)
    {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public List<WebElement> waitVisibleListAllElement(List<WebElement> elementList){
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
        return elementList;
    }

    public void verifyElementContainsText(WebElement element, String text){
        // waitUntilVisible(element);
        wait.until(ExpectedConditions.textToBePresentInElement(element,text));
        System.out.println(element.getText());
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

    public void selectElement(WebElement selectElement, String value){

        Select menu= new Select(selectElement);
        menu.selectByValue(value);
    }

}
