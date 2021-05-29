package PROJECTS.Project_Selenium_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Class1 {
    public static void main(String[] args) {


        System.setProperty("webdriver.edge.driver", "D:/Selenium/EdgeDriver/msedgedriver.exe");


        WebDriver driver = new EdgeDriver();

        driver.get("https://java.com.tr");



    }
}
