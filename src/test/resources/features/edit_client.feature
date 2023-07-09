Feature: User feedback - Edit Client
  Background:
    Given user is on Docuport login page
  @client
  Scenario: edit email for client
    When user enters credentials
      |username|b1g2_advisor@gmail.com|
      |password|Group2               |
    And user goes on Clients page
    And they click “Create new client” button and choose PERSONAL,
    When the user filled all the information about new client and they click SAVE button
    Then the user sees Confirmation text - "Steven King" been created successfully”
    When  the user is redirected to EDIT CLIENT page.
    And the user filled out all fields and they click SAVE button
    Then the user sees Confirmation  CLIENT FULL NAME has been updated successfully”