@Login
  Feature: This feature tests the register and login functionality of automation practice page

    Scenario: Register to automation practice page
      Given I launch automation practice page
      And I click on Signin
      And I enter my email and click on create account to register
      Then I should navigate to Create Account page

    Scenario: Sign in to automation practice page
      Given I launch automation practice page
      And I click on Signin
      And I enter my email and password and click on Sign in
      Then I should see error authentication failed as account doesn't exist
