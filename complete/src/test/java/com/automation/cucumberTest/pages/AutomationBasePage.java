package com.automation.cucumberTest.pages;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static com.automation.cucumberTest.CommonMethods.getDriver;
import static com.automation.cucumberTest.CommonMethods.quitDriver;

public class AutomationBasePage {
    public WebDriver driver;

    public AutomationBasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 40), this);
    }

    @After
    public void close_browser(Scenario scenario) throws Throwable {
        driver = getDriver();
        quitDriver();
    }
}
