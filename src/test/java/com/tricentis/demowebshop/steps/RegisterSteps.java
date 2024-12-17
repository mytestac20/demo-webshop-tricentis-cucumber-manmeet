package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on the register link")
    public void iClickOnTheRegisterLink() {
        new RegisterPage().getRegisterText();
    }

    @Then("I should navigate to register successfully")
    public void iShouldNavigateToRegisterSuccessfully() {
        String expectedMessage = "register page open successfully";
        String actualMessage = new RegisterPage().getRegisterText();
        Assert.assertEquals(expectedMessage,actualMessage,"register page not open successfully");
    }

    @When("I click on the register button")
    public void iClickOnTheRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should verify the error message {string}")
    public void iShouldVerifyTheErrorMessage(String errorMessage) {
        Assert.assertEquals(new RegisterPage().getFirstNameRequired(),"first name required not display" );

    }

    @And("I should verify the erroe message {string}")
    public void iShouldVerifyTheErroeMessage(String arg0) {
        Assert.assertEquals(new RegisterPage().getLastNameRequired(),"last name is required not display");
        Assert.assertEquals(new RegisterPage().getEmailRequired(),"email is required not display");
        Assert.assertEquals(new RegisterPage().getPasswordRequires(),"password is required not display");
        Assert.assertEquals(new RegisterPage().getPasswordRequires2(),"conform password is required not display");
    }

    @When("I select gender female")
    public void iSelectGenderFemale() {
        new RegisterPage().clickOnGender();
    }

    @And("I enter the first name")
    public void iEnterTheFirstName() {
        new RegisterPage().enterFirstNameField("jalpa");
    }

    @And("I enter the last name")
    public void iEnterTheLastName() {
        new RegisterPage().enterLastNameField("kalpeshkumar");
    }

    @And("I enter confirmPassword {string}")
    public void iEnterConfirmPassword(String arg0) {
        new RegisterPage().enterConfirmPasswordField("abc123");
    }

    @Then("I should see the verify the message {string}")
    public void iShouldSeeTheVerifyTheMessage(String errorMessage) {
    }

//    @Then("I should see the verify the message {string}")
//    public void iShouldSeeTheVerifyTheMessage(String YourRegistrationCompleted) {
//        Assert.assertEquals(new RegisterPage().g);
//    }
}
