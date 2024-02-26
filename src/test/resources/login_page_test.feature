Feature: Login page test
  Scenario: Login with invalid email
    Given Open login page
    When Fill email
    When Fill password
    When Click button
    Then Expected error message