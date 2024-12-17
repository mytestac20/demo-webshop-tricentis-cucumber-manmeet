package com.tricentis.demowebshop.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new com.tricentis.demowebshop.pages.HomePage().clickOnLoginLink();

    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new com.tricentis.demowebshop.pages.LoginPage().getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new com.tricentis.demowebshop.pages.LoginPage().enterEmailId(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new com.tricentis.demowebshop.pages.LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new com.tricentis.demowebshop.pages.LoginPage().clickOnLoginButton();
    }

    @Then("I should log in successfully")
    public void iShouldLogInSuccessfully() {
    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String errorMessage) {
        Assert.assertEquals(new com.tricentis.demowebshop.pages.LoginPage().getErrorMessage(),errorMessage, "errorMessage not display ");
    }
}
