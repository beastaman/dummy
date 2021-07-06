import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})

public class BusinessTransactionTest {
	
	BusinessTransaction obj;
	int discount;
	@Given("purchase of material")
	public void purchase_of_material() {
	   obj = new BusinessTransaction();
	}

	@When("I purchase {int} worth of material")
	public void i_purchase_worth_of_amount(Integer int1) {
	    discount =obj.doPurchaseTransaction(int1);
	}

	
	@Then("The discount I got was {int}")
	public void the_discount_i_got_was(Integer int1) {
	    assertEquals(discount, 2500);
	}



}