package PROJECTS.Project_Selenium_2;


import PROJECTS.Project_Selenium_1.utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class Soru3 extends BaseStaticDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("http://zero.webappsecurity.com/login.html"); // siteyi açtım // 1

        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.cssSelector("input#user_login")); //2
        username.sendKeys("username");

        WebElement password = driver.findElement(By.cssSelector("input#user_password")); //2
        password.sendKeys("password");

        Thread.sleep(1000);

        WebElement sing = driver.findElement(By.cssSelector(".btn.btn-primary")); // 2
        sing.click();

        Thread.sleep(1000);

        WebElement paybils = driver.findElement(By.cssSelector("#pay_bills_tab")); // 3
        paybils.click();

        Thread.sleep(1000);

        WebElement purchase = driver.findElement(By.xpath("//a[text()='Purchase Foreign Currency']")); // 4
        purchase.click();

        Thread.sleep(1000);

        WebElement currency = driver.findElement(By.cssSelector("select[name='currency']")); // 5
        Select menu = new Select(currency);

        List<WebElement> currencList = menu.getOptions(); // 5
        int max = currencList.size();
        menu.selectByIndex(Soru1.RandomDegerAta(max,1));
// todo random sayıyı method ile aldık. Methodu Soru1 in içinde oluşturduk. Oradan çağırdık.
// todo max ve min değerini Select menüsündeki indeksin aralığına göre Methodun parametre kısmına el ile girdik.
// todo burada Select menüsünde 1.index dahil olmalı. 0.indekste değer yok. min oyüzden 1 girdik. max ise Arraylist ile aldırdık.

        Thread.sleep(1000);

        WebElement amount = driver.findElement(By.cssSelector("#pc_amount")); // 6
        amount.sendKeys("500");

        Thread.sleep(1000);

        WebElement dolar = driver.findElement(By.cssSelector("input#pc_inDollars_true")); // 7
        dolar.click();

        Thread.sleep(1000);

        WebElement purchaseButton = driver.findElement(By.cssSelector("input#purchase_cash")); // 8
        purchaseButton.click();

        Thread.sleep(1000);

        WebElement kontrol = driver.findElement(By.cssSelector("div#alert_content")); // 9
        String kontrolStr = kontrol.getText();
        Assert.assertEquals("Foreign currency cash was successfully purchased.",kontrolStr);

        System.out.println("Test başarı ile geçmiştir...");

        Thread.sleep(3000);
        driver.quit();
    }
}