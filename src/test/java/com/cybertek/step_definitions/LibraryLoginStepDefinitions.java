package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LibraryLoginStepDefinitions {
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("-> User is on the login page");
    }

    @When("user logs in as a librarian")
    public void user_logs_in_as_a_librarian() {
        System.out.println("-> User logs in as a librarian");
    }

    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("-> User should see dashboard");
    }
}
