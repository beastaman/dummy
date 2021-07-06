//import cucumber.apijava.CucumberOptions;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import cucumber.api.junit.Cucumber;
//import org.junit.runner.RunWith;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty"})
//public class CucumberDemoTest {
//    FoodOrderService foodOrderService;
//    String category;
//
//    @Given("I have not yet ordered anything")
//    public void no_order_yet() {
//        foodOrderService = new FoodOrderService();
//    }
//
//    @When("I go to the {string} category")
//    public void i_go_to_category(String category) {
//        this.category = category;
//    }
//
////    @When("I select a/an {string}")
////    public void i_select_item(String itemName) {
////        foodOrderService.addItem(new Item(itemName, category));
////    }
////
////    @Then("I have a new order")
////    public void i_have_new_order() {
////        assertTrue("Order was null", foodOrderService.getOrder().isPresent());
////    }
////
////    @Then("the order has {int} item(s) in it")
////    public void order_has_n_item_in_it(int itemCount) {
////        assertEquals("Wrong number of items in order",
////                itemCount, foodOrderService.getOrder().get().getItems().size());
////    }
//}
