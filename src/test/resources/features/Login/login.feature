Feature: Login CMS


  Scenario: Login success
    Given user navigate to Login page "https://sma.tecdiary.net/admin/login"
    When user enter email "admin@tecdiary.com" and password: "12345678"
    And click login button
    Then user redirect to admin page "https://sma.tecdiary.net/admin/"
    And user should see the notification displays

  @SuccessfulLogin
  Scenario: Successful Login
    Given user on the login page
    When user enter valid username and password
    And click on the login button
    Then user should be redirected to the admin page

  @InvalidLogin
  Scenario: Invalid Login
    Given user on the login page
    When user enter an invalid username or password
    And click on the login button
    Then user should see an error message
    And stay on the login page

#  Scenario: Empty Username
#    Given user on the login page
#    When user leave the username field empty
#    And enter a valid password
#    And click on the login button
#    Then user should see an error message
#    And stay on the login page
#
#  Scenario: Empty Password
#    Given user on the login page
#    When user leave the password field empty
#    And enter a valid username
#    And click on the login button
#    Then user should see an error message
#    And stay on the login page
#
#  Scenario: Locked Account
#    Given user on the login page
#    And my account has been locked
#    When user enter valid username and password
#    And click on the login button
#    Then user should see an error message
#    And stay on the login page
#
#  Scenario: Forgotten Password
#    Given user on the login page
#    And user have forgotten my password
#    When user click on the "Forgot Password" link
#    And enter my email address
#    And click on the "Reset Password" button
#    Then user should receive an email with instructions to reset my password.