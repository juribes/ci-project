package com.automation.cucumberTest;

import hello.Application;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;


@ContextConfiguration(classes = Application.class)
@WebAppConfiguration
public class SpringIntegrationTest {

}