Feature: Register a new e-learning user
    In order to use the system,
    one must register with the system 
    so that one gets authorized and may login

Scenario: Register a new user using valid credentials
    Given I am on the E-learning login page after entering URL in the browser 
    When  I click on signup button
      And I Enter valid credential in First name textbox
      And I Enter valid credential in Last name textbox
      And I Enter valid credential in e-mail textbox
			And I Enter valid credential in username textbox
			And I Enter valid credential in pass textbox
			And I Enter valid credential in confirm password textbox
			And I Enter valid credential in phone textbox
			And I Selected Valid credentials from Language list box
			And I Click Student radio button in Profile
			And I Click on Register button
      
    Then  I shall get confirmation that user registered.