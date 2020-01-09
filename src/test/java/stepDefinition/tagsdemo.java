package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class tagsdemo {
	@Given("Launch app")
	public void launch_app() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("launch");
	}

	@Then("reg with valid data")
	public void reg_with_valid_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("reg");
	}

	@Given("provide the valid data")
	public void provide_the_valid_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("enter data");
	}

	@Given("placed the order")
	public void placed_the_order() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("order");
	}

	@Given("cancelled the order")
	public void cancelled_the_order() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("order cancelled");
	}
}
