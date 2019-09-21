$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/google.feature");
formatter.feature({
  "line": 1,
  "name": "Google - launch Gmail",
  "description": "",
  "id": "google---launch-gmail",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Application URL \u0026 driver details from Configuration file",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.application_URL_and_driver_details()"
});
formatter.result({
  "duration": 60010584,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#When reading a Json \"testData2222.json\""
    }
  ],
  "line": 7,
  "name": "launch the browser in Chrome",
  "description": "",
  "id": "google---launch-gmail;launch-the-browser-in-chrome",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Application URL \u0026 driver details from Configuration file",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "launch the application on browser",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "navigate to forWork Page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click on Get Started button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.application_URL_and_driver_details()"
});
formatter.result({
  "duration": 33091,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.launch_the_application_on_browser()"
});
formatter.result({
  "duration": 574438,
  "error_message": "java.lang.NullPointerException\n\tat commonUtility.base.accessApplicationURL(base.java:40)\n\tat stepDefination.stepDefination.launch_the_application_on_browser(stepDefination.java:46)\n\tat ✽.When launch the application on browser(src/test/resources/feature/google.feature:9)\n",
  "status": "failed"
});
formatter.match({
  "location": "stepDefination.navigate_to_forWork_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.click_on_Get_Started_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Application URL \u0026 driver details from Configuration file",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.application_URL_and_driver_details()"
});
formatter.result({
  "duration": 37622,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "launch the browser in Firefox",
  "description": "",
  "id": "google---launch-gmail;launch-the-browser-in-firefox",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Tag"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Application URL \u0026 driver details from Configuration file",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.application_URL_and_driver_details()"
});
formatter.result({
  "duration": 29212,
  "status": "passed"
});
});