package PROJECTS.Project_Cucumber_02.A.Pages;

import PROJECTS.Project_Cucumber_02.A.Utilities.Driver_P2;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class _Parent_P2 {

    WebDriver driver;
    WebDriverWait wait;

    public _Parent_P2() {
        driver = Driver_P2.getDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element);// eleman clikable olana kadar bekle
   //   scrollToElement(element); // eleman kadar scroll yap
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

        if (element.isDisplayed() == false){

            System.out.println("Negativ message doğrulandı");
        }

        else {

            // waitUntilVisible(element);
            wait.until(ExpectedConditions.textToBePresentInElement(element,text));

            System.out.println(element.getText());
            System.out.println(text);

            Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));

        }

    }

    public void selectElement(WebElement selectElement, String value){

        Select menu= new Select(selectElement);
        menu.selectByValue(value);
    }
}
