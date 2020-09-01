$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Overall Functionality",
  "description": "",
  "id": "overall-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the user is able to login the application",
  "description": "",
  "id": "overall-functionality;verify-the-user-is-able-to-login-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the valid username in User field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters the valid password in password field.",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User verify the home page and navigate to next page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 12612894900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_valid_username_in_User_field()"
});
formatter.result({
  "duration": 337058600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_password_in_password_field()"
});
formatter.result({
  "duration": 224295500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "duration": 4320902700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verify_the_home_page_and_navigate_to_next_page()"
});
formatter.result({
  "duration": 29700,
  "status": "passed"
});
});