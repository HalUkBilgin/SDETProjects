package PROJECTS.Project_Cucumber_02.B.StepDefinitions;


import PROJECTS.Project_Cucumber_02.B.Utilities.Driver_P2B;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class _04_Hooks {

    @Before
    public void before(Scenario scenario)
    {
        System.out.println("Senaryo Başladı");
        System.out.println("senaryonun id si= "+scenario.getId());
        System.out.println("senaryonun adı= "+scenario.getName());
    }

    @After
    public void after(Scenario scenario)
    {
        System.out.println("Senaryo bitti");
        System.out.println("senaryonun sonucu= "+ scenario.getStatus());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Driver_P2B.quitDriver();
    }
}
