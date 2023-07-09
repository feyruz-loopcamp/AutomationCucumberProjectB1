package com.loop.step_definitions;

import com.loop.pages.ClientAdvisorPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EditClientStepDefs {

    ClientAdvisorPage clientPageAdvisor =new ClientAdvisorPage();
    @When("user goes on Clients page")
    public void user_goes_on_clients_page() {
        clientPageAdvisor.clickNavigationBar("clients");
    }


    @When("they click “Create new client” button and choose PERSONAL,")
    public void they_click_create_new_client_button_and_choose_personal() {



    }

    @When("the user filled all the information about new client and they click SAVE button")
    public void the_user_filled_all_the_information_about_new_client_and_they_click_save_button() {
        clientPageAdvisor.createNewClient("Steven","King","jjkkkkkfffkkkkkkkkkk@gmail.com","1234556788");

    }
    @Then("the user sees Confirmation text - {string} been created successfully”")
    public void the_user_sees_confirmation_text_been_created_successfully(String string) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(string+" has been created successfully",clientPageAdvisor.successMsg.getText());

    }
    @When("the user is redirected to EDIT CLIENT page.")
    public void the_user_is_redirected_to_edit_client_page() {

    }
    @When("the user filled out all fields and they click SAVE button")
    public void the_user_filled_out_all_fields_and_they_click_save_button() {
        clientPageAdvisor.editClient();

    }
    @Then("the user sees Confirmation  CLIENT FULL NAME has been updated successfully”")
    public void the_user_sees_confirmation_client_full_name_has_been_updated_successfully() {

    }

}
