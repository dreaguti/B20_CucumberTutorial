package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GoogleStepDefinitions {
    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {
        System.out.println("I am on the google search page");
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        System.out.println("I see that the title is Google");
    }

}
