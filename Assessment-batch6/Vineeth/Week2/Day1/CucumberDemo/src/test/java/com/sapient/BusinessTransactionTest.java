package com.sapient;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.*;

public class BusinessTransactionTest {
	
	BusinessTransaction obj;
	Integer discount;
	
	@Given("Purchase of material")
	public void purchase_of_material() {
		obj = new BusinessTransaction();
	}

	@When("I purchsae of {int} worth amount")
	public void i_purchsae_of_worth_amount(Integer int1) {
		discount = obj.doTransaction(int1);
	}

	@Then("The discount I got was {int}")
	public void the_discount_I_got_was(Integer int1) {
		assertEquals(int1, discount);
	}

}
