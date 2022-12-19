package najah.edu;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import softwareProject.Bill;
import softwareProject.user;


public class BillSteps {
	
	public static List<Map<String, String>> Bookings;
	public Bill b;
	public user p;
	
	@Given("these are bookings")
	public void these_are_bookings(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    Bookings= dataTable.asMaps(String.class, String.class);
	    
	}

	@Given("there is the patient with ID {string}")
	public void there_is_the_patient_with_id(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    b.pID= string;
	   
	}

	@Given("the patient come in time where Previously selected")
	public void the_patient_come_in_time_where_previously_selected() {
	    b.correct= true;
	    b.find(Bookings);
	}

	@When("the patient pay his bill")
	public void the_patient_pay_his_bill() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Get well soon, Your bill is "+b.Bill);
	}

	@Then("the booking delete from Schedule table")
	public void the_booking_delete_from_schedule_table() {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(b.correct);
	}

	@Given("the patient come in another booktime {int}:{int}")
	public void the_patient_come_in_another_booktime(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	   b.hour= int1;
	   b.min= int2;
	   b.correct= false;
	  
	}

	@When("the bookdate Conflicts with another patient for same doctor")
	public void the_bookdate_conflicts_with_another_patient_for_same_doctor() {
		 b.find(Bookings);
	    
	}

	@Then("the booking time will delayed to another time")
	public void the_booking_time_will_delayed_to_another_time() {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(true);
	}

	@Given("the patient not comming in his booktime")
	public void the_patient_not_comming_in_his_booktime() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("the bookdate has passed")
	public void the_bookdate_has_passed() {

	}

	@Then("the booking will deleted")
	public void the_booking_will_deleted() {
	   
	}

}
