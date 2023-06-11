package com.loop.step_definitions;

import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginStepDefs {

    public static final Logger LOG = LogManager.getLogger();

    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        LOG.info("from log 4j");
    }
    @When("user enters username for client")
    public void user_enters_username_for_client() {
        System.out.println("test");
    }
    @When("user enter password for client")
    public void user_enter_password_for_client() {
        System.out.println("test");
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        System.out.println("test");
    }
    @Then("user should be able to login as a client")
    public void user_should_be_able_to_login_as_a_client() {
        System.out.println("test");
    }

    @When("user enters username for advisor")
    public void user_enters_username_for_advisor() {
        System.out.println("test");
    }
    @When("user enter password for advisor")
    public void user_enter_password_for_advisor() {
        System.out.println("test");
    }
    @Then("user should be able to login as a advisor")
    public void user_should_be_able_to_login_as_a_advisor() {
        System.out.println("test");
    }

    }
