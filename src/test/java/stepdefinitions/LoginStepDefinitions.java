package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Login;

public class LoginStepDefinitions extends Login {

    @Given("I launch automation practice page")
    public void navigateToAutomationPracticeHomePage()
    {
        navigateToAutomationPage();
    }

    @And("I click on Signin")
    public void clickOnSignInLink() throws Throwable
    {
        clickOnSignIn();
    }

    @And("I enter my email and click on create account to register")
    public void enterEmailAndRegister() throws Throwable
    {
        registerEmail();
    }

    @Then("I should navigate to Create Account page")
    public void navigateToCreateAccountPage() throws Throwable
    {
        assertCreateAccountPage();
    }

    @And("I enter my email and password and click on Sign in")
    public void enterEmailAndPasswordForSignin() throws Throwable
    {
        signInUsernamePassword();
    }

    @Then("I should see error authentication failed as account doesn't exist")
    public void authenticationErrorAccountDoesntExist() throws Throwable
    {
        loginAuthenticationError();
    }
}