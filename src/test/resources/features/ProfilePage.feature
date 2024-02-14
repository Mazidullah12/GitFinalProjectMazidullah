@S
Feature: Validate information on the profile page

  Background:
    When click on login button
    Then enter userName "supervisor" and password "tek_supervisor"
    And click on Sign In Button
    And click on profile button

  Scenario: Validate information on the side profile page

    And validate STATUS is "Active"
    And validate USER TYPE is "CSR"
    And validate FULL NAME is "Supervisor"
    And validate USERNAME is "supervisor"
    And validate AUTHORITIES is "admin"


    Scenario: Validate Logout button functionality
      And click on Logout button


