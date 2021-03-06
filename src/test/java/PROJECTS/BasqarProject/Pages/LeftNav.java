package PROJECTS.BasqarProject.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(driver, this);
    }

    // 3.8 proje Hüseyin

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setup3;

    @FindBy(xpath = "//span[text()='Position Salary']")
    private WebElement positionSalary;

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positions;



    // 3.5 proje Hülya hanim

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement setup5;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subjectCategories;

    @FindBy(xpath = "//span[text()='Subjects']")
    private WebElement subject;


    // 3.9 Gulsah Hanim

    @FindBy(xpath = "(//span[text()='Reports'])[4]")
    private WebElement reports;

    @FindBy(xpath = "(//span[text()='Setup'])[7]")
    private WebElement setup7;

    @FindBy(xpath = "//span[text()='Excel Template']")
    private WebElement excelTemplate;

    @FindBy(xpath = "//span[text()='Salary Types']")
    private WebElement salaryTypes;


    // 3.1 Yavuz Bey

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement country;

    @FindBy(xpath = "//span[text()='Cities']")
    private WebElement cities;


    // 3.10  Bekir Bey

    @FindBy(xpath = "//span[text()='Salary Modifiers']")
    private WebElement salaryModifiers;

    @FindBy(xpath = "//span[text()='Salary Constants']")
    private WebElement salaryConstants;


    // 3.11 Deniz Hanim

    @FindBy(xpath = "//span[text()='Budget']")
    private WebElement budget;

    @FindBy(xpath = "(//span[text()='Setup'])[6]")
    private WebElement setup6;

    @FindBy(xpath = "//span[text()='Budget Accounts']")
    private WebElement budgetAccounts;

    @FindBy(xpath = "//span[text()='Cost Centers']")
    private WebElement CostCenters;



























    WebElement myElement;
    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "humanResources":
                myElement = humanResources;
                break;

            case "setup3":
                myElement = setup3;
                break;

            case "positionSalary":
                myElement = positionSalary;
                break;

            case "positions":
                myElement = positions;
                break;

            case "education":
                myElement = education;
                break;

            case "setup5":
                myElement = setup5;
                break;

            case "subjectCategories":
                myElement = subjectCategories;
                break;

            case "subject":
                myElement = subject;
                break;

            case "reports":
                myElement = reports;
                break;

            case "setup7":
                myElement = setup7;
                break;

            case "excelTemplate":
                myElement = excelTemplate;
                break;

            case "salaryTypes":
                myElement = salaryTypes;
                break;

            case "setupOne":
                myElement = setupOne;
                break;

            case "parameters":
                myElement = parameters;
                break;

            case "country":
                myElement = country;
                break;

            case "cities":
                myElement = cities;
                break;

            case "salaryModifiers":
                myElement = salaryModifiers;
                break;

            case "salaryConstants":
                myElement = salaryConstants;
                break;

            case "budget":
                myElement = budget;
                break;

            case "setup6":
                myElement = setup6;
                break;

            case "budgetAccounts":
                myElement = budgetAccounts;
                break;

            case "CostCenters":
                myElement = CostCenters;
                break;

        }

        clickFunction(myElement);
    }
}
