package com.automation.cucumberTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ServicesPage extends AutomationBasePage {
    public ServicesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='title']")
    public WebElement pageHeader;
}
