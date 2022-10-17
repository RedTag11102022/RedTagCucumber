@login @loginFlight+Hotel @E2E
Feature: To validate the login funcitonality of redtag.ca application

  Background: Given The user should be in the HomePage

  @smoke @regression @sanity @loginInvalidFHTC @tc1
  Scenario Outline: To valid the login function with Invalid credentials
    When The user has click the "Sign In Home Page" button
    And The user has to fill the "<Email Address>" and "<password>"
    When The user has click the "Sign In login Page" button
    Then The user should be in "invalid login" page

    Examples: 
      | Email Address                  | password    |
      | suriyaprabha@gmail.com         | Suriya@89   |
      | 234333253533232@gmail.com      | Suriya@ 89  |
      | suriyaprabhatest1989@gmail.com | 8899@&^* && |
      | @$%^&*()$ %^&*()@gmail.com     | Suriy@89    |

  @smoke @regression @sanity @loginValidFHTC @tc2
  Scenario Outline: To valid the login function with valid credentials
    When The user has click the "Sign In Home Page" button
    And The user has to fill the "<Email Address>" and "<password>"
    When The user has click the "Sign In login Page" button
    Then The user should be in "valid login" page

    Examples: 
      | Email Address                  | password  |
      | suriyaprabhatest1989@gmail.com | Suriya@89 |

  @smoke @regression @sanity @resetpasswordValidFHTC @tc3
  Scenario: To valid the Reset Password with valid credentials
    When The user has click the "Sign In Home Page" button
    And The user has click the "Forgot Password" button
    And The user has to fill the Email Address
      | suriyaprabhatest1989@gmail.com |
    When The user has click the "Reset Password" button
    And The user has click the "Done" button
    And The user get the email with Reset Password link
    Then The user has click the link on the email
     
  @smoke @regression @sanity @googleloginValidFHTC @tc4
  Scenario: To valid the Google login with valid credentials
    When The user has click the "Sign In Home Page" button
    And The user has click the "google" button
    Then The user should be in "google" page
  
   
  @smoke @regression @sanity @facbookloginValidFHTC @tc5
  Scenario: To valid the facebook login with valid credentials
    When The user has click the "Sign In Home Page" button
    And The user has click the "facbook" button
    Then The user should be in "facebook" page
   
  @smoke @regression @sanity @signUpValidFHTC @tc6
  Scenario: To valid the SignUp function with valid credentials
    When The user has click the "Sign In Home Page" button
    And The user has click the "sign Up" button
    Then The user should be in "valid sign up" page
