#Author: SyntaxErrorTeam
Feature: I should have the ability to add Job Title

@IsmailKose
Scenario: Add Job title
Given I logged into OrangeHRM
And I am on Job Titles Page
When I provide job title, description and upload file with job specifications
Then I see job title is added successfully