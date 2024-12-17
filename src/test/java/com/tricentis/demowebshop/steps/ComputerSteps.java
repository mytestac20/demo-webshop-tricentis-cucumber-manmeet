package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.ComputerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerSteps {
    @When("I click on computer tab")
    public void iClickOnComputerTab() {
        new ComputerPage().mouseHoverToElement();
    }

    @Then("I should navigate to select computer tab successfully")
    public void iShouldNavigateToSelectComputerTabSuccessfully() {
        String expectedMessage = "Computer page select successfully";
        String actualMessage = new ComputerPage().getComputerMessageRequired();
        Assert.assertEquals(expectedMessage,actualMessage,"Computer page not Display");
    }


    @And("I click on DesktopsLink")
    public void iClickOnDesktopsLink() {
        new ComputerPage().mouseHoverToElement();
    }

    @Then("I should Select DesktopsLink successfully")
    public void iShouldSelectDesktopsLinkSuccessfully(String errorMessage) {
        Assert.assertEquals(new ComputerPage().getComputerMessageRequired(),errorMessage,"errorMessage not display");

    }


}
