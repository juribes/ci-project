package com.automation.cucumberTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GreetingPage extends AutomationBasePage {
    public GreetingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='greeting']")
    public WebElement greetingMessage;

}
