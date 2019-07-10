#Author: SyntaxErrorTeam
Feature: I should have the ability to add Skills

@Ismail
Scenario: Adding skill into OrangeHrm
Given I logged into OrangeHRM
And I am on Skills Page
When I provide skills name and description
Then I see skills are added successfully