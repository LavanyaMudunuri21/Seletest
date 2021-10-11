Feature: Enter the valid userid and password to login to application

Scenario: Login to Elearningstudent
    Given Login to user credentials
    When I click on Edit Profile
    And I Enter valid credentials in New passord fied
    And I enter password in Confirm Password field
    And I click on save changes
    Then I shall get confirmation that new profile has been saved