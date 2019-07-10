#Author: SyntaxErrorTeam
Feature: I should have the ability to add Languages

@temp
Scenario: Add language
Given I logged into OrangeHRM
And I am on Languages Page
When I provide language name and click save
Then I see language is added successfully