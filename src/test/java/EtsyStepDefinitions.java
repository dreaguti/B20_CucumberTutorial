import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class EtsyStepDefinitions {
    //Windows shortcut - Alt+Enter

    @Given("user is on the etsy home page")
    public void userIsOnTheEtsyHomePage() {
        Driver.getDriver().get("https://www.etsy.com");
    }

    @Then("user should see title is as expected")
    public void userShouldSeeTitleIsAsExpected() {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
