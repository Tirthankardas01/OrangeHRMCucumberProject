Feature: Orange HRM Demo Application Functionalities

Scenario Outline: Testing of Orange HRM Home Page
Given browser is launched and application login page is displayed
When user enters "<username>" and "<password>" and clicks login button
Then orange hrm home page is displayed with correct page title

Examples:
|username|password|
|Admin|admin123|