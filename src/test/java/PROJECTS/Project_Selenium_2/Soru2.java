package PROJECTS.Project_Selenium_2;


import PROJECTS.Project_Selenium_1.utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Soru2 extends BaseStaticDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("http://zero.webappsecurity.com/login.html"); // siteyi açtım // 1

        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.cssSelector("input#user_login")); //2
        username.sendKeys("username");

        WebElement password = driver.findElement(By.cssSelector("input#user_password")); //2
        password.sendKeys("password");

        WebElement sing = driver.findElement(By.cssSelector(".btn.btn-primary")); // 2
        sing.click();

        WebElement paybils = driver.findElement(By.cssSelector("#pay_bills_tab")); // 3
        paybils.click();

        Thread.sleep(1000);

        WebElement Payee = driver.findElement(By.cssSelector("#sp_payee")); //4
        Select menu = new Select(Payee);
        menu.selectByIndex(Soru1.RandomDegerAta(3,0));
// todo random sayıyı method ile aldık. Methodu Soru1 in içinde oluşturduk. Oradan çağırdık.
// todo max ve min değerini Select menüsündeki indeksin aralığına göre Methodun parametre kısmına el ile girdik.
// todo burada Select menüsünde 0.index dahil-3.index dahil alıyoruz. toplam 4 değer var.

        Thread.sleep(1000);

        WebElement account = driver.findElement(By.cssSelector("select#sp_account")); //5
        Select menu2 = new Select(account);
        menu2.selectByIndex(Soru1.RandomDegerAta(5,0));
// todo burada Select menüsünde 0.index dahil-5.index dahil alıyoruz. toplam 6 değer var.

        Thread.sleep(1000);

        WebElement amount = driver.findElement(By.cssSelector("#sp_amount")); //6
        amount.sendKeys("89988");

        Thread.sleep(1000);

        WebElement date = driver.findElement(By.cssSelector("#sp_date")); //7
        date.click();
        WebElement day = driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")); //7
        day.click();

        Thread.sleep(1000);

        WebElement description = driver.findElement(By.cssSelector("input#sp_description")); //8
        description.sendKeys("Borcu zamanında ödeyeceğim");

        Thread.sleep(1000);

        WebElement pay = driver.findElement(By.cssSelector("input#pay_saved_payees")); //9
        pay.click();

        WebElement kontrol = driver.findElement(By.cssSelector("div#alert_content")); // 10
        String kontrolStr = kontrol.getText();
        Assert.assertEquals("The payment was successfully submitted.",kontrolStr);

        System.out.println("Test başarı ile geçmiştir...");

        Thread.sleep(3000);
        driver.quit();
    }
}