package com.bohnenkamptech.blog.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.PendingException;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

/**
 * The step definitions for a Drinker feature
 */
public class DrinkerStepsDef {

    @Autowired
    Beverage beverage;
    Drinker drinker = new Drinker();

    @When("^I take a sip$")
    public void I_take_a_sip() throws Throwable {
        drinker.sip(beverage);
    }

    @When("^I take a drink$")
    public void I_take_a_drink() throws Throwable {
        drinker.drink(beverage);
    }

    @When("^I slam it$")
    public void I_slam_it() throws Throwable {
        drinker.slam(beverage);
    }

}
