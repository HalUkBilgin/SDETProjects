package PROJECTS.Project_TestNG_1;


import PROJECTS.Project_Selenium_1.utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.util.List;
import java.util.Set;

/*
 *"Https://demo.sellacious.com/squick/" sayfasına gidin
 *  * Arama simgesine tıklayın ve "Canon" u arayın
 * * "Canon" kamera için "Add to cart" a tıklayın
 *    * "Ödeme Yap" ı tıklayın
 * Email adresini girin ve ""Proceed" e tıklayın.
 * "Checkout as Guest"  te tıklayın.
 * Formu doldurun.(rastgele bir ülke seçilmeli) - (Eyalet ve ilçe için hiçbir şey seçmeyin)
 * Save butonuna tıklayın
 * Adresin altındaki 'Bill Here' ve 'deliver here' butonuna tıklayın ve devam etmek için oka tıklayın
 * Devam etmek için ok butonuna tıklayın
 * "Proceed to payment" butonuna tıklayın
 * "Cheque" ve "pay now" butonuna tıklayın. (burada bir bug var)
 * "Adress Adress" kutucugunu kapatmak için X 'e basın. (thread sleep)
 * "Cheque" e tıklayın ve "Pay Now" butonuna tekrar basın.
 * "Payment via Cheque approved" mesajının görüntülendiğini dogrulayın
 * Success" mesajının görüntülendiğini doğrulayın
 * "View Invoice" butonuna tıklayın ve doğru ürünü siparis ettiginizi onaylayın.
 * "View Receipt" e tıklayın ve e postanızın makbuzda dogru yazıldıgını kontol edin, onaylayın.
 *
 */
public class Proje4 extends BaseStaticDriver {

public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.e-shopland.ch/sellacious/");

        //search butonuna tıklattım
        driver.findElement(By.xpath("//i[@class='search-icon fa fa-search']")).click();

        //canon u yazdırdık
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Canon");

        //search butonuna tıklattık
        driver.findElement(By.xpath("//button[@class='btn btn-primary findersubmit btn-right']")).click();

        //add to cart a tıklattık
        driver.findElement(By.xpath("(//button[@class='btn btn-default btn-add-cart add'])[1]")).click();

        //check out a tıklattık
        driver.findElement(By.xpath("//button[@class='btn btn-small btn-primary']")).click();

        //email i girdik
        driver.findElement(By.xpath("//input[@id='login_email']")).sendKeys("kocaagayavuz10@gmail.com");

        //Proceed e tıklattık
        driver.findElement(By.xpath("//button[@id='login_email_submit']")).click();

        //checkout as a guest e tıklattık
        driver.findElement(By.xpath("//button[@id='btn_guest_checkout']")).click();

        driver.findElement(By.id("jform0_name")).sendKeys("Yavuz"); //isimi yazdırdık
        driver.findElement(By.id("jform0_company")).sendKeys("Techno Study"); //company yazdırık
        driver.findElement(By.id("jform0_po_box")).sendKeys("48790"); // posta kodunu yazdırdık
        driver.findElement(By.id("jform0_address")).sendKeys("abcdas"); // adresi yazdırdık
        driver.findElement(By.id("jform0_landmark")).sendKeys("asdfasdf"); //landmark yazdırdık



        // Select ülke seçim
        driver.findElement(By.xpath("//div[@id='s2id_jform0_country']")).click();//ülke satırı tıklama
        List<WebElement> ulkeler = driver.findElements(By.cssSelector("div[class='select2-result-label']"));
        int random = (int)(Math.random()*ulkeler.size()+1);
        ulkeler.get(random).click();

        //ulkeler.get(((int) (Math.random() * ulkeler.size()))).click();

        //save butonu tıklatma
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-save-address']")).click();

        //bill here butonuna tıklatma
        driver.findElement(By.xpath("//button[@class='btn btn-small btn-default btn-bill-here']")).click();

        //ship here butonuna tıklatma
        driver.findElement(By.xpath("//button[@class='btn btn-small btn-default btn-ship-here']")).click();

        //next butonuna tıklatma
        driver.findElement(By.xpath("(//a[text()='Next '])[1]")).click();
        Thread.sleep(2000);

        //2. next butonu tıklatma
        WebElement next = driver.findElement(By.xpath("(//a[@class='btn btn-small btn-default btn-next pull-right'])[2]"));
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOf(next));
        next.click();

        //Proceed payment butonuna tıklatma
        WebElement proceed= driver.findElement(By.xpath("//button[@class='btn-next btn btn-primary']"));
        //bu butona kadar scroll yaptık
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",proceed);
        proceed.click();


        //pay now butonuna kadar scroll
        WebElement scroll = driver.findElement(By.xpath("//div[text()='Summary']"));
        js.executeScript("arguments[0].scrollIntoView();",scroll);
        Thread.sleep(1000);

        //pay now tıklatma
        WebElement  payNow = driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-pay-now'])[1]"));
        payNow.click();

        Thread.sleep(2000);

        //cümlenin xpath ini aldık assert de kullanmak için
        WebElement approved = driver.findElement(By.cssSelector("div.alert.alert-info>div>p"));

        //cümlenin xpath ini aldık assert de kullanmak için
        WebElement succes = driver.findElement(By.xpath("//h4[text()='success']"));


        Thread.sleep(2000);
        //Assert kontrol
        Assert.assertEquals("Payment via Cheque approved.",approved.getText());
        Assert.assertEquals("success",succes.getText());


        //ürünün ana sayfadaki xpath kounumu ve text i
        WebElement AnaurunIsım = driver.findElement(By.xpath("//div[@class='orderinfos cart_product_info']"));
        String anaUrun = AnaurunIsım.getText();

        //kullandığımız mailin text i
        String mail = "kocaagayavuz10@gmail.com";

        //Ana sayfa ID si
        String anaSayfaID = driver.getWindowHandle();

        //viewInvoice butonu tıklatma
        WebElement viewInvoice = driver.findElement(By.xpath("//span[text()='VIEW INVOICE']"));
        viewInvoice.click();

        //ID LERİ BULDUK. 2.WEBSAYFASINA GEÇTİK.
        Set<String> windowIdler = driver.getWindowHandles();

        for (String ID: windowIdler) {

        if (ID.equals(anaSayfaID)) continue;

        System.out.println(ID);

        driver.switchTo().window(ID);
        }

        //ürünün 2. sayfadaki xpath konumu ve text i
        WebElement ikinciSayfadaUrun = driver.findElement(By.xpath("//td[@class='v-top']"));
        String urun2 = ikinciSayfadaUrun.getText();
        System.out.println(urun2);

        //ürün ismi kontrol
        Assert.assertTrue(anaUrun.contains(urun2.substring(0,10)));

        //2.pencere kapatma
        driver.close();

        //ana sayfaya dönme
        driver.switchTo().window(anaSayfaID);


        //view receipt tıklatma
        driver.findElement(By.xpath("//span[text()='VIEW RECEIPT']")).click();

        //ID LERİ BULDUK. 3.WEBSAYFASINA GEÇTİK.
        Set<String> windowIdler2 = driver.getWindowHandles();


        for (String ID: windowIdler2) {

        if (ID.equals(anaSayfaID)) continue;

        System.out.println(ID);

        driver.switchTo().window(ID);
        }

        //3. web sayfasından maili kontrol için aldık
        WebElement ikinciMail = driver.findElement(By.xpath("//strong[text()='kocaagayavuz10@gmail.com']"));
        String mail2Str = ikinciMail.getText();

        //Mail kontrol
        Assert.assertEquals(mail,mail2Str);


        //BITTI










        Thread.sleep(2000);
        driver.quit();


        }
        }


