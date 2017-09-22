package com.automation.cucumberTest;

import com.automation.cucumberTest.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class CommonMethods {
    public static WebDriver driver;
    public AboutPage aboutPage;
    public ContactPage contactPage;
    public GreetingPage greetingPage;
    public HomePage homePage;
    public ServicesPage servicesPage;

    public static WebDriver getDriver(){
        return driver;
    }

    public static void goToUrl(String url){
        driver.manage().window().maximize();
        driver.get(url);
    }

    public static void createDriver(){
        driver = new FirefoxDriver();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public static void quitDriver() throws Throwable{
        TimeUnit.SECONDS.sleep(5);
        driver.quit();
    }

}
