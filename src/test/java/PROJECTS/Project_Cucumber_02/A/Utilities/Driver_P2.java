package PROJECTS.Project_Cucumber_02.A.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_P2 {
    /**
     *  Interview Sorusu
     *              Singleton driver nedir?
     *      Bütün projede aynı ve tek bir driverın kullanılmasıdır.
     */

    private static WebDriver driver;

    public static WebDriver getDriver()
    {
        if (driver == null)
        {
            // System.SetProperty'nin karşılığı olarak projeyi chromedriver'la
            // çalışacak şekilde buraya set etmiş olduk
            WebDriverManager.chromedriver().setup(); // System.SetProperty nin karşılığı
            driver=new ChromeDriver();

            // firefox için de aşağıdaki şekilde
//            WebDriverManager.firefoxdriver().setup();
//            driver=new FirefoxDriver();
        }
        return driver;
    }

    public static void quitDriver()
    {
        if (driver != null)
        {
            driver.quit();
            driver=null;
        }
    }
}
