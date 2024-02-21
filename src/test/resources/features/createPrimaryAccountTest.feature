
@Regression @Smoke
Feature: Create Account functionality

  Background:
    Given Click on Create Primary Account button


  Scenario: Create Account form page validate Form Title as Expected
    Then Validate Create Primary Account Holder is exist


  Scenario: Creating an Account on the Primary Account Holder
    When Fill Create Account form "Mazidkhan@gmail.com" "Mazidullah" "Student" "Hafizi" "01/01/1996"
    And Select Gender "Male"
    And Select Title "Mr."
    And Select Marital Status "Single"
    And Click on Create Account Button
    Then Validate "random@gmail.com" on Sign up Page shows as expected


  Scenario: Create account with existing email address and validate error message
    When Fill Create Account form "Mazidkhan@gmail.com" "Mazidullah" "Student" "Hafizi" "01/01/1996"
    And Select Gender "Male"
    And Select Title "Mr."
    And Select Marital Status "Single"
    And Click on Create Account Button
    Then Validate error message "ERROR Account with email Mazidkhan@gmail.com is exist"