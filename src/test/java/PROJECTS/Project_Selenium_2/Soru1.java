package PROJECTS.Project_Selenium_2;


import PROJECTS.Project_Selenium_1.utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Soru1 extends BaseStaticDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("http://zero.webappsecurity.com/login.html"); // siteyi açtım // 1

        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.cssSelector("input#user_login")); //2
        username.sendKeys("username");

        WebElement password = driver.findElement(By.cssSelector("input#user_password")); //2
        password.sendKeys("password");

        WebElement sing = driver.findElement(By.cssSelector(".btn.btn-primary")); // 2
        sing.click();

        Thread.sleep(1000);

        WebElement transfer = driver.findElement(By.cssSelector("li#transfer_funds_tab")); // 3
        transfer.click();

        Thread.sleep(1000);

        WebElement accountFrom = driver.findElement(By.cssSelector("#tf_fromAccountId")); //4
        Select menu = new Select(accountFrom);
        menu.selectByIndex(RandomDegerAta(5,0));
// todo random sayıyı method ile aldık. Methodu Soru1 in içinde oluşturduk. Oradan çağırdık.
// todo max ve min değerini Select menüsündeki indeksin aralığına göre Methodun parametre kısmına el ile girdik.
// todo burada Select menüsünde 0.index dahil-5.index dahil alıyoruz. toplam 6 değer var.

        Thread.sleep(1000);

        WebElement accountTo = driver.findElement(By.cssSelector("#tf_toAccountId")); //5
        Select menu2 = new Select(accountTo);
        menu2.selectByIndex(RandomDegerAta(5,0));

        Thread.sleep(1000);

        WebElement amount = driver.findElement(By.cssSelector("#tf_amount")); //6
        amount.sendKeys("100");

        Thread.sleep(1000);

        WebElement description = driver.findElement(By.cssSelector("#tf_description")); //7
        description.sendKeys("Para yatırıldı...");

        Thread.sleep(1000);

        WebElement contButton = driver.findElement(By.cssSelector("#btn_submit")); //8
        contButton.click();

        Thread.sleep(1000);

        WebElement submitButton = driver.findElement(By.cssSelector("#btn_submit")); //9
        submitButton.click();

        Thread.sleep(1000);

        WebElement kontrol = driver.findElement(By.cssSelector("div.alert.alert-success")); // 10
        String kontrolStr = kontrol.getText();
        Assert.assertEquals("You successfully submitted your transaction.",kontrolStr);

        System.out.println("Test başarı ile geçmiştir...");

        Thread.sleep(3000);
        driver.quit();
    }

        public static int RandomDegerAta(int Randommax, int Randommin) {

        int uretilenSayi = (int) (Math.random() * ((Randommax-Randommin)+1)) + Randommin;

        return uretilenSayi;
    }
}