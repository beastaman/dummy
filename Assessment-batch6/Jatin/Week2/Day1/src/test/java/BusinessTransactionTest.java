import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//@RunWith(Cucumber.class)
//@CucumberOptions(plugin = { "pretty" })

public class BusinessTransactionTest {
	
	BusinessTransaction obj ;
	int discount;
	@Given("Purchase of material")
	public void purchase_of_material() {
	   obj = new BusinessTransaction();
	}

	@When("I purchase of {int} worth amount")
	public void i_purchase_of_worth_amount(Integer int1) {
		discount = obj.doPurchaseTransaction(50000);
	}

	@Then("The discount I got was {int}")
	public void the_discount_I_got_was(Integer int1) {
		assertEquals(discount, 2500);
	}

}