//package cucumberTesting;

import org.junit.Assert;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class BusinessTransactionTest {
	
	BusinessTransaction obj;
	Integer discount;
	
	@Given("Purchase of material")
	public void purchase_of_material() {
	   obj = new BusinessTransaction();
	}

	@When("I purchase of {int} worth amount")
	public void i_purchase_of_worth_amount(Integer int1) {
	   discount = obj.doPurchaseTransaction(int1);
	}

	@Then("The discount i got was {int}")
	public void the_discount_i_got_was(Integer int1) {
	    Assert.assertEquals(discount, int1);
	}
	
}