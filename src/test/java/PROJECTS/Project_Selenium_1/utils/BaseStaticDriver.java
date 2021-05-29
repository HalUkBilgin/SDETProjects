package PROJECTS.Project_Selenium_1.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;

public class BaseStaticDriver {
    public static WebDriver driver;

    // direk bu class çağrıldığı anda canlı olması için static blok içine alındı
    static {
        System.setProperty(EdgeDriverService.EDGE_DRIVER_LOG_PROPERTY, "true"); // consola yazılan gereksiz bilgileri sessize aldı.
        System.setProperty("webdriver.edge.driver", "Driver/msedgedriver.exe");
        // hangi browserı kullanacağımı ve tarayıcının path ini verdim.
       driver= new ChromeDriver(); // çalıştıracağımız driverı kontrol edecek değişkeni tanımladım.
    }

}