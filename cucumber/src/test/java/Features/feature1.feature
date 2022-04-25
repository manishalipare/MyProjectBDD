
Feature: Login to actitime

  @smoke
  Scenario: Login with valid user id and password
  
  Given Open app
  When Enter id and password and hit Login
  Then Home page should be displayed
  
  @Regression
  
  Scenario: Login with invalid user id and password
  
  Given Open app
  When Enter invalid id and password and hit Login
  Then Home page should be displayed with error message

 