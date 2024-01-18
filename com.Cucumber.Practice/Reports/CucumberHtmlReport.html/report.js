$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/BasicAmazonlogin.feature");
formatter.feature({
  "name": "Basic Login Feature Of Amazon",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user should be on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "BasicAmazonLoginPage.user_should_be_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters username in username text field",
  "keyword": "When "
});
formatter.match({
  "location": "BasicAmazonLoginPage.user_enters_username_in_username_text_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on continue button",
  "keyword": "And "
});
formatter.match({
  "location": "BasicAmazonLoginPage.user_click_on_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user navigates to next page for entering  password in password text feild",
  "keyword": "Then "
});
formatter.match({
  "location": "BasicAmazonLoginPage.user_navigates_to_next_page_for_entering_password_in_password_text_feild()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "BasicAmazonLoginPage.user_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user navigates to home page \"Online Shopping site in India:\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BasicAmazonLoginPage.user_navigates_to_home_page(String)"
});
formatter.result({
  "status": "skipped"
});
});