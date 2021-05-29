package PROJECTS.Project_Selenium_1.Part3;


import PROJECTS.Project_Selenium_1.utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class ReadMe extends BaseStaticDriver {

    /*

        1) Bu siteye gidin. -> https://www.snapdeal.com/

        2) "teddy bear" aratın ve  Search butonuna tıklayın.

        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 918 results for 'teddy bear')
        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

        4) Snepdeal logosuna tıklayınız.

        5) URL'in bu olduğunu doğrulayın. (https://www.snapdeal.com/)

     */

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.snapdeal.com");
        driver.manage().window().maximize();

        WebElement searchThing = driver.findElement(By.id("inputValEnter"));
        searchThing.sendKeys("teddy bear");

        WebElement searchButoon = driver.findElement(By.className("searchformButton"));
        searchButoon.click();

        WebElement line = driver.findElement(By.className("marT12"));
        String lineStr = line.getText();
        Assert.assertEquals("We've got 1499 results for 'teddy bear'",lineStr);

        WebElement Snepdeal = driver.findElement(By.className("cur-pointer"));
        Snepdeal.click();


        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://www.snapdeal.com/",url);







        Thread.sleep(3000);
        driver.quit();
    }
}
