Feature: Login


@SuccesfulLogin
  Scenario Outline: Succesful login with "<username>" and "<password>"
    Given User is in saucedemo webpage
    When User fills username input field with "<username>"
    And Fills password input field with "<password>"
    And Clicks login button
    Then User should be navigated to the homepage
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | visual_user             | secret_sauce |


@UnsuccesfulLogin
   Scenario Outline: Unsuccesful login scenario ()
     Given User is in saucedemo webpage
     When User fills username input field with "<username>"
     And Fills password input field with "<password>"
     And Clicks login button
     Then "<error>" error message should be displayed
     Examples:

       | name                                | username        |  | password     | error                                                                     |
       | empty username and password         |                 |  |              | Epic sadface: Username is required                                        |
       | correct username and empty password | standard_user   |  |              | Epic sadface: Password is required                                        |
       | empty username and correct password |                 |  | secret_sauce | Epic sadface: Username is required                                        |
       | valid username and invalid password | standard_user   |  | salam123     | Epic sadface: Username and password do not match any user in this service |
       | invalid username and valid password | standard_userus |  | secret_sauce | Epic sadface: Username and password do not match any user in this service |
       | incorrect username and password     | lololo          |  | lololololol  | Epic sadface: Username and password do not match any user in this service |


