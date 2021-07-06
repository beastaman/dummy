package w2d1;
import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.*;
import junit.framework.Assert;


public class BusinessTransactionTest {
	
	BusinessTransaction obj;
	int discount;
	
	@Given("purchase of material")
	public void purchase_of_material() {
	    // Write code here that turns the phrase above into concrete actions
		obj = new BusinessTransaction();
//	    throw new cucumber.api.PendingException();
	}

	@When("I purchase of material of worth {int}")
	public void i_purchase_of_material_of_worth(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		discount = obj.doPurchaseTransaction(amount: 50000);
//	    throw new cucumber.api.PendingException();
	}

	@Then("the discount I got was {int}")
	public void the_discount_I_got_was(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(discount,2500)
//	    throw new cucumber.api.PendingException();
	}

}
