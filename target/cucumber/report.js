$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/loginWithDtaFromDb.feature");
formatter.feature({
  "name": "Techfios billing login page functionality validation with data from DB",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DbFeature"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to login with valid credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DbFeature"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@DbScenario1"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User enters \"username\" from mysql database",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_from_mysql_database(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"password\" from mysql database",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_from_mysql_database(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});