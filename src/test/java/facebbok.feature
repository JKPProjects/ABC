Feature: Login

  @Regression
  Scenario: Successful login with valid credentials
    Given user open the browser
    When user entered the url "https://en-gb.facebook.com/"
    And user entered email as "jayakrushnapani123@gmail.com" and password as "tarini96"
    And user click on login button
    And user validate the title of the webpage and title should be "Facebook"
    And user click on logout link