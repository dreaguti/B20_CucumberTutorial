package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    @When("user searches {string} in the search box")
    public void userSearchesInTheSearchBox(String searchValue) {
        Driver.getDriver().get("https://www.etsy.com");

    }

    @And("user clicks on search button")
    public void userClicksOnSearchButton() {

    }

    @Then("user will see {string} in the title")
    public void userWillSeeInTheTitle(String searchValue) {
    }
}