package com.bohnenkamptech.blog.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Class description
 */
public class PintStepsDef {

    @Autowired
    Pint pint;

    int dispensed;
    int filled;

    @Given("^I have a pint$")
    public void I_have_a_pint() throws Throwable {
        //no op, Spring autowired it
    }

    @Given("^I have a full pint$")
    public void I_have_a_full_pint() throws Throwable {
        pint.fillFull();
    }

    @When("^I fill the pint full$")
    public void I_fill_the_pint_full() throws Throwable {
        pint.fillFull();
    }

    @Then("^there should be (\\d+) oz of beer in the pint$")
    public void there_should_be_oz_of_beer_in_the_pint(int ounces) throws Throwable {
        assertEquals("There was not the expected number of ounces in the pint", ounces,
                pint.liquidCurrentlyHolding());
    }

    @When("^I dispense (\\d+) oz$")
    public void I_dispense_oz(int ounces) throws Throwable {
        this.dispensed = pint.dispense(ounces);
    }

    @Given("^I have a pint with (\\d+) oz of beer$")
    public void I_have_a_pint_with_oz_of_beer(int ounces) throws Throwable {
        pint.fill(ounces);
    }

    @Then("^The actual amount dispensed should be (\\d+) oz$")
    public void The_actual_amount_dispensed_should_be_oz(int ounces) throws Throwable {
        assertEquals("The amount dispensed was not the amount expected", ounces,
                this.dispensed);
    }

    @When("^I fill it with (\\d+) oz$")
    public void I_fill_it_with_oz(int ounces) throws Throwable {
        this.filled = pint.fill(ounces);
    }

    @Then("^The actual amount filled should be (\\d+) oz$")
    public void The_actual_amount_filled_should_be_oz(int ounces) throws Throwable {
        assertEquals("The amount filled was not the amount expected", ounces,
                this.filled);
    }
}
