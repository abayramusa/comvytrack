$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "name": "login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user should be able to login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepDefinitions.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the login button",
  "keyword": "When "
});
formatter.match({
  "location": "loginStepDefinitions.the_user_clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the enters username and password then clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinitions.the_enters_username_and_password_then_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
});