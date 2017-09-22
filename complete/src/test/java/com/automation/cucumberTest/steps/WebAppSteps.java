package com.automation.cucumberTest.steps;
import com.automation.cucumberTest.CommonMethods;
import com.automation.cucumberTest.pages.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class WebAppSteps extends CommonMethods {

    @Given("^I am in home$")
    public void i_am_in_home() throws Throwable {
        CommonMethods.createDriver();
        CommonMethods.goToUrl("http://localhost:8090/");
        homePage = new HomePage(CommonMethods.driver);
        Assert.assertEquals(homePage.welcomeHeader.getText(), "Welcome");
    }

    @When("^I click the button$")
    public void i_click_the_button() throws Throwable {
        homePage.buttonSubmit.click();
    }

    @Then("^I get the message \"(.*?)\"$")
    public void i_get_the_message(String message) throws Throwable {
        greetingPage = new GreetingPage(CommonMethods.driver);
        Assert.assertEquals(greetingPage.greetingMessage.getText(), message);
        CommonMethods.quitDriver();
    }

    @When("^I type \"(.*?)\" in the input box$")
    public void i_type_in_the_input_box(String name) throws Throwable {
        homePage.inputName.sendKeys(name);
    }

    @When("^I click the link About us$")
    public void i_click_the_link_About_us() throws Throwable {
        homePage.linkAbout.click();
    }

    @Then("^I will see the About us page$")
    public void i_will_see_the_About_us_page() throws Throwable {
        aboutPage = new AboutPage(CommonMethods.driver);
        Assert.assertEquals(aboutPage.pageHeader.getText(),"About us");
        CommonMethods.quitDriver();
    }

    @When("^I click the link Contact us$")
    public void i_click_the_link_Contact_us() throws Throwable {
        homePage.linkContact.click();
    }

    @Then("^I will see the Contact us page$")
    public void i_will_see_the_Contact_us_page() throws Throwable {
        contactPage = new ContactPage(CommonMethods.driver);
        Assert.assertEquals(contactPage.pageHeader.getText(),"Contact us");
        CommonMethods.quitDriver();
    }

    @When("^I click the link Our Services$")
    public void i_click_the_link_Our_Services() throws Throwable {
        homePage.linkServices.click();
    }

    @Then("^I will see the Our Services page$")
    public void i_will_see_the_Our_Services_page() throws Throwable {
        servicesPage = new ServicesPage(CommonMethods.driver);
        Assert.assertEquals(servicesPage.pageHeader.getText(),"Services");
        CommonMethods.quitDriver();
    }

}
