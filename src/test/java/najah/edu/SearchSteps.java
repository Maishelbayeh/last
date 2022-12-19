package najah.edu;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import softwareProject.Dr;
import softwareProject.Search;


public class SearchSteps {

	Dr medicalspecialty;
	Search search;

	@Given("I have a search field on Hospital Page")
	public void i_have_a_search_field_on_Hospital_page() {
		System.out.println("Step 1: I am on search page");
	}

	@When("I search for a medical specialty with name {string}")
	public void i_search_for_a_medical_specialty_with_name(String medical ) {
		System.out.println("Step 2: Search the medical_specialty with name : " + medical );
		medicalspecialty = new Dr(medical);
	}

	@Then("Order id is {int} and dr_name is {string}")
	public void order_id_is_and_dr_name_is(Integer int1, String string) {
		System.out.println("Step 3: medical_specialty " + string + " is displayed");

		search = new Search();
		String name = search.displaymedicalspecialty(medicalspecialty);
		System.out.println("searched medical_specialty is : " + name);

	}

	
	@Then("medical specialty with name {string} should be displayed")
	public void medical_specialty_with_name_should_be_displayed(String string) {
	    
	}

}