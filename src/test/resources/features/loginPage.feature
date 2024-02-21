
@Regression @1
Feature: Navigate Login page by clicking

  Scenario: Navigate to login page
    When click on login button
    Then enter userName "supervisor" and password "tek_supervisor"
    And click on Sign In Button


  Scenario: Navigate to login page
    When click on login button
    Then enter userName "visor" and password "tek_supervisor"
    And click on Sign In Button
    And validate error User massage shows as expected
    And validate error Password massage shows as expected
