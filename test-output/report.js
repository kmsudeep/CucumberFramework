$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Complete_Project/CucumberFramework/src/main/java/com/amazon/features/feature");
formatter.feature({
  "line": 1,
  "name": "Amazon Application",
  "description": "",
  "id": "amazon-application",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "Login to Amazon Site with a Valid Username and Password",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Open the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter the username and click on continue",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter the password and click on login",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify User is successfully logged in to amazon site",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.open_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 13465455400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.enter_the_username_and_click_on_continue()"
});
formatter.result({
  "duration": 1883991300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.enter_the_password_and_click_on_login()"
});
formatter.result({
  "duration": 3102471800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_User_is_successfully_logged_in_to_amazon_site()"
});
formatter.result({
  "duration": 48548800,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Add a Wildcraft bag to the Cart",
  "description": "",
  "id": "amazon-application;add-a-wildcraft-bag-to-the-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "Search for the bag in the search section",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Click on the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Select the Wildcraft Brand",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Select the Specific Bag",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Click on Add to Cart link",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Verify bag is Successfully added into cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.search_for_the_bag_in_the_search_section()"
});
formatter.result({
  "duration": 159285100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_the_Search_button()"
});
formatter.result({
  "duration": 3993044400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.select_the_WildCrat_Brand()"
});
formatter.result({
  "duration": 2852495700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.select_the_Specific_Bag()"
});
formatter.result({
  "duration": 611559200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_Add_to_Cart_link()"
});
formatter.result({
  "duration": 7022714600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_bag_is_Successfully_added_into_cart()"
});
formatter.result({
  "duration": 121916100,
  "status": "passed"
});
formatter.after({
  "duration": 768956400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Login to Amazon Site with a Valid Username and Password",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Open the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter the username and click on continue",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter the password and click on login",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify User is successfully logged in to amazon site",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.open_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 12395521200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.enter_the_username_and_click_on_continue()"
});
formatter.result({
  "duration": 1849451700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.enter_the_password_and_click_on_login()"
});
formatter.result({
  "duration": 3093338500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_User_is_successfully_logged_in_to_amazon_site()"
});
formatter.result({
  "duration": 41562900,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Add the the User new Address",
  "description": "",
  "id": "amazon-application;add-the-the-user-new-address",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "Click on the Cart link from HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Click on Proceed to Buy Page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Enter the User Information",
  "rows": [
    {
      "cells": [
        "FullName",
        "Mobile No",
        "Pincode",
        "Flat No",
        "Area",
        "Landmark"
      ],
      "line": 24
    },
    {
      "cells": [
        "K M Sudeep",
        "8867184906",
        "580023",
        "7/A",
        "Tearcher\u0027s colony",
        "Gayatri Temple"
      ],
      "line": 25
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.click_on_the_Cart_link_from_HomePage()"
});
formatter.result({
  "duration": 2601217400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_Proceed_to_Buy_Page()"
});
formatter.result({
  "duration": 2394091500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.enter_the_User_Information(DataTable)"
});
formatter.result({
  "duration": 777121700,
  "status": "passed"
});
formatter.after({
  "duration": 709798200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Login to Amazon Site with a Valid Username and Password",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Open the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter the username and click on continue",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter the password and click on login",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify User is successfully logged in to amazon site",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.open_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 11956215500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.enter_the_username_and_click_on_continue()"
});
formatter.result({
  "duration": 1949346400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.enter_the_password_and_click_on_login()"
});
formatter.result({
  "duration": 3021453700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_User_is_successfully_logged_in_to_amazon_site()"
});
formatter.result({
  "duration": 56829700,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Remove the Bag from the Cart",
  "description": "",
  "id": "amazon-application;remove-the-bag-from-the-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "Click on the the cart link from HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "Click on Delete link",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "Verify bag is deleted from the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.click_on_the_the_cart_link_from_HomePage()"
});
formatter.result({
  "duration": 2313811500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_Delete_link()"
});
formatter.result({
  "duration": 125105000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_bag_is_deleted_from_the_cart()"
});
formatter.result({
  "duration": 1107792700,
  "status": "passed"
});
formatter.after({
  "duration": 715188800,
  "status": "passed"
});
});