package najah.edu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import softwareProject.invoice;

public class invoiceStep {
	public static BillSteps B;
	public static invoice i;
	
	
	@Given("there is a patient with id {string}")
	public void there_is_a_patient_with_id(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   i.pID= string;
	}

	@When("the patient does not have any visited history")
	public void the_patient_does_not_have_any_visited_history() {
	    // Write code here that turns the phrase above into concrete actions
	   i.find(B.Bookings);
	}

	@Then("the message will alert {string}")
	public void the_message_will_alert(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    assertFalse(i.f);
	    System.out.println(string);
	}

	@When("the patient have visited history")
	public void the_patient_have_visited_history() {
	    // Write code here that turns the phrase above into concrete actions
	   i.f= true;
	   i.find(B.Bookings);
	}

	@Then("the informetion for visited about this patient will be shown")
	public void the_informetion_for_visited_about_this_patient_will_be_shown() {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(i.f);
	}
}
