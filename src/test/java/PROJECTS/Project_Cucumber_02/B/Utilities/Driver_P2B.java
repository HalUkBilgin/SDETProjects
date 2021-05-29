package PROJECTS.Project_Cucumber_02.B.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_P2B {

    private static WebDriver driver;

    public static WebDriver getDriver()
    {
        if (driver == null)
        {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
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
