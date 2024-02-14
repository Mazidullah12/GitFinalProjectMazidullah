@Regression
Feature: Testing CSR Primary Account Section
  Background: Login with CSR Credentials
    When click on login button
    Then enter userName "supervisor" and password "tek_supervisor"
    And click on Sign In Button
    When click on account page


  Scenario: Navigate to Customer Service Portal with valid CSR credentials and navigate to Accounts verify 5 row
  /page is default
    Then validate card title to be "Primary Accounts"
    Then validate table row count to be 5


  Scenario: Navigate to Customer Service Portal with valid CSR credentials.
    When change items per page to "50"