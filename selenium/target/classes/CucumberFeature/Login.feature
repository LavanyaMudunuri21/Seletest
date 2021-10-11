Feature: Enter the valid userid and password to login to application

Scenario: Login to Elearning
    Given I am on the login page after entering URL in the browser 
    When I Enter valid credentials in Username textbox
    And I Enter valid credential in pass text box and click login button
    Then I shall get confirmation that user login is success 	