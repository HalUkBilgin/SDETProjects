package PROJECTS.Project_Cucumber_01.StepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class _05_Hooks_P1 {

    @Before   // her senaryodan önce
    public void before(Scenario scenario) {
        System.out.println("Senaryo Başladı");
        System.out.println("senaryonun id si= " + scenario.getId());
        System.out.println("senaryonun adı= " + scenario.getName());
    }

    @After  // her senaryodan sonra
    public void after(Scenario scenario) {
        System.out.println("Senaryo bitti");
        System.out.println("senaryonun sonucu= " + scenario.getStatus());

        // en son çıkmadan ekranı görelim diye bilerek koyduk
        // çalışma mantığı ile ilgilis yok.
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

   //     Driver.quitDriver();
    }
}