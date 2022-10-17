$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/loginFlightHotel.feature");
formatter.feature({
  "name": "To validate the login funcitonality of redtag.ca application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@loginFlight+Hotel"
    },
    {
      "name": "@E2E"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To valid the login function with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@loginValidFHTC"
    },
    {
      "name": "@tc2"
    }
  ]
});
formatter.step({
  "name": "The user has click the \"Sign In Home Page\" button",
  "keyword": "When "
});
formatter.step({
  "name": "The user has to fill the \"\u003cEmail Address\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "The user has click the \"Sign In login Page\" button",
  "keyword": "When "
});
formatter.step({
  "name": "The user should be in \"valid login\" page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Email Address",
        "password"
      ]
    },
    {
      "cells": [
        "suriyaprabhatest1989@gmail.com",
        "Suriya@89"
      ]
    }
  ]
});
formatter.background({
  "name": "Given The user should be in the HomePage",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "To valid the login function with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@loginFlight+Hotel"
    },
    {
      "name": "@E2E"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@loginValidFHTC"
    },
    {
      "name": "@tc2"
    }
  ]
});
formatter.step({
  "name": "The user has click the \"Sign In Home Page\" button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginFlightHotel.the_user_has_click_the_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to fill the \"suriyaprabhatest1989@gmail.com\" and \"Suriya@89\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginFlightHotel.the_user_has_to_fill_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has click the \"Sign In login Page\" button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginFlightHotel.the_user_has_click_the_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in \"valid login\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginFlightHotel.the_user_should_be_in_page(String)"
});
