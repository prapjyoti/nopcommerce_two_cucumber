$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/topmenu.feature");
formatter.feature({
  "line": 1,
  "name": "Home Page Functionality",
  "description": "\r\nAs a user I want to check home page different links functionality",
  "id": "home-page-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11388947400,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TestSuit.iAmOnHomePage()"
});
formatter.result({
  "duration": 543630700,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User should Navigate to electronics page successfully",
  "description": "",
  "id": "home-page-functionality;user-should-navigate-to-electronics-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I click on \"Electronics\" link then",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should navigate to electronics page successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Electronics",
      "offset": 12
    }
  ],
  "location": "TopMenuTest.iClickOnLinkThen(String)"
});
formatter.result({
  "duration": 1659932300,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuTest.iShouldNavigateToElectronicsPageSuccessfully()"
});
formatter.result({
  "duration": 138586900,
  "status": "passed"
});
formatter.after({
  "duration": 1657577700,
  "status": "passed"
});
});