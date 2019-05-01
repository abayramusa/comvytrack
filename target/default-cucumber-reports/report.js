$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "name": "login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "Create vehicle model",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@createvehicle"
    }
  ]
});
formatter.step({
  "name": "user clicks on the fleet",
  "keyword": "When "
});
formatter.match({
  "location": "createVehicleStepDefinitions.user_clicks_on_the_fleet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the vehicle model",
  "keyword": "Then "
});
formatter.match({
  "location": "createVehicleStepDefinitions.user_clicks_on_the_vehicle_model()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on hte create vehicle model",
  "keyword": "Then "
});
formatter.match({
  "location": "createVehicleStepDefinitions.user_clicks_on_hte_create_vehicle_model()"
});
formatter.result({
  "status": "passed"
});
});