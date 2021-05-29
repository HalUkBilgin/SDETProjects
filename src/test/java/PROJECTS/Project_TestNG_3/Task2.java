package PROJECTS.Project_TestNG_3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*
Task 2)
Step 1) Siteye gidin    http://demowebshop.tricentis.com/
Step 2) email ve password girin.
Step 3) Apparel & Shoes ‘ a tıklayın.
Step 4) Blue and green Sneaker ‘e tıklayın.( Green and blue olan değil, 	‘Blue and green sneaker olana tıklayın !!’ )
Step 5) Wishliste ekleyin.
Step 6) Ürünlerin olduğu sayfaya geri gelin. (Step 3 teki sayfaya)
Step 7) 50’s Rockabilly Polka Dot Top JR Plus Size ürününe tıklayın ve wishlist’e  ekleyin.
Step 8) Wishlist sayfasına gidin.
Step 9) Eklediğimiz ürünlerin, wishlist sayfasında gözüküp gözükmediğini doğrulayın.

 */
public class Task2 {


    @Test
    @Parameters({"username", "password"})
// sıralama önemli... 1. yi 1. Stringe,2.yi 2. stringe atıyor...
    public void task1_elements(String userna, String password) { //userna bıraktık ki farkı anlayalım.

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://demowebshop.tricentis.com/");

        project_3_ListElements_POM proje_3Elements = new project_3_ListElements_POM(driver);

        proje_3Elements.Login.click();
        proje_3Elements.email.sendKeys(userna);
        proje_3Elements.password.sendKeys(password);
        proje_3Elements.loginClick.click();
        proje_3Elements.apprShoes.click();
        proje_3Elements.addToCart.click();

        String product1 = proje_3Elements.product1.getText();
        proje_3Elements.apprShoeswishListClick.click();

        driver.navigate().back();

        proje_3Elements._50sAddCart.click();
        String product2 = proje_3Elements.product2.getText();
        proje_3Elements._50sWishList.click();
        proje_3Elements.wishListClick.click();


        boolean bulundu = false;
        for (WebElement el : proje_3Elements.wishTotallist) {

            if (el.getText().contains(product1)) {
                bulundu = true;
                break;
            }
        }

        Assert.assertTrue(bulundu, "Aranan Eleman Bulunamadı");


        boolean bulundu1 = false;
        for (WebElement el : proje_3Elements.wishTotallist) {

            if (el.getText().contains(product2)) {
                bulundu1 = true;
                break;
            }
        }

        Assert.assertTrue(bulundu, "Aranan Eleman Bulunamadı");



/*


        for(WebElement el:projeElements1.wishTotallist){
           Assert.assertTrue( el.getText().contains(product1));
        }

        for(WebElement el:projeElements1.wishTotallist){
            Assert.assertTrue( el.getText().contains(product2));
        }


 */

/*
        ArrayList<String > urunler=new ArrayList<>();
        urunler.add(product1);
        urunler.add(product2);

        int i = 0; // bu sayede fori ye gerek kalmadan foreach ile indexli compare yaparsın.
        for (WebElement eleman : projeElements1.wishTotallist) {
            Assert.assertEquals(eleman.getText(), urunler.get(i++));
        }



 */


        /*

        for (WebElement element: projeElements1.wishTotallist) {

            if (element.getText().contains(product1)) System.out.println(product1 + " VAR");
            if (element.getText().contains(product2)) System.out.println(product2 + " VAR");


        }



         */


    }


}
