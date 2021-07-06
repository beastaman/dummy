import com.sapient.BuisnessTransaction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import org.junit.Assert;

public class BuisnessStepDef {
    BuisnessTransaction buisnessTransaction;
    int discount;
    @Given("Purchase of material")
    public void purchase_of_material() {
        buisnessTransaction = new BuisnessTransaction();
    }

    @When("I purchase of {int} worth amount")
    public void i_purchase_of_worth_amount(Integer int1) {
        discount = buisnessTransaction.doPurchaseTransaction(50000);
    }

    @Then("The discount i got was {int}")
    public void the_discount_i_got_was(Integer int1) {
        Assert.assertEquals(discount, 2500);
    }
}
