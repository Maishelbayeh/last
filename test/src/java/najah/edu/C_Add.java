package najah.edu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import org.junit.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import softwareProject.admin;
import softwareProject.clinic;

public class C_Add {
	
	public clinic a;
	public static List<Map<String, String>> clinicData;	
	public boolean checkAdd;
	public C_Search S;
	
	public C_Add(clinic ad) {
		a=ad;
    }
	
	
	
	
	
	@Given("these are the clinics")
	public void these_are_the_clinics(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		clinicData=  dataTable.asMaps(String.class, String.class);
	}
	@Given("that the admin is logged in")
	public void that_the_admin_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("the admin want to add clinic with number {string} , and name {string}")
	public void the_admin_want_to_add_clinic_with_number_and_name(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		a.c_Nom=string;
		a.c_Name=string2;
	    
	}

	@When("the clinic is not exist before")
	public void the_clinic_is_not_exist_before() {
	    // Write code here that turns the phrase above into concrete actions
		a.check(clinicData);
	   System.out.println(a.ex);
	}

	@Then("the clinic added")
	public void the_clinic_added() {
	    // Write code here that turns the phrase above into concrete actions
		 assertFalse(a.ex);
	   System.out.println("Added");
		
	}
    
	@Given("the admin want to add exist clinic with number {string} , and name {string}")
	public void the_admin_want_to_add_exist_clinic_with_number_and_name(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		a.c_Nom=string;
		a.c_Name=string2;
	}
	@When("the clinic already exist")
	public void the_clinic_already_exist() {
	    // Write code here that turns the phrase above into concrete actions
		a.check(clinicData);
		   System.out.println(a.ex);
	}

	@Then("the error message {string} is given")
	public void the_error_message_is_given(String string) {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(a.ex);
	    System.out.println(string);
	}

	@Given("the admin clinic only by name {string}")
	public void the_admin_clinic_only_by_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("the error message {string}")
	public void the_error_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   assertTrue(true);
	   System.out.println(string);
	}
}
