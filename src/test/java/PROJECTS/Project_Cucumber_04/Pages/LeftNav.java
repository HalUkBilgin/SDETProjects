package PROJECTS.Project_Cucumber_04.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(driver, this);
    }
    //@FindBy


    WebElement myElement;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {

            //case
        }
        clickFunction(myElement);
    }
}
