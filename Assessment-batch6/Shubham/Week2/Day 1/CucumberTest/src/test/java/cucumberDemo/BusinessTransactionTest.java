package cucumberDemo;

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
	int discount;
	
	@Given("Purchase of material")
	public void purchase_of_material() {
		obj = new BusinessTransaction();
	}
	
	@When("I purchase of  worth amount")
	public void i_purchase_of_worth_amount(Integer int1) {
		discount=obj.doPurchaseTransaction(50000);
	}
	
	@Then("The discount I got was")
	public void the_discount_I_got_was(Integer int1) {
		Assert.assertEquals(discount, 2500);
	}
}
