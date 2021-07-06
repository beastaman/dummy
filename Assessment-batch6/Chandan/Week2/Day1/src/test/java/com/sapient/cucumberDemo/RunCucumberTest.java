package com.sapient.cucumberDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class RunCucumberTest {
	
	FoodOrderService foodOrderService;
    String category;

    @Given("I have not yet ordered anything")
    public void no_order_yet() {
        foodOrderService = new FoodOrderService();
    }

    @When("I go to the {string} category")
    public void i_go_to_category(String category) {
        this.category = category;
    }

    @When("I select a/an {string}")
    public void i_select_item(String itemName) {
        foodOrderService.addItem(new Item(itemName, category));
    }

    @Then("I have a new order")
    public void i_have_new_order() {
        assertTrue("Order was null", foodOrderService.getOrder().isPresent());
    }

    @Then("the order has {int} item(s) in it")
    public void order_has_n_item_in_it(int itemCount) {
        assertEquals("Wrong number of items in order",
                itemCount, foodOrderService.getOrder().get().getItems().size());
    }

    @Then("my current order total is \\$([\\d\\.]+)")
    public void current_order_total_is(String price) {
    }

}
