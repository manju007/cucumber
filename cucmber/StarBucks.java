package cucmber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StarBucks {

	StarBucksCoffeeShopService coffeeShop = new StarBucksCoffeeShop();

	@Given("^there are (\\d+) coffees left in the machine$")
	public void leftOverCoffee(int numberOfCoffee) throws Throwable {
		coffeeShop.setNumberOfCoffee(numberOfCoffee);
	}

	@Given("^I have deposited (\\d+)\\$$")
	public void depositMoney(int depositMoney) throws Throwable {
		coffeeShop.setDepositMoney(depositMoney);
	}

	@When("^I press the coffee button$")
	public void pressCoffeeButton() throws Throwable {
		coffeeShop.pressCoffeeButton();
	}

	@Then("^I should be served a coffee$")
	public void serveCoffee() throws Throwable {
		coffeeShop.serveCoffe();
	}

	@Then("^Only (\\d+) Coffee should be left in the machine$")
	public void only_Coffee_should_be_left_in_the_machine(int arg1) throws Throwable {

	}

	@Then("^Machine should refund money$")
	public void refund_money() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		coffeeShop.refundmoney();

	}

	@When("^I select (\\d+) coffees$")
	public void i_select_coffees(int numberOfCoffees) throws Throwable {
		coffeeShop.selectNumberOfCoffee(numberOfCoffees);
	}

	@Then("^I should be served (\\d+) coffee$")
	public void i_should_be_served_coffee(int numberOfCoffees) throws Throwable {
		coffeeShop.serveNumberOfCoffee(numberOfCoffees);
	}

}
