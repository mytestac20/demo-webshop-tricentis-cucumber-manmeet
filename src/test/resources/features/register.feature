@regression
Feature: register Feature

  @smoke
  Scenario: user should navigate to registerPage successfully
    Given I am on homepage
    When I click on the register link
    Then I should navigate to register successfully

  @sanity
  Scenario: user should register with valid credentials
    Given I click on the register link
    When I click on the register button
    And I should verify the error message "first name is requried"
    And I should verify the error message "last name is requried"
    And I should verify the error message "email is required"
    And  I should verify the error message "password is required"
    Then I should verify the error message "conform password is required"

  @sanity
  Scenario: user should create Account Successfully
    Given I click on DesktopsLink
    When I select gender female
    And  I enter the first name
    And I enter the last name
    And I enter email "parekhrudraa@gmail.com"
    And I enter password "Ludhiana@123"
    And  I enter confirmPassword "Ludhiana123"
    And  I click on the register button
    Then I should see the verify the message "Your registration completed"