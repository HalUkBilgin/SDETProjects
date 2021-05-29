package PROJECTS.Project_TestNG_2;


import PROJECTS.Project_Selenium_1.utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Set;

/*
         İlk olarak manuel olarak bir hesap oluşturmalısınız. Bu linkle ulaşabilirsiniz. "http://demowebshop.tricentis.com/register"

            TASK 1
        - Bu siteye gidiniz.  "http://demowebshop.tricentis.com/"
        - Sağ üstteki "Log in" yazısına tıklayınız.
        - "email" ve "password" girip "log in"e tıklayınız.
        - Sayfanın en altındaki "Follow Us" başlığındaki "Facebook" buttonuna tıklayınız.
          Sonrasında açılan pencerenin URL'indeki "facebook" kelimesini doğrulayınız.
        - Ana sayfaya geri dönün.
        - "Information" başlığı altındaki "Contact Us" buttonuna tıklayınız.
        - "Enquiry" yazan yerin altındaki text kutusuna mesajınızı yazıp "submit" butonuna tıklayınız.
        - Sonrasında çıkan yazıyı dpğrulayınız.

            TASK 2
        - Bu siteye gidiniz.  "http://demowebshop.tricentis.com/"
        - Sağ üstteki "Log in" yazısına tıklayınız.
        - "email" ve "password" girip "log in"e tıklayınız.
        - Soldaki "categories" başlığının altındaki "Computers"a tıklayınız.
        - Soldaki yerde "Computers"ın altında "Desktops"a tıklayınız.
        - "BUILD YOUR OWN EXPENSIVE COMPUTER" yazan bilgisayarın altındaki "Add to cart" buttonuna tıklayınız.
        - Processor kısmında Fast'i seçin.
        - Ram kısmından 8GB'yi seçin.
        - HDD kısmından 400 GB'yi seçin.
        - Software kısmından Other Office Suite'i seçinç
        - Add to Cart buttonuna tıklayınız.
        - En yukarıdan Shopping Cart'a tıklayınız.
        - I agree with the terms checkbox'una tıklayınız.
        - Checkout buttonuna tıklayınız.
        - Billing Address formunu doldurun.
        - Formu doldurduktan sonra Continue buttonuna tıklayınız.
        - Shipping Address penceresindeki Continue Buttonuna tıklayınız.
        - Shipping Method penceresindeki Continue Buttonuna tıklayınız.
        - Cash On Delivery'yi seçip Continue buttonuna tıklayınız.
        - Payment Information penceresindeki Continue Buttonuna tıklayınız.
        - Confirm Order penceresindeki Continue Buttonuna tıklayınız.
        - Ekranda yazan mesajı doğrulayınız.

     */
public class Proje5 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://demowebshop.tricentis.com/");

        // ANASAYFA ID Sİ
        String anaSayfaIDsi = driver.getWindowHandle();
        System.out.println("Ana Sayfa ID = " + anaSayfaIDsi);

        // LoginLink Tıklandı
        WebElement logLink = driver.findElement(By.linkText("Log in"));
        logLink.click();

        // E-Mail girişi yapıldı
        WebElement email = driver.findElement(By.cssSelector("input#Email"));
        email.sendKeys("suzun3545@gmail.com");

        // Password girişi yapıldı
        WebElement password = driver.findElement(By.cssSelector("input#Password"));
        password.sendKeys("08011985");

        // Login Tıklatıldı
        WebElement loginButton = driver.findElement(By.cssSelector("input.button-1.login-button"));
        loginButton.click();

        // FacebookLink Tıklatıldı
        WebElement facebook = driver.findElement(By.linkText("Facebook"));
        facebook.click();

        //ID LERİ BULDUK. 2.WEBSAYFASINA GEÇTİK.(FACEBOOK SAYFASI)
        Set<String> windowIdler = driver.getWindowHandles();

        for (String ID: windowIdler) {

            if (ID.equals(anaSayfaIDsi)) continue;

            System.out.println("diğer sayda IDsi = " + ID);

            driver.switchTo().window(ID);
        }

        // 2.SAYFA URL VE ASSERT İLE URL DOĞRULAMA
        String url = driver.getCurrentUrl();
        System.out.println("facebookUrl = " + url);

        Assert.assertTrue(url.toLowerCase().contains("facebook"));

        driver.close(); //2.Sayfayı kapattık

        // ANASAYFAYA GERİ DÖNDÜK
        driver.switchTo().window(anaSayfaIDsi);

        WebElement computers = driver.findElement(By.xpath("(//li[@class='inactive']/a)[2]"));
        computers.click();

        //Desktops tıklandı
        WebElement desktops =driver.findElement(By.linkText("Desktops"));
        desktops.click();

        //"BUILD YOUR OWN EXPENSIVE COMPUTER" yazan bilgisayarın altındaki "Add to cart" buttonuna tıklandı
        WebElement addtocard =driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]"));
        addtocard.click();

        //addToCard tıklandı
        WebElement addToCart = driver.findElement(By.xpath("(//input[@type='button'])[4]"));
        addToCart.click();


        //fast tıklandı
        WebElement fast =driver.findElement(By.cssSelector("input#product_attribute_74_5_26_82"));
        fast.click();

        // ram tıklandı
        WebElement ram=driver.findElement(By.cssSelector("input#product_attribute_74_6_27_85"));
        ram.click();

        //hdd 400gb tıklandı
        WebElement hdd=driver.findElement(By.cssSelector("input#product_attribute_74_3_28_87"));
        hdd.click();

        //Other Office Suite tıklandı
        WebElement officesuit=driver.findElement(By.cssSelector("input#product_attribute_74_8_29_90"));
        officesuit.click();

        //Add to Cart
        WebElement adToCart = driver.findElement(By.cssSelector("input#add-to-cart-button-74"));
        adToCart.click();

        //shopping card tıklandı
        WebElement shoppingCaed = desktops.findElement(By.linkText("Shopping card"));
        shoppingCaed.click();

        //I agree tıklandı
        WebElement Iagree =driver.findElement(By.cssSelector("input#termsofservice"));
        Iagree.click();



        System.out.println("Test Başarılı....");
        Thread.sleep(2000);
       // driver.quit();
    }
}
