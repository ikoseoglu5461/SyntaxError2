#Author: SyntaxErrorTeam
Feature: Locations in OrangeHRM
  Background: 
    Given I logged in into OrangeHRM
    And I am on Locations Page
    
  
  Scenario:  Add new locations by specifying mandatory fields only
    When I provide locations name, country, city and zip code
    Then I location added successfully
  
  Scenario: Locations labels verification
    When I click on Add Locations
    Then I see following location labels