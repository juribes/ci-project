package com.automation.cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\com\\automation\\cucumberTest\\features",
        glue={"com.automation.cucumberTest.steps"}
)

public class TestRunner {

}