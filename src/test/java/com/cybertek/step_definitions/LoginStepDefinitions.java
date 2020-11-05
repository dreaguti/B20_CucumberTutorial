package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa2.vytrack.com");
    }

    @When("user logs in as a store manager")
    public void user_logs_in_as_a_store_manager() {
        System.out.println("Trying to log in as a store manager");
    }

    @Then("user should be able to see Dashboard page title")
    public void user_should_be_able_to_see_dashboard_page_title() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";
        Assert.assertEquals("Actual title does not match expected title!", actualTitle, expectedTitle);
    }
}
