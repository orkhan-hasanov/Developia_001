Feature: Login

  Scenario: Succesful login with correct credentials
    Given User is in saucedemo webpage
    When User fills username input
    And Fills password input
    And Clicks login button
    Then User should be navigated to the homepage


Scenario:  Unsuccesful login with uncorrect username
  Given User is in saucedemo webpage
  When User fills username input with invalid username
  And Fills password input with valid passsword
  And Clicks login button
  Then Error message should be displayed


  Scenario:  Unsuccesful login with uncorrect password
    Given User is in saucedemo webpage
    When User fills username input
    And Fills password input with invalid passsword
    And Clicks login button
    Then Error message should be displayed

  Scenario:  Unsuccesful login with don't fill both required credentials
    Given User is in saucedemo webpage
    When User don't fills username input
    And User don't fills password input
    And Clicks login button
    Then Error message should be displayed

  Scenario:  Unsuccesful login with valid username but don't fill the password field
    Given User is in saucedemo webpage
    When User fills username input
    And User don't fills password input
    And Clicks login button
    Then Error message should be displayed

  Scenario:  Unsuccesful login with valid password but don't fill the username field
    Given User is in saucedemo webpage
    When User don't fills username input
    And Fills password input
    And Clicks login button
    Then Error message should be displayed

  Scenario: Succesful refresh with correct credentials
    Given User is in saucedemo webpage
    When User fills username input
    And Fills password input
    And Refresh the web page
    Then User should be navigated to the loginpage

  Scenario: Succesful refresh with filled username, unfilled password
    Given User is in saucedemo webpage
    When User fills username input
    And User don't fills password input
    And Refresh the web page
    Then User should be navigated to the loginpage

  Scenario: Succesful refresh with filled password, unfilled username
    Given User is in saucedemo webpage
    When User don't fills username input
    And Fills password input
    And Refresh the web page
    Then User should be navigated to the loginpage

  Scenario:  Click error button After the case called "Unsuccesful login with don't fill both required credentials"
    Given User is in saucedemo webpage
    When User don't fills username input
    And User don't fills password input
    And Clicks login button
    And Click error button for hide the error message
    Then User should be navigated to the loginpage

