package com.automation.cucumberTest.steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebAppSteps {


    @Given("^I am in home$")
    public void i_am_in_home() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("CHKCHK ENTRE1");
    }

    @When("^I click the link$")
    public void i_click_the_link() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("CHKCHK ENTRE2");
    }

    @Then("^I get the message \"(.*?)\"$")
    public void i_get_the_message(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("CHKCHK ENTRE3");
    }
}
