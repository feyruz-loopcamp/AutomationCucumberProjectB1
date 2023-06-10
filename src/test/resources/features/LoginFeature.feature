Feature: Docuport login Feature
  @smoke @client
  Scenario: Login as a client
    Given user is on Docuport login page
    When user enters username for client
    And user enter password for client
    And user clicks login button
    Then user should be able to login as a client

    @smoke @advisor
  Scenario: Login as a advisor
    Given user is on Docuport login page
    When user enters username for advisor
    And user enter password for advisor
    And user clicks login button
    Then user should be able to login as a advisor



