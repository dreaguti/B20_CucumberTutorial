package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class EtsyStepDefinitions {
    //Windows shortcut - Alt+Enter

    @Given("user is on the etsy home page")
    public void user_is_on_the_etsy_home_page() {
        Driver.getDriver().get("https://www.etsy.com");
    }

    @Then("user should see title is as expected")
    public void user_should_see_title_is_as_expected() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}