
@Regression
Feature: Account page validation

  Background:
    Given click on login button
    When enter userName "supervisor" and password "tek_supervisor"
    And click on Sign In Button
    And Click on Accounts Button


  Scenario: Verify 5 row page is default.
    And Verify the presence of all 5 rows
    Then all five rows should be present


  Scenario Outline: Customer Service Portal - Accounts change show per page to
    Then Select Show "<Page per show>" from page per show dropdown
    Then Verify the presence of all "<Visible Rows>" per page

    Examples:
      |Page per show|Visible Rows |
      |Show 10      |10           |
      |Show 25      |25           |
      |Show 50      |50           |