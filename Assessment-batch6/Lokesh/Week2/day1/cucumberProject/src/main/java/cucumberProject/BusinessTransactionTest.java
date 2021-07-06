package cucumberProject;
//import cucumber.api.java.en.*;
import junit.framework.Assert;
import cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}) 

public class BusinessTransactionTest {
	BusinessTransaction obj ;
	int discount;
	@Given("Purchase of material")
	public void purchase_of_material() {
		obj = new BusinessTransaction();
	}

	@When("I purchased of {int} worth amount")
	public void i_purchased_of_worth_amount(Integer int1) {
		discount =obj.doPurchaseTransaction(50000);
	}

	@Then("The discount I got was {int}")
	public void the_discount_I_got_was(Integer int1) {
		assertEquals(discount,2500);
	}


}
