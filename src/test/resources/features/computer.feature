@regression
Feature: computer Feature
       In Order to perform successful computer
       As a User
       I have to select correct computer text, , DesktopsLink and NotebooksLink

  @smoke
    Scenario: User should navigate to computer tab successfully
    Given I am on homepage
    When I click on computer tab
    Then I should navigate to select computer tab successfully

  @sanity
    Scenario: User should  Computer with valid credentials
    Given I am on homepage
    When I click on computer tab
    And I click on DesktopsLink
    Then I should Select DesktopsLink successfully