import org.junit.*;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class BusinessTransactionTst {
	
	BusinessTransaction businessTransaction;
	int discount;
	
	@Given("Purchase of material")
	public void purchase_of_material() {
		businessTransaction = new BusinessTransaction();
	}

	@When("I purchase of 50000 worth amount")
	public void i_purchase_of_worth_amount() {
		discount = businessTransaction.doPurchaseTransaction(50000);
	}

	@Then("Discount I got is 2500")
	public void discount_I_got_is() {
		Assert.assertEquals(discount, 2500);
	}
	

	@Given("Purchase of material")
	public void purchase_of_material1() {
		businessTransaction = new BusinessTransaction();
	}

	@When("I purchase of 110000 worth amount")
	public void i_purchase_of_worth_amount1() {
		discount = businessTransaction.doPurchaseTransaction(110000);
	}

	@Then("Discount I got is 11000")
	public void discount_I_got_is1() {
		Assert.assertEquals(discount, 11000);
	}
	
//	@Given("Purchase of material")
//	public void purchase_of_material() {
//		businessTransaction = new BusinessTransaction();
//	}
//
//	@When("I purchase of {int} worth amount")
//	public void i_purchase_of_worth_amount(Integer int1) {
//		discount = businessTransaction.doPurchaseTransaction(50000);
//	}
//
//	@Then("Discount I got is {int}")
//	public void discount_I_got_is(Integer int1) {
//		Assert.assertEquals(discount, 2500);
//	}
	
}
