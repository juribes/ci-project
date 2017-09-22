package com.automation.cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;


//@RunWith(SpringRunner.class)
@RunWith(Cucumber.class)
//@RunWith(SpringJUnit4ClassRunner.class)
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
public class bddTest {

}