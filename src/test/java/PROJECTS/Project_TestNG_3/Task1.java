package PROJECTS.Project_TestNG_3;
/*
NOTE : 	NOT: Bu web sitesi için bir hesabınız yoksa,bir tane oluşturun
        testNG Projesi :
        •	Verilen taskları  iki farklı classta oluşturmalı ve taskları tamamladıktan sonra
        bu görevleri paralel olarak run etmelisiniz.
        •	Username ve password ‘ u  xml dosyasında  bir parametre olarak kullanın.

        Task 1)
        Step 1) Siteye gidin    http://demowebshop.tricentis.com/
        Step 2) username ve password girin.
        Step 3) Sol alttaki contact us butonuna tıklayın.
        Step 4)Gerekli alanları doldurun.
        Step 5) Submit butonuna tıklayın.
        Step 6) Submite bastıktan sonra gelen mesajın gözüküp gözükmedigini kontrol edin.

 */

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1 {


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
        proje_3Elements.contactUsClick.click();
        proje_3Elements.enquiry.sendKeys("GROUP_5 completed  projects successfully");
        proje_3Elements.submit.click();

        Assert.assertTrue(proje_3Elements.dogrulama.getText().contains("succes"));


    }


}
