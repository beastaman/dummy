import org.junit.*;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class BusinessTransactionTest {
	
	BusinessTransaction obj;
	int discount; 
	
	@Given("Purchase of material")
	public void purchase_of_material() {
		obj = new BusinessTransaction();
	    //throw new cucumber.api.PendingException();
	}

	@When("I purchase of {int} worth amount")
	public void i_purchase_of_worth_amount(Integer int1) {
		discount = obj.doPurchaseTransaction(int1);
	   // throw new cucumber.api.PendingException();
	}

	@Then("discount I got was {int}")
	public void discount_I_got_was(Integer int1) {
		Assert.assertEquals(Integer.valueOf(discount),int1);
	   // throw new cucumber.api.PendingException();
	}
}
