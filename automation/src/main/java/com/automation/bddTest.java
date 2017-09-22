package com.automation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * This goal will say a message.
 *
 * @goal bddTest
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\com\\automation\\cucumberTest\\features",
        glue={"com.automation.cucumberTest.steps"},
        plugin = {"pretty", "html:target/cucumber"}
)


/**
 * This goal will say a message.
 *
 * @goal bddTest
 */
public class bddTest  extends AbstractMojo  {
    public void execute() throws MojoExecutionException {
    }
}