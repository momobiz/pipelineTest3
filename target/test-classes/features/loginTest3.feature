
Feature: Login functionality of website automation exercise 

  Scenario: verify when login with invalid credentials
    Given I open the website "https://automationexercise.com/login"
    When I fillIn invalie login "sonia12@gmail.com" and password "sonia123"
    And I click on login button 
    Then A warning message is displayed