package PROJECTS.Project_Cucumber_04.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    //Her farklı browser için farklı bir static değişken havuzu oluşturduk
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();

    public static WebDriver getDriver()
    {
        // eğer browser adı gelmezse
        if (threadBrowserName.get()==null)
        {
            threadBrowserName.set("chrome");
        }

        if (threadDriver.get()==null)
        {
            switch (threadBrowserName.get())
            {
                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    threadDriver.set(new FirefoxDriver() );
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    threadDriver.set( new ChromeDriver() );
                    break;
            }
        }
        return threadDriver.get();
    }

    public static void quitDriver()
    {
        if (threadDriver.get()!= null)
        {
            threadDriver.get().quit();
            WebDriver driver= threadDriver.get(); // threadLocl deki ilgili driverının referansı alındı.
            driver=null;
            threadDriver.set(driver);

        }
    }
}
