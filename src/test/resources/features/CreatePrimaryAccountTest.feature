@Regression
Feature: Create Primary Account Functionality tests

  Background:
    When Click on Create Primary Account button
    Then Fill up the form "mazidullah20@gmail.com" "Mr" "Mazidullah" "Hafizi" "Male" "Single" "Student" "01/01/1996"
    And click on create Account Button

  Scenario: Validate title button
    When Click on Create Primary Account button
    Then validate title on the top

    Scenario:Create valid new account
      And validate user navigate to sign up your account page
      And validate email address "mazidullah15@gmail.com" shows as expected


   Scenario: Error massage show as expected
     And validate error massage shows as expected

