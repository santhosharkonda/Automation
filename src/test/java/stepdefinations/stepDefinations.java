package my.package.name

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinations {

    @Given("^User is on netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        throw new PendingException();
    }

    @When("^User login into application with username nad password$")
    public void user_login_into_application_with_username_nad_password() throws Throwable {
        throw new PendingException();
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        throw new PendingException();
    }

    @And("^Cards are dispalyed$")
    public void cards_are_dispalyed() throws Throwable {
        throw new PendingException();
    }

}