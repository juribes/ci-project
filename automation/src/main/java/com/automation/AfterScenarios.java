package com.automation;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;

import static com.automation.CommonMethods.getDriver;
import static com.automation.CommonMethods.quitDriver;


public class AfterScenarios {
    @After
    public void close_browser(Scenario scenario) throws Throwable {
        System.out.println("CHKCHK SALI");
        WebDriver driver = getDriver();
        quitDriver();
    }
}
