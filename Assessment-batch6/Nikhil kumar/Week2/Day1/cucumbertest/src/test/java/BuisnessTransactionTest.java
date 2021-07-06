import com.sapient.BuisnessTransaction;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "ExplainFeature.feature")
public class BuisnessTransactionTest {

    BuisnessTransaction obj;
    Integer discount;
    BuisnessStepDef stepDef;

    public void doCheck(){
        stepDef = new BuisnessStepDef();
        stepDef.purchase_of_material();
        stepDef.i_purchase_of_worth_amount(50000);
        stepDef.the_discount_i_got_was(2500);
    }
}
