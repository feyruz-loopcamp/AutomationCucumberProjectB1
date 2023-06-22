package com.loop.step_definitions;


import com.loop.pages.LoginPage;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.DocuportConstants;
import com.loop.utilities.Driver;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.*;
import io.cucumber.messages.types.Exception;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user enters username for client")
    public void user_enters_username_for_client() throws InterruptedException {
        BrowserUtils.waitForClickable(loginPage.loginButton, 10);
        loginPage.loginInput.sendKeys(DocuportConstants.USERNAME_CLIENT);
    }
    @When("user enters password for client")
    public void user_enters_password_for_client() {

    }
    @When("user clicks login button")
    public void user_clicks_login_button() {

    }
    @Then("user should see the home page for client")
    public void user_should_see_the_home_page_for_client() {

    }

    @When("user enters username for employee")
    public void user_enters_username_for_employee() {

    }
    @When("user enters password for employee")
    public void user_enters_password_for_employee() {

    }
    @Then("user should see the home page for employee")
    public void user_should_see_the_home_page_for_employee() {

    }

    @When("user enters username for advisor")
    public void user_enters_username_for_advisor() {

    }
    @When("user enters password for advisor")
    public void user_enters_password_for_advisor() {

    }
    @Then("user should see the home page for advisor")
    public void user_should_see_the_home_page_for_advisor() {

    }

    @When("user enters password for admin")
    public void user_enters_password_for_admin() {

    }
    @Then("user should see the home page for admin")
    public void user_should_see_the_home_page_for_admin() {

    }

    @When("user enters username for admin")
    public void user_enters_username_for_admin() {

    }



}
