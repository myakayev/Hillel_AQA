Feature: Login page test
  Scenario: Login with invalid email
    Given Open login page
    When Fill email
    When Fill password
    Then Expected error message