
Feature: test index

Scenario: Validate Greetings message without input
Given I am in home
When I click the button
Then I get the message "Hello, World!"


Scenario: Validate Greetings message with input
Given I am in home
When I type "Juan" in the input box
And I click the button
Then I get the message "Hello, Juan!"


Scenario: Navigate to About us page
Given I am in home
When I click the link About us
Then I will see the About us page


Scenario: Navigate to Contact us page
Given I am in home
When I click the link Contact us
Then I will see the Contact us page


Scenario: Navigate to Our Services page
Given I am in home
When I click the link Our Services
Then I will see the Our Services page