import org.junit.Assert;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import demo.BusinessTransaction;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" })
public class BusinessTransactionTest {

	BusinessTransaction obj;
	Integer discount;

//	@Given("Purchase of material")
//	public void purchase_of_material() {
//		obj = new BusinessTransaction();
//	}
//
//	@When("I purchase material of amount 50000 ")
//	public void i_purchase_material_of_amount() {
//		discount = obj.doTransaction(50000);
//	}
//
//	@Then("I get discount of 2500")
//	public void i_get_discount_of() {
//		Assert.assertEquals(discount, 2500);
//	}

	@Given("Purchase of material")
	public void purchase_of_material() {
		obj = new BusinessTransaction();
	}

	@When("I purchase material of amount {int}")
	public void i_purchase_material_of_amount(Integer int1) {
		discount = obj.doTransaction(int1);
	}

	@Then("I get discount of {int}")
	public void i_get_discount_of(Integer int1) {
		Assert.assertEquals(discount, int1);
	}

}
