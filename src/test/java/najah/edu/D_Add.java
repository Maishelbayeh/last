package najah.edu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import softwareProject.doctors;

public class D_Add {
	public static List<Map<String, String>> docData;
	public static doctors doc;
	
	
	@Given("These are the doctors")
	public void these_are_the_doctors(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		docData=  dataTable.asMaps(String.class, String.class);
	}

	@Given("that the user is logged in")
	public void that_the_user_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("the user want to add doctor with ID {string} , and name {string} , and Dr_medical specialty {string} , and Dr_phone {string}, and password {string} ,and city {string} ,and bill {string}")
	public void the_user_want_to_add_doctor_with_id_and_name_and_dr_medical_specialty_and_dr_phone_and_password_and_city_and_bill(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	    // Write code here that turns the phrase above into concrete actions
	    doc.d_id= string;
	    doc.name= string2;
	    doc.specialty= string3;
	    doc.phone= string4;
	    doc.password= string5;
	    doc.city= string6;
	    doc.bill= string7;
	}

	@When("the doctor is not exist before")
	public void the_doctor_is_not_exist_before() {
	    // Write code here that turns the phrase above into concrete actions
		   doc.check(docData);
		   System.out.println(doc.ex);
	}

	@Given("the user want to add doctor with ID {string}")
	public void the_user_want_to_add_doctor_with_id(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    doc.d_id= string;
	}

	@When("the doctor already exist")
	public void the_doctor_already_exist() {
	    // Write code here that turns the phrase above into concrete actions
		   doc.check(docData);
		   System.out.println(doc.ex);
	}
	@Then("error message {string} is given")
	public void error_message_is_given(String string) {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(doc.ex);
	    System.out.println(string);	
	    }
	
	@Then("the doctor added")
	public void the_doctor_added() {
	    // Write code here that turns the phrase above into concrete actions
		assertFalse(doc.ex);
	}


}
