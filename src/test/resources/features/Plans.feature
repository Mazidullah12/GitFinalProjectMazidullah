@Smoke
Feature: Validate the presence of 4 rows of data on the Plans page

  Background: Login with CSR Credentials
    When click on login button
    Then enter userName "supervisor" and password "tek_supervisor"
    And click on Sign In Button
    When click on the plans link

  Scenario: Navigate to Customer Service Portal with valid CSR credentials and navigate to Plans Page. Validate 4
            row of data is present.
    Then validate table row count to be 4

  Scenario: Navigate to Customer Service Portal then validate create date
    Then validate create date is today's date EST Time Zone
    And validate expire date is day after EST Time Zone