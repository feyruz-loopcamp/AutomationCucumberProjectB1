package com.loop.step_definitions;

import com.loop.pages.GooglePage;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class GoogleSearchStepDefs {

    GooglePage googlePage = new GooglePage();

    @Given("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));
    }
    @When("user types loop academy in the google search box and click enter")
    public void user_types_loop_academy_in_the_google_search_box_and_click_enter() throws InterruptedException {
        googlePage.searchBox.sendKeys("Loop Academy");
        googlePage.searhcButton.click();
    }
    @Then("User should see Loop Academy - Google search is in the google title")
    public void user_should_see_loop_academy_google_search_is_in_the_google_title() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Loop Academy"));
    }

    @When("user types {string} in the google search box and click enter")
    public void user_types_in_the_google_search_box_and_click_enter(String input) {
        googlePage.searchBox.sendKeys(input);
        googlePage.searhcButton.click();
    }
    @Then("User should see {string} search is in the google title")
    public void user_should_see_search_is_in_the_google_title(String input) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(input));
    }
}
