package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends AutomationBasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='submit']")
    public WebElement buttonSubmit;

    @FindBy(how = How.XPATH, using = ".//*[@id='name']")
    public WebElement inputName;

    @FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr[1]/td[2]/h1")
    public WebElement welcomeHeader;

    @FindBy(how = How.XPATH, using = ".//*[@href='/about']")
    public WebElement linkAbout;

    @FindBy(how = How.XPATH, using = ".//*[@href='/contact']")
    public WebElement linkContact;

    @FindBy(how = How.XPATH, using = ".//*[@href='/services']")
    public WebElement linkServices;

}
