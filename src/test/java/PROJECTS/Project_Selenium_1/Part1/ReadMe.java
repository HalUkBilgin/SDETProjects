package PROJECTS.Project_Selenium_1.Part1;


import PROJECTS.Project_Selenium_1.utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ReadMe extends BaseStaticDriver {

    /*

        1) Bu siteye gidin. ->  http://demoqa.com/text-box

        2) Full Name kısmına "Automation" girin.

        3) Email kısmına "Testing" girin.

        4) Current Address kısmına "Testing Current Address" girin.

        5) Permanent Address kısmına "Testing Permanent Address" girin.

        6) Submit butonuna tıklayınız.

        7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

        8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

     */

    public static void main(String[] args) throws InterruptedException {
        driver.get("http://demoqa.com/text-box"); // siteyi açtım

        driver.manage().window().maximize();

        WebElement name = driver.findElement(By.id("userName"));
        name.sendKeys("Automation");

        WebElement mail = driver.findElement(By.id("userEmail"));
        mail.sendKeys("kocaagayavuz10@gmail.com");

        WebElement adress = driver.findElement(By.id("currentAddress"));
        adress.sendKeys("Testing Current Address");

        WebElement adress2 = driver.findElement(By.id("permanentAddress"));
        adress2.sendKeys("Testing Permanent Address");

        driver.findElement(By.id("submit")).click();
        //  WebElement buton = driver.findElement(By.id("submit"));
        //  buton.click();


        WebElement checkname = driver.findElement(By.id("name"));
        String namecontrol = checkname.getText();


        Assert.assertTrue(namecontrol.contains("Automation"));


        WebElement checkEmail = driver.findElement(By.id("email"));
        String emailtext = checkEmail.getText();

        Assert.assertEquals("Email:Testing@gmail.com",emailtext);

        System.out.println("test başarılı ile geçmiştir...");









        Thread.sleep(5000);
        driver.quit();
    }
}
