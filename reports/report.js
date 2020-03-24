$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/DemoWebShop.feature");
formatter.feature({
  "name": "DemoWebShop",
  "description": "\tIn order to buy products \n\tAs a e-commerce customer\n\tI want to access the Application",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have a browser with DemoWebShop Application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepDefinitions.StepDefinitions.i_have_a_browser_with_DemoWebShop_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@valid"
    }
  ]
});
formatter.step({
  "name": "I enter \u0027Fiction\u0027 in search bar and click on search",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepDefinitions.StepDefinitions.i_enter_in_search_bar_and_click_on_search(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I must get the products related to \u0027Fiction\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepDefinitions.StepDefinitions.i_must_get_the_products_related_to(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Got wrong product suggestions\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat com.cts.stepDefinitions.StepDefinitions.i_must_get_the_products_related_to(StepDefinitions.java:103)\r\n\tat ✽.I must get the products related to \u0027Fiction\u0027(file:///D:/Webshop-master/AdityaDemoWebShop/src/main/resources/features/DemoWebShop.feature:32)\r\n",
  "status": "failed"
});
});