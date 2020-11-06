package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {
    @Given("user is on the google search page")
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

    @When("user searches apple")
    public void userSearchesApple() {
        //creating the page object
        GoogleSearchPage googleSearchPage=new GoogleSearchPage();

        //sending value into search box using page object
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("user should see apple in the title")
    public void userShouldSeeAppleInTheTitle() {
        String expectedTitle="apple - Google Search";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals("Actual title doesn't match expected title", actualTitle, expectedTitle);
    }

    @When("user searches {string}")
    public void userSearches(String searchValue) {
        GoogleSearchPage googleSearchPage=new GoogleSearchPage();
        googleSearchPage.searchBox.sendKeys(searchValue + Keys.ENTER);
    }

    @Then("user should see {string} in the title")
    public void userShouldSeeInTheTitle(String searchValue) {
        //basically just change everything to what you chose to name your string and concatenate
        String expectedTitle=searchValue + " - Google Search";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("user should see About link")
    public void user_should_see_about_link() {

    }
}
