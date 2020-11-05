package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class GoogleStepDefinitions {
    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {
        //Assert.fail("failing test on purpose"); -- just to see it on report
        Driver.getDriver().get("https://www.google.com");

    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
    //comparing actual title vs expected title
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";
        Assert.assertEquals("Actual title doesn't match expected title!", actualTitle, expectedTitle);
    }

}
