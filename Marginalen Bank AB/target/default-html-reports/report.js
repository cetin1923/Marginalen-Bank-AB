$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CreateANewAccount.feature");
formatter.feature({
  "name": "Users should be able to create a new saving account",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create an account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@NewAccount"
    },
    {
      "name": "@all"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the web page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.MarginalenBankAB.step_definitions.CreateANewAccountStepDefs.the_user_is_on_the_web_page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat com.MarginalenBankAB.step_definitions.CreateANewAccountStepDefs.the_user_is_on_the_web_page(CreateANewAccountStepDefs.java:34)\n\tat ✽.the user is on the web page(file:///Users/cetinarslan/IdeaProjects/fromgit/Marginalen-Bank-AB/Marginalen%20Bank%20AB/src/test/resources/features/CreateANewAccount.feature:4)\n",
  "status": "failed"
});
formatter.step({
  "name": "the user clicks on SPARA tab",
  "keyword": "When "
});
formatter.match({
  "location": "com.MarginalenBankAB.step_definitions.CreateANewAccountStepDefs.the_user_clicks_on_SPARA_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user clicks on SPARKONTO sub tab",
  "keyword": "And "
});
formatter.match({
  "location": "com.MarginalenBankAB.step_definitions.CreateANewAccountStepDefs.the_user_clicks_on_SPARKONTO_sub_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user clicks on BORJA SPARA NU button",
  "keyword": "And "
});
formatter.match({
  "location": "com.MarginalenBankAB.step_definitions.CreateANewAccountStepDefs.the_user_clicks_on_BORJA_SPARA_NU_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user is able land on to PERSONUPPGIFTER page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.MarginalenBankAB.step_definitions.CreateANewAccountStepDefs.the_user_is_able_land_on_to_PERSONUPPGIFTER_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user types the required personal info",
  "keyword": "When "
});
formatter.match({
  "location": "com.MarginalenBankAB.step_definitions.CreateANewAccountStepDefs.the_user_types_the_required_personal_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user clicks on the forward button",
  "keyword": "And "
});
formatter.match({
  "location": "com.MarginalenBankAB.step_definitions.CreateANewAccountStepDefs.the_user_clicks_on_the_forward_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user lands on FRAGOR page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.MarginalenBankAB.step_definitions.CreateANewAccountStepDefs.the_user_lands_on_FRAGOR_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user selects the related FRAGOR checkboxes",
  "keyword": "When "
});
formatter.match({
  "location": "com.MarginalenBankAB.step_definitions.CreateANewAccountStepDefs.the_user_selects_the_related_FRAGOR_checkboxes()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user clicks on the forward button",
  "keyword": "And "
});
formatter.match({
  "location": "com.MarginalenBankAB.step_definitions.CreateANewAccountStepDefs.the_user_clicks_on_the_forward_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user lands on ANVANDNING page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.MarginalenBankAB.step_definitions.CreateANewAccountStepDefs.the_user_lands_on_ANVANDNING_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user selects the related ANVANDNING checkboxes",
  "keyword": "When "
});
formatter.match({
  "location": "com.MarginalenBankAB.step_definitions.CreateANewAccountStepDefs.the_user_selects_the_related_ANVANDNING_checkboxes()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the clicks on the forward button",
  "keyword": "And "
});
formatter.match({
  "location": "com.MarginalenBankAB.step_definitions.CreateANewAccountStepDefs.the_clicks_on_the_forward_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user lands on the GRANSKA%SKICKA page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.MarginalenBankAB.step_definitions.CreateANewAccountStepDefs.the_user_lands_on_the_GRANSKA_SKICKA_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user clicks on the SKICKA ANSOKAN button",
  "keyword": "When "
});
formatter.match({
  "location": "com.MarginalenBankAB.step_definitions.CreateANewAccountStepDefs.the_user_clicks_on_the_SKICKA_ANSOKAN_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user makes application for a new account successfully.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.MarginalenBankAB.step_definitions.CreateANewAccountStepDefs.the_user_makes_application_for_a_new_account_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "The user is NOT able to log in with invalid credentials",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify that the user is NOT able log in to the WebPage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@all"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the web page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.MarginalenBankAB.step_definitions.CreateANewAccountStepDefs.the_user_is_on_the_web_page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat com.MarginalenBankAB.step_definitions.CreateANewAccountStepDefs.the_user_is_on_the_web_page(CreateANewAccountStepDefs.java:34)\n\tat ✽.the user is on the web page(file:///Users/cetinarslan/IdeaProjects/fromgit/Marginalen-Bank-AB/Marginalen%20Bank%20AB/src/test/resources/features/Login.feature:6)\n",
  "status": "failed"
});
formatter.step({
  "name": "the user enters invalid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.MarginalenBankAB.step_definitions.LoginStepDefs.the_user_enters_invalid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user should NOT be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.MarginalenBankAB.step_definitions.LoginStepDefs.the_user_should_NOT_be_able_to_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the title contains \"Marginalen - Ett fel har inträffat eller sessionen har stängts\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.MarginalenBankAB.step_definitions.LoginStepDefs.the_title_contains(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png", "screenshot");
formatter.after({
  "status": "passed"
});
});